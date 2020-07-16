package com.sasha.testJpa.singleTable;

import com.sasha.testJpa.singleTable.enums.KindProduct;
import com.sasha.testJpa.singleTable.enums.Sex;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue("t_shirts")
public class T_shirts extends  Product{

    @Enumerated(value = EnumType.STRING)
    private Sex sex;
    private String color;


    public T_shirts setT_S(Sex sex, String color, boolean inStock, int price){
        this.sex=sex;
        this.color=color;
        setInStock(inStock);
        setKindProduct(KindProduct.T_SHIRT);
        setPrice(price);
        return this;
    }

    public T_shirts() {
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
