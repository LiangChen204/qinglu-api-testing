package com.saas.qa.api.model;

import java.util.List;

/**
 * 车型在不同门店下的车辆标签
 * AI开头
 * @since 2024-05-15
 */
public class VehicleStoreTags {
    /**
     * 门店ID
     */
    private String storeId;
    
    /**
     * 标签ID列表
     */
    private List<Long> tagIds;
    
    /**
     * 是否删除 true:删除 false:新增/更新
     */
    private Boolean delFlg;
    
    public String getStoreId() {
        return storeId;
    }
    
    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }
    
    public List<Long> getTagIds() {
        return tagIds;
    }
    
    public void setTagIds(List<Long> tagIds) {
        this.tagIds = tagIds;
    }
    
    public Boolean getDelFlg() {
        return delFlg;
    }
    
    public void setDelFlg(Boolean delFlg) {
        this.delFlg = delFlg;
    }
} 