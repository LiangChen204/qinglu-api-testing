package com.saas.qa.api.testcase.open.store;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.saas.qa.api.base.HttpBase;
import com.saas.qa.api.factory.StoreSyncRequestFactory;
import com.saas.qa.api.util.PrintResponseHelper;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import okhttp3.FormBody;
import okhttp3.Request;
import okhttp3.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

@Epic("门店管理")
@Feature("门店状态更新")
public class StoreStatusUpdateTest extends HttpBase {

    @Test(description = "测试正常场景")
    @Description("测试门店状态更新接口的正常场景")
    @Story("正常场景")
    public void testNormalScenario() throws IOException {
        String bizRequest = StoreSyncRequestFactory.createNormalScenario();
        Request request = new Request.Builder()
                .url(MethodConstants.HELLO_BASE_URL + "/open/test")
                .post(new FormBody.Builder()
                        .add("bizRequest", bizRequest)
                        .add("method", MethodConstants.STORE_STATUS_UPDATE)
                        .build())
                .build();

        try (Response response = client.newCall(request).execute()) {
            PrintResponseHelper.printResponse(response);
            Assert.assertEquals(response.isSuccessful(), true);
            JSONObject jsonResponse = JSON.parseObject(response.body().string());
            Assert.assertEquals(jsonResponse.getString("code"), "0");
        }
    }

    @Test(description = "测试字段异常场景")
    @Description("测试门店状态更新接口的字段异常场景")
    @Story("字段异常场景")
    public void testFieldExceptionScenario() throws IOException {
        String bizRequest = StoreSyncRequestFactory.createFieldExceptionScenario();
        Request request = new Request.Builder()
                .url(MethodConstants.HELLO_BASE_URL + "/open/test")
                .post(new FormBody.Builder()
                        .add("bizRequest", bizRequest)
                        .add("method", MethodConstants.STORE_STATUS_UPDATE)
                        .build())
                .build();

        try (Response response = client.newCall(request).execute()) {
            PrintResponseHelper.printResponse(response);
            Assert.assertEquals(response.isSuccessful(), true);
            JSONObject jsonResponse = JSON.parseObject(response.body().string());
            Assert.assertEquals(jsonResponse.getString("code"), "1"); // 假设异常返回码为1
        }
    }

    @Test(description = "测试必填项缺失场景")
    @Description("测试门店状态更新接口的必填项缺失场景")
    @Story("必填项缺失场景")
    public void testMissingFieldScenario() throws IOException {
        String bizRequest = StoreSyncRequestFactory.createMissingFieldScenario();
        Request request = new Request.Builder()
                .url(MethodConstants.HELLO_BASE_URL + "/open/test")
                .post(new FormBody.Builder()
                        .add("bizRequest", bizRequest)
                        .add("method", MethodConstants.STORE_STATUS_UPDATE)
                        .build())
                .build();

        try (Response response = client.newCall(request).execute()) {
            PrintResponseHelper.printResponse(response);
            Assert.assertEquals(response.isSuccessful(), true);
            JSONObject jsonResponse = JSON.parseObject(response.body().string());
            Assert.assertEquals(jsonResponse.getString("code"), "1"); // 假设异常返回码为1
        }
    }
}
