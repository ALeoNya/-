package com.example.secondhandcardemo.service.serviceImpl;

import com.example.secondhandcardemo.mapper.CarMapper;
import com.example.secondhandcardemo.mapper.car.*;
import com.example.secondhandcardemo.pojo.Car;
import com.example.secondhandcardemo.pojo.carPojo.*;
import com.example.secondhandcardemo.service.AddCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddCarCarServiceImpl implements AddCarService {
    @Autowired
    private CarMapper carMapper;  //主表
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

    @Override
    public String addNewCar() {
        carMapper.insert(new Car());
        accidentMapper.insert(new Accident());
        informationMapper.insert(new Information());
        insuranceMapper.insert(new Insurance());
        maintainMapper.insert(new Maintain());
        ownerMapper.insert(new Owner());
        performanceMapper.insert(new Performance());
        return "新建新车辆完成";
    }

    @Override
    public String deleteCar(Car cat) {
        System.out.println(cat.getCar_id());
        carMapper.deleteById(cat);
        carMapper.alterKey();  //重置自增键

        accidentMapper.deleteById(cat.getCar_id());
        accidentMapper.alterKey();

        informationMapper.deleteById(cat.getCar_id());
        informationMapper.alterKey();

        insuranceMapper.deleteById(cat.getCar_id());
        insuranceMapper.alterKey();

        maintainMapper.deleteById(cat.getCar_id());
        maintainMapper.alterKey();

        ownerMapper.deleteById(cat.getCar_id());
        ownerMapper.alterKey();

        performanceMapper.deleteById(cat.getCar_id());
        performanceMapper.alterKey();
        return "删除车辆完成";
    }

    @Override
    public String updateCar(Car car) {
        carMapper.updateById(car);
        return "更新车辆表单完成";
    }

    @Override
    public String updateAccident(Accident accident) {
        accidentMapper.updateById(accident);
        return "更新事故表单完成";
    }

    @Override
    public String updateInformation(Information information) {
        informationMapper.updateById(information);
        return "更新额外信息表单完成";
    }

    @Override
    public String updateInsurance(Insurance insurance) {
        insuranceMapper.updateById(insurance);
        return "更新保险表单完成";
    }

    @Override
    public String updateMaintain(Maintain maintain) {
        maintainMapper.updateById(maintain);
        return "更新整备表单完成";
    }

    @Override
    public String updateOwner(Owner owner) {
        ownerMapper.updateById(owner);
        return "更新原车主表单完成";
    }

    @Override
    public String updatePerformance(Performance performance) {
        performanceMapper.updateById(performance);
        return "更新车况表单完成";
    }
}
