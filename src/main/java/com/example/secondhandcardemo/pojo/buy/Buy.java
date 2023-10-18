package com.example.secondhandcardemo.pojo.buy;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
@TableName("buy")
public class Buy {
    @TableId(type = IdType.AUTO)
    private Integer buy_id;

    private Integer car_id;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private Integer buy_cost;
}
