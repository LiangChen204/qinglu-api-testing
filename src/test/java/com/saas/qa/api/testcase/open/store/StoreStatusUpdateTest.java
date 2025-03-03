package com.saas.qa.api.testcase.open.store;

import com.saas.qa.api.base.HttpBase;
import com.saas.qa.api.constants.MethodConstants;
import com.saas.qa.api.factory.StoreSyncRequestFactory;
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
import static org.testng.Assert.assertNotEquals;

/**
 * 门店状态更新测试类
 * @since 2024-01-10
 */
@Epic("门店管理")
@Feature("门店状态更新")
public class StoreStatusUpdateTest extends HttpBase {

    @Test(description = "正常场景测试：传递合法参数")
    @Description("门店状态更新接口")
    @Story("正常场景")
    public void testStoreStatusUpdate_Success() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        String bizRequest = StoreSyncRequestFactory.createNormalRequest();
        
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", MethodConstants.STORE_STATUS_UPDATE);
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
    @Description("门店状态更新接口")
    @Story("异常场景-缺少必填字段")
    public void testStoreStatusUpdate_MissingRequired() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        String bizRequest = StoreSyncRequestFactory.createMissingRequiredFieldRequest();
        
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", MethodConstants.STORE_STATUS_UPDATE);
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

    @Test(description = "异常场景测试：无效字段值")
    @Description("门店状态更新接口")
    @Story("异常场景-无效字段值")
    public void testStoreStatusUpdate_InvalidField() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        String bizRequest = StoreSyncRequestFactory.createInvalidFieldRequest();
        
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", MethodConstants.STORE_STATUS_UPDATE);
        formBody.put("bizRequest", bizRequest);
        
        Response response = httpHelper.postRequestForForm(url, formBody);
        try {
            String res = response.body().string();
            System.out.println("响应结果：" + res);
            assertNotEquals(printResponseHelper.printResponseString(res, "code"), "1", "结果不符合预期");
            assertEquals(printResponseHelper.printResponseString(res, "message"), "未找到该门店渠道表数据", "结果不符合预期"); // 新增message信息校验
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
} 