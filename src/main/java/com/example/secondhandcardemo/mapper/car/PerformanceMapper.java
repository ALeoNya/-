package com.example.secondhandcardemo.mapper.car;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.secondhandcardemo.pojo.carPojo.Performance;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface PerformanceMapper extends BaseMapper<Performance> {
    @Update("alter table secondhandcars3.performance auto_increment = 0")
    void alterKey();
}
