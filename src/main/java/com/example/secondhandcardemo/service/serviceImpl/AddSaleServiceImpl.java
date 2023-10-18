package com.example.secondhandcardemo.service.serviceImpl;

import com.example.secondhandcardemo.mapper.sale.SaleMapper;
import com.example.secondhandcardemo.mapper.sale.SaleTimeMapper;
import com.example.secondhandcardemo.mapper.sale.SaleTransferMapper;
import com.example.secondhandcardemo.pojo.Car;
import com.example.secondhandcardemo.pojo.SaleData;
import com.example.secondhandcardemo.pojo.buy.BuyTime;
import com.example.secondhandcardemo.pojo.sale.Sale;
import com.example.secondhandcardemo.pojo.sale.SaleTime;
import com.example.secondhandcardemo.pojo.sale.SaleTransfer;
import com.example.secondhandcardemo.service.AddSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddSaleServiceImpl implements AddSaleService {
    @Autowired
    private SaleMapper saleMapper;
    @Autowired
    private SaleTimeMapper saleTimeMapper;
    @Autowired
    private SaleTransferMapper saleTransferMapper;

    /**
     * 添加售出订单
     * @param car
     * @return
     */
    @Override
    public String addNewSaler(Car car) {
        Sale sale  = new Sale();
        sale.setCar_id(car.getCar_id());
        saleMapper.insert(sale);

        SaleTime saleTime = new SaleTime();
        saleTime.setCar_id(car.getCar_id());
        saleTimeMapper.insert(saleTime);

        SaleTransfer saleTransfer = new SaleTransfer();
        saleTransfer.setCar_id(car.getCar_id());
        saleTransferMapper.insert(saleTransfer);
        return "新建新车辆售出订单完成";
    }

    /**
     * 删除售出订单
     * @param car
     * @return
     */
    @Override
    public String delSaler(Car car) {
        saleMapper.deleteById(car.getCar_id());
        saleMapper.alterKey();

        saleTimeMapper.deleteById(car.getCar_id());
        saleTimeMapper.alterKey();

        saleTransferMapper.deleteById(car.getCar_id());
        saleTransferMapper.alterKey();
        return "删除车辆售出订单完成";
    }

    @Override
    public String UpdateSale(Sale sale) {
        saleMapper.updateById(sale);
        return "更新车辆表单完成";
    }

    @Override
    public String UpdateSaleData(SaleTime saleTime) {
        saleTimeMapper.updateById(saleTime);
        return "更新车辆表单完成";
    }

    @Override
    public String UpdateSaleTransfer(SaleTransfer saleTransfer) {
        saleTransferMapper.updateById(saleTransfer);
        return "更新车辆表单完成";
    }
}
