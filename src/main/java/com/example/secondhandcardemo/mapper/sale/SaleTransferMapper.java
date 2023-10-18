package com.example.secondhandcardemo.mapper.sale;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.secondhandcardemo.pojo.sale.SaleTransfer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface SaleTransferMapper extends BaseMapper<SaleTransfer> {
    @Update("alter table secondhandcars3.saletransfer auto_increment = 0")
    void alterKey();
}
