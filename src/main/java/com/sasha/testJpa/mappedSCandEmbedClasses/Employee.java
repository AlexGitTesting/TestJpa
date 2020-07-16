package com.sasha.testJpa.mappedSCandEmbedClasses;

import javax.persistence.*;
import java.util.Date;

@Embeddable
@AttributeOverrides({
        @AttributeOverride(name = "firstName", column = @Column(name = "emp_F_name")),
        @AttributeOverride(name = "lastName", column = @Column(name = "emp_L_name"))})
public class Employee extends Person {

    private int salary;
    @Temporal(TemporalType.DATE)
//            @Basic(optional = false)
    Date startWork;

    public Date getStartWork() {
        return startWork;
    }

    public void setStartWork(Date startWork) {
        this.startWork = startWork;
    }

    public Employee() {
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
