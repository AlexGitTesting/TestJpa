package com.sasha.testJpa.oneToMany.bag;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo extends JpaRepository<Itemic, Long> {
}
