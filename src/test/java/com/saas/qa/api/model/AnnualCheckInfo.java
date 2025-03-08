package com.saas.qa.api.model;

/**
 * 年检证信息
 * AI开头
 * @since 2024-05-15
 */
public class AnnualCheckInfo {
    /**
     * 年检有效期(yyyy-MM-dd格式)
     */
    private String activeData;

    /**
     * 年检图片地址（公网可访问）
     */
    private String imgUrl;

    public String getActiveData() {
        return activeData;
    }

    public void setActiveData(String activeData) {
        this.activeData = activeData;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
} 