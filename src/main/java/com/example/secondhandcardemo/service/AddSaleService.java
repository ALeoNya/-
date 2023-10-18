package com.example.secondhandcardemo.service;

import com.example.secondhandcardemo.pojo.Car;
import com.example.secondhandcardemo.pojo.SaleData;
import com.example.secondhandcardemo.pojo.buy.Buy;
import com.example.secondhandcardemo.pojo.buy.BuyTime;
import com.example.secondhandcardemo.pojo.buy.BuyTransfer;
import com.example.secondhandcardemo.pojo.sale.Sale;
import com.example.secondhandcardemo.pojo.sale.SaleTime;
import com.example.secondhandcardemo.pojo.sale.SaleTransfer;

public interface AddSaleService {
    String addNewSaler(Car car);
    String delSaler(Car car);

    String UpdateSale(Sale sale);
    String UpdateSaleData(SaleTime saleTime);
    String UpdateSaleTransfer(SaleTransfer saleTransfer);
}
