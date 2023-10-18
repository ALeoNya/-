package com.example.secondhandcardemo.service;

import com.example.secondhandcardemo.pojo.Car;
import com.example.secondhandcardemo.pojo.carPojo.*;

public interface AddCarService {
    String addNewCar();
    String deleteCar(Car car);

    String updateCar(Car car);
    String updateAccident(Accident accident);
    String updateInformation(Information information);
    String updateInsurance(Insurance insurance);
    String updateMaintain(Maintain maintain);
    String updateOwner(Owner owner);
    String updatePerformance(Performance performance);
}
