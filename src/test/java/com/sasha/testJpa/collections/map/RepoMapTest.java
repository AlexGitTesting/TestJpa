package com.sasha.testJpa.collections.map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class RepoMapTest {

    @Autowired
    RepoMap repository;

    @Test
    void createCars(){
        Cars cars=new Cars();
        cars.setName("euro");
        Map<String, String>map=new HashMap<>();
        map.put("1","SHCODA");
        map.put("2","MERSEDES");
        map.put("3","VOLVO");
        map.put("4","RENO");
        cars.setMap(map);
        repository.save(cars);
        cars=new Cars();
        cars.setName("american");
        map=new HashMap<>();
        map.put("1","FORD");
        map.put("2","CHEVROLET");
        map.put("3","DODGE");
        map.put("4","OLDSMOBILE");
        cars.setMap(map);
        repository.save(cars);

    }

}