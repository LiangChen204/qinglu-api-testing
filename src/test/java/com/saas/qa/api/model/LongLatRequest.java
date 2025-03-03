package com.saas.qa.api.model;

/**
 * 经纬度请求对象
 * @since 2024-01-10
 */
public class LongLatRequest {
    /**
     * 经度信息
     */
    private Double longitude;

    /**
     * 纬度信息
     */
    private Double latitude;

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
} 