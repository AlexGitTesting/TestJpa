package com.sasha.testJpa.joinTable;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE )
class JoinRepositoryTest {

    @Autowired
    JoinRepository joinRepository;

    @Test
    void savePersonJoin(){

        joinRepository.save(new Manager().setManager("Alex",30,2000, "Bariga"));
        joinRepository.save(new HousewifeNew().setWife("Luda",38,true,450));
        joinRepository.save(new Manager().setManager("Dima",40,4000, "Junior"));
        joinRepository.save(new HousewifeNew().setWife("Lada",54,true,800));
    }

}