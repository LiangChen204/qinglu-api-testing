package com.saas.qa.api.model;

import java.util.List;

/**
 * 营业时间请求对象
 * @since 2025-03-03
 */
public class BusinessTimeRequest {
    private String businessPeriod;
    private Integer businessFrom;
    private Integer businessTo;
    private Byte nightService;
    private List<StoreNightRequest> nightList;

    public String getBusinessPeriod() {
        return businessPeriod;
    }

    public void setBusinessPeriod(String businessPeriod) {
        this.businessPeriod = businessPeriod;
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

    public Byte getNightService() {
        return nightService;
    }

    public void setNightService(Byte nightService) {
        this.nightService = nightService;
    }

    public List<StoreNightRequest> getNightList() {
        return nightList;
    }

    public void setNightList(List<StoreNightRequest> nightList) {
        this.nightList = nightList;
    }
} 