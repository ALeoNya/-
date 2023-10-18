package com.example.secondhandcardemo.service.serviceImpl;

import com.example.secondhandcardemo.mapper.CarMapper;
import com.example.secondhandcardemo.mapper.SaleDataMapper;
import com.example.secondhandcardemo.mapper.buy.BuyMapper;
import com.example.secondhandcardemo.mapper.buy.BuyTimeMapper;
import com.example.secondhandcardemo.mapper.buy.BuyTransferMapper;
import com.example.secondhandcardemo.mapper.car.*;
import com.example.secondhandcardemo.mapper.sale.SaleMapper;
import com.example.secondhandcardemo.mapper.sale.SaleTimeMapper;
import com.example.secondhandcardemo.mapper.sale.SaleTransferMapper;
import com.example.secondhandcardemo.pojo.Car;
import com.example.secondhandcardemo.pojo.SaleData;
import com.example.secondhandcardemo.pojo.buy.Buy;
import com.example.secondhandcardemo.pojo.buy.BuyTime;
import com.example.secondhandcardemo.pojo.buy.BuyTransfer;
import com.example.secondhandcardemo.pojo.carPojo.*;
import com.example.secondhandcardemo.pojo.sale.Sale;
import com.example.secondhandcardemo.pojo.sale.SaleTime;
import com.example.secondhandcardemo.pojo.sale.SaleTransfer;
import com.example.secondhandcardemo.service.AllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllServiceImpl implements AllService {
    //主表
    @Autowired
    private CarMapper carMapper;
    @Autowired
    private AccidentMapper accidentMapper;
    @Autowired
    private InformationMapper informationMapper;
    @Autowired
    private InsuranceMapper insuranceMapper;
    @Autowired
    private MaintainMapper maintainMapper;
    @Autowired
    private OwnerMapper ownerMapper;
    @Autowired
    private PerformanceMapper performanceMapper;

    //buy
    @Autowired
    private BuyMapper buyMapper;
    @Autowired
    private BuyTimeMapper buyTimeMapper;
    @Autowired
    private BuyTransferMapper buyTransferMapper;

    //sale
    @Autowired
    private SaleMapper saleMapper;
    @Autowired
    private SaleTimeMapper saleTimeMapper;
    @Autowired
    private SaleTransferMapper saleTransferMapper;

    //销售总表
    @Autowired
    private SaleDataMapper saleDataMapper;

    @Override
    public String addAll() {
        carMapper.insert(new Car());
        accidentMapper.insert(new Accident());
        informationMapper.insert(new Information());
        insuranceMapper.insert(new Insurance());
        maintainMapper.insert(new Maintain());
        ownerMapper.insert(new Owner());
        performanceMapper.insert(new Performance());

        buyMapper.insert(new Buy());
        buyTimeMapper.insert(new BuyTime());
        buyTransferMapper.insert(new BuyTransfer());
        saleDataMapper.insert(new SaleData());

        saleMapper.insert(new Sale());
        saleTimeMapper.insert(new SaleTime());
        saleTransferMapper.insert(new SaleTransfer());

        saleDataMapper.insert(new SaleData());
        return "新建新车辆完成";
    }
}
