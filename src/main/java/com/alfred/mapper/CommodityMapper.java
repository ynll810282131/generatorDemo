package com.alfred.mapper;

import com.alfred.domain.Commodity;

public interface CommodityMapper {
    int deleteByPrimaryKey(Integer commodityPk);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    Commodity selectByPrimaryKey(Integer commodityPk);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);
}