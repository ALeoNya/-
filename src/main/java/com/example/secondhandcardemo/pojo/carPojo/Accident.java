package com.example.secondhandcardemo.pojo.carPojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
@TableName("accident")
public class Accident {
    @TableId(type = IdType.AUTO)
    private Integer accident_id;

    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private Integer accident_yes;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private String accident_description;
}
