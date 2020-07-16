package com.sasha.testJpa.mappedSCandEmbedClasses;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@AttributeOverrides({
        @AttributeOverride(name = "firstName", column = @Column(name = "man_F_Name")),
        @AttributeOverride(name = "lastName", column = @Column(name = "man_L_name"))})
public class Manager extends Person {

    private String position;



    public Manager() {
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
