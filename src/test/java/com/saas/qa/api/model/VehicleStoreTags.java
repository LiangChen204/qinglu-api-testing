package com.saas.qa.api.model;

import java.util.List;

public class VehicleStoreTags {

    /**
     * 车辆标签列表
     * 1: 半年内新车; 2: 一年内新车; 3: 两年内新车; 4: 三年内新车;
     * 5: 倒车雷达; 6: 倒车影像; 7: 行车记录仪; 8: 手机支架;
     * 9: ETC; 10: 雪地胎; 11: 满油取还; 12: 车已消毒;
     * 13: 油量保障; 14: 不限里程; 15: 一车一洗; 16: 可升级车损免赔;
     * 17: 闪租; 18: 车载冰箱; 19: 真皮座椅; 20: 制氧机; 21: 加湿器
     */
    private List<Long> tags;

    /**
     * 门店ID列表
     */
    private List<String> storeIds;

    /**
     * Saas 内部ID
     * 20241102 add for hello对接专用，直连商家忽略
     */
    private List<Long> saasStoreIds;

    /**
     * 是否选择全部门店
     * 默认 false。
     * 1. 若 selectAllStores 为 true，后续新增的门店也会使用该标签。
     * 2. storeIds 为空且 selectAllStores 为 false 的场景，标签无效。
     * 3. selectAllStores 为 true，且 storeIds 不为空时，selectAllStores 优先级更高。
     */
    private Boolean selectAllStores = false;

    // Getter 和 Setter 方法
    public List<Long> getTags() {
        return tags;
    }

    public void setTags(List<Long> tags) {
        this.tags = tags;
    }

    public List<String> getStoreIds() {
        return storeIds;
    }

    public void setStoreIds(List<String> storeIds) {
        this.storeIds = storeIds;
    }

    public List<Long> getSaasStoreIds() {
        return saasStoreIds;
    }

    public void setSaasStoreIds(List<Long> saasStoreIds) {
        this.saasStoreIds = saasStoreIds;
    }

    public Boolean getSelectAllStores() {
        return selectAllStores;
    }

    public void setSelectAllStores(Boolean selectAllStores) {
        this.selectAllStores = selectAllStores;
    }
}


