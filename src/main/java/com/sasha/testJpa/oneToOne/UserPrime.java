package com.sasha.testJpa.oneToOne;

import javax.persistence.*;

@Entity
public class UserPrime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    protected String name;

    @OneToOne(mappedBy = "user")
   // @Column(name = "address_id")
    protected AddressPrime addressPrime;

    public UserPrime() {
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

    public AddressPrime getAddressPrime() {
        return addressPrime;
    }

    public void setAddressPrime(AddressPrime addressPrime) {
        this.addressPrime = addressPrime;
    }
}
