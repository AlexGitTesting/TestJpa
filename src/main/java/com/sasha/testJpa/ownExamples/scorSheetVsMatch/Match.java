package com.sasha.testJpa.ownExamples.scorSheetVsMatch;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="match")
public class Match extends Identifiable {

    private String date;
    private int number;

    public Match() {
    }
    public Match(String date, int number){
        this.date=date;
        this.number=number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
