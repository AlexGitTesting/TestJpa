package com.sasha.testJpa.ownExamples.scorSheetVsMatch;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepo extends JpaRepository<Match,Long> {
}
