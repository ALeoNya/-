package com.example.secondhandcardemo.mapper.buy;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.secondhandcardemo.pojo.buy.BuyTime;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BuyTimeMapper extends BaseMapper<BuyTime> {
    @Update("alter table secondhandcars3.buytime auto_increment = 0")
    void alterKey();
}
