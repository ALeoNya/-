package com.example.secondhandcardemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.secondhandcardemo.pojo.Car;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CarMapper extends BaseMapper<Car> {
    @Update("alter table secondhandcars3.car auto_increment = 0")
    void alterKey();
}
