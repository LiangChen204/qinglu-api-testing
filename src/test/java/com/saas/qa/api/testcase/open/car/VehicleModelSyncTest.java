package com.saas.qa.api.testcase.open.car;

import com.saas.qa.api.base.HttpBase;
import com.saas.qa.api.constants.MethodConstants;
import com.saas.qa.api.factory.VehicleModelSyncRequestFactory;
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
 * 车型同步V2测试类
 * AI开头
 * @since 2024-05-15
 */
@Epic("车型管理")
@Feature("车型同步V2接口")
public class VehicleModelSyncTest extends HttpBase {

    @Test(description = "正常场景测试：传递合法参数")
    @Description("车型同步V2接口")
    @Story("正常场景")
    public void testVehicleModelSync_Success() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        // 获取method值
        String method = MethodConstants.VEHICLE_MODEL_SYNCHRONIZATION;
        System.out.println("method值为: " + method);
        
        String bizRequest = VehicleModelSyncRequestFactory.createNormalRequest();
        
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
    @Description("车型同步V2接口")
    @Story("异常场景-字段值异常")
    public void testVehicleModelSync_InvalidField() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        // 获取method值
        String method = MethodConstants.VEHICLE_MODEL_SYNCHRONIZATION;
        System.out.println("method值为: " + method);
        
        String bizRequest = VehicleModelSyncRequestFactory.createInvalidFieldRequest();
        
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
    @Description("车型同步V2接口")
    @Story("异常场景-缺少必填字段")
    public void testVehicleModelSync_MissingRequired() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        // 获取method值
        String method = MethodConstants.VEHICLE_MODEL_SYNCHRONIZATION;
        System.out.println("method值为: " + method);
        
        String bizRequest = VehicleModelSyncRequestFactory.createMissingRequiredFieldRequest();
        
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

    @Test(description = "删除场景测试：删除牌照类型")
    @Description("车型同步V2接口")
    @Story("删除场景-删除牌照类型")
    public void testVehicleModelSync_DeleteLicenseType() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        // 获取method值
        String method = MethodConstants.VEHICLE_MODEL_SYNCHRONIZATION;
        System.out.println("method值为: " + method);
        
        String bizRequest = VehicleModelSyncRequestFactory.createDeleteLicenseTypeRequest();
        
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

    @Test(description = "异常场景测试：超过最大牌照类型数量")
    @Description("车型同步V2接口")
    @Story("异常场景-超过最大牌照类型数量")
    public void testVehicleModelSync_ExceedMaxLicenseTypes() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        // 获取method值
        String method = MethodConstants.VEHICLE_MODEL_SYNCHRONIZATION;
        System.out.println("method值为: " + method);
        
        String bizRequest = VehicleModelSyncRequestFactory.createExceedMaxLicenseTypesRequest();
        
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", method);
        formBody.put("bizRequest", bizRequest);
        
        Response response = httpHelper.postRequestForForm(url, formBody);
        try {
            String res = response.body().string();
            System.out.println("响应结果：" + res);
            assertNotEquals(printResponseHelper.printResponseString(res, "code"), "1", "结果不符合预期");
            // 验证错误信息，具体错误信息根据实际情况调整
            // assertEquals(printResponseHelper.printResponseString(res, "message"), "牌照类型数量超过最大限制50个", "结果不符合预期");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
} 