package com.sasha.testJpa.entityBinding.oneToOne.TwoWay;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class CostomerTwoRepoTest {

    @Autowired
    CostomerTwoRepo costomerTwoRepo;
    @Autowired
    AddressTwoRepo addressTwoRepo;

    @Test
    public void createCostomer(){
        final CostomerTwo costomerTwo = new CostomerTwo();
        costomerTwo.setName("Sasha");
        costomerTwo.setLastname("Hren");
        AddressTwo addressTwo=createAddressTwo();
        addressTwo.setCostomerTwo(costomerTwo);
        costomerTwo.setAddressTwo(addressTwo);
        costomerTwoRepo.save(costomerTwo);
        addressTwoRepo.save(addressTwo);






    }

    public AddressTwo createAddressTwo(){
        final AddressTwo addressTwo = new AddressTwo();
        addressTwo.setCity("Kyiv");
        addressTwo.setStreet("Donca");
        addressTwo.setZipcode("12687");

        return addressTwo;

    }

}