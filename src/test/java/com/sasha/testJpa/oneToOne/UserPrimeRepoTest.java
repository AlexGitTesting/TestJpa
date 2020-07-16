package com.sasha.testJpa.oneToOne;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;

@SpringBootTest
@AutoConfigureTestDatabase(replace = NONE)
class UserPrimeRepoTest {

    @Autowired
    private UserPrimeRepo userPrimeRepo;
    @Autowired
    private AddressPrimeRepo addressPrimeRepo;

    private final static Logger log = LoggerFactory.getLogger(UserPrimeRepoTest.class);

    @Test
    void saveAddress() {
        UserPrime user=createUser();

        final AddressPrime addressPrime = new AddressPrime(user, "Petrovka", "65464", "Lviv");
        user.setAddressPrime(addressPrime);

       addressPrimeRepo.save(addressPrime);
    }

    UserPrime createUser() {
        final UserPrime userPrime = new UserPrime();
        userPrime.setName("Lenoks");
        return userPrimeRepo.save(userPrime);
//        return userPrime;

    }

}