package com.example.secondhandcardemo.mapper.sale;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.secondhandcardemo.pojo.sale.Sale;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface SaleMapper extends BaseMapper<Sale> {
    @Update("alter table secondhandcars3.sale auto_increment = 0")
    void alterKey();
}
