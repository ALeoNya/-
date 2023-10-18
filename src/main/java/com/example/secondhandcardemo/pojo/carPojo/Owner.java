package com.example.secondhandcardemo.pojo.carPojo;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Owner {
    @TableId(type = IdType.AUTO)
    private Integer owner_id;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private String owner_name;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private String owner_id_num;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private String owner_wechat;
    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private String owner_phone;
}
