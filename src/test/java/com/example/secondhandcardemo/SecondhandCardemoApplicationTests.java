package com.example.secondhandcardemo;

import com.example.secondhandcardemo.mapper.CarMapper;
import com.example.secondhandcardemo.pojo.Car;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SecondhandCardemoApplicationTests {
    @Autowired
    private CarMapper carMapper;
    @Test
    void testGetAllCar() {
        List<Car> carList = carMapper.selectList(null);
        System.out.println(carList);
    }

    @Test
    void addNewCar() {
        Car cars = new Car();
//        cars.setCar_name("");
//        cars.setCar_configuration("");
//        cars.setCar_plate("");
//        cars.setCar_state(null);
        carMapper.insert(new Car());
        List<Car> carList = carMapper.selectList(null);
        System.out.println(carList);
    }

}
