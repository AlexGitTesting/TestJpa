package com.sasha.testJpa.collections.list;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ReposNamesTest {
    @Autowired
    ReposNames repository;

    @Test
    void createNames() {
        Names names = new Names();
        names.setList(new ArrayList<>(Arrays.asList("popqwr", "qwewsdew", "oiupewg", "soipwuiytriwhvo")));
        repository.save(names);
        names = new Names();
        names.setList(new ArrayList<>(Arrays.asList("wpqoif", "nowijf", "wqfqw", "mnvzcywr")));
        repository.save(names);

    }

}