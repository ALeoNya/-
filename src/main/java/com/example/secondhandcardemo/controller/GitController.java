package com.example.secondhandcardemo.controller;

import com.example.secondhandcardemo.pojo.Car;
import com.example.secondhandcardemo.pojo.Response;
import com.example.secondhandcardemo.pojo.response.Code;
import com.example.secondhandcardemo.pojo.response.Msg;
import com.example.secondhandcardemo.service.serviceImpl.AddSaleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {
    //Test1
    //Test2
    @Autowired
    private AddSaleServiceImpl addSaleService;

    @PostMapping("/sale/add")
    public Response addSaler(@RequestBody Car car) {
        addSaleService.addNewSaler(car);
        return new Response(Code.RUN_SUCCESS, Msg.RUN_SUCCESS,"hello world add saler");
    }
}
