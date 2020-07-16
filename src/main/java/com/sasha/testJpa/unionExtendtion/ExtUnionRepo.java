package com.sasha.testJpa.unionExtendtion;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExtUnionRepo extends JpaRepository<ExtPerson, Long> {
}
