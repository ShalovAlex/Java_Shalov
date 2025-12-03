package Collection_Framework.map;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, Cat> cats = new HashMap<>();

        Cat cat1 = new Cat("Vasya", 1);      //Создаем запись
        Cat cat2 = new Cat("Ara", 3);

        cats.put("Alex", cat1);   //Хозяин и кот -- добавляем в коллекцию их -- Alex(уникальный)
        cats.put("Vova", cat2);

        System.out.println(cats);
        System.out.println(cats.keySet()); //Ключи
        System.out.println(cats.values()); //Значения

    }
}
