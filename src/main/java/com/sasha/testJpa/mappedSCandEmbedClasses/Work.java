package com.sasha.testJpa.mappedSCandEmbedClasses;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Work {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    protected Employee employee;


    protected Manager manager;

    public void setEmployee(String firstName, String lastName, int salary, String date){
//        Employee employee1=new Employee();
//        employee1.setFirstName(firstName);
//        employee1.setLastName(lastName);
//        employee1.setSalary(salary);
//        employee1.setStartWork(parsDate(date));
//        employee=employee1;

        employee=new Employee();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setSalary(salary);
        employee.setStartWork(parsDate(date));



    }

    public  void setManager(String firstName, String lastName, String position) {
        Manager manager1=new Manager();
        manager1.setFirstName(firstName);
        manager1.setLastName(lastName);
        manager1.setPosition(position);
        manager=manager1;

    }

    private Date parsDate(String date){
        SimpleDateFormat format=new SimpleDateFormat("dd.MM.yyyy");
        Date date1=null;
        try {
            date1=format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date1;
    }

    public Work() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Manager getManager() {
        return manager;
    }
}
