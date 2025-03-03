package com.saas.qa.api.model;

import java.util.List;

/**
 * 服务圈同步请求对象
 * @since 2024-01-10
 */
public class OpenCircleSyncRequest {
    /**
     * 服务圈对象列表，最多50条
     */
    private List<CircleRequest> circleList;

    public List<CircleRequest> getCircleList() {
        return circleList;
    }

    public void setCircleList(List<CircleRequest> circleList) {
        if (circleList != null && circleList.size() > 50) {
            throw new IllegalArgumentException("circleList size cannot exceed 50");
        }
        this.circleList = circleList;
    }
} 