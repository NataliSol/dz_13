import models.Good;
import utils.DBReader;

import java.util.List;

public class TestDBReader {
    public static void main(String[] args) {
        // Вставкаб нового товару
//        DBReader.insert(11, "Product 1", 10, 9.99);
//        DBReader.insert(12, "Product 2", 5, 19.99);
//
        // Отримання всіх товарів
        List<Good> goods = DBReader.getNumbersFromDB();
        System.out.println("All goods:");
        for (Good good : goods) {
            System.out.println(good.getName() + " - " + good.getQuantity() + " - " + good.getPrice());
        }

     //    Оновлення кількості товару за ідентифікатором
        DBReader.updateQuantity(1, 15);

//        // Отримання конкретного товару за ідентифікатором
        Good specificGood = DBReader.getGoodById(1);
        if (specificGood != null) {
            System.out.println("Specific good: " + specificGood.getName() + " - " +
                    specificGood.getQuantity() + " - " + specificGood.getPrice());
        } else {
            System.out.println("Specific good not found");
        }

//        // Видалення товару за ідентифікатором
        DBReader.delete(2);
//
        // Повторне отримання всіх товарів після видалення
        goods = DBReader.getNumbersFromDB();
        System.out.println("Remaining goods:");
        for (Good good : goods) {
            System.out.println(good.getName() + " - " + good.getQuantity() + " - " + good.getPrice());
        }
    }
}
