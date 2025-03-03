package com.saas.qa.api.model;

/**
 * 时间段请求对象
 * @since 2024-01-10
 */
public class PeriodTimeRequest {
    private Integer fromTime;
    private Integer toTime;

    public Integer getFromTime() {
        return fromTime;
    }

    public void setFromTime(Integer fromTime) {
        this.fromTime = fromTime;
    }

    public Integer getToTime() {
        return toTime;
    }

    public void setToTime(Integer toTime) {
        this.toTime = toTime;
    }
} 