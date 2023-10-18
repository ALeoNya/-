package com.example.secondhandcardemo.pojo;

import lombok.Data;

@Data
public class Response {
    private Integer code;
    private String msg;
    private Object entity;
    public Response(Integer code, String msg, Object entity) {
        this.code = code;
        this.msg = msg;
        this.entity = entity;
    }
}
