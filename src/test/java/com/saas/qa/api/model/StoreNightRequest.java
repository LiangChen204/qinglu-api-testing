package com.saas.qa.api.model;

/**
 * 夜间服务设置请求对象
 * @since 2024-01-10
 */
public class StoreNightRequest {
    private Integer businessFrom;
    private Integer businessTo;
    private Integer fee;
    private Byte feeType;

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

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }

    public Byte getFeeType() {
        return feeType;
    }

    public void setFeeType(Byte feeType) {
        this.feeType = feeType;
    }
} 