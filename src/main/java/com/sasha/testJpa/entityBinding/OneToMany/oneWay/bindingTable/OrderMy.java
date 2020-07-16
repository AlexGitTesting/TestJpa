package com.sasha.testJpa.entityBinding.OneToMany.oneWay.bindingTable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class OrderMy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany
            @JoinTable(name = "summary_table",joinColumns = @JoinColumn(name = "order_id"),inverseJoinColumns = @JoinColumn(name="line_id"))
    List<Line> list=new ArrayList<>();

    public OrderMy() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Line> getList() {
        return list;
    }

    public void setList(List<Line> list) {
        this.list = list;
    }
}
