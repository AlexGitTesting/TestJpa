package com.sasha.testJpa.oneToOne;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressPrimeRepo extends JpaRepository<AddressPrime,Long> {
}
