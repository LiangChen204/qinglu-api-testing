package com.saas.qa.common;

import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import io.qameta.allure.model.StatusDetails;
import io.qameta.allure.model.StepResult;
import org.testng.*;
import org.testng.xml.XmlSuite;

import java.util.*;

public class ExtentTestNGReporterListener implements IReporter {

    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        for (ISuite suite : suites) {
            Map<String, ISuiteResult> result = suite.getResults();
            if (result.size() == 0) {
                continue;
            }
            for (ISuiteResult r : result.values()) {
                ITestContext context = r.getTestContext();
                buildTestNodes(context.getFailedTests(), Status.FAILED);
                buildTestNodes(context.getSkippedTests(), Status.SKIPPED);
                buildTestNodes(context.getPassedTests(), Status.PASSED);
            }
        }
    }

    /**
     * 根据测试结果构建测试节点
     * 此方法主要用于根据给定的测试结果集和测试状态来构建测试节点，并对测试步骤进行排序和命名，
     * 同时将测试信息和结果更新到Allure报告中
     *
     * @param tests  包含测试结果的IResultMap对象，用于获取测试结果集
     * @param status 测试状态，用于更新测试步骤的状态
     */
    private void buildTestNodes(IResultMap tests, Status status) {
        // 检查测试结果集是否为空，如果不为空，则进一步处理
        if (tests.size() > 0) {
            // 创建一个TreeSet集合，用于按照测试开始时间对测试结果进行排序
            Set<ITestResult> treeSet = new TreeSet<ITestResult>(new Comparator<ITestResult>() {
                @Override
                public int compare(ITestResult o1, ITestResult o2) {
                    // 根据测试开始时间比较两个测试结果，确保测试按开始时间顺序排列
                    return o1.getStartMillis() < o2.getStartMillis() ? -1 : 1;
                }
            });
            // 将所有测试结果添加到TreeSet集合中，以便进行排序
            treeSet.addAll(tests.getAllResults());
            // 遍历排序后的测试结果集
            for (ITestResult result : treeSet) {
                // 获取测试方法的参数，并构建测试步骤的名称
                Object[] parameters = result.getParameters();
                String stepName = "";
                for (Object param : parameters) {
                    stepName += param.toString();
                }
                // 如果构建的步骤名称长度大于50，则截取前49个字符，并添加省略标记
                if (stepName.length() > 0) {
                    if (stepName.length() > 50) {
                        stepName = stepName.substring(0, 49) + "...";
                    }
                } else {
                    // 如果步骤名称为空，则使用测试方法的名称作为步骤名称
                    stepName = result.getMethod().getMethodName();
                }
                // 创建一个新的StepResult对象，并设置其名称
                StepResult stepResult = new StepResult();
                stepResult.setName(stepName);
                // 生成一个唯一的UUID作为步骤的标识，并在Allure报告中开始一个新的步骤
                String uuid = UUID.randomUUID().toString();
                Allure.getLifecycle().startStep(uuid, stepResult);
                // 遍历测试方法所属的组，并为每个组添加标签
                for (String group : result.getMethod().getGroups()) {
                    Allure.label("suite", group);
                }
                // 获取测试报告中的输出信息，并作为附件添加到Allure报告中
                List<String> outputList = Reporter.getOutput(result);
                for (String output : outputList) {
                    Allure.addAttachment("Log", output);
                }
                // 检查测试结果中是否包含异常，如果包含，则更新步骤状态和详细信息
                if (result.getThrowable() != null) {
                    Allure.getLifecycle().updateStep(step -> step.setStatus(status)
                            .setStatusDetails(new StatusDetails().setMessage(result.getThrowable().getMessage())));
                } else {
                    // 如果没有异常，仅更新步骤状态
                    Allure.getLifecycle().updateStep(step -> step.setStatus(status));
                }
                // 在Allure报告中停止当前步骤
                Allure.getLifecycle().stopStep();
            }
        }
    }
}
