package com.sasha.testJpa.mapSuperClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "FEATURES")
public class PersonFeatures extends Person {
    @Column(name="WEIGHT_kg")
    private int weight;
    @Column(name = "HEIGHT_sm")
    private int height;

    public PersonFeatures() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
