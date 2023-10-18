package com.example.secondhandcardemo.service.serviceImpl;

import com.example.secondhandcardemo.mapper.SaleDataMapper;
import com.example.secondhandcardemo.mapper.buy.BuyMapper;
import com.example.secondhandcardemo.mapper.buy.BuyTimeMapper;
import com.example.secondhandcardemo.mapper.buy.BuyTransferMapper;
import com.example.secondhandcardemo.pojo.Car;
import com.example.secondhandcardemo.pojo.SaleData;
import com.example.secondhandcardemo.pojo.buy.Buy;
import com.example.secondhandcardemo.pojo.buy.BuyTime;
import com.example.secondhandcardemo.pojo.buy.BuyTransfer;
import com.example.secondhandcardemo.service.AddBuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddBuyServiceImpl implements AddBuyService {
    @Autowired
    private BuyMapper buyMapper;  //buy主表
    @Autowired
    private BuyTimeMapper buyTimeMapper;
    @Autowired
    private BuyTransferMapper buyTransferMapper;
    @Autowired
    private SaleDataMapper saleDataMapper;  //销售主表

    /**
     * 添加购入订单
     * @param car
     * @return
     */
    @Override
    public String addNewBuyer(Car car) {
        Buy buy = new Buy();
        buy.setCar_id(car.getCar_id());
        buyMapper.insert(buy);

        BuyTime buyTime  = new BuyTime();
        buyTime.setCar_id(car.getCar_id());
        buyTimeMapper.insert(buyTime);

        BuyTransfer buyTransfer = new BuyTransfer();
        buyTransfer.setCar_id(car.getCar_id());
        buyTransferMapper.insert(buyTransfer);

        SaleData saleData = new SaleData();
        saleData.setCar_id(car.getCar_id());
        saleDataMapper.insert(saleData);
        return "新建新车辆购入订单完成";
    }

    /**
     * 删除购入订单
     * @param car
     * @return
     */
    @Override
    public String delBuyer(Car car) {
        buyMapper.deleteById(car.getCar_id());
        buyMapper.alterKey();

        buyTimeMapper.deleteById(car.getCar_id());
        buyTimeMapper.alterKey();

        buyTransferMapper.deleteById(car.getCar_id());
        buyTransferMapper.alterKey();

        saleDataMapper.deleteById(car.getCar_id());
        saleDataMapper.alterKey();
        return "删除车辆购入订单完成";
    }

    @Override
    public String UpdateBuy(Buy buy) {
        buyMapper.updateById(buy);
        return "更新车辆表单完成";
    }

    @Override
    public String UpdateBuyTime(BuyTime buyTime) {
        buyTimeMapper.updateById(buyTime);
        return "更新车辆表单完成";
    }

    @Override
    public String UpdateBuyTransfer(BuyTransfer buyTransfer) {
        buyTransferMapper.updateById(buyTransfer);
        return "更新车辆表单完成";
    }

    @Override
    public String UpdateSaleData(SaleData saleData) {
        saleDataMapper.updateById(saleData);
        return "更新车辆表单完成";
    }
}
