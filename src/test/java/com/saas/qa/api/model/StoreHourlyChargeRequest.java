package com.saas.qa.api.model;

/**
 * 门店零散收费规则请求对象
 * @since 2025-03-03
 */
public class StoreHourlyChargeRequest {
    private Byte scene;
    private Byte chargeItem;
    private String chargeValue;

    public Byte getScene() {
        return scene;
    }

    public void setScene(Byte scene) {
        this.scene = scene;
    }

    public Byte getChargeItem() {
        return chargeItem;
    }

    public void setChargeItem(Byte chargeItem) {
        this.chargeItem = chargeItem;
    }

    public String getChargeValue() {
        return chargeValue;
    }

    public void setChargeValue(String chargeValue) {
        this.chargeValue = chargeValue;
    }
} 