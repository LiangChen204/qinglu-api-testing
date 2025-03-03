package com.saas.qa.api.model;

import java.util.List;

/**
 * 营业时间V2请求对象
 * @since 2024-01-10
 */
public class BusinessTimeV2Request {
    private String businessPeriod;
    private List<PeriodTimeRequest> periodTimeList;
    private Byte nightService;
    private List<StoreNightRequest> nightList;

    public String getBusinessPeriod() {
        return businessPeriod;
    }

    public void setBusinessPeriod(String businessPeriod) {
        this.businessPeriod = businessPeriod;
    }

    public List<PeriodTimeRequest> getPeriodTimeList() {
        return periodTimeList;
    }

    public void setPeriodTimeList(List<PeriodTimeRequest> periodTimeList) {
        this.periodTimeList = periodTimeList;
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