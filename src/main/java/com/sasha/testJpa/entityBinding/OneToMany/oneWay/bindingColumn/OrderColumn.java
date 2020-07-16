package com.sasha.testJpa.entityBinding.OneToMany.oneWay.bindingColumn;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "columnbind_order")
public class OrderColumn {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany
            @JoinColumn(name = "linecolumb_fk")
    List<LineColumn> list=new ArrayList<>();

    public OrderColumn() {
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

    public List<LineColumn> getList() {
        return list;
    }

    public void setList(List<LineColumn> list) {
        this.list = list;
    }
}
