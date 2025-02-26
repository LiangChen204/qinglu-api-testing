package com.saas.qa.api.testcase.open.store;

import com.saas.qa.api.base.HttpBase;
import com.saas.qa.api.constants.MethodConstants;
import okhttp3.Response;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;

public class StoreStatusUpdateTest extends HttpBase {

    @Test(description = "正常更新门店状态")
    public void updateStoreStatus_Success() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        // 创建请求体对象
        String bizRequest = "{\"storeInfoList\":[{\"storeId\":\"test57_hello\",\"saasStoreId\":7305,\"channelId\":2,\"storeStatus\":0}]}";
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", MethodConstants.STORE_STATUS_UPDATE);
        formBody.put("bizRequest", bizRequest);
        // 发送POST请求
        Response response = httpHelper.postRequestForForm(url, formBody);
        try {
            String res = response.body().string();
            System.out.println("响应结果：" + res);
            // 验证响应结果
            assertEquals(printResponseHelper.printResponseString(res, "code"), "1", "结果不符合预期");
            assertEquals(printResponseHelper.printResponseString(res,"data"), "true", "结果不符合预期");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Test(description = "入参缺失时更新门店状态")
    public void updateStoreStatus_MissingStoreId() {
        String url = MethodConstants.Hello_BASE_URL + "/open/test";
        // 创建请求体对象
        String bizRequest = "{\"storeInfoList\":[{\"channelId\":2,\"storeStatus\":0}]}";
        Map<String, String> formBody = new HashMap<>();
        formBody.put("method", MethodConstants.STORE_STATUS_UPDATE);
        formBody.put("bizRequest", bizRequest);
        // 发送POST请求
        Response response = httpHelper.postRequestForForm(url, formBody);
        //验证响应结果
        try {
            String res = response.body().string();
            System.out.println("响应结果：" + res);
            assertEquals(printResponseHelper.printResponseString(res,"message"), "错误", "结果不符合预期");
            assertEquals(printResponseHelper.printResponseString(res,"data"), "null", "结果不符合预期");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
