package com.sasha.testJpa.oneToMany.bag;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "binnding_bag")
public class Binnding {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @NotNull
    protected Itemic itemic;

    @NotNull
    protected int amount;

    public Binnding() {
    }


    public Binnding(int amount, Itemic itemic){
        this.amount=amount;
        this.itemic = itemic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Itemic getItemic() {
        return itemic;
    }

    public void setItemic(Itemic itemic) {
        this.itemic = itemic;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
