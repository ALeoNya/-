package com.example.secondhandcardemo.controller;

import com.example.secondhandcardemo.pojo.Car;
import com.example.secondhandcardemo.pojo.Response;
import com.example.secondhandcardemo.pojo.response.Code;
import com.example.secondhandcardemo.pojo.response.Msg;
import com.example.secondhandcardemo.pojo.sale.Sale;
import com.example.secondhandcardemo.pojo.sale.SaleTime;
import com.example.secondhandcardemo.pojo.sale.SaleTransfer;
import com.example.secondhandcardemo.service.serviceImpl.AddSaleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class SaleController {
    @Autowired
    private AddSaleServiceImpl addSaleService;

    @PostMapping("/sale/add")
    public Response addSaler(@RequestBody Car car) {
        addSaleService.addNewSaler(car);
        return new Response(Code.RUN_SUCCESS, Msg.RUN_SUCCESS,"hello world add saler");
    }

    @PostMapping("/sale/del")
    public Response UpdateSale(@RequestBody  Car car) {
        addSaleService.delSaler(car);
        return new Response(Code.RUN_SUCCESS, Msg.RUN_SUCCESS,"hello world delete saler");
    }

    @PostMapping("/sale/udp/sale")
    public Response UpdateSale(@RequestBody Sale sale) {
        addSaleService.UpdateSale(sale);
        return new Response(Code.RUN_SUCCESS, Msg.RUN_SUCCESS,"hello world Update Sale");
    }

    @PostMapping("/sale/udp/saleTransfer")
    public Response UpdateSaleData(@RequestBody SaleTime saleTime) {
        addSaleService.UpdateSaleData(saleTime);
        return new Response(Code.RUN_SUCCESS, Msg.RUN_SUCCESS,"hello world Update SaleData");
    }

    @PostMapping("/sale/udp/saleTime")
    public Response UpdateSaleTransfer(@RequestBody SaleTransfer saleTransfer) {
        addSaleService.UpdateSaleTransfer(saleTransfer);
        return new Response(Code.RUN_SUCCESS, Msg.RUN_SUCCESS,"hello world Update SaleTransfer");
    }
}
