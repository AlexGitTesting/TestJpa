package com.sasha.testJpa.entityBinding.oneToOne.oneWay;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostomerRepo extends JpaRepository<Costomer,Long> {
}
