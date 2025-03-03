package com.saas.qa.api.factory;

import com.alibaba.fastjson.JSON;
import com.saas.qa.api.model.OpenStoreSyncRequest;
import com.saas.qa.api.model.StoreInfoRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * 组装门店状态同步接口的入参数据
 * @since 2024-01-10
 */
public class StoreSyncRequestFactory {
    
    /**
     * 创建正常场景的请求数据
     */
    public static String createNormalRequest() {
        OpenStoreSyncRequest request = new OpenStoreSyncRequest();
        List<StoreInfoRequest> storeInfoList = new ArrayList<>();
        
        StoreInfoRequest storeInfo = new StoreInfoRequest();
        storeInfo.setStoreId("test57_hello");
        storeInfo.setSaasStoreId(7315L);
        storeInfo.setChannelId(2L);
        storeInfo.setStoreStatus((byte) 1);
        
        storeInfoList.add(storeInfo);
        request.setStoreInfoList(storeInfoList);
        
        return JSON.toJSONString(request);
    }
    
    /**
     * 创建缺少必填字段的请求数据
     */
    public static String createMissingRequiredFieldRequest() {
        OpenStoreSyncRequest request = new OpenStoreSyncRequest();
        List<StoreInfoRequest> storeInfoList = new ArrayList<>();
        
        StoreInfoRequest storeInfo = new StoreInfoRequest();
        // 故意不设置storeId
        storeInfo.setSaasStoreId(7315L);
        storeInfo.setChannelId(2L);
        storeInfo.setStoreStatus((byte) 1);
        
        storeInfoList.add(storeInfo);
        request.setStoreInfoList(storeInfoList);
        
        return JSON.toJSONString(request);
    }
    
    /**
     * 创建无效字段值的请求数据
     */
    public static String createInvalidFieldRequest() {
        OpenStoreSyncRequest request = new OpenStoreSyncRequest();
        List<StoreInfoRequest> storeInfoList = new ArrayList<>();
        
        StoreInfoRequest storeInfo = new StoreInfoRequest();
        storeInfo.setStoreId("test57_hello");
        storeInfo.setSaasStoreId(7315L);
        storeInfo.setChannelId(999L); // 使用无效的渠道ID
        storeInfo.setStoreStatus((byte) 3); // 使用无效的状态值
        
        storeInfoList.add(storeInfo);
        request.setStoreInfoList(storeInfoList);
        
        return JSON.toJSONString(request);
    }
} 