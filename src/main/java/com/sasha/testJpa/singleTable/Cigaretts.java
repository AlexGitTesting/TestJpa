package com.sasha.testJpa.singleTable;

import com.sasha.testJpa.singleTable.enums.KindOfCigaretts;
import com.sasha.testJpa.singleTable.enums.KindProduct;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue("cigarettes")
public class Cigaretts extends Product{

    @Enumerated(value = EnumType.STRING)
    private KindOfCigaretts kind;

    public Cigaretts setCigaretts(KindOfCigaretts kind, boolean inStock, int price){
        this.kind=kind;
        setInStock(inStock);
        setKindProduct(KindProduct.CIGARETTES);
        setPrice(price);
        return this;
    }


    public Cigaretts() {
    }

    public KindOfCigaretts getKind() {
        return kind;
    }

    public void setKind(KindOfCigaretts kind) {
        this.kind = kind;
    }
}
