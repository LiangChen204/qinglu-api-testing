package com.saas.qa.api.model;

import java.util.List;

/**
 * 车辆保单详情
 * AI开头
 * @since 2024-05-15
 */
public class InsuranceDetailInfo {
    /**
     * 保险公司名称
     */
    private String insuranceCompany;

    /**
     * 保险单号(业务唯一键)
     */
    private String insuranceId;

    /**
     * 投保人
     */
    private String insuranceHolder;

    /**
     * 投保证件号
     */
    private String insuranceHolderId;

    /**
     * 有效期开始日期 (yyyy-MM-dd格式)
     */
    private String startTime;

    /**
     * 有效期结束日期 (yyyy-MM-dd格式)
     */
    private String endTime;

    /**
     * 第三者险额度:TWENTY_MILLI-20万;THIRTY_MILI-30万;FIFTY_MILI-50万;HUNDRED_MILI-100万;HUNDRED_FIFTY_MILI-150万;TWO_HUNDRED_MILI-200万;ABOVE_TWO_HUNDRED_MILI-200万以上
     */
    private String coverageLevel;

    /**
     * 商业险-车损起陪额度(正整数)
     */
    private Integer indemnityAmount;

    /**
     * 保单文件（pdf或者图片 公网可访问）
     */
    private List<String> urlList;

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public String getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(String insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getInsuranceHolder() {
        return insuranceHolder;
    }

    public void setInsuranceHolder(String insuranceHolder) {
        this.insuranceHolder = insuranceHolder;
    }

    public String getInsuranceHolderId() {
        return insuranceHolderId;
    }

    public void setInsuranceHolderId(String insuranceHolderId) {
        this.insuranceHolderId = insuranceHolderId;
    }

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

    public String getCoverageLevel() {
        return coverageLevel;
    }

    public void setCoverageLevel(String coverageLevel) {
        this.coverageLevel = coverageLevel;
    }

    public Integer getIndemnityAmount() {
        return indemnityAmount;
    }

    public void setIndemnityAmount(Integer indemnityAmount) {
        this.indemnityAmount = indemnityAmount;
    }

    public List<String> getUrlList() {
        return urlList;
    }

    public void setUrlList(List<String> urlList) {
        this.urlList = urlList;
    }
} 