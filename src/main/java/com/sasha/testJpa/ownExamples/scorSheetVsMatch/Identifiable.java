package com.sasha.testJpa.ownExamples.scorSheetVsMatch;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Identifiable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Identifiable() {
    }

    public Long getId() {
        return id;
    }
}
