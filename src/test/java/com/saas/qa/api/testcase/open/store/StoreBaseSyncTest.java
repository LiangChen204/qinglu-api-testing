package com.saas.qa.api.testcase.open.store;

import com.saas.qa.api.base.HttpBase;
import com.saas.qa.api.constants.MethodConstants;
import com.saas.qa.api.factory.StoreBaseSyncRequestFactory;
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
 * 门店基础信息同步测试类
 * @since 2025-03-03
 */
@Epic("门店管理")
@Feature("门店基础信息同步")
public class StoreBaseSyncTest extends HttpBase {

    @Test(description = "正常场景测试：传递合法参数")
    @Description("门店基础信息同步接口")
    @Story("正常场景")
    public void testStoreBaseSync_Success() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        String bizRequest = StoreBaseSyncRequestFactory.createNormalRequest();
        
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", MethodConstants.QINGLU_OPEN_STORE_BASE_SYNC);
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
    @Description("门店基础信息同步接口")
    @Story("异常场景-缺少必填字段")
    public void testStoreBaseSync_MissingRequired() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        String bizRequest = StoreBaseSyncRequestFactory.createMissingRequiredFieldRequest();
        
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", MethodConstants.QINGLU_OPEN_STORE_BASE_SYNC);
        formBody.put("bizRequest", bizRequest);
        
        Response response = httpHelper.postRequestForForm(url, formBody);
        try {
            String res = response.body().string();
            System.out.println("响应结果：" + res);
            assertNotEquals(printResponseHelper.printResponseString(res, "code"), "1", "结果不符合预期");
            assertEquals(printResponseHelper.printResponseString(res, "message"), "门店名称不能为空", "结果不符合预期");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(description = "异常场景测试：无效字段值")
    @Description("门店基础信息同步接口")
    @Story("异常场景-无效字段值")
    public void testStoreBaseSync_InvalidField() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        String bizRequest = StoreBaseSyncRequestFactory.createInvalidFieldRequest();
        
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", MethodConstants.QINGLU_OPEN_STORE_BASE_SYNC);
        formBody.put("bizRequest", bizRequest);
        
        Response response = httpHelper.postRequestForForm(url, formBody);
        try {
            String res = response.body().string();
            System.out.println("响应结果：" + res);
            assertNotEquals(printResponseHelper.printResponseString(res, "code"), "1", "结果不符合预期");
            assertEquals(printResponseHelper.printResponseString(res, "message"), "渠道ID不存在", "结果不符合预期");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}