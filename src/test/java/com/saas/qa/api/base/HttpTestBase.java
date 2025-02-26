//package com.saas.qa.api.qingluapi.base;
//
//import com.saas.qa.api.qingluapi.util.HttpHelper;
//import okhttp3.OkHttpClient;
//import okhttp3.Request;
//import okhttp3.Response;
//import org.testng.annotations.BeforeClass;
//
//import java.io.IOException;
//
//public class HttpTestBase {
//
//    HttpHelper httpHelper;
//
//    @BeforeClass(description = "初始化连接")
//    public void initConnection() {
//        OkHttpClient client = new OkHttpClient();
//        httpHelper = new HttpHelper(client);
//    }
//
//    // 组装GET请求
//    public Response sendGetRequest(String url) throws IOException {
//        Request request = new Request.Builder()
//                .url(url)
//                .get()
//                .build();
//        return httpHelper.executeRequest(request);
//    }
//
//    // 组装POST请求
//    public Response sendPostRequest(String url, String jsonBody) throws IOException {
//        Request request = new Request.Builder()
//                .url(url)
//                .post(okhttp3.RequestBody.create(jsonBody, okhttp3.MediaType.parse("application/json")))
//                .build();
//        return httpHelper.executeRequest(request);
//    }
//
//    // 组装PUT请求
//    public Response sendPutRequest(String url, String jsonBody) throws IOException {
//        Request request = new Request.Builder()
//                .url(url)
//                .put(okhttp3.RequestBody.create(jsonBody, okhttp3.MediaType.parse("application/json")))
//                .build();
//        return httpHelper.executeRequest(request);
//    }
//
//    // 组装DELETE请求
//    public Response sendDeleteRequest(String url) throws IOException {
//        Request request = new Request.Builder()
//                .url(url)
//                .delete()
//                .build();
//        return httpHelper.executeRequest(request);
//    }
//}