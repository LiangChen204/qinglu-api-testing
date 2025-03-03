package com.saas.qa.api.testcase.open.circle;

import com.saas.qa.api.base.HttpBase;
import com.saas.qa.api.constants.MethodConstants;
import com.saas.qa.api.factory.CircleDeleteRequestFactory;
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
@Feature("服务圈删除")
public class StoreCircleDeleteTest extends HttpBase {

    @Test(description = "正常场景测试：传递合法参数")
    @Description("门店服务圈删除接口")
    @Story("正常场景")
    public void testStoreCircleDelete_Success() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        // 使用工厂类生成正常场景的请求参数
        String bizRequest = CircleDeleteRequestFactory.createNormalRequest();
        
        // 构建表单参数
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", MethodConstants.STORE_CIRCLE_DELETE);
        formBody.put("bizRequest", bizRequest);
        
        // 发送POST请求
        Response response = httpHelper.postRequestForForm(url, formBody);
        try {
            String res = response.body().string();
            System.out.println("响应结果：" + res);
            // 验证响应状态码
            assertEquals(printResponseHelper.printResponseString(res, "message"), "null", "结果不符合预期");
            assertEquals(printResponseHelper.printResponseString(res, "code"), "1", "结果不符合预期");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(description = "异常场景测试：缺少必填字段")
    @Description("门店服务圈删除接口")
    @Story("异常场景-缺少必填字段")
    public void testStoreCircleDelete_MissingRequired() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        // 使用工厂类生成缺少必填字段的请求参数
        String bizRequest = CircleDeleteRequestFactory.createMissingRequiredFieldRequest();
        
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", MethodConstants.STORE_CIRCLE_DELETE);
        formBody.put("bizRequest", bizRequest);
        
        // 发送POST请求
        Response response = httpHelper.postRequestForForm(url, formBody);
        try {
            String res = response.body().string();
            System.out.println("响应结果：" + res);
            // 验证响应状态码
            assertEquals(printResponseHelper.printResponseString(res, "code"), "open_store_001", "结果不符合预期");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(description = "异常场景测试：空列表")
    @Description("门店服务圈删除接口")
    @Story("异常场景-空列表")
    public void testStoreCircleDelete_EmptyList() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        // 使用工厂类生成空列表的请求参数
        String bizRequest = CircleDeleteRequestFactory.createEmptyListRequest();
        
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", MethodConstants.STORE_CIRCLE_DELETE);
        formBody.put("bizRequest", bizRequest);
        
        // 发送POST请求
        Response response = httpHelper.postRequestForForm(url, formBody);
        try {
            String res = response.body().string();
            System.out.println("响应结果：" + res);
            // 验证响应状态码
            assertEquals(printResponseHelper.printResponseString(res, "message"), "参数错误", "结果不符合预期");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(description = "异常场景测试：无效渠道ID")
    @Description("门店服务圈删除接口")
    @Story("异常场景-无效渠道ID")
    public void testStoreCircleDelete_InvalidChannel() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        // 使用工厂类生成无效渠道ID的请求参数
        String bizRequest = CircleDeleteRequestFactory.createInvalidChannelRequest();
        
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", MethodConstants.STORE_CIRCLE_DELETE);
        formBody.put("bizRequest", bizRequest);
        
        // 发送POST请求
        Response response = httpHelper.postRequestForForm(url, formBody);
        try {
            String res = response.body().string();
            System.out.println("响应结果：" + res);
            // 验证响应状态码
            assertEquals(printResponseHelper.printResponseString(res, "code"), "1", "结果不符合预期");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
} 