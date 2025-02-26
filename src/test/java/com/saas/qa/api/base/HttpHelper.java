
package com.saas.qa.api.base;


import okhttp3.*;
import java.util.Map;
import java.io.IOException;

public class HttpHelper {

    /**
     * 发送 POST 请求，入参为 JSON 格式
     *
     * @param jsonBody JSON 格式的请求体字符串
     * @return Response 对象
     */
    public Response postRequestForJson(String baseUrl, String jsonBody, Headers headers) {
        try {
            // 创建 OkHttpClient 实例
            OkHttpClient client = new OkHttpClient();

            // 创建请求体
            RequestBody body = RequestBody.create(jsonBody, MediaType.parse("application/json"));

            // 创建请求
            Request request = new Request.Builder()
                    .url(baseUrl) // 替换为你的API路径
                    .post(body)
                    .build();

            // 发送请求并获取响应
            return client.newCall(request).execute();
        } catch (IOException e) {
            throw new RuntimeException("Failed to send POST request", e);
        }
    }

    /**
     * 发送 POST 请求，入参为表单格式
     * @param formData 表单数据（键值对）
     * @return Response 对象
     */

    public Response postRequestForForm(String baseUrl, Map<String, String> formData) {
        try {
            // 创建 OkHttpClient 实例
            OkHttpClient client = new OkHttpClient();

            // 创建表单体
            FormBody.Builder formBuilder = new FormBody.Builder();
            for (Map.Entry<String, String> entry : formData.entrySet()) {
                formBuilder.add(entry.getKey(), entry.getValue());
            }
            RequestBody body = formBuilder.build();

            // 创建请求
            Request request = new Request.Builder()
                    .url(baseUrl) // 替换为你的API路径
                    .post(body)
                    .build();

            // 发送请求并获取响应
            return client.newCall(request).execute();
        } catch (IOException e) {
            throw new RuntimeException("Failed to send POST request", e);
        }
    }

    public String get(String url) {
        return null;
    }
}