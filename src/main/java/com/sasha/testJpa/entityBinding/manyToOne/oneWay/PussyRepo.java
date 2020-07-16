package com.sasha.testJpa.entityBinding.manyToOne.oneWay;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PussyRepo extends JpaRepository<Pussy, Long> {
}
