package com.saas.qa.api.factory;

import com.alibaba.fastjson.JSON;
import com.saas.qa.api.model.CircleRequest;
import com.saas.qa.api.model.LongLatRequest;
import com.saas.qa.api.model.OpenCircleSyncRequest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 组装服务圈同步接口的入参数据
 * @since 2024-01-10
 */
public class CircleSyncRequestFactory {
    
    /**
     * 创建正常场景的请求数据
     */
    public static String createNormalRequest() {
        OpenCircleSyncRequest request = new OpenCircleSyncRequest();
        List<CircleRequest> circleList = new ArrayList<>();
        
        CircleRequest circle = new CircleRequest();
        circle.setCircleId("");
        circle.setSaasCircleId(null);
        circle.setStoreId("test57_hello");
        circle.setSaasStoreId(7310L);
        circle.setChannelId(2L);
        circle.setDeliveryServiceType((byte) 2);
        circle.setName("收费服务圈");
        circle.setFeeType((byte) 1);
        circle.setEnabled((byte) 1);
        circle.setFee(5000);
        
        // 设置经纬度
        List<LongLatRequest> longLats = new ArrayList<>();
        LongLatRequest longLat = new LongLatRequest();
        longLat.setLongitude(116.397428);
        longLat.setLatitude(39.909946);

        LongLatRequest longLat1 = new LongLatRequest();
        longLat1.setLongitude(116.607064);
        longLat1.setLatitude(39.856902);

        LongLatRequest longLat2 = new LongLatRequest();
        longLat2.setLongitude(116.701109);
        longLat2.setLatitude(39.896082);

        LongLatRequest longLat3 = new LongLatRequest();
        longLat3.setLongitude(116.397428);
        longLat3.setLatitude(39.909946);

        longLats.add(longLat);
        longLats.add(longLat1);
        longLats.add(longLat2);
        longLats.add(longLat3);
        circle.setLongLats(longLats);
        
        circle.setMinAdvanceBookingTime(new BigDecimal("2.5"));
        circle.setDelFlg(false);
        
        circleList.add(circle);
        request.setCircleList(circleList);
        
        return JSON.toJSONString(request);
    }
    
    /**
     * 创建缺少必填字段的请求数据
     */
    public static String createMissingRequiredFieldRequest() {
        OpenCircleSyncRequest request = new OpenCircleSyncRequest();
        List<CircleRequest> circleList = new ArrayList<>();
        
        CircleRequest circle = new CircleRequest();
        // 故意不设置必填字段
        circle.setSaasCircleId(1001L);
        circle.setStoreId("test57_hello");
        circle.setSaasStoreId(7315L);
        circle.setChannelId(2L);
        
        circleList.add(circle);
        request.setCircleList(circleList);
        
        return JSON.toJSONString(request);
    }
    
    /**
     * 创建无效字段值的请求数据
     */
    public static String createInvalidFieldRequest() {
        OpenCircleSyncRequest request = new OpenCircleSyncRequest();
        List<CircleRequest> circleList = new ArrayList<>();
        
        CircleRequest circle = new CircleRequest();
        circle.setCircleId("test_circle_001");
        circle.setSaasCircleId(1001L);
        circle.setStoreId("test57_hello");
        circle.setSaasStoreId(7315L);
        circle.setChannelId(999L); // 使用无效的渠道ID
        circle.setDeliveryServiceType((byte) 9); // 使用无效的服务类型
        circle.setName("测试服务圈");
        circle.setFeeType((byte) 1);
        circle.setEnabled((byte) 1);
        circle.setFee(5000);
        
        circleList.add(circle);
        request.setCircleList(circleList);
        
        return JSON.toJSONString(request);
    }
}