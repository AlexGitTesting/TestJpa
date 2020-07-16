package com.sasha.testJpa.colectionsOfComponents.CollectionOfEmbededClass;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Man {
    @Column(name = "man_name")
    private String name;

    @Column(name = "age")
    private int age;

    public Man() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
