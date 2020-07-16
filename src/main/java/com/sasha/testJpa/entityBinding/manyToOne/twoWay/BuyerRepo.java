package com.sasha.testJpa.entityBinding.manyToOne.twoWay;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyerRepo extends JpaRepository<Buyer, Long> {

    Buyer findBuyerByFirstName(String firstName);





}
