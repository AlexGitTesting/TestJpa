package com.sasha.testJpa.oneToMany.oneWay;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PureService extends JpaRepository<PureOrder,Long> {
}
