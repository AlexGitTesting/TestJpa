package com.sasha.testJpa.entityBinding.manyToOne.twoWay;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodStuffRepo extends JpaRepository<FoodStaff, Long> {
}
