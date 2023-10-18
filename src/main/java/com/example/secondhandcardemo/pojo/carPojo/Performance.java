package com.example.secondhandcardemo.pojo.carPojo;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Performance {
    @TableId(type = IdType.AUTO)
    private Integer performance_id;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private String performance_description;
}
