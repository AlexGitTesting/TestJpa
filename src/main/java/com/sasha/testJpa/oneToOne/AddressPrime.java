package com.sasha.testJpa.oneToOne;

import com.sasha.testJpa.entityBinding.oneToOne.oneWay.Address;

import javax.persistence.*;

@Entity
public class AddressPrime {
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    protected Long id;

    protected String street;
    protected String zipCode;
    protected String city;
    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    protected UserPrime user;

    public AddressPrime() {
    }

    public AddressPrime (UserPrime user){
        this.user=user;
    }
    public AddressPrime(UserPrime user, String street,String zipCode,String city){
        this.id=user.getId();
        this.user=user;
        this.street=street;
        this.zipCode=zipCode;
        this.city=city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public UserPrime getUser() {
        return user;
    }

    public void setUser(UserPrime user) {
        this.user = user;
    }
}
