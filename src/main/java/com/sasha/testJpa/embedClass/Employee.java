package com.sasha.testJpa.embedClass;

import org.hibernate.annotations.Proxy;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="number_id")
    private Long id;
    @Column(name="post")
    private String position;
    @Embedded
    protected PersonEmbed personEmbed;
    @AttributeOverrides({
            @AttributeOverride(name = "firstName", column = @Column(name = "firstName1")),
            @AttributeOverride(name = "lastName", column = @Column(name = "lastName1")),
            @AttributeOverride(name = "gender", column = @Column(name = "gender1")),
    })
    protected PersonEmbed personEmbed2;

    public void setDefColumn(String defColumn) {
        this.defColumn = defColumn;
    }

    private  String defColumn="default";

    public String getDefColumn() {
        return defColumn;
    }

    public PersonEmbed getPersonEmbed2() {
        return personEmbed2;
    }

    public void setPersonEmbed2(PersonEmbed personEmbed1) {
        this.personEmbed2 = personEmbed1;
    }

    public Employee() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public PersonEmbed getPersonEmbed() {
        return personEmbed;
    }

    public void setPersonEmbed(PersonEmbed personEmbed) {
        this.personEmbed = personEmbed;
    }
}
