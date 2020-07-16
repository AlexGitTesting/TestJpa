package com.sasha.testJpa.entityBinding.OneToMany.oneWay.bindingTable;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class OrderTableRepoTest {

    @Autowired
    LineRepo lineRepo;
    @Autowired
    OrderRepo orderRepo;

    public Line createLine(int number, int price){
        final Line line = new Line();
        line.setNumber(number);
        line.setPrice(price);
        lineRepo.save(line);

        return line;
    }

    @Test
    void createOrder(){
        final OrderMy orderMy = new OrderMy();
        orderMy.setName("first");
        ArrayList<Line> list=new ArrayList<>();
        list.add(createLine(1,10));
        list.add(createLine(2,20));
        list.add(createLine(3,30));
        orderMy.setList(list);
        orderRepo.save(orderMy);
    }

}