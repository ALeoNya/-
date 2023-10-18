package com.example.secondhandcardemo.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
@TableName("car")
public class Car {
//    private int maintain_id;
//    private int insurance_id;
//    private int information_id;
//    private int accident_id;
//    private int performance_id;

    @TableId(type = IdType.AUTO)
    private Integer car_id;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private String car_name;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private String car_configuration;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private String car_description;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private String car_plate;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private Integer car_state;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private String car_remark;
}
