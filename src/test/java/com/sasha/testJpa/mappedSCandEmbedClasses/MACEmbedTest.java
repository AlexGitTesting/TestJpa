package com.sasha.testJpa.mappedSCandEmbedClasses;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE )
class MACEmbedTest {

    @Autowired
    MACEmbed macEmbed;

    @Test
    void createWork(){
        Work work=new Work();
        work.setEmployee("vasa","hz", 5,"23.02.1985");
        work.setManager("lola", "Boss", "doctor");
        macEmbed.save(work);
    }

}