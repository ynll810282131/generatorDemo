package com.alfred.domain;

public class CommodityType {
    private Integer commodityTypePk;

    private String commodityTypeId;

    private String commodityTypeName;

    private Integer flag;

    public Integer getCommodityTypePk() {
        return commodityTypePk;
    }

    public void setCommodityTypePk(Integer commodityTypePk) {
        this.commodityTypePk = commodityTypePk;
    }

    public String getCommodityTypeId() {
        return commodityTypeId;
    }

    public void setCommodityTypeId(String commodityTypeId) {
        this.commodityTypeId = commodityTypeId == null ? null : commodityTypeId.trim();
    }

    public String getCommodityTypeName() {
        return commodityTypeName;
    }

    public void setCommodityTypeName(String commodityTypeName) {
        this.commodityTypeName = commodityTypeName == null ? null : commodityTypeName.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}