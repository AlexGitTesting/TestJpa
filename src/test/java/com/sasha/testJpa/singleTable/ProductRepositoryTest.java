package com.sasha.testJpa.singleTable;

import com.sasha.testJpa.singleTable.enums.Genre;
import com.sasha.testJpa.singleTable.enums.KindOfCigaretts;
import com.sasha.testJpa.singleTable.enums.Sex;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.print.Book;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE )
class ProductRepositoryTest {

    @Autowired
    ProductRepository repository;


    @Test
    public void saveProduct(){
        repository.save(setBook());
        repository.save(setCigarettes());
        repository.save(setTS());

    }
    @Test
    public Books setBook(){

       return new Books().setBook(Genre.FANTASY,true,true,9000);
    }
    @Test
    public Cigaretts setCigarettes(){
        return new Cigaretts().setCigaretts(KindOfCigaretts.GLO,true,90);
    }
    @Test
    public T_shirts setTS(){
        return new T_shirts().setT_S(Sex.FEMALE,"White",false, 555);
    }

}