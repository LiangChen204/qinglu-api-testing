package com.saas.qa.api.qingluapi.testcase;

import com.alibaba.fastjson.JSONObject;
import com.saas.qa.api.qingluapi.util.HttpHelper;
import okhttp3.Headers;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VehicleModelPriceSearchTest {

    HttpHelper httpHelper = new HttpHelper();
    @Test(description = "车型列表搜索接口")
    public void testStoreSearch() throws Exception {
        String path = "http://s2.qinglusaas-dev.com/api/aggregate/v1/vehicle/merchant/1/store-vehicle-model-price/search";
        String jsonInput = "{\"channelId\":2,\"storePairList\":[{\"id\":1,\"pickUpStore\":{\"id\":2,\"cityCode\":\"107\",\"serviceCircleIdList\":[-1]},\"returnStore\":{\"id\":2,\"cityCode\":\"107\",\"serviceCircleIdList\":[-1]}}],\"pickUpDate\":\"2024-01-05 12:00\",\"returnDate\":\"2024-01-06 12:00\",\"pickUpPoint\":{\"longitude\":120.115127,\"latitude\":30.300649},\"returnPoint\":{\"longitude\":119.972922,\"latitude\":30.291166},\"priceChannel\":10,\"useServiceCircle\":1}";
        Headers headers =Headers.of();
        String result = httpHelper.postForJson(path, jsonInput, headers);
        JSONObject jsonObject = JSONObject.parseObject(result);
        System.out.println("result输出为：" + result);
        Assert.assertEquals(jsonObject.get("code"), "0");
        Assert.assertEquals(jsonObject.get("message"), "success");
    }

}
