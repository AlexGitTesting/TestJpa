package com.sasha.testJpa.joinTable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "some_wife")
public class HousewifeNew extends Person {
    private  boolean bigudi;
    private int dailyExpenses;

    public HousewifeNew() {
    }

    public HousewifeNew setWife(String name, int age, boolean bigudi, int dailyExpenses){
        setName(name);
        setAge(age);
        this.bigudi=bigudi;
        this.dailyExpenses=dailyExpenses;

        return this;
    }

    public boolean isBigudi() {
        return bigudi;
    }

    public void setBigudi(boolean bigudi) {
        this.bigudi = bigudi;
    }

    public int getDailyExpenses() {
        return dailyExpenses;
    }

    public void setDailyExpenses(int dailyExpenses) {
        this.dailyExpenses = dailyExpenses;
    }
}
