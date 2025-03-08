package com.saas.qa.api.model;

import lombok.Data;

/**
 * 门店搜索请求
 */
@Data
public class StoreSearchRequest {
    private String keyword;
    private Point location;
    private Integer radius;
    private Integer page;
    private Integer size;
    
    // 添加缺少的字段
    private Integer channelId;
    private Integer pickUpCityId;
    private String pickUpDate;
    private Point pickUpPoint;
    private Integer returnCityId;
    private String returnDate;
    private Point returnPoint;
    
    public String getKeyword() {
        return keyword;
    }
    
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    
    public Point getLocation() {
        return location;
    }
    
    public void setLocation(Point location) {
        this.location = location;
    }
    
    public Integer getRadius() {
        return radius;
    }
    
    public void setRadius(Integer radius) {
        this.radius = radius;
    }
    
    public Integer getPage() {
        return page;
    }
    
    public void setPage(Integer page) {
        this.page = page;
    }
    
    public Integer getSize() {
        return size;
    }
    
    public void setSize(Integer size) {
        this.size = size;
    }
    
    public Integer getChannelId() {
        return channelId;
    }
    
    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }
    
    public Integer getPickUpCityId() {
        return pickUpCityId;
    }
    
    public void setPickUpCityId(Integer pickUpCityId) {
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
    
    public Integer getReturnCityId() {
        return returnCityId;
    }
    
    public void setReturnCityId(Integer returnCityId) {
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