package com.sasha.testJpa.oneToMany.bag;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "itemic_bag")
public class Itemic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    protected String name;

    @OneToMany(mappedBy = "itemic")
    public Collection<Binnding> binndings = new ArrayList<>();

    public Itemic() {
    }
    public Itemic(String name){
        this.name=name;
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

    public Collection<Binnding> getBinndings() {
        return binndings;
    }

    public void setBinndings(Collection<Binnding> binndings) {
        this.binndings = binndings;
    }
}
