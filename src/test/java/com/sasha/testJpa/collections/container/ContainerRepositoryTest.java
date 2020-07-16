package com.sasha.testJpa.collections.container;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ContainerRepositoryTest {

    @Autowired
    ContainerRepository containerRepository;

    @Test
    void createContainer(){
        Item item=new Item();
        item.setImages(containerHelper(10));
        containerRepository.save(item);


    }

    public ArrayList<String> containerHelper(int count){
        final ArrayList<String> strings = new ArrayList<>();
        String string="kluhclewrhrtjhloipqvnhr";
        for (int i = 0; i < count; i++) {
             strings.add(String.valueOf(count) + string.charAt(new Random().nextInt(string.length())));
        }

        return strings;
    }

}