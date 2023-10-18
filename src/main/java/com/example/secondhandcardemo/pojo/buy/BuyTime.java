package com.example.secondhandcardemo.pojo.buy;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
@TableName("buytime")
public class BuyTime {
    @TableId(type = IdType.AUTO)
    private Integer buy_time_id;

    private Integer car_id;

    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private Integer buy_time_year;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private Integer buy_time_month;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private Integer buy_time_day;
}
