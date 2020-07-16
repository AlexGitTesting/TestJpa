package com.sasha.testJpa.entityBinding.manyToOne.oneWay;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.EnableMBeanExport;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ManRepoTest {

    @Autowired
    ManRepo manRepo;
    @Autowired
    PussyRepo pussyRepo;

    @Test
    void createPussy(){
        Man man=createMan("Fedor", "Rogachev");
        Pussy pussy=new Pussy();
        pussy.setPussyName("Luba");
        pussy.setPussyLastName("Krovosisya");
        pussy.setMan(man);
        pussyRepo.save(pussy);

        pussy=new Pussy();
        pussy.setPussyName("Liza");
        pussy.setPussyLastName("Golovach");
        pussy.setMan(man);
        pussyRepo.save(pussy);

        pussy=new Pussy();
        pussy.setPussyName("Aziza");
        pussy.setPussyLastName("Plesheedova");
        pussy.setMan(man);
        pussyRepo.save(pussy);
    }

    @Test
    Man createMan(String name, String lastName){
        Man man= new Man();
        man.setName(name);
        man.setLastName(lastName);
        manRepo.save(man);
        return man;
    }

}