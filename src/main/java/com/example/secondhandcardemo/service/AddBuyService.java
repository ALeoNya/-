package com.example.secondhandcardemo.service;

import com.example.secondhandcardemo.pojo.Car;
import com.example.secondhandcardemo.pojo.SaleData;
import com.example.secondhandcardemo.pojo.buy.Buy;
import com.example.secondhandcardemo.pojo.buy.BuyTime;
import com.example.secondhandcardemo.pojo.buy.BuyTransfer;
import com.example.secondhandcardemo.pojo.carPojo.*;

public interface AddBuyService {
    String addNewBuyer(Car car);
    String delBuyer(Car car);

    String UpdateBuy(Buy buy);
    String UpdateBuyTime(BuyTime buyTime);
    String UpdateBuyTransfer(BuyTransfer buyTransfer);
    String UpdateSaleData(SaleData saleData);
}
