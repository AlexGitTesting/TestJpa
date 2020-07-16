package com.sasha.testJpa.entityBinding.OneToMany.oneWay.bindingColumn;

import javax.persistence.*;

@Entity
@Table(name = "BindColumnLine")
public class LineColumn {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int number;
    private int price;

    public LineColumn() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
