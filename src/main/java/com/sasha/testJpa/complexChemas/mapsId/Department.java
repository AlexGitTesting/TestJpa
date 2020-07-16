package com.sasha.testJpa.complexChemas.mapsId;

import javax.persistence.*;

/**
 *
 * @author Alexandr Yefremov
 */
@Entity
@Table(name = "department_maps_id")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    public Department() {
    }
    public Department(String name){
        this.name=name;
    }

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
