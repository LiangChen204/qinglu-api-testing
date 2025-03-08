package com.saas.qa.api.model;

import java.util.List;

/**
 * 车辆批量操作请求对象
 * AI开头
 * @since 2024-05-15
 */
public class VehicleBatchRequest {
    /**
     * 需要新增/删除的列表，每次最大20条 (2023.10.10单条改为批量) 注意：最多50条 待确认
     */
    private List<VehicleRequest> list;

    public List<VehicleRequest> getList() {
        return list;
    }

    public void setList(List<VehicleRequest> list) {
        this.list = list;
    }
} 