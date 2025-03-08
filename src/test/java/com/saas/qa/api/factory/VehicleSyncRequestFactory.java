package com.saas.qa.api.factory;

import com.alibaba.fastjson.JSON;
import com.saas.qa.api.model.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 车辆同步请求工厂类
 * AI开头
 * @since 2024-05-15
 */
public class VehicleSyncRequestFactory {

    /**
     * 创建正常场景的请求
     * 所有字段设置为合法的默认值
     */
    public static String createNormalRequest() {
        VehicleBatchRequest batchRequest = new VehicleBatchRequest();
        List<VehicleRequest> vehicleList = new ArrayList<>();
        
        // 创建车辆请求对象
        VehicleRequest request = new VehicleRequest();
        request.setVehicleModelId("modelhello");
        request.setSaasModelId(1001L);
        request.setStoreId("test57_hello");
        request.setSaasStoreId(2001L);
        request.setVehicleId("vehicle900");
        request.setSaasVehicleId(3001L);
        
        // 设置行驶证信息
        DrivingLicenseInfo drivingLicenseInfo = new DrivingLicenseInfo();
        drivingLicenseInfo.setPlateNumber("沪A19999");
        drivingLicenseInfo.setVin("LSVAU2429E2184736");
        drivingLicenseInfo.setEngineNo("EA211358975");
        drivingLicenseInfo.setRegisterDate(LocalDate.now().minusYears(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        drivingLicenseInfo.setUsageNature(1); // 使用性质设置在行驶证信息中
        drivingLicenseInfo.setImgUrl("https://example.com/driving_license.jpg");
        drivingLicenseInfo.setOwner("测试车主");
        request.setDrivingLicenseInfo(drivingLicenseInfo);
        
        // 设置年检信息
        AnnualCheckInfo annualCheckInfo = new AnnualCheckInfo();
        annualCheckInfo.setActiveData(LocalDate.now().plusYears(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        annualCheckInfo.setImgUrl("https://example.com/annual_check.jpg");
        request.setAnnualCheckInfo(annualCheckInfo);
        
        // 设置商业保险信息
        List<InsuranceDetailInfo> commercialInfoList = new ArrayList<>();
        InsuranceDetailInfo commercialInfo = new InsuranceDetailInfo();
        commercialInfo.setInsuranceCompany("平安保险");
        commercialInfo.setInsuranceId("PA20240515001");
        commercialInfo.setInsuranceHolder("测试车主");
        commercialInfo.setInsuranceHolderId("310101199001011234");
        commercialInfo.setStartTime(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        commercialInfo.setEndTime(LocalDate.now().plusYears(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        commercialInfo.setCoverageLevel("HUNDRED_MILI");
        commercialInfo.setIndemnityAmount(2000);
        commercialInfo.setUrlList(Arrays.asList("https://example.com/commercial_insurance.pdf"));
        commercialInfoList.add(commercialInfo);
        request.setCommercialInfo(commercialInfoList);
        
        // 设置交强险信息
        List<InsuranceDetailInfo> compulsoryInfoList = new ArrayList<>();
        InsuranceDetailInfo compulsoryInfo = new InsuranceDetailInfo();
        compulsoryInfo.setInsuranceCompany("人保财险");
        compulsoryInfo.setInsuranceId("PICC20240515001");
        compulsoryInfo.setInsuranceHolder("测试车主");
        compulsoryInfo.setInsuranceHolderId("310101199001011234");
        compulsoryInfo.setStartTime(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        compulsoryInfo.setEndTime(LocalDate.now().plusYears(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        compulsoryInfo.setCoverageLevel("TWENTY_MILLI");
        compulsoryInfo.setIndemnityAmount(950);
        compulsoryInfo.setUrlList(Arrays.asList("https://example.com/compulsory_insurance.pdf"));
        compulsoryInfoList.add(compulsoryInfo);
        request.setCompulsoryInfo(compulsoryInfoList);
        
        // 设置其他信息
        request.setVehicleSource(1);
        request.setVehicleColor(3);
        request.setMileAge(10000);
        request.setSelfServiceReturn(1);
        request.setDelFlg(false);
        
        vehicleList.add(request);
        batchRequest.setList(vehicleList);
        
        return JSON.toJSONString(batchRequest);
    }
    
    /**
     * 创建字段异常场景的请求
     * 部分字段设置为异常值
     */
    public static String createInvalidFieldRequest() {
        VehicleBatchRequest batchRequest = new VehicleBatchRequest();
        List<VehicleRequest> vehicleList = new ArrayList<>();
        
        // 创建车辆请求对象
        VehicleRequest request = new VehicleRequest();
        request.setVehicleModelId("modelhello");
        request.setSaasModelId(1001L);
        request.setStoreId("test57_hello");
        request.setSaasStoreId(2001L);
        request.setVehicleId("vehicle900");
        request.setSaasVehicleId(3001L);
        
        // 设置行驶证信息 - 使用异常值
        DrivingLicenseInfo drivingLicenseInfo = new DrivingLicenseInfo();
        drivingLicenseInfo.setPlateNumber("沪A12345"); // 正常值
        drivingLicenseInfo.setVin("INVALID_VIN"); // 异常值：无效的车架号
        drivingLicenseInfo.setEngineNo("INVALID_ENGINE"); // 异常值：无效的发动机号
        drivingLicenseInfo.setRegisterDate("2050-01-01"); // 异常值：未来日期
        drivingLicenseInfo.setUsageNature(99); // 异常值：不存在的使用性质
        drivingLicenseInfo.setImgUrl("invalid_url"); // 异常值：无效的URL
        drivingLicenseInfo.setOwner("测试车主");
        request.setDrivingLicenseInfo(drivingLicenseInfo);
        
        // 设置年检信息 - 使用异常值
        AnnualCheckInfo annualCheckInfo = new AnnualCheckInfo();
        annualCheckInfo.setActiveData("2000-01-01"); // 异常值：过期日期
        annualCheckInfo.setImgUrl("invalid_url"); // 异常值：无效的URL
        request.setAnnualCheckInfo(annualCheckInfo);
        
        // 设置其他信息 - 使用异常值
        request.setVehicleSource(99); // 异常值：不存在的车辆来源
        request.setVehicleColor(99); // 异常值：不存在的车辆颜色
        request.setMileAge(-1000); // 异常值：负数里程
        request.setSelfServiceReturn(99); // 异常值：无效的自助取还值
        request.setDelFlg(false);
        
        vehicleList.add(request);
        batchRequest.setList(vehicleList);
        
        return JSON.toJSONString(batchRequest);
    }
    
    /**
     * 创建必填字段为空的请求
     * 必填字段设置为null或空值
     */
    public static String createMissingRequiredFieldRequest() {
        VehicleBatchRequest batchRequest = new VehicleBatchRequest();
        List<VehicleRequest> vehicleList = new ArrayList<>();
        
        // 创建车辆请求对象 - 缺少必填字段
        VehicleRequest request = new VehicleRequest();
        // 不设置vehicleModelId（必填）
        request.setSaasModelId(1001L);
        // 不设置storeId（必填）
        request.setSaasStoreId(2001L);
        // 不设置vehicleId（必填）
        request.setSaasVehicleId(3001L);
        
        // 设置行驶证信息 - 缺少必填字段
        DrivingLicenseInfo drivingLicenseInfo = new DrivingLicenseInfo();
        // 不设置plateNumber（必填）
        // 不设置vin（必填）
        // 不设置engineNo（必填）
        drivingLicenseInfo.setRegisterDate(LocalDate.now().minusYears(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        drivingLicenseInfo.setUsageNature(1);
        drivingLicenseInfo.setImgUrl("https://example.com/driving_license.jpg");
        drivingLicenseInfo.setOwner("测试车主");
        request.setDrivingLicenseInfo(drivingLicenseInfo);
        
        // 设置其他信息
        request.setVehicleSource(1);
        request.setVehicleColor(3);
        request.setMileAge(10000);
        request.setSelfServiceReturn(1);
        request.setDelFlg(false);
        
        vehicleList.add(request);
        batchRequest.setList(vehicleList);
        
        return JSON.toJSONString(batchRequest);
    }
    
    /**
     * 创建空列表请求
     * 列表为空
     */
    public static String createEmptyListRequest() {
        VehicleBatchRequest batchRequest = new VehicleBatchRequest();
        batchRequest.setList(new ArrayList<>());
        
        return JSON.toJSONString(batchRequest);
    }
    
    /**
     * 创建超过最大数量的请求
     * 列表数量超过50条
     */
    public static String createExceedMaxCountRequest() {
        VehicleBatchRequest batchRequest = new VehicleBatchRequest();
        List<VehicleRequest> vehicleList = new ArrayList<>();
        
        // 创建51条记录（超过最大限制50条）
        for (int i = 0; i < 51; i++) {
            VehicleRequest request = new VehicleRequest();
            request.setVehicleModelId("modelhello");
            request.setSaasModelId(1000L + i);
            request.setStoreId("test57_hello");
            request.setSaasStoreId(2000L + i);
            request.setVehicleId("vehicle" + i);
            request.setSaasVehicleId(3000L + i);
            
            // 设置行驶证信息
            DrivingLicenseInfo drivingLicenseInfo = new DrivingLicenseInfo();
            drivingLicenseInfo.setPlateNumber("沪A" + (10000 + i));
            drivingLicenseInfo.setVin("LSVAU2429E" + (1000000 + i));
            drivingLicenseInfo.setEngineNo("EA211" + (100000 + i));
            drivingLicenseInfo.setRegisterDate(LocalDate.now().minusYears(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            drivingLicenseInfo.setUsageNature(1);
            drivingLicenseInfo.setImgUrl("https://example.com/driving_license_" + i + ".jpg");
            drivingLicenseInfo.setOwner("测试车主" + i);
            request.setDrivingLicenseInfo(drivingLicenseInfo);
            
            request.setVehicleSource(1);
            request.setSelfServiceReturn(1);
            request.setDelFlg(false);
            
            vehicleList.add(request);
        }
        
        batchRequest.setList(vehicleList);
        
        return JSON.toJSONString(batchRequest);
    }
} 