package com.saas.qa.api.model;

import java.util.Date;

/**
 * 服务圈休息时间对象
 * @since 2024-01-10
 */
public class ServiceRestTimeDTO {
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