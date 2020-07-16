package com.sasha.testJpa.mapSuperClass.repository;

import com.sasha.testJpa.mapSuperClass.Gender;
import com.sasha.testJpa.mapSuperClass.PersonAddress;
import com.sasha.testJpa.mapSuperClass.PersonFeatures;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE )
class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    public void savePerson(){
        PersonAddress personAddress=new PersonAddress();
        personAddress.setFirstName("Sasha");
        personAddress.setLastName("Yefremov");
        personAddress.setGender(Gender.MALE);
        personAddress.setCity("KYIV");
        personAddress.setZipcode(13589);

        userRepository.save(personAddress);
        PersonFeatures personFeatures=new PersonFeatures();
        personFeatures.setFirstName("Serg");
        personFeatures.setLastName("Dorosh");
        personFeatures.setGender(Gender.MALE);
        personFeatures.setHeight(175);
        personFeatures.setWeight(90);


        userRepository.save(personFeatures);
    }

}