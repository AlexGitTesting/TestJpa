package com.sasha.testJpa.singleTable;

import com.sasha.testJpa.singleTable.enums.Genre;
import com.sasha.testJpa.singleTable.enums.KindProduct;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue("books")
public class Books extends Product{

    @Enumerated(value = EnumType.STRING)
    private Genre genre;
    private boolean isElectronic;

    public Books setBook(Genre genre, boolean isElectronic, boolean inStock, int price ){
        this.genre=genre;
        this.isElectronic=isElectronic;
        setInStock(inStock);
        setKindProduct(KindProduct.BOOK);
        setPrice(price);
        return this;
    }

    public Books() {
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public boolean isElectronic() {
        return isElectronic;
    }

    public void setElectronic(boolean electronic) {
        isElectronic = electronic;
    }
}
