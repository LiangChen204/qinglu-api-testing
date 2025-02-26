package com.saas.qa.api.testcase.mainsaas;

import com.saas.qa.api.base.HttpBase;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import okhttp3.Headers;
import okhttp3.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

@Epic("询价流程")
@Feature("门店搜索接口")
public class StoreSearchTest extends HttpBase {
    @Story("询价搜索接口")
    @Test(description = "有资源透出场景")
    public void testStoreSearch() throws Exception {
        String path = "http://s2.qinglusaas-dev.com/api/aggregate/v1/store/merchant/1/store/search";
        String jsonInput = "{\"channelId\":1,\"pickUpCityId\":107,\"pickUpDate\":\"2025-05-04 18:00:00\",\"pickUpPoint\":{\"latitude\":31.19,\"longitude\":121.31},\"returnCityId\":107,\"returnDate\":\"2025-05-05 9:00:00\",\"returnPoint\":{\"latitude\":31.19,\"longitude\":121.31}}";
        Headers headers =Headers.of();
        Response response = httpHelper.postRequestForJson(path, jsonInput, headers);
        //验证响应结果
        try {
            String res = response.body().string();
            System.out.println("响应结果：" + res);
            assertEquals(printResponseHelper.printResponseString(res,"message"), "success", "message结果不符合预期");
            assertNotNull(printResponseHelper.printResponseString(res,"data"), "data结果不符合预期");
            assertEquals(printResponseHelper.printResponseString(res,"code"), "0", "code结果不符合预期");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
