package com.saas.qa.api.factory;

import com.alibaba.fastjson.JSON;
import com.saas.qa.api.model.OpenStoreSyncRequest;
import com.saas.qa.api.model.StoreInfoRequest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StoreInfoRequestFactory {
    public static String createNormalRequest() {
        StoreInfoRequest request = new StoreInfoRequest();
        request.setStoreId("test57_hello");
        request.setSaasStoreId(7315L);
        request.setChannelId(2L);
        request.setStoreName("Test Store");
        request.setAddress("123 Test St");
        request.setStorePosType((byte) 1);
        request.setPosHub((byte) 0);
        request.setMinAdvanceBookingTime(new BigDecimal(1));
        request.setMaxAdvanceBookingTime(new BigDecimal(30));
        request.setOrderInterval(60);
        request.setStoreType((byte) 0);
        request.setStoreStatus((byte) 1);
        request.setDelFlg(false);

        OpenStoreSyncRequest syncRequest = new OpenStoreSyncRequest();
        List<StoreInfoRequest> storeInfoList = new ArrayList<>();
        storeInfoList.add(request);
        syncRequest.setStoreInfoList(storeInfoList);

        return JSON.toJSONString(syncRequest);
    }

    public static String createMissingRequiredFieldRequest() {
        StoreInfoRequest request = new StoreInfoRequest();
        request.setStoreId("test57_hello");
        request.setSaasStoreId(7315L);
        request.setChannelId(2L);
        request.setAddress("123 Test St");
        request.setStorePosType((byte) 1);
        request.setPosHub((byte) 0);
        request.setMinAdvanceBookingTime(new BigDecimal(1));
        request.setMaxAdvanceBookingTime(new BigDecimal(30));
        request.setOrderInterval(60);
        request.setStoreType((byte) 0);
        request.setStoreStatus((byte) 1);
        request.setDelFlg(false);

        OpenStoreSyncRequest syncRequest = new OpenStoreSyncRequest();
        List<StoreInfoRequest> storeInfoList = new ArrayList<>();
        storeInfoList.add(request);
        syncRequest.setStoreInfoList(storeInfoList);

        return JSON.toJSONString(syncRequest);
    }

    public static String createInvalidChannelRequest() {
        StoreInfoRequest request = new StoreInfoRequest();
        request.setStoreId("test57_hello");
        request.setSaasStoreId(7315L);
        request.setChannelId(10L); // Invalid channel ID
        request.setStoreName("Test Store");
        request.setAddress("123 Test St");
        request.setStorePosType((byte) 1);
        request.setPosHub((byte) 0);
        request.setMinAdvanceBookingTime(new BigDecimal(1));
        request.setMaxAdvanceBookingTime(new BigDecimal(30));
        request.setOrderInterval(60);
        request.setStoreType((byte) 0);
        request.setStoreStatus((byte) 1);
        request.setDelFlg(false);

        OpenStoreSyncRequest syncRequest = new OpenStoreSyncRequest();
        List<StoreInfoRequest> storeInfoList = new ArrayList<>();
        storeInfoList.add(request);
        syncRequest.setStoreInfoList(storeInfoList);

        return JSON.toJSONString(syncRequest);
    }
}