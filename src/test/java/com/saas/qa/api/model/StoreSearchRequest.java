package com.saas.qa.api.model;

// 通过swagger文档的入参说明 生成一个接口对应的json类
public class StoreSearchRequest {
    private int channelId;
    private int pickUpCityId;
    private String pickUpDate;
    private Point pickUpPoint;
    private int returnCityId;
    private String returnDate;
    private Point returnPoint;
    
    // Getters and Setters
    public int getChannelId() {
        return channelId;
    }
    
    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }
    
    public int getPickUpCityId() {
        return pickUpCityId;
    }
    
    public void setPickUpCityId(int pickUpCityId) {
        this.pickUpCityId = pickUpCityId;
    }
    
    public String getPickUpDate() {
        return pickUpDate;
    }
    
    public void setPickUpDate(String pickUpDate) {
        this.pickUpDate = pickUpDate;
    }
    
    public Point getPickUpPoint() {
        return pickUpPoint;
    }
    
    public void setPickUpPoint(Point pickUpPoint) {
        this.pickUpPoint = pickUpPoint;
    }
    
    public int getReturnCityId() {
        return returnCityId;
    }
    
    public void setReturnCityId(int returnCityId) {
        this.returnCityId = returnCityId;
    }
    
    public String getReturnDate() {
        return returnDate;
    }
    
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
    
    public Point getReturnPoint() {
        return returnPoint;
    }
    
    public void setReturnPoint(Point returnPoint) {
        this.returnPoint = returnPoint;
    }
} 