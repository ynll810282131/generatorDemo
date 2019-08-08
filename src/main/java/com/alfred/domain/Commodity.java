package com.alfred.domain;

import java.math.BigDecimal;

public class Commodity {
    private Integer commodityPk;

    private String commodityId;

    private String commodityName;

    private BigDecimal price;

    private String commodityTypeId;

    private String commodityTypeName;

    private String commodityPicture;

    private Integer flag;

    private String salePoint;

    public Integer getCommodityPk() {
        return commodityPk;
    }

    public void setCommodityPk(Integer commodityPk) {
        this.commodityPk = commodityPk;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId == null ? null : commodityId.trim();
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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

    public String getCommodityPicture() {
        return commodityPicture;
    }

    public void setCommodityPicture(String commodityPicture) {
        this.commodityPicture = commodityPicture == null ? null : commodityPicture.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getSalePoint() {
        return salePoint;
    }

    public void setSalePoint(String salePoint) {
        this.salePoint = salePoint == null ? null : salePoint.trim();
    }
}