package com.saas.qa.api.model;

/**
 * 车型牌照类型
 * AI开头
 * @since 2024-05-15
 */
public class VehicleModelLicenseType {
    /**
     * 牌照类型ID
     */
    private Long licenseTypeId;
    
    /**
     * 是否删除 true:删除 false:新增/更新
     */
    private Boolean delFlg;
    
    public Long getLicenseTypeId() {
        return licenseTypeId;
    }
    
    public void setLicenseTypeId(Long licenseTypeId) {
        this.licenseTypeId = licenseTypeId;
    }
    
    public Boolean getDelFlg() {
        return delFlg;
    }
    
    public void setDelFlg(Boolean delFlg) {
        this.delFlg = delFlg;
    }
} 