package com.sasha.testJpa.mapSuperClass;

import javax.persistence.*;
@Entity
@Table(name = "Peress")
public class PersonAddress extends Person {

    @Column(name = "zip")
    private Integer zipcode;
    @Column(name="CITY")
    private String city;

    public PersonAddress() {
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
