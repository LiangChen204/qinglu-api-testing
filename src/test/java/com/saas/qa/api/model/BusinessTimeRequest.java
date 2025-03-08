package com.saas.qa.api.model;

import lombok.Data;

/**
 * 营业时间请求
 * AI开头
 * @since 2024-05-15
 */
@Data
public class BusinessTimeRequest {
    /**
     * 星期几 1-7
     */
    private Integer dayOfWeek;
    
    /**
     * 开始时间 HH:mm
     */
    private String startTime;
    
    /**
     * 结束时间 HH:mm
     */
    private String endTime;
    
    /**
     * 是否营业 0-不营业 1-营业
     */
    private Integer isOpen;
} 