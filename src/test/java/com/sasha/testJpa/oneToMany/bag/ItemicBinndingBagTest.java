package com.sasha.testJpa.oneToMany.bag;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ItemicBinndingBagTest {

    @Autowired
    ItemRepo itemRepo;
    @Autowired
    BidRepo bidRepo;

    @Test
    @Transactional
    void create(){
        final Itemic first = new Itemic("first");
        final Itemic itemic1 = itemRepo.save(first);
        final Binnding binnding = new Binnding(328, itemic1);
        final Binnding saveBinnding = bidRepo.save(binnding);
        itemic1.getBinndings().add(saveBinnding);
        final Itemic itemic = itemRepo.save(itemic1);
        final Binnding binnding1 = new Binnding(468, itemic1);
        final Binnding savedBinnding2 = bidRepo.save(binnding1);
        itemic.getBinndings().add(savedBinnding2);
        itemRepo.save(itemic);

    }

}