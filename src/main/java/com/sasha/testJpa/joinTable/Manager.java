package com.sasha.testJpa.joinTable;


import javax.persistence.Entity;

@Entity
public class Manager extends Person {
    private int salary;
    private String position;

    public Manager() {
    }

    public Manager setManager(String name, int age, int salary, String position) {
        setName(name);
        setAge(age);
        this.salary=salary;
        this.position=position;
        return this;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
