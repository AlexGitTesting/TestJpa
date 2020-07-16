package com.sasha.testJpa.mapSuperClass.repository;

import com.sasha.testJpa.mapSuperClass.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Person, Long> {

}
