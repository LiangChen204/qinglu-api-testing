package com.saas.qa.api.factory;

import com.alibaba.fastjson.JSON;
import com.saas.qa.api.model.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 组装门店基础信息同步接口的入参数据
 * @since 2025-03-03
 */
public class StoreBaseSyncRequestFactory {
    
    /**
     * 创建正常场景的请求数据
     */
    public static String createNormalRequest() {
        OpenStoreSyncRequest request = new OpenStoreSyncRequest();
        List<StoreInfoRequest> storeInfoList = new ArrayList<>();
        
        StoreInfoRequest storeInfo = new StoreInfoRequest();
        // 设置基本信息
        storeInfo.setStoreId("test57_hello");
        storeInfo.setSaasStoreId(7315L);
        storeInfo.setChannelId(2L);
        storeInfo.setStoreName("测试门店");
        storeInfo.setAddress("北京市朝阳区测试地址");
        storeInfo.setStorePosType((byte) 1);
        storeInfo.setPosHub((byte) 0);
        storeInfo.setMinAdvanceBookingTime(new BigDecimal("1"));
        storeInfo.setMaxAdvanceBookingTime(new BigDecimal("30"));
        storeInfo.setOrderInterval(60);
        storeInfo.setStoreType((byte) 0);
        storeInfo.setStoreStatus((byte) 1);
        
        // 设置经纬度
        LongLatRequest longLat = new LongLatRequest();
        longLat.setLongitude(116.397428);
        longLat.setLatitude(39.909946);
        storeInfo.setLongLat(longLat);
        
        // 设置营业时间
        List<BusinessTimeV2Request> businessTimeList = new ArrayList<>();
        BusinessTimeV2Request businessTime = new BusinessTimeV2Request();
        businessTime.setBusinessPeriod("1111111");
        businessTime.setNightService((byte) 0);
        
        List<PeriodTimeRequest> periodTimeList = new ArrayList<>();
        PeriodTimeRequest periodTime = new PeriodTimeRequest();
        periodTime.setFromTime(800);
        periodTime.setToTime(2200);
        periodTimeList.add(periodTime);
        businessTime.setPeriodTimeList(periodTimeList);
        
        businessTimeList.add(businessTime);
        storeInfo.setBusinessTimeV2List(businessTimeList);
        
        // 设置联系人
        List<StoreContactRequest> contactList = new ArrayList<>();
        StoreContactRequest contact = new StoreContactRequest();
        contact.setLinkName("测试联系人");
        contact.setCountryCode("+86");
        contact.setMobile("13800138000");
        contact.setContactType((byte) 0);
        contactList.add(contact);
        storeInfo.setContactList(contactList);
        
        // 设置零散规则
        List<StoreHourlyChargeRequest> hourlyChargeList = new ArrayList<>();
        StoreHourlyChargeRequest hourlyCharge1 = new StoreHourlyChargeRequest();
        hourlyCharge1.setScene((byte) 1);
        hourlyCharge1.setChargeItem((byte) 1);
        hourlyCharge1.setChargeValue("0.25,0.35,0.5,0.75,0.8,0.9,1,1");
        hourlyChargeList.add(hourlyCharge1);
        
        StoreHourlyChargeRequest hourlyCharge2 = new StoreHourlyChargeRequest();
        hourlyCharge2.setScene((byte) 2);
        hourlyCharge2.setChargeItem((byte) 1);
        hourlyCharge2.setChargeValue("0.25,0.35,0.5,0.75,0.8,0.9,1,1");
        hourlyChargeList.add(hourlyCharge2);
        
        storeInfo.setHourlyChargeList(hourlyChargeList);
        storeInfo.setDelFlg(false);
        
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
        // 只设置部分必填字段，故意遗漏一些必填字段
        storeInfo.setStoreId("test57_hello");
        storeInfo.setSaasStoreId(7315L);
        storeInfo.setChannelId(2L);
        // 故意不设置必填字段storeName
        storeInfo.setAddress("北京市朝阳区测试地址");
        storeInfo.setStorePosType((byte) 1);
        storeInfo.setPosHub((byte) 0);
        storeInfo.setStoreType((byte) 0);
        storeInfo.setStoreStatus((byte) 1);
        
        // 设置经纬度
        LongLatRequest longLat = new LongLatRequest();
        longLat.setLongitude(116.397428);
        longLat.setLatitude(39.909946);
        storeInfo.setLongLat(longLat);
        
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
        storeInfo.setStoreName("测试门店");
        storeInfo.setAddress("北京市朝阳区测试地址");
        storeInfo.setStorePosType((byte) 9); // 使用无效的位置类型
        storeInfo.setPosHub((byte) 9); // 使用无效的枢纽类型
        storeInfo.setStoreType((byte) 9); // 使用无效的门店类型
        storeInfo.setStoreStatus((byte) 9); // 使用无效的状态值
        
        // 设置经纬度
        LongLatRequest longLat = new LongLatRequest();
        longLat.setLongitude(999.999999); // 使用无效的经度值
        longLat.setLatitude(999.999999); // 使用无效的纬度值
        storeInfo.setLongLat(longLat);
        
        storeInfoList.add(storeInfo);
        request.setStoreInfoList(storeInfoList);
        
        return JSON.toJSONString(request);
    }

    // 继续创建其他场景的请求数据...
} 