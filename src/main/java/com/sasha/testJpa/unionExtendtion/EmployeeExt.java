package com.sasha.testJpa.unionExtendtion;

import com.sasha.testJpa.mapSuperClass.Gender;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class EmployeeExt extends ExtPerson {

    private String position;

    private Integer salary;
    @Temporal(TemporalType.DATE)
    private Date startWorking;

    public EmployeeExt() {
    }

    public void setFields(String position, int salary, Date date, String firstName, String lastName, Gender gender){
        setPosition(position);
        setSalary(salary);
        setStartWorking(date);
        setFirstName(firstName);
        setLastName(lastName);
        setGender(gender);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Date getStartWorking() {
        return startWorking;
    }

    public void setStartWorking(Date startWorking) {
        this.startWorking = startWorking;
    }
}
