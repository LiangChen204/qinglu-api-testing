package com.saas.qa.api.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * 服务圈请求对象
 * @since 2024-01-10
 */
public class CircleRequest {
    /**
     * 服务圈ID
     */
    private String circleId;

    /**
     * Saas内部ID (20241102 add for hello对接专用，直连商家忽略)
     */
    private Long saasCircleId;

    /**
     * 门店ID
     */
    private String storeId;

    /**
     * Saas内部ID (20241102 add for hello对接专用，直连商家忽略)
     */
    private Long saasStoreId;

    /**
     * 渠道ID
     * 1.线下
     * 2.携程【携程分销】
     * 3.飞猪
     * 4.哈啰
     * 5.租租车
     * 6.悟空
     * 7.滴滴
     */
    private Long channelId;

    /**
     * 配送服务类型
     */
    private Byte deliveryServiceType;

    /**
     * 免费班车
     */
    private Integer freeShuttle;

    /**
     * 服务圈名称
     */
    private String name;

    /**
     * 服务圈颜色
     */
    private String color;

    /**
     * 费用类型
     */
    private Byte feeType;

    /**
     * 启用状态
     */
    private Byte enabled;

    /**
     * 费用
     */
    private Integer fee;

    /**
     * 经纬度列表
     */
    private List<LongLatRequest> longLats;

    /**
     * 最小提前预订时间
     */
    private BigDecimal minAdvanceBookingTime;

    /**
     * 业务开始时间
     */
    private Integer businessFrom;

    /**
     * 业务结束时间
     */
    private Integer businessTo;

    /**
     * 服务休息时间
     */
    private ServiceRestTimeDTO serviceRestTime;

    /**
     * 删除标志
     */
    private Boolean delFlg;

    public String getCircleId() {
        return circleId;
    }

    public void setCircleId(String circleId) {
        this.circleId = circleId;
    }

    public Long getSaasCircleId() {
        return saasCircleId;
    }

    public void setSaasCircleId(Long saasCircleId) {
        this.saasCircleId = saasCircleId;
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

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public Byte getDeliveryServiceType() {
        return deliveryServiceType;
    }

    public void setDeliveryServiceType(Byte deliveryServiceType) {
        this.deliveryServiceType = deliveryServiceType;
    }

    public Integer getFreeShuttle() {
        return freeShuttle;
    }

    public void setFreeShuttle(Integer freeShuttle) {
        this.freeShuttle = freeShuttle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Byte getFeeType() {
        return feeType;
    }

    public void setFeeType(Byte feeType) {
        this.feeType = feeType;
    }

    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }

    public List<LongLatRequest> getLongLats() {
        return longLats;
    }

    public void setLongLats(List<LongLatRequest> longLats) {
        this.longLats = longLats;
    }

    public BigDecimal getMinAdvanceBookingTime() {
        return minAdvanceBookingTime;
    }

    public void setMinAdvanceBookingTime(BigDecimal minAdvanceBookingTime) {
        this.minAdvanceBookingTime = minAdvanceBookingTime;
    }

    public Integer getBusinessFrom() {
        return businessFrom;
    }

    public void setBusinessFrom(Integer businessFrom) {
        this.businessFrom = businessFrom;
    }

    public Integer getBusinessTo() {
        return businessTo;
    }

    public void setBusinessTo(Integer businessTo) {
        this.businessTo = businessTo;
    }

    public ServiceRestTimeDTO getServiceRestTime() {
        return serviceRestTime;
    }

    public void setServiceRestTime(ServiceRestTimeDTO serviceRestTime) {
        this.serviceRestTime = serviceRestTime;
    }

    public Boolean getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(Boolean delFlg) {
        this.delFlg = delFlg;
    }
} 