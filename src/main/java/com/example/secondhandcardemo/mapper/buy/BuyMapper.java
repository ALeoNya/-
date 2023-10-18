package com.example.secondhandcardemo.mapper.buy;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.secondhandcardemo.pojo.buy.Buy;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BuyMapper extends BaseMapper<Buy> {
    @Update("alter table secondhandcars3.buy auto_increment = 0")
    void alterKey();
}
