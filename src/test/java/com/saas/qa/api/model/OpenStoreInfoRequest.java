package com.saas.qa.api.model;

/**
 * 门店信息查询请求对象
 * 通过swagger文档的入参说明生成
 */
public class OpenStoreInfoRequest {
    /**
     * 门店ID
     */
    private String storeId;

    /**
     * Saas内部ID (20241102 add for hello对接专用，直连商家忽略)
     */
    private Long saasStoreId;

    /**
     * 渠道ID
     * 1.线下
     * 2.携程【携程分销】
     * 3.飞猪
     * 4.哈啰
     * 5.租租车
     * 6.悟空
     * 7.滴滴
     * 8.同程
     * 9.神州
     */
    private Long channelId;

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public Long getSaasStoreId() {
        return saasStoreId;
    }

    public void setSaasStoreId(Long saasStoreId) {
        this.saasStoreId = saasStoreId;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }
} 