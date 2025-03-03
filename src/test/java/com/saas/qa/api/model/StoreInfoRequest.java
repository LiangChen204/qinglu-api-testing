package com.saas.qa.api.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * 门店基础信息请求对象
 * @since 2025-03-03
 */
public class StoreInfoRequest {
    private String storeId;
    private Long saasStoreId;
    private Long channelId;
    private String storeName;
    private String provinceCode;
    private String cityCode;
    private String areaCode;
    private Integer storeSize;
    private Byte storeDecorate;
    private String address;
    private Byte storePosType;
    private Byte posHub;
    private BigDecimal minAdvanceBookingTime;
    private Byte minAdvanceBookingUnit;
    private BigDecimal maxAdvanceBookingTime;
    private Byte maxAdvanceBookingUnit;
    private BigDecimal minRentTerm;
    private BigDecimal maxRentTerm;
    private Integer orderInterval;
    private Byte orderIntervalUnit;
    private Byte pickupEnabled;
    private Byte freeShuttleEnabled;
    private Byte storeType;
    private Byte storeStatus;
    private LongLatRequest longLat;
    private List<StoreGuideRequest> guidePickupList;
    private List<StoreGuideRequest> guideReturnList;
    private Boolean selfServiceReturn;
    private List<StoreGuideRequest> selfGuidePickupList;
    private List<StoreGuideRequest> selfGuideReturnList;
    private Integer selfServiceDistance;
    private List<BusinessTimeRequest> businessTimeList;
    private List<RestTimeRequest> restTimeList;
    private List<BusinessTimeV2Request> businessTimeV2List;
    private List<RestTimeV2Request> restTimeV2List;
    private List<StoreContactRequest> contactList;
    private List<StoreHourlyChargeRequest> hourlyChargeList;
    private Boolean delFlg;

    // Getters and Setters
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

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public Integer getStoreSize() {
        return storeSize;
    }

    public void setStoreSize(Integer storeSize) {
        this.storeSize = storeSize;
    }

    public Byte getStoreDecorate() {
        return storeDecorate;
    }

    public void setStoreDecorate(Byte storeDecorate) {
        this.storeDecorate = storeDecorate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Byte getStorePosType() {
        return storePosType;
    }

    public void setStorePosType(Byte storePosType) {
        this.storePosType = storePosType;
    }

    public Byte getPosHub() {
        return posHub;
    }

    public void setPosHub(Byte posHub) {
        this.posHub = posHub;
    }

    public BigDecimal getMinAdvanceBookingTime() {
        return minAdvanceBookingTime;
    }

    public void setMinAdvanceBookingTime(BigDecimal minAdvanceBookingTime) {
        this.minAdvanceBookingTime = minAdvanceBookingTime;
    }

    public Byte getMinAdvanceBookingUnit() {
        return minAdvanceBookingUnit;
    }

    public void setMinAdvanceBookingUnit(Byte minAdvanceBookingUnit) {
        this.minAdvanceBookingUnit = minAdvanceBookingUnit;
    }

    public BigDecimal getMaxAdvanceBookingTime() {
        return maxAdvanceBookingTime;
    }

    public void setMaxAdvanceBookingTime(BigDecimal maxAdvanceBookingTime) {
        this.maxAdvanceBookingTime = maxAdvanceBookingTime;
    }

    public Byte getMaxAdvanceBookingUnit() {
        return maxAdvanceBookingUnit;
    }

    public void setMaxAdvanceBookingUnit(Byte maxAdvanceBookingUnit) {
        this.maxAdvanceBookingUnit = maxAdvanceBookingUnit;
    }

    public BigDecimal getMinRentTerm() {
        return minRentTerm;
    }

    public void setMinRentTerm(BigDecimal minRentTerm) {
        this.minRentTerm = minRentTerm;
    }

    public BigDecimal getMaxRentTerm() {
        return maxRentTerm;
    }

    public void setMaxRentTerm(BigDecimal maxRentTerm) {
        this.maxRentTerm = maxRentTerm;
    }

    public Integer getOrderInterval() {
        return orderInterval;
    }

    public void setOrderInterval(Integer orderInterval) {
        this.orderInterval = orderInterval;
    }

    public Byte getOrderIntervalUnit() {
        return orderIntervalUnit;
    }

    public void setOrderIntervalUnit(Byte orderIntervalUnit) {
        this.orderIntervalUnit = orderIntervalUnit;
    }

    public Byte getPickupEnabled() {
        return pickupEnabled;
    }

    public void setPickupEnabled(Byte pickupEnabled) {
        this.pickupEnabled = pickupEnabled;
    }

    public Byte getFreeShuttleEnabled() {
        return freeShuttleEnabled;
    }

    public void setFreeShuttleEnabled(Byte freeShuttleEnabled) {
        this.freeShuttleEnabled = freeShuttleEnabled;
    }

    public Byte getStoreType() {
        return storeType;
    }

    public void setStoreType(Byte storeType) {
        this.storeType = storeType;
    }

    public Byte getStoreStatus() {
        return storeStatus;
    }

    public void setStoreStatus(Byte storeStatus) {
        this.storeStatus = storeStatus;
    }

    public LongLatRequest getLongLat() {
        return longLat;
    }

    public void setLongLat(LongLatRequest longLat) {
        this.longLat = longLat;
    }

    public List<StoreGuideRequest> getGuidePickupList() {
        return guidePickupList;
    }

    public void setGuidePickupList(List<StoreGuideRequest> guidePickupList) {
        this.guidePickupList = guidePickupList;
    }

    public List<StoreGuideRequest> getGuideReturnList() {
        return guideReturnList;
    }

    public void setGuideReturnList(List<StoreGuideRequest> guideReturnList) {
        this.guideReturnList = guideReturnList;
    }

    public Boolean getSelfServiceReturn() {
        return selfServiceReturn;
    }

    public void setSelfServiceReturn(Boolean selfServiceReturn) {
        this.selfServiceReturn = selfServiceReturn;
    }

    public List<StoreGuideRequest> getSelfGuidePickupList() {
        return selfGuidePickupList;
    }

    public void setSelfGuidePickupList(List<StoreGuideRequest> selfGuidePickupList) {
        this.selfGuidePickupList = selfGuidePickupList;
    }

    public List<StoreGuideRequest> getSelfGuideReturnList() {
        return selfGuideReturnList;
    }

    public void setSelfGuideReturnList(List<StoreGuideRequest> selfGuideReturnList) {
        this.selfGuideReturnList = selfGuideReturnList;
    }

    public Integer getSelfServiceDistance() {
        return selfServiceDistance;
    }

    public void setSelfServiceDistance(Integer selfServiceDistance) {
        this.selfServiceDistance = selfServiceDistance;
    }

    public List<BusinessTimeRequest> getBusinessTimeList() {
        return businessTimeList;
    }

    public void setBusinessTimeList(List<BusinessTimeRequest> businessTimeList) {
        this.businessTimeList = businessTimeList;
    }

    public List<RestTimeRequest> getRestTimeList() {
        return restTimeList;
    }

    public void setRestTimeList(List<RestTimeRequest> restTimeList) {
        this.restTimeList = restTimeList;
    }

    public List<BusinessTimeV2Request> getBusinessTimeV2List() {
        return businessTimeV2List;
    }

    public void setBusinessTimeV2List(List<BusinessTimeV2Request> businessTimeV2List) {
        this.businessTimeV2List = businessTimeV2List;
    }

    public List<RestTimeV2Request> getRestTimeV2List() {
        return restTimeV2List;
    }

    public void setRestTimeV2List(List<RestTimeV2Request> restTimeV2List) {
        this.restTimeV2List = restTimeV2List;
    }

    public List<StoreContactRequest> getContactList() {
        return contactList;
    }

    public void setContactList(List<StoreContactRequest> contactList) {
        this.contactList = contactList;
    }

    public List<StoreHourlyChargeRequest> getHourlyChargeList() {
        return hourlyChargeList;
    }

    public void setHourlyChargeList(List<StoreHourlyChargeRequest> hourlyChargeList) {
        this.hourlyChargeList = hourlyChargeList;
    }

    public Boolean getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(Boolean delFlg) {
        this.delFlg = delFlg;
    }
} 