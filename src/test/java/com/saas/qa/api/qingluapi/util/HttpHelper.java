package com.saas.qa.api.qingluapi.util;

import okhttp3.*;
import org.springframework.stereotype.Component;
import org.testng.annotations.Test;

import java.io.IOException;


@Component
public class HttpHelper {

//    private static final Logger logger = LoggerFactory.getLogger(HttpHelper.class);
// 创建OkHttpClient实例
    private static OkHttpClient okHttpClient;
    private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    public HttpHelper(OkHttpClient client) {
        this.okHttpClient = client;

    }

    public HttpHelper(){
        this.okHttpClient = new OkHttpClient();
    }

//    /**
//     * 发起GET请求并获取响应
//     *
//     * @param url    请求的URL
//     * @param queries    请求的查询参数，键值对形式
//     * @param headers    请求的头部信息
//     * @return    返回请求的响应内容，如果请求失败则返回空字符串
//     */
//    public String get(String url, Map<String, String> queries, Headers headers) {
//        // 初始化响应内容为空字符串
//        String responseBody = "";
//        // 使用StringBuffer初始化请求URL
//        StringBuffer sb = new StringBuffer(url);
//
//        // 如果查询参数不为空且有内容，则拼接到URL上
//        if (queries != null && queries.keySet().size() > 0) {
//            // 标记是否是第一个查询参数
//            boolean firstFlag = true;
//            // 迭代查询参数的键值对
//            Iterator iterator = queries.entrySet().iterator();
//            while (iterator.hasNext()) {
//                // 获取当前的键值对
//                Map.Entry entry = (Map.Entry<String, String>) iterator.next();
//                // 如果是第一个查询参数，使用问号开头
//                if (firstFlag) {
//                    sb.append("?").append(entry.getKey()).append("=").append(entry.getValue());
//                    firstFlag = false;
//                } else {
//                    // 否则使用与号连接
//                    sb.append("&" + entry.getKey() + "=" + entry.getValue());
//                }
//            }
//        }
//
//        // 构建请求对象
//        Request request = new Request.Builder()
//                .url(sb.toString()).headers(headers)
//                .build();
//
//        // 初始化响应对象为null
//        okhttp3.Response response = null;
//        try {
//            // 执行请求并获取响应
//            response = okHttpClient.newCall(request).execute();
//            // 获取响应状态码
//            int status = response.code();
//            if (status == 200) {
//                // 如果状态码为200，读取并返回响应内容
//                String responseStr = response.body().string();
//                logger.info("response: " + responseStr);
//                return responseStr;
//            }
//        } catch (Exception e) {
//            // 异常情况下，记录错误日志
//            logger.error("okhttp put error >> ex = {}", ExceptionUtils.getStackTrace(e));
//        } finally {
//            // 确保响应对象被关闭
//            if (response != null) {
//                response.close();
//            }
//        }
//        // 如果请求失败或异常，返回空字符串
//        return responseBody;
//    }


//    /**
//     * 发起POST请求并处理响应
//     *
//     * @param url 请求的URL
//     * @param params 请求的参数，映射形式的键值对
//     * @param headers 请求的头信息
//     * @return 响应的字符串表示，如果请求成功（状态码为200）；否则返回空字符串
//     */
//    public String post(String url, Map<String, Object> params, Headers headers) {
//        // 初始化响应体为空字符串
//        String responseBody = "";
//        // 创建表单请求体构建器
//        FormBody.Builder builder = new FormBody.Builder();
//        // 如果参数不为空且有参数，则添加到请求体中
//        if (params != null && params.keySet().size() > 0) {
//            for (String key : params.keySet()) {
//                builder.add(key, params.get(key).toString());
//            }
//        }
//        // 构建请求对象
//        Request request = new Request
//                .Builder()
//                .url(url).headers(headers)
//                .post(builder.build())
//                .build();
//        // 初始化OkHttp的响应对象为null
//        okhttp3.Response response = null;
//        // 尝试执行请求并处理响应
//        try {
//            response = okHttpClient.newCall(request).execute();
//            // 获取响应状态码
//            int status = response.code();
//            // 如果请求成功（状态码为200），则返回响应体
//            if (status == 200) {
//                String resString = response.body().string();
////                logger.info("response: " + resString);
//                return resString;
//            }
//        } catch (Exception e) {
//            // 如果发生异常，记录错误日志
////            ExceptionUtils.getStackTrace(e);
//            System.out.println("okhttp post error >> ex = {}");
////            logger.error("okhttp post error >> ex = {}", ExceptionUtils.getStackTrace(e));
//        } finally {
//            // 确保响应体被关闭
//            if (response != null) {
//                response.close();
//            }
//        }
//        // 如果请求失败或发生异常，返回初始的空字符串
//        return responseBody;
//    }

    public String get(String url) throws Exception {
        // 构建一个 GET 请求
        String Url = url;
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = null;
        try  {
            response = okHttpClient.newCall(request).execute();
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response.body().string();
    }

    public String postForJson(String url, String jsonInput, Headers headers) throws Exception {
        // 构建RequestBody对象
        RequestBody requestBody = RequestBody.create(JSON, jsonInput);

        // 构建Request对象
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody).headers(headers)
                .build();

        Response response = null;
        try  {
            response = okHttpClient.newCall(request).execute();
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response.body().string();
    }

    public String postForForm(String url, FormBody body, Headers headers) throws Exception {
        // todo

        // 构建表单请求体
//        FormBody body = new FormBody.Builder()
//                .add("key1", "value1")
//                .add("key2", "value2")
//                .build();
        // 创建请求
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();

        Response response = null;
        try {
            response = okHttpClient.newCall(request).execute();
            if (!response.isSuccessful()){
                throw new IOException("Unexpected code " + response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return response.body().string();
    }


    @Test
    public  void test1() {


    }

}



