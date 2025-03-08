package com.saas.qa.api.model;

import java.util.List;

public class VehicleModelRequest {

    private String vehicleModelId; // [直连商家]车型id，由接入方自行定义，确定擎路系统中的车型唯一编码
    private Long saasModelId; // Saas 内部ID --20241102 add for hello对接专用，直连商家忽略
    private Integer licenseType; // 1 :沪牌(不含沪C); 3 :京牌; 4: 粤A; 5:粤B; 6:津牌; 7:浙A; 8:普牌
    private List<VehicleStoreTags> storeTags; // 车型在不同门店下的车辆标签
    private Boolean delFlg = false; // 是否删除，默认为false

    // Getter 和 Setter 方法
    public String getVehicleModelId() {
        return vehicleModelId;
    }

    public void setVehicleModelId(String vehicleModelId) {
        this.vehicleModelId = "modelhello";
    }

    public Long getSaasModelId() {
        return saasModelId;
    }

    public void setSaasModelId(Long saasModelId) {
        this.saasModelId = saasModelId;
    }

    public Integer getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(Integer licenseType) {
        this.licenseType = licenseType;
    }

    public List<VehicleStoreTags> getStoreTags() {
        return storeTags;
    }

    public void setStoreTags(List<VehicleStoreTags> storeTags) {
        this.storeTags = storeTags;
    }

    public Boolean getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(Boolean delFlg) {
        this.delFlg = delFlg;
    }

    @Override
    public String toString() {
        return "VehicleModelRequest{" +
                "vehicleModelId='" + vehicleModelId + '\'' +
                ", saasModelId=" + saasModelId +
                ", licenseType=" + licenseType +
                ", storeTags=" + storeTags +
                ", delFlg=" + delFlg +
                '}';
    }
}