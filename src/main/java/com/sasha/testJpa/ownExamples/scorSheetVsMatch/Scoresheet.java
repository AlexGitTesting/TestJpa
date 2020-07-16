package com.sasha.testJpa.ownExamples.scorSheetVsMatch;

import javax.persistence.*;

@Entity
@Table(name = "scoresheet")
public class Scoresheet extends Identifiable {

    @MapsId
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private Match match;

    private int serial;

    public Scoresheet() {
    }

    public Scoresheet(int serial){
        this.serial=serial;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }
}
