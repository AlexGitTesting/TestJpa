package com.sasha.testJpa.collections.set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE )
class PeopleSetRepositoryTest {

    @Autowired
    PeopleRepository peopleRepository;

    @Test
    public void createSet(){
        PeopleSet peopleSet =new PeopleSet();
        peopleSet.setNames(createSet(10));
        peopleRepository.save(peopleSet);


    }
    public Set<String> createSet(int count){
        Set<String>names=new HashSet<>();
        for (int i = 0; i < count; i++) {
            names.add(String.valueOf(count+i));
        }



        return names;
    }

}