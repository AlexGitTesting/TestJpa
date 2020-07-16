package com.sasha.testJpa.embedClass.repos;

import com.sasha.testJpa.embedClass.Employee;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmbedRepository extends JpaRepository<Employee,Long> {





}
