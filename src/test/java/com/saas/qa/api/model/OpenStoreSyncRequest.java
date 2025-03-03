package com.saas.qa.api.model;

import java.util.List;

public class OpenStoreSyncRequest {
    private List<StoreInfoRequest> storeInfoList;

    // Getters and Setters
    public List<StoreInfoRequest> getStoreInfoList() {
        return storeInfoList;
    }

    public void setStoreInfoList(List<StoreInfoRequest> storeInfoList) {
        this.storeInfoList = storeInfoList;
    }
}