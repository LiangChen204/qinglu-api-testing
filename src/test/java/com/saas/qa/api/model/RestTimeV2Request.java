package com.saas.qa.api.model;

import java.util.Date;
import java.util.List;

/**
 * 休息时间V2请求对象
 * @since 2024-01-10
 */
public class RestTimeV2Request {
    private Date startDate;
    private Date endDate;
    private List<PeriodTimeRequest> periodTimeVoList;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<PeriodTimeRequest> getPeriodTimeVoList() {
        return periodTimeVoList;
    }

    public void setPeriodTimeVoList(List<PeriodTimeRequest> periodTimeVoList) {
        this.periodTimeVoList = periodTimeVoList;
    }
} 