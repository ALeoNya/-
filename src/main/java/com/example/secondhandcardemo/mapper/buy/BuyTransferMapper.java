package com.example.secondhandcardemo.mapper.buy;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BuyTransferMapper extends BaseMapper<com.example.secondhandcardemo.pojo.buy.BuyTransfer> {
    @Update("alter table secondhandcars3.buytransfer auto_increment = 0")
    void alterKey();
}
