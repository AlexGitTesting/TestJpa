package com.sasha.testJpa.oneToMany.oneWay;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class PureServiceTest {

    @Autowired
    public PureService pureService;
    @Autowired
    public IrenRepo irenRepo;

    @Test

     void createPureOrder(){
         Iren iren1 = new Iren("first");
        Iren iren2 = new Iren("second");
         Iren iren3 = new Iren("third");
         PureOrder pureOrder = new PureOrder();
         pureOrder.getList().add(irenRepo.save(iren1));
         pureOrder.getList().add(irenRepo.save(iren2));
         pureOrder.getList().add(irenRepo.save(iren3));
                  PureOrder save = pureService.save(pureOrder);
         assertNotNull(save);


    }


}