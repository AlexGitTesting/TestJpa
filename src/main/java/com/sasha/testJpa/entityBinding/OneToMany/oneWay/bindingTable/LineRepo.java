package com.sasha.testJpa.entityBinding.OneToMany.oneWay.bindingTable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LineRepo extends JpaRepository<Line, Long> {
}
