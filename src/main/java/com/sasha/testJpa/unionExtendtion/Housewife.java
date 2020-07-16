package com.sasha.testJpa.unionExtendtion;

import com.sasha.testJpa.mapSuperClass.Gender;

import javax.persistence.Entity;

@Entity
public class Housewife extends ExtPerson {

    private boolean bigudi;

    private int dailyExpenses;

    public Housewife() {
    }

    public void setFields(boolean bigudi, int dailyExpenses,String firstName, String lastName, Gender gender){
        this. bigudi=bigudi;
        this.dailyExpenses=dailyExpenses;
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setGender(gender);
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
