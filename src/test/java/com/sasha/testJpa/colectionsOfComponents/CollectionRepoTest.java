package com.sasha.testJpa.colectionsOfComponents;

import com.sasha.testJpa.colectionsOfComponents.CollectionOfEmbededClass.Man;
import com.sasha.testJpa.colectionsOfComponents.CollectionOfEmbededClass.ManCollection;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@SpringBootTest
class CollectionRepoTest {

    @Autowired
    CollectionRepo repo;
    private final static Logger log = LoggerFactory.getLogger(CollectionRepoTest.class);

    @Test
    void manCollectionTest(){
        ManCollection collection=new ManCollection();
        collection.setObjectName("fifth");
        Set<Man>set=new LinkedHashSet<>();
        set.add(createMan("Serg",15));
        set.add(createMan("Alex",20));
        set.add(createMan("Miho",90));
        set.add(createMan("Pasha",54));
        collection.setManRepo(set);
        repo.save(collection);
        collection=new ManCollection();
        collection.setObjectName("sixth");
        set=new LinkedHashSet<>();
        set.add(createMan("Vasya",36));
        set.add(createMan("Petro",28));
        set.add(createMan("Loma",31));
        set.add(createMan("Andre",81));
        collection.setManRepo(set);
        repo.save(collection);


    }
    private Man createMan(String name, int age){
        Man man =new Man();
        man.setName(name);
        man.setAge(age);
        return  man;
    }

    @Test
    @Transactional
    public void getCollection(){
        ManCollection collection=repo.getOne(27L);
        Set<Man> set=collection.getManRepo();
        for (Man man :
                set) {
            log.warn("*************" + man.getAge() + "******************");
        }

    }

}