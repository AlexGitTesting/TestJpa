package com.sasha.testJpa.entityBinding.oneToOne.TwoWay;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressTwoRepo extends JpaRepository<AddressTwo,Long> {
}
