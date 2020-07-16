package com.sasha.testJpa.entityBinding.manyToOne.twoWay;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.EnableMBeanExport;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class FoodStuffRepoTest {

    @Autowired
    FoodStuffRepo foodStuffRepo;

    @Autowired
    BuyerRepo buyerRepo;
    @Autowired
    CrudFoodStuff crudFoodStuff;

    @Test
    void saveBuyer() {
        Buyer buyer = createBuyer("Dima", "Dzhura");
        Buyer savedBuyer = buyerRepo.save(buyer);
        savedBuyer.addFoodStuffs(saveFoodStuff(createFoodStuff("milk", 28), savedBuyer));
        savedBuyer.addFoodStuffs(saveFoodStuff(createFoodStuff("tomato", 83), savedBuyer));
        savedBuyer.addFoodStuffs(saveFoodStuff(createFoodStuff("meatball", 120), savedBuyer));
        savedBuyer.addFoodStuffs(saveFoodStuff(createFoodStuff("ice-cream", 3200), savedBuyer));


    }

    @Test
    FoodStaff saveFoodStuff(FoodStaff foodStaff, Buyer buyer) {

        final FoodStaff save = foodStuffRepo.save(foodStaff);
        save.setBuyer(buyer);
        foodStuffRepo.save(save);
        return save;
    }

    public static Buyer createBuyer(String name, String lastName) {
        Buyer buyer = new Buyer();
        buyer.setFirstName(name);
        buyer.setLastName(lastName);
        return buyer;
    }

    public static FoodStaff createFoodStuff(String name, int price) {
        final FoodStaff foodStaff = new FoodStaff();
        foodStaff.setName(name);
        foodStaff.setPrice(price);
        return foodStaff;
    }

    @Test
    void testGet(){
        Buyer buyer=buyerRepo.findBuyerByFirstName("Dima");//вытягиваю баера по имени
        FoodStaff foodStaff=createFoodStuff("pineapple",96); //создается фудстаф без айди и баера
        final FoodStaff saved = foodStuffRepo.save(foodStaff);//сохраняю фудстаф и присваивается айди, если сначала баеру присвоить фуд в коллекцию, а потом сохранить, то ошибка
        buyer.addFoodStuffs(saved);//добавляем фуд(уже сохраненный с айди но без баера) в коллекцию
        saved.setBuyer(buyer);// присваиваем баера для фуда() в колонке соединения фуда бу отображ айди баера.
        foodStuffRepo.save(saved);// сохранение и обновление- один метод. обновляем фуд в базе, чтоб в колонке соед отобраз айди баера.

    }

    @Test
    void CrudTest(){
        Buyer buyer=buyerRepo.findBuyerByFirstName("Dima");
        FoodStaff foodStaff=createFoodStuff("apple", 24);
        final FoodStaff saved = foodStuffRepo.save(foodStaff);
        saved.setBuyer(buyer);
        buyer.addFoodStuffs(saved);
        foodStuffRepo.flush();
    }
}