package com.alfred.mapper;

import com.alfred.domain.CommodityInfo;

public interface CommodityInfoMapper {
    int deleteByPrimaryKey(Integer commodityInfoPk);

    int insert(CommodityInfo record);

    int insertSelective(CommodityInfo record);

    CommodityInfo selectByPrimaryKey(Integer commodityInfoPk);

    int updateByPrimaryKeySelective(CommodityInfo record);

    int updateByPrimaryKeyWithBLOBs(CommodityInfo record);

    int updateByPrimaryKey(CommodityInfo record);
}