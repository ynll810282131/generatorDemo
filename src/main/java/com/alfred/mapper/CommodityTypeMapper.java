package com.alfred.mapper;

import com.alfred.domain.CommodityType;

public interface CommodityTypeMapper {
    int deleteByPrimaryKey(Integer commodityTypePk);

    int insert(CommodityType record);

    int insertSelective(CommodityType record);

    CommodityType selectByPrimaryKey(Integer commodityTypePk);

    int updateByPrimaryKeySelective(CommodityType record);

    int updateByPrimaryKey(CommodityType record);
}