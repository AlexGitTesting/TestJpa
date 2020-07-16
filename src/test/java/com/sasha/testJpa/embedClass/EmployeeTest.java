package com.sasha.testJpa.embedClass;

import com.sasha.testJpa.embedClass.repos.EmbedRepository;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE )
class EmployeeTest {
    private static final Logger Log= LoggerFactory.getLogger(EmployeeTest.class);

    @Autowired
    EmbedRepository embedRepository;

    @Test
    void embedPerson(){


        PersonEmbed personEmbed=new PersonEmbed();
        PersonEmbed personEmbed2=new PersonEmbed();
        Employee employee=new Employee();
        employee.setPosition("driver");
        employee.setPersonEmbed(personEmbed);
        employee.setPersonEmbed2(personEmbed2);
        embedRepository.save(employee);
        PersonEmbed personEmbed1=new PersonEmbed();
        Employee employee1=new Employee();
        employee1.setPosition("doctor");
        employee1.setPersonEmbed(personEmbed1);
        employee1.setPersonEmbed2(personEmbed2);
        embedRepository.save(employee1);

    }

    @Test
    @Transactional
    void getFieldEmployee(){
        Employee empl=embedRepository.getOne(2L);
        System.out.println(empl.getClass().getSimpleName());

        PersonEmbed getPersonEmbedded=empl.getPersonEmbed();
        System.out.println(getPersonEmbedded.getClass().getSimpleName());

        assertNotNull(getPersonEmbedded, "person is null");
        String name=getPersonEmbedded.getFirstName();
        Log.warn(name+"************************************************");

    }
    @Test
    void changeColumnDef(){
        List<Employee> list;
        list=embedRepository.findAll();

        for (Employee empl :
                list) {
            if (empl.getDefColumn()==null){
                empl.setDefColumn("newDefault");
                embedRepository.save(empl);
            }
        }
    }

}