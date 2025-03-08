package com.saas.qa.api.factory;

import com.alibaba.fastjson.JSON;
import com.saas.qa.api.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 车型同步请求工厂类
 * AI开头
 * @since 2024-05-15
 */
public class VehicleModelSyncRequestFactory {

    /**
     * 创建正常场景的请求
     * 所有字段设置为合法的默认值
     */
    public static String createNormalRequest() {
        VehicleModelSyncRequest request = new VehicleModelSyncRequest();
        
        // 设置携程子车系ID
        request.setCtripSubSeryId(12345L);
        
        // 设置牌照类型列表
        List<VehicleModelLicenseType> licenseTypes = new ArrayList<>();
        VehicleModelLicenseType licenseType1 = new VehicleModelLicenseType();
        licenseType1.setLicenseTypeId(1L);
        licenseType1.setDelFlg(false);
        licenseTypes.add(licenseType1);
        
        VehicleModelLicenseType licenseType2 = new VehicleModelLicenseType();
        licenseType2.setLicenseTypeId(2L);
        licenseType2.setDelFlg(false);
        licenseTypes.add(licenseType2);
        
        request.setLicenseTypes(licenseTypes);
        
        // 设置其他必填字段
        request.setHasSnowTires(1);
        request.setSelfServiceReturn(1);
        request.setFastChargeTime(1);
        
        // 设置第三方平台车型编码
        List<ThirdVehicleModelCode> thirdVehicleModelCodes = new ArrayList<>();
        ThirdVehicleModelCode thirdCode1 = new ThirdVehicleModelCode();
        thirdCode1.setChannelId(3); // 飞猪
        thirdCode1.setThirdModelCode("FZ12345");
        thirdCode1.setDelFlg(false);
        thirdVehicleModelCodes.add(thirdCode1);
        
        ThirdVehicleModelCode thirdCode2 = new ThirdVehicleModelCode();
        thirdCode2.setChannelId(4); // 哈啰
        thirdCode2.setThirdModelCode("HL67890");
        thirdCode2.setDelFlg(false);
        thirdVehicleModelCodes.add(thirdCode2);
        
        request.setThirdVehicleModelCodes(thirdVehicleModelCodes);
        
        // 设置车型在不同门店下的车辆标签
        List<VehicleStoreTags> storeTags = new ArrayList<>();
        VehicleStoreTags storeTag1 = new VehicleStoreTags();
        storeTag1.setStoreId("store123");
        storeTag1.setTagIds(Arrays.asList(1L, 2L, 3L));
        storeTag1.setDelFlg(false);
        storeTags.add(storeTag1);
        
        VehicleStoreTags storeTag2 = new VehicleStoreTags();
        storeTag2.setStoreId("store456");
        storeTag2.setTagIds(Arrays.asList(4L, 5L, 6L));
        storeTag2.setDelFlg(false);
        storeTags.add(storeTag2);
        
        request.setStoreTags(storeTags);
        
        return JSON.toJSONString(request);
    }
    
    /**
     * 创建字段异常场景的请求
     * 部分字段设置为异常值
     */
    public static String createInvalidFieldRequest() {
        VehicleModelSyncRequest request = new VehicleModelSyncRequest();
        
        // 设置携程子车系ID为无效值
        request.setCtripSubSeryId(-1L);
        
        // 设置牌照类型列表
        List<VehicleModelLicenseType> licenseTypes = new ArrayList<>();
        VehicleModelLicenseType licenseType = new VehicleModelLicenseType();
        licenseType.setLicenseTypeId(999999L); // 不存在的牌照类型ID
        licenseType.setDelFlg(false);
        licenseTypes.add(licenseType);
        
        request.setLicenseTypes(licenseTypes);
        
        // 设置其他字段为异常值
        request.setHasSnowTires(2); // 无效值，只能是0或1
        request.setSelfServiceReturn(2); // 无效值，只能是0或1
        request.setFastChargeTime(2); // 无效值，只能是0或1
        
        return JSON.toJSONString(request);
    }
    
    /**
     * 创建必填字段为空的请求
     * 必填字段设置为null或空值
     */
    public static String createMissingRequiredFieldRequest() {
        VehicleModelSyncRequest request = new VehicleModelSyncRequest();
        
        // 不设置携程子车系ID（必填）
        
        // 不设置牌照类型列表（必填）
        
        // 不设置其他必填字段
        
        return JSON.toJSONString(request);
    }
    
    /**
     * 创建删除牌照类型的请求
     */
    public static String createDeleteLicenseTypeRequest() {
        VehicleModelSyncRequest request = new VehicleModelSyncRequest();
        
        // 设置携程子车系ID
        request.setCtripSubSeryId(12345L);
        
        // 设置牌照类型列表，标记为删除
        List<VehicleModelLicenseType> licenseTypes = new ArrayList<>();
        VehicleModelLicenseType licenseType = new VehicleModelLicenseType();
        licenseType.setLicenseTypeId(1L);
        licenseType.setDelFlg(true); // 标记为删除
        licenseTypes.add(licenseType);
        
        request.setLicenseTypes(licenseTypes);
        
        // 设置其他必填字段
        request.setHasSnowTires(0);
        request.setSelfServiceReturn(0);
        request.setFastChargeTime(0);
        
        return JSON.toJSONString(request);
    }
    
    /**
     * 创建超过最大牌照类型数量的请求
     */
    public static String createExceedMaxLicenseTypesRequest() {
        VehicleModelSyncRequest request = new VehicleModelSyncRequest();
        
        // 设置携程子车系ID
        request.setCtripSubSeryId(12345L);
        
        // 设置牌照类型列表，超过50个
        List<VehicleModelLicenseType> licenseTypes = new ArrayList<>();
        for (int i = 1; i <= 51; i++) {
            VehicleModelLicenseType licenseType = new VehicleModelLicenseType();
            licenseType.setLicenseTypeId((long) i);
            licenseType.setDelFlg(false);
            licenseTypes.add(licenseType);
        }
        
        request.setLicenseTypes(licenseTypes);
        
        // 设置其他必填字段
        request.setHasSnowTires(1);
        request.setSelfServiceReturn(1);
        request.setFastChargeTime(1);
        
        return JSON.toJSONString(request);
    }
} 