package com.saas.qa.api.factory;

import com.google.gson.Gson;
import com.saas.qa.api.model.ThirdVehicleModelCode;
import com.saas.qa.api.model.VehicleModelUpdateRequest;
import com.saas.qa.api.model.VehicleStoreTags;

import java.util.ArrayList;
import java.util.List;

/**
 * 车型更新请求工厂类
 * AI创建
 * @since 2024-05-15
 */
public class VehicleModelUpdateRequestFactory {

    /**
     * 创建正常场景的请求
     * 所有字段设置为合法的默认值
     */
    public static String createNormalRequest() {
        VehicleModelUpdateRequest request = new VehicleModelUpdateRequest();
        
        // 设置基本信息
        request.setVehicleModelId("modelhello");
        request.setSaasModelId(1001L);
        request.setHasSnowTires(1);
        request.setSelfServiceReturn(1);
        request.setFastChargeTime(1);
        
        // 设置车型在不同门店下的车辆标签
        List<VehicleStoreTags> storeTagsList = new ArrayList<>();
        VehicleStoreTags storeTags = new VehicleStoreTags();
        storeTags.setStoreId("test57_hello");
        List<Long> tagIds = new ArrayList<>();
        tagIds.add(1001L);
        tagIds.add(1002L);
        storeTags.setTagIds(tagIds);
        storeTags.setDelFlg(false);
        storeTagsList.add(storeTags);
        request.setStoreTags(storeTagsList);
        
        // 设置第三方平台车型代码
        List<ThirdVehicleModelCode> thirdCodes = new ArrayList<>();
        ThirdVehicleModelCode thirdCode = new ThirdVehicleModelCode();
        thirdCode.setChannelId(1);
        thirdCode.setThirdModelCode("ctrip_model_001");
        thirdCode.setDelFlg(false);
        thirdCodes.add(thirdCode);
        request.setThirdVehicleModelCodes(thirdCodes);
        
        return new Gson().toJson(request);
    }
    
    /**
     * 创建字段异常场景的请求
     * 部分字段设置为异常值
     */
    public static String createInvalidFieldRequest() {
        VehicleModelUpdateRequest request = new VehicleModelUpdateRequest();
        
        // 设置异常的基本信息
        request.setVehicleModelId(""); // 空字符串，应该是非法的
        request.setSaasModelId(-1001L); // 负数，应该是非法的
        request.setHasSnowTires(2); // 不是0或1，应该是非法的
        request.setSelfServiceReturn(3); // 不是0或1，应该是非法的
        request.setFastChargeTime(-1); // 负数，应该是非法的
        
        // 设置车型在不同门店下的车辆标签
        List<VehicleStoreTags> storeTagsList = new ArrayList<>();
        VehicleStoreTags storeTags = new VehicleStoreTags();
        storeTags.setStoreId(""); // 空字符串，应该是非法的
        List<Long> tagIds = new ArrayList<>();
        tagIds.add(-1L); // 负数，应该是非法的
        storeTags.setTagIds(tagIds);
        storeTags.setDelFlg(null); // null值，应该是非法的
        storeTagsList.add(storeTags);
        request.setStoreTags(storeTagsList);
        
        // 设置第三方平台车型代码
        List<ThirdVehicleModelCode> thirdCodes = new ArrayList<>();
        ThirdVehicleModelCode thirdCode = new ThirdVehicleModelCode();
        thirdCode.setChannelId(-1); // 负数，应该是非法的
        thirdCode.setThirdModelCode(""); // 空字符串，应该是非法的
        thirdCode.setDelFlg(null); // null值，应该是非法的
        thirdCodes.add(thirdCode);
        request.setThirdVehicleModelCodes(thirdCodes);
        
        return new Gson().toJson(request);
    }
    
    /**
     * 创建缺少必填字段场景的请求
     * 必填字段设置为null
     */
    public static String createMissingRequiredFieldRequest() {
        VehicleModelUpdateRequest request = new VehicleModelUpdateRequest();
        
        // 只设置非必填字段，必填字段保持为null
        List<VehicleStoreTags> storeTagsList = new ArrayList<>();
        VehicleStoreTags storeTags = new VehicleStoreTags();
        storeTags.setStoreId("test57_hello");
        List<Long> tagIds = new ArrayList<>();
        tagIds.add(1001L);
        storeTags.setTagIds(tagIds);
        storeTags.setDelFlg(false);
        storeTagsList.add(storeTags);
        request.setStoreTags(storeTagsList);
        
        List<ThirdVehicleModelCode> thirdCodes = new ArrayList<>();
        ThirdVehicleModelCode thirdCode = new ThirdVehicleModelCode();
        thirdCode.setChannelId(1);
        thirdCode.setThirdModelCode("ctrip_model_001");
        thirdCode.setDelFlg(false);
        thirdCodes.add(thirdCode);
        request.setThirdVehicleModelCodes(thirdCodes);
        
        return new Gson().toJson(request);
    }
    
    /**
     * 创建删除标签场景的请求
     * 将标签的删除标志设置为true
     */
    public static String createDeleteTagsRequest() {
        VehicleModelUpdateRequest request = new VehicleModelUpdateRequest();
        
        // 设置基本信息
        request.setVehicleModelId("modelhello");
        request.setSaasModelId(1001L);
        request.setHasSnowTires(1);
        request.setSelfServiceReturn(1);
        request.setFastChargeTime(1);
        
        // 设置要删除的车型标签
        List<VehicleStoreTags> storeTagsList = new ArrayList<>();
        VehicleStoreTags storeTags = new VehicleStoreTags();
        storeTags.setStoreId("test57_hello");
        List<Long> tagIds = new ArrayList<>();
        tagIds.add(1001L);
        storeTags.setTagIds(tagIds);
        storeTags.setDelFlg(true); // 设置删除标志为true
        storeTagsList.add(storeTags);
        request.setStoreTags(storeTagsList);
        
        // 设置第三方平台车型代码
        List<ThirdVehicleModelCode> thirdCodes = new ArrayList<>();
        ThirdVehicleModelCode thirdCode = new ThirdVehicleModelCode();
        thirdCode.setChannelId(1);
        thirdCode.setThirdModelCode("ctrip_model_001");
        thirdCode.setDelFlg(false);
        thirdCodes.add(thirdCode);
        request.setThirdVehicleModelCodes(thirdCodes);
        
        return new Gson().toJson(request);
    }
    
    /**
     * 创建删除第三方车型代码场景的请求
     * 将第三方车型代码的删除标志设置为true
     */
    public static String createDeleteThirdCodeRequest() {
        VehicleModelUpdateRequest request = new VehicleModelUpdateRequest();
        
        // 设置基本信息
        request.setVehicleModelId("modelhello");
        request.setSaasModelId(1001L);
        request.setHasSnowTires(1);
        request.setSelfServiceReturn(1);
        request.setFastChargeTime(1);
        
        // 设置车型在不同门店下的车辆标签
        List<VehicleStoreTags> storeTagsList = new ArrayList<>();
        VehicleStoreTags storeTags = new VehicleStoreTags();
        storeTags.setStoreId("test57_hello");
        List<Long> tagIds = new ArrayList<>();
        tagIds.add(1001L);
        storeTags.setTagIds(tagIds);
        storeTags.setDelFlg(false);
        storeTagsList.add(storeTags);
        request.setStoreTags(storeTagsList);
        
        // 设置要删除的第三方平台车型代码
        List<ThirdVehicleModelCode> thirdCodes = new ArrayList<>();
        ThirdVehicleModelCode thirdCode = new ThirdVehicleModelCode();
        thirdCode.setChannelId(1);
        thirdCode.setThirdModelCode("ctrip_model_001");
        thirdCode.setDelFlg(true); // 设置删除标志为true
        thirdCodes.add(thirdCode);
        request.setThirdVehicleModelCodes(thirdCodes);
        
        return new Gson().toJson(request);
    }
} 