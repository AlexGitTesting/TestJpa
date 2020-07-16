package com.sasha.testJpa.collections.list;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReposNames extends JpaRepository<Names, Long> {
}
