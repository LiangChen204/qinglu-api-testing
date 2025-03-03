package com.saas.qa.api.model;

import java.util.List;

/**
 * 门店联系人请求对象
 * @since 2025-03-03
 */
public class StoreContactRequest {
    private String linkName;
    private String countryCode;
    private String mobile;
    private String telArea;
    private String tel;
    private String telExt;
    private String email;
    private Byte contactType;
    private List<Byte> mobileTypeList;

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTelArea() {
        return telArea;
    }

    public void setTelArea(String telArea) {
        this.telArea = telArea;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTelExt() {
        return telExt;
    }

    public void setTelExt(String telExt) {
        this.telExt = telExt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Byte getContactType() {
        return contactType;
    }

    public void setContactType(Byte contactType) {
        this.contactType = contactType;
    }

    public List<Byte> getMobileTypeList() {
        return mobileTypeList;
    }

    public void setMobileTypeList(List<Byte> mobileTypeList) {
        this.mobileTypeList = mobileTypeList;
    }
} 