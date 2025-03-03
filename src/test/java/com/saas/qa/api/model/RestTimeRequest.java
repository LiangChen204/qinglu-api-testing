package com.saas.qa.api.model;

import java.util.Date;

/**
 * 休息时间请求对象
 * @since 2025-03-03
 */
public class RestTimeRequest {
    private Date startDate;
    private Date endDate;
    private Integer startTime;
    private Integer endTime;

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

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }
} 