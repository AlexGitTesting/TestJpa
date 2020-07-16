package com.sasha.testJpa.oneToOne.joinTable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemJoinRepo extends JpaRepository<ItemJoin, Long> {
}
