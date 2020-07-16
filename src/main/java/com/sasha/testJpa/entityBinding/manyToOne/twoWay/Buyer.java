package com.sasha.testJpa.entityBinding.manyToOne.twoWay;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Buyer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "buyer",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<FoodStaff> foodStuffs=new ArrayList<>();

    public Buyer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<FoodStaff> getFoodStuffs() {
        return foodStuffs;
    }

    public void setFoodStuffs(List<FoodStaff> foodStuffs) {
        this.foodStuffs = foodStuffs;
    }
    public void addFoodStuffs(FoodStaff foodStaff){
        foodStuffs.add(foodStaff);
    }
}
