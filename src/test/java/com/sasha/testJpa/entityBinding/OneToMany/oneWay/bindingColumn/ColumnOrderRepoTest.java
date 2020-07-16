package com.sasha.testJpa.entityBinding.OneToMany.oneWay.bindingColumn;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ColumnOrderRepoTest {

    @Autowired
    ColumnOrderRepo columnOrderRepo;

    @Autowired
    ColumnLineRepo columnLineRepo;

    public LineColumn create(int number, int price){
        final LineColumn lineColumn = new LineColumn();
        lineColumn.setNumber(number);
        lineColumn.setPrice(price);
        columnLineRepo.save(lineColumn);
        return lineColumn;
    }

    @Test
    public void createOrderColumn(){
        final OrderColumn orderColumn = new OrderColumn();
        orderColumn.setName("first");
        ArrayList<LineColumn> list=new ArrayList<>();
        list.add(create(5, 50));
        list.add(create(6, 60));
        list.add(create(7, 70));
        orderColumn.setList(list);
        columnOrderRepo.save(orderColumn);

    }

}