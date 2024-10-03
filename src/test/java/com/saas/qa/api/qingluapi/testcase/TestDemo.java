package com.saas.qa.api.qingluapi.testcase;

import com.saas.qa.api.qingluapi.util.HttpHelper;
import okhttp3.FormBody;
import okhttp3.Headers;
import org.testng.annotations.Test;

public class TestDemo {

    HttpHelper httpHelper = new HttpHelper();
//    @Test
//    public void test() throws Exception {
//        // 创建一个 URL 对象
//        URL url = new URL("http://s2.qinglusaas-dev.com/api/aggregate/v1/store/merchant/1/store/search");
//        // 打开连接
//        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//        // 设置请求方法为 POST
//        connection.setRequestMethod("POST");
//        // 设置允许输出
//        connection.setDoOutput(true);
//
//        // 设置 Content-Type 为 application/json
//        connection.setRequestProperty("Content-Type", "application/json; utf-8");
//
//        // 构建 JSON 数据
//        String jsonInputString = "{\"channelId\":1,\"pickUpCityId\":107,\"pickUpDate\":\"2024-09-04 18:00:00\",\"pickUpPoint\":{\"latitude\":31.19,\"longitude\":121.31},\"returnCityId\":107,\"returnDate\":\"2024-09-05 9:00:00\",\"returnPoint\":{\"latitude\":31.19,\"longitude\":121.31}}";
//
//        // 通过连接获取输出流，用于向服务器发送请求数据
//        try (OutputStream os = connection.getOutputStream()) {
//            // 将输入的JSON字符串转换为字节数组，准备发送
//            byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
//            // 将字节数组写入输出流，发送数据
//            os.write(input, 0, input.length);
//        }
//
//        // 获取响应码
//        int responseCode = connection.getResponseCode();
//        System.out.println("Response Code : " + responseCode);
//        if (responseCode == HttpURLConnection.HTTP_OK) {
//            // 读取响应
//            StringBuilder response = new StringBuilder();
//            try (java.util.Scanner scanner = new java.util.Scanner(connection.getInputStream(), "UTF-8")) {
//                while (scanner.hasNext()) {
//                    response.append(scanner.nextLine());
//                }
//            }
//            System.out.println("Response: " + response.toString());
//        }
//
//        // 关闭连接
//        connection.disconnect();
//    }

    @Test
    public void testPost() throws Exception {
        String path = "http://s2.qinglusaas-dev.com/api/aggregate/v1/store/merchant/1/store/search";
        String jsonInput = "{\"channelId\":1,\"pickUpCityId\":107,\"pickUpDate\":\"2024-09-04 18:00:00\",\"pickUpPoint\":{\"latitude\":31.19,\"longitude\":121.31},\"returnCityId\":107,\"returnDate\":\"2024-09-05 9:00:00\",\"returnPoint\":{\"latitude\":31.19,\"longitude\":121.31}}";
        Headers headers =Headers.of();
        String result = httpHelper.postForJson(path, jsonInput, headers);
        System.out.println("result输出为：" + result);
    }

    @Test
    public void testGet() throws Exception {
        String url = "https://www.baidu.com/sugrec?&prod=pc_his&from=pc_web&json=1&sid=60276_60565_60360_60621&hisdata=&_t=1724060271359&req=2&csor=0";
        String result = httpHelper.get(url);
        System.out.println("result输出为：" + result);
    }

    @Test
    public void testPostForForm() throws Exception {
        String url = "http://sa-dev.qinglusaas.com/api/order/v1/plan_vehicle/update?buildTime=20240923_182514";
        FormBody body = new FormBody.Builder()
                .add("orderId", "470429")
                .add("vehicleId", "23948")
                .add("vehicleModelId", "3812")
                .build();
        Headers headers =Headers.of(
                "Content-Type", "application/x-www-form-urlencoded",
                "x-auth-token", "bcd1169e9667453d9019d9596ff023bd",
                "User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36",
                "content-length:", "51",
                "Host", "sa-dev.qinglusaas.com",
                "user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36",
                "Origin", "http://whale.qinglusaas-dev.com"
        );
        System.out.println("headers输出为：" + headers);
        // 输出FormBody数据
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < body.size(); i++) {
            sb.append(body.name(i)).append('=').append(body.value(i));
            if (i < body.size() - 1) {
                sb.append("\n");
            }
        }
        System.out.println("body输出为：" + sb.toString());
        String result = httpHelper.postForForm(url, body, headers);
        System.out.println("result输出为：" + result);

    }

}
