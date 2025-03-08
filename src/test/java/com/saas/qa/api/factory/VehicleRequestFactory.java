package com.saas.qa.api.factory;

import com.alibaba.fastjson.JSON;
import com.saas.qa.api.model.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 车辆请求工厂类
 * AI开头
 * @since 2024-05-15
 */
public class VehicleRequestFactory {

    /**
     * 创建新增车辆请求
     */
    public static String createAddVehicleRequest() {
        VehicleBatchRequest batchRequest = new VehicleBatchRequest();
        List<VehicleRequest> vehicleList = new ArrayList<>();
        
        // 创建车辆请求对象
        VehicleRequest request = new VehicleRequest();
        request.setVehicleModelId("modelhello");
        request.setSaasModelId(1001L);
        request.setStoreId("store456");
        request.setSaasStoreId(2001L);
        request.setVehicleId("vehicle789");
        request.setSaasVehicleId(3001L);
        
        // 设置行驶证信息
        DrivingLicenseInfo drivingLicenseInfo = new DrivingLicenseInfo();
        drivingLicenseInfo.setPlateNumber("沪A12345");
        drivingLicenseInfo.setVin("LSVAU2429E2184735");
        drivingLicenseInfo.setEngineNo("EA211358975");
        drivingLicenseInfo.setRegisterDate(LocalDate.now().minusYears(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        drivingLicenseInfo.setUsageNature(1);
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
     * 创建删除车辆请求
     */
    public static String createDeleteVehicleRequest(String vehicleId, Long saasVehicleId) {
        VehicleBatchRequest batchRequest = new VehicleBatchRequest();
        List<VehicleRequest> vehicleList = new ArrayList<>();
        
        // 创建车辆请求对象
        VehicleRequest request = new VehicleRequest();
        request.setVehicleId(vehicleId);
        request.setSaasVehicleId(saasVehicleId);
        request.setDelFlg(true);
        
        vehicleList.add(request);
        batchRequest.setList(vehicleList);
        
        return JSON.toJSONString(batchRequest);
    }
    
    /**
     * 创建批量新增车辆请求
     */
    public static String createBatchAddVehicleRequest(int count) {
        if (count > 50) {
            count = 50; // 最多50条
        }
        
        VehicleBatchRequest batchRequest = new VehicleBatchRequest();
        List<VehicleRequest> vehicleList = new ArrayList<>();
        
        for (int i = 0; i < count; i++) {
            // 创建车辆请求对象
            VehicleRequest request = new VehicleRequest();
            request.setVehicleModelId("modelhello");
            request.setSaasModelId(1000L + i);
            request.setStoreId("store" + i);
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
            
            // 设置其他必要信息
            request.setVehicleSource(1);
            request.setSelfServiceReturn(1);
            request.setDelFlg(false);
            
            vehicleList.add(request);
        }
        
        batchRequest.setList(vehicleList);
        
        return JSON.toJSONString(batchRequest);
    }
} 