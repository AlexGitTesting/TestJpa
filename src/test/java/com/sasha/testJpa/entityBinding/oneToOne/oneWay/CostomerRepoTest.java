package com.sasha.testJpa.entityBinding.oneToOne.oneWay;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class CostomerRepoTest {
    @Autowired
    CostomerRepo costomerRepo;
    @Autowired
    AddressRepo addressRepo;

    @Test
    public void createCostomer(){

        Costomer costomer=new Costomer();
        costomer.setName("Sasha");
        costomer.setLastname("efremov");
        costomer.setAddress(createAddress());
        costomerRepo.save(costomer);

//        costomer.setName("Petro");
//        costomer.setLastname("Bamper");
//        costomer.setAddress(address);


    }



    public Address createAddress(){
        Address address=new Address();
        address.setCity("Kyiv");
        address.setStreet("Khreschyatik");
        address.setZipcode("01033");
        addressRepo.save(address);

//        address.setCity("Odessa");
//        address.setStreet("Derebasovsckaya");
//        address.setZipcode("07050");

        return address;
    }

}