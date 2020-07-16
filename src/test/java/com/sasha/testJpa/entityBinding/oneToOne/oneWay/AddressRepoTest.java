package com.sasha.testJpa.entityBinding.oneToOne.oneWay;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE )
class AddressRepoTest {
    @Autowired
    AddressRepo addressRepo;

    private final static Logger log= LoggerFactory.getLogger(AddressRepoTest.class);









}