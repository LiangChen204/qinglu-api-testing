package com.saas.qa.api.factory;

import com.alibaba.fastjson.JSON;
import com.saas.qa.api.model.CircleRequest;
import com.saas.qa.api.model.OpenCircleSyncRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * 组装门店服务圈删除接口的入参数据
 */
public class CircleDeleteRequestFactory {
    
    /**
     * 创建正常场景的请求数据
     * 使用指定的默认值：
     * storeId: test57_hello
     * saasStoreId: 7315
     * channelId: 2
     */
    public static String createNormalRequest() {
        OpenCircleSyncRequest request = new OpenCircleSyncRequest();
        List<CircleRequest> circleList = new ArrayList<>();
        
        CircleRequest circle = new CircleRequest();
        circle.setStoreId("test57_hello");
        circle.setSaasStoreId(7315L);
        circle.setChannelId(2L);
        
        circleList.add(circle);
        request.setCircleList(circleList);
        
        return JSON.toJSONString(request);
    }
    
    /**
     * 创建缺少必填字段的请求数据
     * storeId: null (必填)
     * saasStoreId: 7315
     * channelId: 2
     */
    public static String createMissingRequiredFieldRequest() {
        OpenCircleSyncRequest request = new OpenCircleSyncRequest();
        List<CircleRequest> circleList = new ArrayList<>();
        
        CircleRequest circle = new CircleRequest();
        // 故意不设置必填字段storeId
        circle.setSaasStoreId(7315L);
        circle.setChannelId(2L);
        
        circleList.add(circle);
        request.setCircleList(circleList);
        
        return JSON.toJSONString(request);
    }
    
    /**
     * 创建空列表的请求数据
     */
    public static String createEmptyListRequest() {
        OpenCircleSyncRequest request = new OpenCircleSyncRequest();
        request.setCircleList(new ArrayList<>());
        return JSON.toJSONString(request);
    }
    
    /**
     * 创建无效渠道ID的请求数据
     * storeId: test57_hello
     * saasStoreId: 7315
     * channelId: 999 (无效值)
     */
    public static String createInvalidChannelRequest() {
        OpenCircleSyncRequest request = new OpenCircleSyncRequest();
        List<CircleRequest> circleList = new ArrayList<>();
        
        CircleRequest circle = new CircleRequest();
        circle.setStoreId("test57_hello");
        circle.setSaasStoreId(7315L);
        circle.setChannelId(999L); // 使用无效的渠道ID
        
        circleList.add(circle);
        request.setCircleList(circleList);
        
        return JSON.toJSONString(request);
    }
    
    /**
     * 创建最大数量(50个)的请求数据
     */
    public static String createMaxSizeRequest() {
        OpenCircleSyncRequest request = new OpenCircleSyncRequest();
        List<CircleRequest> circleList = new ArrayList<>();
        
        for (int i = 0; i < 50; i++) {
            CircleRequest circle = new CircleRequest();
            circle.setStoreId("test57_hello_" + i);
            circle.setSaasStoreId(7315L);
            circle.setChannelId(2L);
            circleList.add(circle);
        }
        
        request.setCircleList(circleList);
        return JSON.toJSONString(request);
    }
    
    /**
     * 创建包含null值的请求数据
     */
    public static String createNullValueRequest() {
        OpenCircleSyncRequest request = new OpenCircleSyncRequest();
        List<CircleRequest> circleList = new ArrayList<>();
        
        CircleRequest circle = new CircleRequest();
        circle.setStoreId("test57_hello");
        circle.setSaasStoreId(null);  // 设置null值
        circle.setChannelId(2L);
        
        circleList.add(circle);
        request.setCircleList(circleList);
        
        return JSON.toJSONString(request);
    }
} 