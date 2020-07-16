package com.sasha.testJpa.oneToOne.joinTable;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    protected LocalDate createdOn=LocalDate.now();

    @NotNull
    @Enumerated(value = EnumType.STRING)
    protected ShipmentState shipmentState;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "ITEM_SHIPMENT",joinColumns = @JoinColumn(name = "shipment_id"),inverseJoinColumns = @JoinColumn(name = "iten_id",nullable = false,unique = true))
    private  ItemJoin itemJoin;

    public Shipment() {
    }
    public Shipment(ShipmentState shipmentState){
        this.shipmentState=shipmentState;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }

    public ShipmentState getShipmentState() {
        return shipmentState;
    }

    public void setShipmentState(ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
    }

    public ItemJoin getItemJoin() {
        return itemJoin;
    }

    public void setItemJoin(ItemJoin itemJoin) {
        this.itemJoin = itemJoin;
    }
}
