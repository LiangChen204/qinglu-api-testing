package com.saas.qa.api.model;

import java.util.List;

/**
 * 门店指引请求对象
 * @since 2024-01-10
 */
public class StoreGuideRequest {
    private Byte step;
    private String guideDesc;
    private List<GuidePicRequest> picVoList;

    public Byte getStep() {
        return step;
    }

    public void setStep(Byte step) {
        this.step = step;
    }

    public String getGuideDesc() {
        return guideDesc;
    }

    public void setGuideDesc(String guideDesc) {
        this.guideDesc = guideDesc;
    }

    public List<GuidePicRequest> getPicVoList() {
        return picVoList;
    }

    public void setPicVoList(List<GuidePicRequest> picVoList) {
        this.picVoList = picVoList;
    }
} 