package com.saas.qa.api.model;

import java.util.List;

/**
 * 车辆请求对象
 * AI开头
 * @since 2024-05-15
 */
public class VehicleRequest {
    /**
     * [直连商家]车型id(新增时必填)
     */
    private String vehicleModelId;

    /**
     * Saas 内部ID --20241102 add for hello对接专用，直连商家忽略
     */
    private Long saasModelId;

    /**
     * [直连商家]门店id(新增时必填)
     */
    private String storeId;

    /**
     * Saas 内部ID --20241102 add for hello对接专用，直连商家忽略
     */
    private Long saasStoreId;

    /**
     * [直连商家]车辆id 商家没有车辆id，有门店与车架号 待确认
     */
    private String vehicleId;

    /**
     * Saas 内部ID --20241102 add for hello对接专用，直连商家忽略
     */
    private Long saasVehicleId;

    /**
     * 行驶证信息 vehicleSource为平台车辆:必传，其他除drivingLicenseInfo中plateNumber必填外其他非必填非必传 03-30
     */
    private DrivingLicenseInfo drivingLicenseInfo;

    /**
     * 年检证信息 vehicleSource为平台车辆:必传，其他非必传 03-30
     */
    private AnnualCheckInfo annualCheckInfo;

    /**
     * 商业保险单详情信息 vehicleSource为平台车辆:必传，其他非必传 03-30
     */
    private List<InsuranceDetailInfo> commercialInfo;

    /**
     * 交强险详情信息 vehicleSource为平台车辆:必传，其他非必传 03-30
     */
    private List<InsuranceDetailInfo> compulsoryInfo;

    /**
     * 1:自有;2:长期借调;3:临时借调;4:挂靠;5:托管;6:融资租赁 (默认为自有)7.虚拟库存;10.平台车辆
     */
    private Integer vehicleSource;

    /**
     * 1:银色; 2:黑色; 3:白色; 4:红色; 5:太空灰; 6:黄色; 7:蓝色; 8:紫色; 9:金色;10:灰色; 11: 咖啡色; 12:绿色; 13:棕色; 14:香槟色; 15:藏青色; 16:其他 默认白色
     */
    private Integer vehicleColor;

    /**
     * 当前里程
     */
    private Integer mileAge;

    /**
     * 车辆状态 1:待上线;2:未租赁;3:租赁中;4:维修中;5:保养中;6:调车中;7:事故中
     * @deprecated 该字段已弃用
     */
    private Integer vehicleStatus;

    /**
     * 使用性质 1:非营运;2:租赁;3:旅游客运;4:预约出租客运;5:营运转非;6:其他
     * @deprecated 该字段已弃用，请使用drivingLicenseInfo中的usageNature
     */
    private Integer usageNature;

    /**
     * 是否支持自助取还 0:否 1:是
     */
    private Integer selfServiceReturn;

    /**
     * true为删除，否则表示新增
     */
    private Boolean delFlg;

    public String getVehicleModelId() {
        return vehicleModelId;
    }

    public void setVehicleModelId(String vehicleModelId) {
        this.vehicleModelId = vehicleModelId;
    }

    public Long getSaasModelId() {
        return saasModelId;
    }

    public void setSaasModelId(Long saasModelId) {
        this.saasModelId = saasModelId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public Long getSaasStoreId() {
        return saasStoreId;
    }

    public void setSaasStoreId(Long saasStoreId) {
        this.saasStoreId = saasStoreId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Long getSaasVehicleId() {
        return saasVehicleId;
    }

    public void setSaasVehicleId(Long saasVehicleId) {
        this.saasVehicleId = saasVehicleId;
    }

    public DrivingLicenseInfo getDrivingLicenseInfo() {
        return drivingLicenseInfo;
    }

    public void setDrivingLicenseInfo(DrivingLicenseInfo drivingLicenseInfo) {
        this.drivingLicenseInfo = drivingLicenseInfo;
    }

    public AnnualCheckInfo getAnnualCheckInfo() {
        return annualCheckInfo;
    }

    public void setAnnualCheckInfo(AnnualCheckInfo annualCheckInfo) {
        this.annualCheckInfo = annualCheckInfo;
    }

    public List<InsuranceDetailInfo> getCommercialInfo() {
        return commercialInfo;
    }

    public void setCommercialInfo(List<InsuranceDetailInfo> commercialInfo) {
        this.commercialInfo = commercialInfo;
    }

    public List<InsuranceDetailInfo> getCompulsoryInfo() {
        return compulsoryInfo;
    }

    public void setCompulsoryInfo(List<InsuranceDetailInfo> compulsoryInfo) {
        this.compulsoryInfo = compulsoryInfo;
    }

    public Integer getVehicleSource() {
        return vehicleSource;
    }

    public void setVehicleSource(Integer vehicleSource) {
        this.vehicleSource = vehicleSource;
    }

    public Integer getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(Integer vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public Integer getMileAge() {
        return mileAge;
    }

    public void setMileAge(Integer mileAge) {
        this.mileAge = mileAge;
    }

    /**
     * @deprecated 该字段已弃用
     */
    public Integer getVehicleStatus() {
        return vehicleStatus;
    }

    /**
     * @deprecated 该字段已弃用
     */
    public void setVehicleStatus(Integer vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    /**
     * @deprecated 该字段已弃用，请使用drivingLicenseInfo中的usageNature
     */
    public Integer getUsageNature() {
        return usageNature;
    }

    /**
     * @deprecated 该字段已弃用，请使用drivingLicenseInfo中的usageNature
     */
    public void setUsageNature(Integer usageNature) {
        this.usageNature = usageNature;
    }

    public Integer getSelfServiceReturn() {
        return selfServiceReturn;
    }

    public void setSelfServiceReturn(Integer selfServiceReturn) {
        this.selfServiceReturn = selfServiceReturn;
    }

    public Boolean getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(Boolean delFlg) {
        this.delFlg = delFlg;
    }
} 