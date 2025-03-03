package com.saas.qa.api.testcase.open.car;

import com.saas.qa.api.base.HttpBase;
import com.saas.qa.api.constants.MethodConstants;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import okhttp3.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Epic("车型管理") // 模块名称
@Feature("车型操作") // 功能名称
public class VehicleModelOpertationTest extends HttpBase {
    @Test(description = "正常场景测试：传递合法参数")
    @Description("车型推送接口") // 测试描述
    @Story("正常场景") // 测试场景
    public void testPostVehicleModel_Success1() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        // 创建请求体对象
        String bizRequest = "{\"ctripSubSeryId\":66607,\"licenseTypes\":[{\"vehicleModelId\":\"modelhello\", \"licenseType\": 2}],\"hasSnowTires\":1,\"selfServiceReturn\":1,\"fastChargeTime\":0}";
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", MethodConstants.VEHICLE_MODEL_SYNCHRONIZATION);
        formBody.put("bizRequest", bizRequest);
        // 发送POST请求
        Response response = httpHelper.postRequestForForm(url, formBody);
        try {
            String res = response.body().string();
            System.out.println("响应结果：" + res);
            // 验证响应状态码
            Assert.assertEquals(printResponseHelper.printResponseString(res, "message"), "null", "结果不符合预期");
            Assert.assertEquals(printResponseHelper.printResponseString(res, "code"), "1", "结果不符合预期");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
