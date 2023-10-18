package com.example.secondhandcardemo.pojo.carPojo;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Insurance {
    @TableId(type = IdType.AUTO)
    private Integer insurance_id;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private Integer insurance_yes;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private Integer expire_year;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private Integer expire_month;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private Integer expire_day;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private String insurance_description;
}
