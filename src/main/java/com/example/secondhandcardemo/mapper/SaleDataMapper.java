package com.example.secondhandcardemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.secondhandcardemo.pojo.SaleData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface SaleDataMapper extends BaseMapper<SaleData> {
    @Update("alter table secondhandcars3.saledata auto_increment = 0")
    void alterKey();
}
