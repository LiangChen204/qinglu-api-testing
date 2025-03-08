package com.saas.qa.api.model;

import java.util.List;

/**
 * 营业时间V2请求
 * AI开头
 * @since 2024-05-15
 */
public class BusinessTimeV2Request {
    /**
     * 星期几 1-7
     */
    private Integer dayOfWeek;
    
    /**
     * 时间段列表
     */
    private List<TimeSlot> timeSlots;
    
    /**
     * 是否营业 0-不营业 1-营业
     */
    private Integer isOpen;
    
    /**
     * 营业时间段
     */
    private String businessPeriod;
    
    /**
     * 夜间服务 0-不提供 1-提供
     */
    private Byte nightService;
    
    /**
     * 时间段列表
     */
    private List<PeriodTimeRequest> periodTimeList;
    
    public Integer getDayOfWeek() {
        return dayOfWeek;
    }
    
    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
    
    public List<TimeSlot> getTimeSlots() {
        return timeSlots;
    }
    
    public void setTimeSlots(List<TimeSlot> timeSlots) {
        this.timeSlots = timeSlots;
    }
    
    public Integer getIsOpen() {
        return isOpen;
    }
    
    public void setIsOpen(Integer isOpen) {
        this.isOpen = isOpen;
    }
    
    public String getBusinessPeriod() {
        return businessPeriod;
    }
    
    public void setBusinessPeriod(String businessPeriod) {
        this.businessPeriod = businessPeriod;
    }
    
    public Byte getNightService() {
        return nightService;
    }
    
    public void setNightService(Byte nightService) {
        this.nightService = nightService;
    }
    
    public List<PeriodTimeRequest> getPeriodTimeList() {
        return periodTimeList;
    }
    
    public void setPeriodTimeList(List<PeriodTimeRequest> periodTimeList) {
        this.periodTimeList = periodTimeList;
    }
    
    /**
     * 时间段
     */
    public static class TimeSlot {
        /**
         * 开始时间 HH:mm
         */
        private String startTime;
        
        /**
         * 结束时间 HH:mm
         */
        private String endTime;
        
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
    }
} 