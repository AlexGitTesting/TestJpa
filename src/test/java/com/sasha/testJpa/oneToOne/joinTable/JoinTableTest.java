package com.sasha.testJpa.oneToOne.joinTable;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class JoinTableTest {

@Autowired
    ItemJoinRepo itemJoinRepo;
@Autowired
   ShipmentRepo shipmentRepo;

//@Test
//    void writeIntoDB(){
//    final Shipment shipment = new Shipment(ShipmentState.CONFIRMED);
//    final ItemJoin bublik = new ItemJoin("gummy");
//
//    final ItemJoin save = itemJoinRepo.save(bublik);
//    shipment.setItemJoin(save);
//     Shipment shipmentSaved = shipmentRepo.save(shipment);
//
//}
@Test
    void cascadeSave(){
    final Shipment shipment = new Shipment(ShipmentState.TRANSIT);
    final ItemJoin circle = new ItemJoin("gusak");
    shipment.setItemJoin(circle);
    final Shipment save = shipmentRepo.save(shipment);
    save.setItemJoin(new ItemJoin("change"));
    final Shipment save1 = shipmentRepo.save(save);
}
}