package com.sasha.testJpa.entityBinding.manyToOne.twoWay;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudFoodStuff extends CrudRepository<FoodStaff, Long> {
}
