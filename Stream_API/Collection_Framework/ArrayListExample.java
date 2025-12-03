package Collection_Framework;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();    //Создаем

        arrayList.add("1");     //Добавляем элемент в список
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");

        for (int i = 0; i < arrayList.size(); i++) {   //size возвращает размер arrayList
            System.out.print(arrayList.get(i));    //Достать элемент массива
        }

        arrayList.add(3, "a");  // добавить "a" в 3 индекс-место
        arrayList.set(2,"b");                  // Заменить элемент во 2 индекс-месте на "b"
        System.out.println();

        for (int i = 0; i < arrayList.size(); i++) {   //size возвращает размер arrayList
            System.out.print(arrayList.get(i));    //Достать элемент массива
        }

        arrayList.remove(4);            // Удалить элемент в 4 индекс-месте
        System.out.println();

        for (int i = 0; i < arrayList.size(); i++) {   //size возвращает размер arrayList
            System.out.print(arrayList.get(i));    //Достать элемент массива
        }

        arrayList.remove("1");            // Удалить сам объект (только первый)
        System.out.println();

        for (int i = 0; i < arrayList.size(); i++) {   //size возвращает размер arrayList
            System.out.print(arrayList.get(i));    //Достать элемент массива
        }

        System.out.println(arrayList.remove(1));    // вернет значение
        System.out.println(arrayList.remove("2"));      // вернет true
        System.out.println(arrayList.remove("2"));      // вернет false

    }
}
