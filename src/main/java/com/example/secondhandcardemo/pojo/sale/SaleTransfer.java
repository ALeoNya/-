package com.example.secondhandcardemo.pojo.sale;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
@TableName("saletransfer")
public class SaleTransfer {
    @TableId(type = IdType.AUTO)
    private String sale_transfer_id;

    private Integer car_id;

    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private String sale_transfer_place;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private Integer sale_transfer_time;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private String sale_transfer_agent;
}
