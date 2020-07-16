package com.sasha.testJpa.singleTable;

import com.sasha.testJpa.singleTable.enums.KindProduct;

import javax.persistence.*;

@Entity(name="products")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "product_type", discriminatorType = DiscriminatorType.STRING)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(value = EnumType.STRING)
    @Column(name="TYPE")
    private KindProduct kindProduct;

    @Basic()
    @Column(name="PRICE")

    private int price;


    private boolean inStock;

    public Product() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public KindProduct getKindProduct() {
        return kindProduct;
    }

    public void setKindProduct(KindProduct kindProduct) {
        this.kindProduct = kindProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
