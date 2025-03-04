package com.saas.qa.api.util;

import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.testng.TestNG;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * AI自动化测试报告生成工具类
 * 
 * 包含：
 * - TestNG 测试框架
 * - Allure 报告生成
 * - Desktop 浏览器打开
 * 
 * 类名：
 * - TestReportGenerator：测试报告生成器
 * 
 * 接口：
 * - generateAndOpenReport：生成并打开测试报告
 * 
 * @author AI Auto Generator
 * @since 2024-03-03
 * @version 1.0
 */
@Slf4j
public class TestReportGenerator {

    private static final String REPORT_PATH = "target/site/allure-maven-plugin/index.html";
    private static final int MAX_WAIT_MINUTES = 2;

    /**
     * 生成并打开测试报告
     * AI自动化测试接口
     * 
     * @param xmlPath TestNG XML文件路径
     * @throws RuntimeException 当报告生成或打开失败时抛出
     */
    @Step("AI自动化测试：生成并打开测试报告")
    public static void generateAndOpenReport(String xmlPath) {
        try {
            log.info("AI自动化测试开始执行测试套件: {}", xmlPath);
            
            // 创建TestNG实例
            TestNG testNG = new TestNG();
            
            // 设置测试套件XML
            List<String> suites = new ArrayList<>();
            suites.add(xmlPath);
            testNG.setTestSuites(suites);
            
            // 运行测试
            testNG.run();
            
            // 清理旧的报告
            cleanOldReport();
            
            // 生成Allure报告
            log.info("AI自动化测试开始生成Allure报告");
            generateReport();
            
            // 等待报告生成完成
            File reportFile = waitForReportGeneration();
            
            // 打开报告
            openReport(reportFile);
            
        } catch (Exception e) {
            log.error("AI自动化测试报告生成失败: {}", e.getMessage());
            throw new RuntimeException("AI自动化测试报告生成失败: " + e.getMessage());
        }
    }

    /**
     * 清理旧的报告文件
     */
    private static void cleanOldReport() throws IOException, InterruptedException {
        log.info("AI自动化测试清理旧的报告文件");
        ProcessBuilder cleanBuilder = new ProcessBuilder(
                "mvn", "allure:clean"
        );
        Process cleanProcess = cleanBuilder.start();
        cleanProcess.waitFor();
    }

    /**
     * 生成新的报告
     */
    private static void generateReport() throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder(
                "mvn", "allure:report"
        );
        processBuilder.inheritIO(); // 继承父进程的输入输出流
        Process process = processBuilder.start();
        process.waitFor();
    }

    /**
     * 等待报告生成完成
     */
    private static File waitForReportGeneration() throws InterruptedException {
        File reportFile = new File(REPORT_PATH);
        long startTime = System.currentTimeMillis();
        long endTime = startTime + TimeUnit.MINUTES.toMillis(MAX_WAIT_MINUTES);

        while (!reportFile.exists() && System.currentTimeMillis() < endTime) {
            log.info("AI自动化测试等待报告生成...");
            Thread.sleep(2000); // 每2秒检查一次
        }

        if (!reportFile.exists()) {
            throw new RuntimeException("AI自动化测试报告生成超时");
        }

        log.info("AI自动化测试报告已生成: {}", reportFile.getAbsolutePath());
        return reportFile;
    }

    /**
     * 打开报告
     */
    private static void openReport(File reportFile) throws IOException {
        if (Desktop.isDesktopSupported()) {
            log.info("AI自动化测试正在打开测试报告: {}", reportFile.getAbsolutePath());
            Desktop.getDesktop().browse(reportFile.toURI());
        } else {
            log.warn("AI自动化测试无法自动打开报告，请手动打开: {}", reportFile.getAbsolutePath());
        }
    }

    /**
     * AI自动化测试示例
     * 演示如何生成并打开测试报告
     */
    public static void main(String[] args) {
        try {
            generateAndOpenReport("src/test/resources/testng-daily.xml");
        } catch (Exception e) {
            System.err.println("AI自动化测试错误: " + e.getMessage());
        }
    }
} 