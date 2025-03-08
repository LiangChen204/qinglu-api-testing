package com.saas.qa.api.util;

import com.saas.qa.api.model.VehicleModelRequest;
import com.saas.qa.api.model.VehicleStoreTags;

import java.util.ArrayList;
import java.util.List;

public class VehicleModelRequestBuilder {
    private VehicleModelRequest request;

    public VehicleModelRequestBuilder() {
        request = new VehicleModelRequest();
    }

    public VehicleModelRequestBuilder setVehicleModelId(String vehicleModelId) {
        request.setVehicleModelId("modelhello");
        return this;
    }

    public VehicleModelRequestBuilder setSaasModelId(Long saasModelId) {
        request.setSaasModelId(saasModelId);
        return this;
    }

    public VehicleModelRequestBuilder setLicenseType(Integer licenseType) {
        request.setLicenseType(licenseType);
        return this;
    }

    public VehicleModelRequestBuilder addStoreTag(VehicleStoreTags storeTag) {
        if (request.getStoreTags() == null) {
            request.setStoreTags(new ArrayList<>());
        }
        request.getStoreTags().add(storeTag);
        return this;
    }

    public VehicleModelRequestBuilder setDelFlg(Boolean delFlg) {
        request.setDelFlg(delFlg);
        return this;
    }

    public VehicleModelRequest build() {
        return request;
    }
}