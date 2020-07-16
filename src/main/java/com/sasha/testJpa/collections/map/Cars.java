package com.sasha.testJpa.collections.map;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "map_cars")
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name_of_object")
    private String name;

    @ElementCollection
    @CollectionTable(name = "carses")
    @MapKeyColumn(name = "keys_maps")
    @Column(name = "values_ofcars")
    Map<String, String>map=new HashMap<>();

    public Cars() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
