package com.sasha.testJpa.oneToMany.oneWay;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class PureOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToMany
    @JoinColumn(name = "iren_id")
    private List<Iren> list=new ArrayList<>();
    private String localNam="federast";

    public PureOrder() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Iren> getList() {
        return list;
    }

    public void setList(List<Iren> list) {
        this.list = list;
    }
}
