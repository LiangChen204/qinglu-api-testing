package com.saas.qa.api.factory;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.saas.qa.api.model.Point;
import com.saas.qa.api.model.StoreSearchRequest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// 组装对应的接口 json入参 数据 ，已给对应的接口调用使用
public class SearchRequestFactory {
    
    /**
     * 创建上海地区的搜索请求
     */
    public static String createShangHaiSearchRequest() {
        StoreSearchRequest request = new StoreSearchRequest();
        request.setChannelId(1);
        request.setPickUpCityId(107); // 上海市ID
        
        // 动态生成取车时间（当前时间后推一年）
        LocalDateTime pickUpTime = LocalDateTime.now().plusYears(1);
        request.setPickUpDate(pickUpTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        
        // 设置取车坐标
        Point pickUpPoint = new Point();
        pickUpPoint.setLatitude(31.19);
        pickUpPoint.setLongitude(121.31);
        request.setPickUpPoint(pickUpPoint);
        
        // 设置还车信息
        request.setReturnCityId(107);
        request.setReturnDate(pickUpTime.plusDays(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        
        // 设置还车坐标
        Point returnPoint = new Point();
        returnPoint.setLatitude(31.19);
        returnPoint.setLongitude(121.31);
        request.setReturnPoint(returnPoint);
        
        return JSON.toJSONString(request);
    }
    
    /**
     * 创建北京地区的搜索请求
     */
    public static String createBeijingSearchRequest() {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("channelId", 1);
        jsonObj.put("pickUpCityId", 101); // 北京市ID
        
        // 动态生成取车时间（当前时间后推一年）
        String pickUpDate = LocalDateTime.now().plusYears(1)
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        jsonObj.put("pickUpDate", pickUpDate);
        
        JSONObject pickUpPoint = new JSONObject();
        pickUpPoint.put("latitude", 39.90);
        pickUpPoint.put("longitude", 116.40);
        jsonObj.put("pickUpPoint", pickUpPoint);
        
        jsonObj.put("returnCityId", 101);
        
        String returnDate = LocalDateTime.now().plusYears(1).plusDays(1)
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        jsonObj.put("returnDate", returnDate);
        
        JSONObject returnPoint = new JSONObject();
        returnPoint.put("latitude", 39.90);
        returnPoint.put("longitude", 116.40);
        jsonObj.put("returnPoint", returnPoint);
        
        return jsonObj.toJSONString();
    }
} 