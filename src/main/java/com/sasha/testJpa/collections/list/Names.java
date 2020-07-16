package com.sasha.testJpa.collections.list;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Names {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    @CollectionTable(name = "persons_names")
    @OrderColumn(name = "order_names")
    @Column(name = "list_of_names")
    List<String> list =new ArrayList<>();

    public Names() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> name) {
        this.list = name;
    }
}
