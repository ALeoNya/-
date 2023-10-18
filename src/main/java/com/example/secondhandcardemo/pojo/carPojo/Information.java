package com.example.secondhandcardemo.pojo.carPojo;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Information {
    @TableId(type = IdType.AUTO)
    private Integer information_id;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private Integer information_tax_yes;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private String information_tax_description;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private Integer information_certificate_yes;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private String information_certificate_description;
}
