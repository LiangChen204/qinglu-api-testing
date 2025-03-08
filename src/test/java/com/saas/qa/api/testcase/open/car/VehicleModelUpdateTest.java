package com.saas.qa.api.testcase.open.car;

import com.saas.qa.api.base.HttpBase;
import com.saas.qa.api.constants.MethodConstants;
import com.saas.qa.api.factory.VehicleModelUpdateRequestFactory;
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
 * 车型更新测试类
 * AI创建
 * @since 2024-05-15
 */
@Epic("车型管理")
@Feature("车型更新接口")
public class VehicleModelUpdateTest extends HttpBase {

    @Test(description = "正常场景测试：传递合法参数")
    @Description("车型更新接口")
    @Story("正常场景")
    public void testVehicleModelUpdate_Success() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        // 获取method值
        String method = MethodConstants.VEHICLE_MODEL_UPDATE;
        System.out.println("method值为: " + method);
        
        String bizRequest = VehicleModelUpdateRequestFactory.createNormalRequest();
        
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", method);
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

    @Test(description = "异常场景测试：字段值异常")
    @Description("车型更新接口")
    @Story("异常场景-字段值异常")
    public void testVehicleModelUpdate_InvalidField() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        // 获取method值
        String method = MethodConstants.VEHICLE_MODEL_UPDATE;
        System.out.println("method值为: " + method);
        
        String bizRequest = VehicleModelUpdateRequestFactory.createInvalidFieldRequest();
        
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", method);
        formBody.put("bizRequest", bizRequest);
        
        Response response = httpHelper.postRequestForForm(url, formBody);
        try {
            String res = response.body().string();
            System.out.println("响应结果：" + res);
            assertNotEquals(printResponseHelper.printResponseString(res, "code"), "1", "结果不符合预期");
            // 验证错误信息，具体错误信息根据实际情况调整
            // assertEquals(printResponseHelper.printResponseString(res, "message"), "参数错误", "结果不符合预期");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(description = "异常场景测试：缺少必填字段")
    @Description("车型更新接口")
    @Story("异常场景-缺少必填字段")
    public void testVehicleModelUpdate_MissingRequired() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        // 获取method值
        String method = MethodConstants.VEHICLE_MODEL_UPDATE;
        System.out.println("method值为: " + method);
        
        String bizRequest = VehicleModelUpdateRequestFactory.createMissingRequiredFieldRequest();
        
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", method);
        formBody.put("bizRequest", bizRequest);
        
        Response response = httpHelper.postRequestForForm(url, formBody);
        try {
            String res = response.body().string();
            System.out.println("响应结果：" + res);
            assertNotEquals(printResponseHelper.printResponseString(res, "code"), "1", "结果不符合预期");
            // 验证错误信息，具体错误信息根据实际情况调整
            // assertEquals(printResponseHelper.printResponseString(res, "message"), "必填字段不能为空", "结果不符合预期");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(description = "删除场景测试：删除车型标签")
    @Description("车型更新接口")
    @Story("删除场景-删除车型标签")
    public void testVehicleModelUpdate_DeleteTags() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        // 获取method值
        String method = MethodConstants.VEHICLE_MODEL_UPDATE;
        System.out.println("method值为: " + method);
        
        String bizRequest = VehicleModelUpdateRequestFactory.createDeleteTagsRequest();
        
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", method);
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

    @Test(description = "删除场景测试：删除第三方车型代码")
    @Description("车型更新接口")
    @Story("删除场景-删除第三方车型代码")
    public void testVehicleModelUpdate_DeleteThirdCode() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        // 获取method值
        String method = MethodConstants.VEHICLE_MODEL_UPDATE;
        System.out.println("method值为: " + method);
        
        String bizRequest = VehicleModelUpdateRequestFactory.createDeleteThirdCodeRequest();
        
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", method);
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
} 