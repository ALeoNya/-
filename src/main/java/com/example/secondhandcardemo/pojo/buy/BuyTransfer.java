package com.example.secondhandcardemo.pojo.buy;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
@TableName("buytransfer")
public class BuyTransfer {
    @TableId(type = IdType.AUTO)
    private String buy_transfer_id;

    private Integer car_id;

    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private String buy_transfer_place;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private Integer buy_transfer_time;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private String buy_transfer_agent;
}
