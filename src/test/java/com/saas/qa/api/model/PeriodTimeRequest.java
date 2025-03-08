package com.saas.qa.api.model;

/**
 * 时间段请求
 * AI开头
 * @since 2024-05-15
 */
public class PeriodTimeRequest {
    /**
     * 开始时间 HH:mm
     */
    private String startTime;
    
    /**
     * 结束时间 HH:mm
     */
    private String endTime;
    
    /**
     * 开始时间（整数表示，如800表示8:00）
     */
    private Integer fromTime;
    
    /**
     * 结束时间（整数表示，如2200表示22:00）
     */
    private Integer toTime;
    
    public String getStartTime() {
        return startTime;
    }
    
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    
    public String getEndTime() {
        return endTime;
    }
    
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    
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