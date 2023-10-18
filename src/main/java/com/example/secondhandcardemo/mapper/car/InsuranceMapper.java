package com.example.secondhandcardemo.mapper.car;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.secondhandcardemo.pojo.carPojo.Insurance;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface InsuranceMapper extends BaseMapper<Insurance> {
    @Update("alter table secondhandcars3.insurance auto_increment = 0")
    void alterKey();
}
