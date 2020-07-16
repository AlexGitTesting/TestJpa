package com.sasha.testJpa.entityBinding.manyToOne.oneWay;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "pussy_collect")
public class Pussy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String pussyName;
    private String pussyLastName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "man_owner")
    private Man man;

    public Pussy() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPussyName() {
        return pussyName;
    }

    public void setPussyName(String pussyName) {
        this.pussyName = pussyName;
    }

    public String getPussyLastName() {
        return pussyLastName;
    }

    public void setPussyLastName(String pussyLastName) {
        this.pussyLastName = pussyLastName;
    }

    public Man getMan() {
        return man;
    }

    public void setMan(Man man) {
        this.man = man;
    }
}
