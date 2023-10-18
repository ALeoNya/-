package com.example.secondhandcardemo.controller;

import com.example.secondhandcardemo.pojo.Car;
import com.example.secondhandcardemo.pojo.Response;
import com.example.secondhandcardemo.pojo.carPojo.*;
import com.example.secondhandcardemo.pojo.response.Code;
import com.example.secondhandcardemo.pojo.response.Msg;
import com.example.secondhandcardemo.service.AddCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CarController {
    @Autowired
    private AddCarService addCarService;

    @PostMapping("/car/add")
    public Response addNewCar() {
        addCarService.addNewCar();
        return new Response(Code.RUN_SUCCESS, Msg.RUN_SUCCESS,"hello world add car");
    }
    @PostMapping("/car/del")
    public Response deleteCar(@RequestBody Car car) {
        addCarService.deleteCar(car);
        return new Response(Code.RUN_SUCCESS, Msg.RUN_SUCCESS,"hello world delete car");
    }

    @PostMapping("/car/updateCar")
    public Response updateCar(@RequestBody Car car) {
        addCarService.updateCar(car);
        return new Response(Code.RUN_SUCCESS, Msg.RUN_SUCCESS,"hello world update Car");
    }

    @PostMapping("/car/updateAccident")
    public Response updateAccident(@RequestBody Accident accident) {
        addCarService.updateAccident(accident);
        return new Response(Code.RUN_SUCCESS, Msg.RUN_SUCCESS,"hello world update Accident");
    }

    @PostMapping("/car/updateInformation")
    public Response updateInformation(@RequestBody Information information) {
        addCarService.updateInformation(information);
        return new Response(Code.RUN_SUCCESS, Msg.RUN_SUCCESS,"hello world update Information");
    }

    @PostMapping("/car/updateInsurance")
    public Response updateInsurance(@RequestBody Insurance insurance) {
        addCarService.updateInsurance(insurance);
        return new Response(Code.RUN_SUCCESS, Msg.RUN_SUCCESS,"hello world update insurance");
    }

    @PostMapping("/car/updateMaintain")
    public Response updateMaintain(@RequestBody Maintain maintain) {
        addCarService.updateMaintain(maintain);
        return new Response(Code.RUN_SUCCESS, Msg.RUN_SUCCESS,"hello world update update Maintain");
    }

    @PostMapping("/car/updateOwner")
    public Response updateOwner(@RequestBody Owner owner) {
        addCarService.updateOwner(owner);
        return new Response(Code.RUN_SUCCESS, Msg.RUN_SUCCESS,"hello world update update Owner");
    }

    @PostMapping("/car/updatePerformance")
    public Response updatePerformance(@RequestBody Performance performance) {
        addCarService.updatePerformance(performance);
        return new Response(Code.RUN_SUCCESS, Msg.RUN_SUCCESS,"hello world update update Performance");
    }
}
