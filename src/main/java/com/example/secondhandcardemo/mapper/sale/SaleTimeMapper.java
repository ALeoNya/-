package com.example.secondhandcardemo.mapper.sale;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.secondhandcardemo.pojo.sale.SaleTime;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface SaleTimeMapper extends BaseMapper<SaleTime> {
    @Update("alter table secondhandcars3.saletime auto_increment = 0")
    void alterKey();
}
