package com.saas.qa.api.testcase.mainsaas;

import com.saas.qa.api.base.HttpBase;
import okhttp3.Headers;
import okhttp3.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VehicleModelPriceSearchTest extends HttpBase {

    @Test(description = "车型列表搜索接口")
    public void testStoreSearch() throws Exception {
        String path = "http://s2.qinglusaas-dev.com/api/aggregate/v1/vehicle/merchant/1/store-vehicle-model-price/search";
        String jsonInput = "{\"channelId\":2,\"storePairList\":[{\"id\":1,\"pickUpStore\":{\"id\":2,\"cityCode\":\"107\",\"serviceCircleIdList\":[-1]},\"returnStore\":{\"id\":2,\"cityCode\":\"107\",\"serviceCircleIdList\":[-1]}}],\"pickUpDate\":\"2025-05-05 12:00\",\"returnDate\":\"2025-05-06 12:00\",\"pickUpPoint\":{\"longitude\":120.115127,\"latitude\":30.300649},\"returnPoint\":{\"longitude\":119.972922,\"latitude\":30.291166},\"priceChannel\":10,\"useServiceCircle\":1}";
        Headers headers =Headers.of();
        Response response = httpHelper.postRequestForJson(path, jsonInput, headers);
        // 校验返回码和返回消息
        String result = response.body().string();
        System.out.println("result输出为:" + result);
        Assert.assertEquals(printResponseHelper.printResponseString(result, "message"), "success", "返回信息校验失败");
        Assert.assertEquals(printResponseHelper.printResponseString(result, "code"), "1", "返回code校验失败");
    }

}
