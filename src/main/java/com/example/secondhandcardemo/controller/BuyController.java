package com.example.secondhandcardemo.controller;

import com.example.secondhandcardemo.pojo.Car;
import com.example.secondhandcardemo.pojo.Response;
import com.example.secondhandcardemo.pojo.SaleData;
import com.example.secondhandcardemo.pojo.buy.Buy;
import com.example.secondhandcardemo.pojo.buy.BuyTime;
import com.example.secondhandcardemo.pojo.buy.BuyTransfer;
import com.example.secondhandcardemo.pojo.response.Code;
import com.example.secondhandcardemo.pojo.response.Msg;
import com.example.secondhandcardemo.service.AddBuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class BuyController {
    @Autowired
    private AddBuyService addBuyService;

    @PostMapping("/buy/add")
    public Response addNewBuyer(@RequestBody Car car) {
        addBuyService.addNewBuyer(car);
        return new Response(Code.RUN_SUCCESS, Msg.RUN_SUCCESS,"hello world add buyer");
    }
    @PostMapping("/buy/del")
    public Response delBuyer(@RequestBody  Car car) {
        addBuyService.delBuyer(car);
        return new Response(Code.RUN_SUCCESS, Msg.RUN_SUCCESS,"hello world add buyer");
    }

    @PostMapping("/buy/udp/buy")
    public Response UpdateBuy(@RequestBody Buy buy) {
        addBuyService.UpdateBuy(buy);
        return new Response(Code.RUN_SUCCESS, Msg.RUN_SUCCESS,"hello world Update Buy");
    }

    @PostMapping("/buy/udp/buyTime")
    public Response UpdateBuyTime(@RequestBody BuyTime buyTime) {
        addBuyService.UpdateBuyTime(buyTime);
        return new Response(Code.RUN_SUCCESS, Msg.RUN_SUCCESS,"hello world Update BuyTime");
    }

    @PostMapping("/buy/udp/buyTransfer")
    public Response UpdateBuyTransfer(@RequestBody BuyTransfer buyTransfer) {
        addBuyService.UpdateBuyTransfer(buyTransfer);
        return new Response(Code.RUN_SUCCESS, Msg.RUN_SUCCESS,"hello world Update BuyTransfer");
    }

    @PostMapping("/buy/udp/saleData")
    public Response UpdateBuy(@RequestBody SaleData saleData) {
        addBuyService.UpdateSaleData(saleData);
        return new Response(Code.RUN_SUCCESS, Msg.RUN_SUCCESS,"hello world Update SaleData");
    }
}
