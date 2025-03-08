package com.saas.qa.api.model;

import java.util.List;

/**
 * 车型同步请求
 * AI开头
 * @since 2024-05-15
 */
public class VehicleModelSyncRequest {
    /**
     * 携程子车系id
     */
    private Long ctripSubSeryId;
    
    /**
     * 牌照类型列表
     */
    private List<VehicleModelLicenseType> licenseTypes;
    
    /**
     * 是否有雪地胎 0:否 1:是
     */
    private Integer hasSnowTires;
    
    /**
     * 是否支持自助取还 0:否 1:是
     */
    private Integer selfServiceReturn;
    
    /**
     * 是否支持快充 0:否 1:是
     */
    private Integer fastChargeTime;
    
    /**
     * 该车型和飞猪、哈啰等平台对应的车型code
     */
    private List<ThirdVehicleModelCode> thirdVehicleModelCodes;
    
    /**
     * 车型在不同门店下的车辆标签
     */
    private List<VehicleStoreTags> storeTags;
    
    public Long getCtripSubSeryId() {
        return ctripSubSeryId;
    }
    
    public void setCtripSubSeryId(Long ctripSubSeryId) {
        this.ctripSubSeryId = ctripSubSeryId;
    }
    
    public List<VehicleModelLicenseType> getLicenseTypes() {
        return licenseTypes;
    }
    
    public void setLicenseTypes(List<VehicleModelLicenseType> licenseTypes) {
        this.licenseTypes = licenseTypes;
    }
    
    public Integer getHasSnowTires() {
        return hasSnowTires;
    }
    
    public void setHasSnowTires(Integer hasSnowTires) {
        this.hasSnowTires = hasSnowTires;
    }
    
    public Integer getSelfServiceReturn() {
        return selfServiceReturn;
    }
    
    public void setSelfServiceReturn(Integer selfServiceReturn) {
        this.selfServiceReturn = selfServiceReturn;
    }
    
    public Integer getFastChargeTime() {
        return fastChargeTime;
    }
    
    public void setFastChargeTime(Integer fastChargeTime) {
        this.fastChargeTime = fastChargeTime;
    }
    
    public List<ThirdVehicleModelCode> getThirdVehicleModelCodes() {
        return thirdVehicleModelCodes;
    }
    
    public void setThirdVehicleModelCodes(List<ThirdVehicleModelCode> thirdVehicleModelCodes) {
        this.thirdVehicleModelCodes = thirdVehicleModelCodes;
    }
    
    public List<VehicleStoreTags> getStoreTags() {
        return storeTags;
    }
    
    public void setStoreTags(List<VehicleStoreTags> storeTags) {
        this.storeTags = storeTags;
    }
} 