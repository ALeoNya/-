package com.example.secondhandcardemo.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
@TableName("saledata")
public class SaleData {
    @TableId(type = IdType.AUTO)
    private Integer saleData_id;

    private Integer car_id;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private Integer saleData_price;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private Integer saleData_total_cost;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private String saleData_PL;
}
