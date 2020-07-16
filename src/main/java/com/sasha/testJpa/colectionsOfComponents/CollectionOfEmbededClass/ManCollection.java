package com.sasha.testJpa.colectionsOfComponents.CollectionOfEmbededClass;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
public class ManCollection {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name_object")
    private String objectName;

    @ElementCollection
    @CollectionTable(name = "men_database")
           @OrderBy("age ASC ")
    Set<Man>manRepo=new LinkedHashSet<>();

    public ManCollection() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public Set<Man> getManRepo() {
        return manRepo;
    }

    public void setManRepo(Set<Man> manRepo) {
        this.manRepo = manRepo;
    }
}
