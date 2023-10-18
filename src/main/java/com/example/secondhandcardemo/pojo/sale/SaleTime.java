package com.example.secondhandcardemo.pojo.sale;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
@TableName("saletime")
public class SaleTime {
    @TableId(type = IdType.AUTO)
    private Integer sale_time_id;

    private Integer car_id;

    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private Integer sale_time_year;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private Integer sale_time_month;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private Integer sale_time_day;
}
