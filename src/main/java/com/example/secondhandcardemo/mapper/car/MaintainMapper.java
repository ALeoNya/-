package com.example.secondhandcardemo.mapper.car;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.secondhandcardemo.pojo.carPojo.Maintain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MaintainMapper extends BaseMapper<Maintain> {
    @Update("alter table secondhandcars3.maintain auto_increment = 0")
    void alterKey();
}
