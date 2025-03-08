package com.saas.qa.api.testcase.open.car;

import com.saas.qa.api.base.HttpBase;
import com.saas.qa.api.constants.MethodConstants;
import com.saas.qa.api.factory.VehicleSyncRequestFactory;
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
 * 车辆同步测试类
 * AI开头
 * @since 2024-05-15
 */
@Epic("车辆管理")
@Feature("车辆同步接口")
public class VehicleSyncTest extends HttpBase {

    @Test(description = "正常场景测试：传递合法参数")
    @Description("车辆同步接口")
    @Story("正常场景")
    public void testVehicleSync_Success() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        String bizRequest = VehicleSyncRequestFactory.createNormalRequest();
        
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", MethodConstants.VEHICLE_SYNC);
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
    @Description("车辆同步接口")
    @Story("异常场景-字段值异常")
    public void testVehicleSync_InvalidField() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        String bizRequest = VehicleSyncRequestFactory.createInvalidFieldRequest();
        
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", MethodConstants.VEHICLE_SYNC);
        formBody.put("bizRequest", bizRequest);
        
        Response response = httpHelper.postRequestForForm(url, formBody);
        try {
            String res = response.body().string();
            System.out.println("响应结果：" + res);
            assertNotEquals(printResponseHelper.printResponseString(res, "code"), "1", "结果不符合预期");
            // 验证错误信息，具体错误信息根据实际情况调整
            // assertEquals(printResponseHelper.printResponseString(res, "message"), "车架号格式不正确", "结果不符合预期");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(description = "异常场景测试：缺少必填字段")
    @Description("车辆同步接口")
    @Story("异常场景-缺少必填字段")
    public void testVehicleSync_MissingRequired() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        String bizRequest = VehicleSyncRequestFactory.createMissingRequiredFieldRequest();
        
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", MethodConstants.VEHICLE_SYNC);
        formBody.put("bizRequest", bizRequest);
        
        Response response = httpHelper.postRequestForForm(url, formBody);
        try {
            String res = response.body().string();
            System.out.println("响应结果：" + res);
            assertNotEquals(printResponseHelper.printResponseString(res, "code"), "1", "结果不符合预期");
            // 验证错误信息，具体错误信息根据实际情况调整
            // assertEquals(printResponseHelper.printResponseString(res, "message"), "车辆ID不能为空", "结果不符合预期");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(description = "异常场景测试：空列表")
    @Description("车辆同步接口")
    @Story("异常场景-空列表")
    public void testVehicleSync_EmptyList() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        String bizRequest = VehicleSyncRequestFactory.createEmptyListRequest();
        
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", MethodConstants.VEHICLE_SYNC);
        formBody.put("bizRequest", bizRequest);
        
        Response response = httpHelper.postRequestForForm(url, formBody);
        try {
            String res = response.body().string();
            System.out.println("响应结果：" + res);
            assertNotEquals(printResponseHelper.printResponseString(res, "code"), "1", "结果不符合预期");
            // 验证错误信息，具体错误信息根据实际情况调整
            // assertEquals(printResponseHelper.printResponseString(res, "message"), "列表不能为空", "结果不符合预期");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(description = "异常场景测试：超过最大数量")
    @Description("车辆同步接口")
    @Story("异常场景-超过最大数量")
    public void testVehicleSync_ExceedMaxCount() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        
        String bizRequest = VehicleSyncRequestFactory.createExceedMaxCountRequest();
        
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", MethodConstants.VEHICLE_SYNC);
        formBody.put("bizRequest", bizRequest);
        
        Response response = httpHelper.postRequestForForm(url, formBody);
        try {
            String res = response.body().string();
            System.out.println("响应结果：" + res);
            assertNotEquals(printResponseHelper.printResponseString(res, "code"), "1", "结果不符合预期");
            // 验证错误信息，具体错误信息根据实际情况调整
            // assertEquals(printResponseHelper.printResponseString(res, "message"), "列表数量超过最大限制50条", "结果不符合预期");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
} 