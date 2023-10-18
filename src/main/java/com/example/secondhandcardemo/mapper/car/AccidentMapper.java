package com.example.secondhandcardemo.mapper.car;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.secondhandcardemo.pojo.carPojo.Accident;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface AccidentMapper extends BaseMapper<Accident> {
    @Update("alter table secondhandcars3.accident auto_increment = 0")
    void alterKey();
}
