package com.saas.qa.api.model;

/**
 * 行驶证信息
 * AI开头
 * @since 2024-05-15
 */
public class DrivingLicenseInfo {
    /**
     * 完整车牌号(新增后不可编辑)
     */
    private String plateNumber;

    /**
     * 车架号
     */
    private String vin;

    /**
     * 发动机号
     */
    private String engineNo;

    /**
     * 行驶证 注册日期 (yyyy-MM-dd格式)
     */
    private String registerDate;

    /**
     * 行驶证-使用性质 1:非营运;2:租赁;3:旅游客运;4:预约出租客运;5:营运转非;6:其他
     */
    private Integer usageNature;

    /**
     * 行驶证图片地址（公网可访问）
     */
    private String imgUrl;

    /**
     * 所有人
     */
    private String owner;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public Integer getUsageNature() {
        return usageNature;
    }

    public void setUsageNature(Integer usageNature) {
        this.usageNature = usageNature;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
} 