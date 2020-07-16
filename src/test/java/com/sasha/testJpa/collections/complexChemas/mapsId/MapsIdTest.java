package com.sasha.testJpa.collections.complexChemas.mapsId;


import com.sasha.testJpa.complexChemas.mapsId.*;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Test of using @MapsId and @Embedded id
 */
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class MapsIdTest {

    private final static Logger log = LoggerFactory.getLogger(MapsIdTest.class);
    @Autowired
    DepartmentRepo departmentRepo;
    @Autowired
    UserMapsIdRepo userMapsIdRepo;

    @Test
    void saveIntoDb(){
        final Department iOs = new Department("IOs");
        final Department savedIOs = departmentRepo.saveAndFlush(iOs);
        final UserId userSasha = new UserId("UserSasha", 22L);
         UserMapsId userMapsIdOne = new UserMapsId(userSasha);
        userMapsIdOne.setDepartment(savedIOs);
        final UserMapsId userMapsIdsaved = userMapsIdRepo.saveAndFlush(userMapsIdOne);
    }


}
