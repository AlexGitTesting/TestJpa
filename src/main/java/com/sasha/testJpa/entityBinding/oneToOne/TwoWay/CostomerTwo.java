package com.sasha.testJpa.entityBinding.oneToOne.TwoWay;

import com.sasha.testJpa.entityBinding.oneToOne.oneWay.Address;

import javax.persistence.*;

@Entity
@Table(name = "twoway_costomer")
public class CostomerTwo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String lastname;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addresstwo_fk")
    AddressTwo addressTwo;

    public CostomerTwo() {
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public AddressTwo getAddressTwo() {
        return addressTwo;
    }

    public void setAddressTwo(AddressTwo addressTwo) {
        this.addressTwo = addressTwo;
    }
}
