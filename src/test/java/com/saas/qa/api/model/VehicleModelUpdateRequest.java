package com.saas.qa.api.model;

import java.util.List;

/**
 * 车型更新请求类
 * AI创建
 * @since 2024-05-15
 */
public class VehicleModelUpdateRequest {
    
    /**
     * [直连商家]车型id
     */
    private String vehicleModelId;
    
    /**
     * Saas 内部ID  --20241102 add for hello对接专用，直连商家忽略
     */
    private Long saasModelId;
    
    /**
     * 是否有雪地胎  0:否 1:是
     */
    private Integer hasSnowTires;
    
    /**
     * 是否支持自助取还  0:否 1:是
     */
    private Integer selfServiceReturn;
    
    /**
     * 是否支持快充  0:否 1:是 (如果携程子车系的快充时间大于0，该字段请传1,否则请传0)
     */
    private Integer fastChargeTime;
    
    /**
     * 车型在不同门店下的车辆标签
     */
    private List<VehicleStoreTags> storeTags;
    
    /**
     * 该车型和携程、飞猪、哈啰等平台对应的车型code
     */
    private List<ThirdVehicleModelCode> thirdVehicleModelCodes;
    
    /**
     * 获取车型ID
     */
    public String getVehicleModelId() {
        return vehicleModelId;
    }
    
    /**
     * 设置车型ID
     */
    public void setVehicleModelId(String vehicleModelId) {
        this.vehicleModelId = vehicleModelId;
    }
    
    /**
     * 获取Saas内部ID
     */
    public Long getSaasModelId() {
        return saasModelId;
    }
    
    /**
     * 设置Saas内部ID
     */
    public void setSaasModelId(Long saasModelId) {
        this.saasModelId = saasModelId;
    }
    
    /**
     * 获取是否有雪地胎
     */
    public Integer getHasSnowTires() {
        return hasSnowTires;
    }
    
    /**
     * 设置是否有雪地胎
     */
    public void setHasSnowTires(Integer hasSnowTires) {
        this.hasSnowTires = hasSnowTires;
    }
    
    /**
     * 获取是否支持自助取还
     */
    public Integer getSelfServiceReturn() {
        return selfServiceReturn;
    }
    
    /**
     * 设置是否支持自助取还
     */
    public void setSelfServiceReturn(Integer selfServiceReturn) {
        this.selfServiceReturn = selfServiceReturn;
    }
    
    /**
     * 获取是否支持快充
     */
    public Integer getFastChargeTime() {
        return fastChargeTime;
    }
    
    /**
     * 设置是否支持快充
     */
    public void setFastChargeTime(Integer fastChargeTime) {
        this.fastChargeTime = fastChargeTime;
    }
    
    /**
     * 获取车型在不同门店下的车辆标签
     */
    public List<VehicleStoreTags> getStoreTags() {
        return storeTags;
    }
    
    /**
     * 设置车型在不同门店下的车辆标签
     */
    public void setStoreTags(List<VehicleStoreTags> storeTags) {
        this.storeTags = storeTags;
    }
    
    /**
     * 获取该车型和第三方平台对应的车型code
     */
    public List<ThirdVehicleModelCode> getThirdVehicleModelCodes() {
        return thirdVehicleModelCodes;
    }
    
    /**
     * 设置该车型和第三方平台对应的车型code
     */
    public void setThirdVehicleModelCodes(List<ThirdVehicleModelCode> thirdVehicleModelCodes) {
        this.thirdVehicleModelCodes = thirdVehicleModelCodes;
    }
} 