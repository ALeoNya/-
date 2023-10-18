package com.example.secondhandcardemo.mapper.car;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.secondhandcardemo.pojo.carPojo.Information;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface InformationMapper extends BaseMapper<Information> {
    @Update("alter table secondhandcars3.information auto_increment = 0")
    void alterKey();
}
