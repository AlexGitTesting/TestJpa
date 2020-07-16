package com.sasha.testJpa.unionExt;

import com.sasha.testJpa.mapSuperClass.Gender;
import com.sasha.testJpa.unionExtendtion.EmployeeExt;
import com.sasha.testJpa.unionExtendtion.ExtUnionRepo;
import com.sasha.testJpa.unionExtendtion.Housewife;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE )
public class ExtUnionTest {

    private static final Logger Log= LoggerFactory.getLogger(ExtUnionTest.class);
    @Autowired
    ExtUnionRepo repository;

    @Test
    void createUnionTable(){
        Housewife wife=new Housewife();
        wife.setFields(true, 350,"Alla","Zaharova", Gender.FEMALE);
        repository.save(wife);

        SimpleDateFormat  format=new SimpleDateFormat("yyyy.MM.dd");
        String date="1984.07.21";
        Date date1=null;
        try {
            date1=format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        EmployeeExt employeeExt=new EmployeeExt();
        employeeExt.setFields("ItDeveloper",2000, date1,"Vlad", "Yama", Gender.MALE);
        repository.save(employeeExt);



    }


}
