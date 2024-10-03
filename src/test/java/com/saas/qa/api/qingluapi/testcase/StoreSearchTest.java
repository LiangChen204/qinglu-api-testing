package com.saas.qa.api.qingluapi.testcase;

import com.alibaba.fastjson.JSONObject;
import com.saas.qa.api.qingluapi.util.HttpHelper;
import okhttp3.Headers;
import org.testng.Assert;
import org.testng.annotations.Test;
public class StoreSearchTest {

    HttpHelper httpHelper = new HttpHelper();
    @Test(description = "门店搜索接口")
    public void testStoreSearch() throws Exception {
        String path = "http://s2.qinglusaas-dev.com/api/aggregate/v1/store/merchant/1/store/search";
        String jsonInput = "{\"channelId\":1,\"pickUpCityId\":107,\"pickUpDate\":\"2024-09-04 18:00:00\",\"pickUpPoint\":{\"latitude\":31.19,\"longitude\":121.31},\"returnCityId\":107,\"returnDate\":\"2024-09-05 9:00:00\",\"returnPoint\":{\"latitude\":31.19,\"longitude\":121.31}}";
        Headers headers =Headers.of();
        String result = httpHelper.postForJson(path, jsonInput, headers);
        JSONObject jsonObject = JSONObject.parseObject(result);
        System.out.println("result输出为：" + result);
        Assert.assertEquals(jsonObject.get("code"), "0");
        Assert.assertEquals(jsonObject.get("message"), "success");
    }
}
