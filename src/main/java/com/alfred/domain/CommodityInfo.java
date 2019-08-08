package com.alfred.domain;

public class CommodityInfo {
    private Integer commodityInfoPk;

    private String commodityId;

    private Integer flag;

    private String commodityInfo;

    public Integer getCommodityInfoPk() {
        return commodityInfoPk;
    }

    public void setCommodityInfoPk(Integer commodityInfoPk) {
        this.commodityInfoPk = commodityInfoPk;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId == null ? null : commodityId.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getCommodityInfo() {
        return commodityInfo;
    }

    public void setCommodityInfo(String commodityInfo) {
        this.commodityInfo = commodityInfo == null ? null : commodityInfo.trim();
    }
}