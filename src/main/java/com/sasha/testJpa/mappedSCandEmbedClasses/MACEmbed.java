package com.sasha.testJpa.mappedSCandEmbedClasses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MACEmbed extends JpaRepository<Work, Long> {
}
