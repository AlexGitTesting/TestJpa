package com.sasha.testJpa.entityBinding.OneToMany.oneWay.bindingTable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<OrderMy,Long> {
}
