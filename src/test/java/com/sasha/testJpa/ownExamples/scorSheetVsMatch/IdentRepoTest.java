package com.sasha.testJpa.ownExamples.scorSheetVsMatch;

import org.hibernate.Hibernate;
import org.hibernate.proxy.HibernateProxy;
import org.hibernate.proxy.HibernateProxyHelper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class IdentRepoTest {

    @Autowired
    private MatchRepo matchRepo;
    @Autowired
    private ScoreSheetRepo sheetRepo;


    @Test
@Transactional
    void firsttest(){
        final Match one = matchRepo.getOne(290L);
        final Match unproxy =(Match) Hibernate.unproxy(one);
        final Scoresheet scoresheetOne = new Scoresheet(789);
        scoresheetOne.setMatch(unproxy);
        final Scoresheet savedScoresheet = sheetRepo.saveAndFlush(scoresheetOne);
    }


    @Test
    void secondTest(){
        final Match matchOne = new Match("03.07.2015", 3);
        final Match savedMatch = matchRepo.saveAndFlush(matchOne);
    }

}