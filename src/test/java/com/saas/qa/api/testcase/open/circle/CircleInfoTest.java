package com.saas.qa.api.testcase.open.circle;

import com.saas.qa.api.base.HttpBase;
import com.saas.qa.api.constants.MethodConstants;
import com.saas.qa.api.factory.CircleInfoRequestFactory;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import okhttp3.Response;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;

@Epic("门店管理")
@Feature("服务圈信息查询")
public class CircleInfoTest extends HttpBase {

    @Test(description = "正常场景测试：传递合法参数")
    @Description("服务圈信息查询接口")
    @Story("正常场景")
    public void testCircleInfo_Success() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        String bizRequest = CircleInfoRequestFactory.createNormalRequest();
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", MethodConstants.CIRCLE_INFO);
        formBody.put("bizRequest", bizRequest);
        Response response = httpHelper.postRequestForForm(url, formBody);
        try {
            String res = response.body().string();
            System.out.println("响应结果：" + res);
            assertEquals(printResponseHelper.printResponseString(res, "message"), "null", "结果不符合预期");
            assertEquals(printResponseHelper.printResponseString(res, "code"), "1", "结果不符合预期");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(description = "异常场景测试：缺少必填字段")
    @Description("服务圈信息查询接口")
    @Story("异常场景-缺少必填字段")
    public void testCircleInfo_MissingRequired() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        String bizRequest = CircleInfoRequestFactory.createMissingRequiredFieldRequest();
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", MethodConstants.CIRCLE_INFO);
        formBody.put("bizRequest", bizRequest);
        Response response = httpHelper.postRequestForForm(url, formBody);
        try {
            String res = response.body().string();
            System.out.println("响应结果：" + res);
            assertEquals(printResponseHelper.printResponseString(res, "code"), "1", "结果不符合预期");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(description = "异常场景测试：无效渠道ID")
    @Description("服务圈信息查询接口")
    @Story("异常场景-无效渠道ID")
    public void testCircleInfo_InvalidChannel() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        String bizRequest = CircleInfoRequestFactory.createInvalidFieldRequest();
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", MethodConstants.CIRCLE_INFO);
        formBody.put("bizRequest", bizRequest);
        Response response = httpHelper.postRequestForForm(url, formBody);
        try {
            String res = response.body().string();
            System.out.println("响应结果：" + res);
            assertEquals(printResponseHelper.printResponseString(res, "code"), "1", "结果不符合预期");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}