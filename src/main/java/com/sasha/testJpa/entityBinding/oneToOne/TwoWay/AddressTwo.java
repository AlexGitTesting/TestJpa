package com.sasha.testJpa.entityBinding.oneToOne.TwoWay;

import javax.persistence.*;

@Entity
@Table(name = "twoway_adress")
public class AddressTwo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "zipcode")
    private String zipcode;

    @Column(name = "street")
    private String street;

    @OneToOne(mappedBy = "addressTwo")
    CostomerTwo costomerTwo;

    public AddressTwo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public CostomerTwo getCostomerTwo() {
        return costomerTwo;
    }

    public void setCostomerTwo(CostomerTwo costomerTwo) {
        this.costomerTwo = costomerTwo;
    }
}
