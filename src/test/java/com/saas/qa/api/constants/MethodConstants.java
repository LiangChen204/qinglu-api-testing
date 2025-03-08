package com.saas.qa.api.constants;

public class MethodConstants {
    // open接口方法
    // 1、车型增删改接口
    public static final String VEHICLE_MODEL_SYNCHRONIZATION = "qinglu.open.vehicle.model.synchronization";
    public static final String STORE_STATUS_UPDATE = "qinglu.open.store.status.update";
    // 2、门店服务圈接口
    public static final String STORE_CIRCLE_SYNC = "qinglu.open.store.circle.sync";
    public static final String STORE_CIRCLE_DELETE = "qinglu.open.store.circle.delete";
    // 3、服务圈信息接口
    public static final String CIRCLE_INFO = "qinglu.open.circle.info";
    public static final String STORE_INFO = "qinglu.open.store.info";
    // 4、车辆同步接口
    public static final String VEHICLE_SYNC = "qinglu.open.vehicle.sync";

    // open环境相关常量
    public static final String Hello_BASE_URL = "http://open2.qinglusaas-dev.com";
    public static final String QINGLU_OPEN_STORE_BASE_SYNC = "qinglu.open.store.base.sync";
    
    private MethodConstants() {
        // 私有构造函数，防止实例化
    }
}