package com.saas.qa.api.testcase.open.store;

import com.saas.qa.api.base.HttpBase;
import com.saas.qa.api.constants.MethodConstants;
import com.saas.qa.api.factory.StoreInfoRequestFactory;
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
@Feature("门店信息查询")
public class StoreInfoTest extends HttpBase {

    @Test(description = "正常场景测试：传递合法参数")
    @Description("门店信息查询接口")
    @Story("正常场景")
    public void testStoreInfo_Success() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        // 使用工厂类生成正常场景的请求参数
        String bizRequest = StoreInfoRequestFactory.createNormalRequest();
        
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", MethodConstants.STORE_INFO);
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
    @Description("门店信息查询接口")
    @Story("异常场景-缺少必填字段")
    public void testStoreInfo_MissingRequired() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        String bizRequest = StoreInfoRequestFactory.createMissingRequiredFieldRequest();
        
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", MethodConstants.STORE_INFO);
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
    @Description("门店信息查询接口")
    @Story("异常场景-无效渠道ID")
    public void testStoreInfo_InvalidChannel() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        String bizRequest = StoreInfoRequestFactory.createInvalidChannelRequest();
        
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", MethodConstants.STORE_INFO);
        formBody.put("bizRequest", bizRequest);
        
        Response response = httpHelper.postRequestForForm(url, formBody);
        try {
            String res = response.body().string();
            System.out.println("响应结果：" + res);
            assertEquals(printResponseHelper.printResponseString(res, "code"), "0", "结果不符合预期");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
} 