package com.saas.qa.api.model;

/**
 * 第三方平台车型编码
 * AI开头
 * @since 2024-05-15
 */
public class ThirdVehicleModelCode {
    /**
     * 渠道ID
     * 3.飞猪
     * 4.哈啰
     * 5.租租车
     * 6.悟空
     * 7.滴滴
     */
    private Integer channelId;
    
    /**
     * 第三方平台车型编码
     */
    private String thirdModelCode;
    
    /**
     * 是否删除 true:删除 false:新增/更新
     */
    private Boolean delFlg;
    
    public Integer getChannelId() {
        return channelId;
    }
    
    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }
    
    public String getThirdModelCode() {
        return thirdModelCode;
    }
    
    public void setThirdModelCode(String thirdModelCode) {
        this.thirdModelCode = thirdModelCode;
    }
    
    public Boolean getDelFlg() {
        return delFlg;
    }
    
    public void setDelFlg(Boolean delFlg) {
        this.delFlg = delFlg;
    }
} 