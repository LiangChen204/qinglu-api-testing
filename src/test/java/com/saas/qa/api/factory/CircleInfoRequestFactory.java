package com.saas.qa.api.factory;

import com.alibaba.fastjson.JSON;
import com.saas.qa.api.model.OpenCircleInfoRequest;

/**
 * 组装服务圈信息查询接口的入参数据
 */
public class CircleInfoRequestFactory {

    /**
     * 创建正常的服务圈信息查询请求
     */
    public static String createNormalRequest() {
        OpenCircleInfoRequest request = new OpenCircleInfoRequest();
        request.setStoreId("test57_hello");
        request.setSaasStoreId(7315L);
        request.setChannelId(2L);
        return JSON.toJSONString(request);
    }

    /**
     * 创建缺少必填字段的服务圈信息查询请求
     */
    public static String createMissingRequiredFieldRequest() {
        OpenCircleInfoRequest request = new OpenCircleInfoRequest();
        request.setStoreId("test57_hello");
        request.setChannelId(2L);
        return JSON.toJSONString(request);
    }

    /**
     * 创建字段异常的服务圈信息查询请求
     */
    public static String createInvalidFieldRequest() {
        OpenCircleInfoRequest request = new OpenCircleInfoRequest();
        request.setStoreId("test57_hello");
        request.setSaasStoreId(7315L);
        request.setChannelId(10L); // 无效的渠道ID
        return JSON.toJSONString(request);
    }
}