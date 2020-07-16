package com.sasha.testJpa.collections.map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoMap extends JpaRepository<Cars,Long> {
}
