package com.saas.qa.api.testcase.mainsaas;

import com.saas.qa.api.base.HttpBase;
import com.saas.qa.api.factory.SearchRequestFactory;
import io.qameta.allure.Description;
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
    @Description("使用工厂模式动态生成请求参数")
    public void testStoreSearch() {
        // 使用工厂类生成请求JSON
        String jsonInput = SearchRequestFactory.createShangHaiSearchRequest();
        
        String path = "http://s2.qinglusaas-dev.com/api/aggregate/v1/store/merchant/1/store/search";
        Headers headers = Headers.of();
        Response response = httpHelper.postRequestForJson(path, jsonInput, headers);
        
        // 验证响应结果
        String res = null;
        try {
            res = response.body().string();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("响应结果：" + res);
        assertEquals(printResponseHelper.printResponseString(res, "message"), "success", "message结果不符合预期");
        assertNotNull(printResponseHelper.printResponseString(res, "data"), "data结果不符合预期");
        assertEquals(printResponseHelper.printResponseString(res, "code"), "0", "code结果不符合预期");
    }
}
