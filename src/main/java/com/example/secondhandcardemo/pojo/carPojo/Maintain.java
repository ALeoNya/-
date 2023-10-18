package com.example.secondhandcardemo.pojo.carPojo;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Maintain {
    @TableId(type = IdType.AUTO)
    private Integer maintain_id;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private Integer maintain_cost;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private Integer maintain_description;
}
