package com.example.secondhandcardemo.mapper.car;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.secondhandcardemo.pojo.carPojo.Owner;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface OwnerMapper extends BaseMapper<Owner> {
    @Update("alter table secondhandcars3.owner auto_increment = 0")
    void alterKey();
}
