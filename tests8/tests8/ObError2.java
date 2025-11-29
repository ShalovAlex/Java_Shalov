package tests8;

import java.io.FileNotFoundException;

public class ObError2 {
    public static void main(String[] args) {
        Humman2 h = new Humman2();
        try {                   //Попытка выполнить (Нормальное выполнение)
            h.setAge(10);
        } catch (FileNotFoundException ex) { //Если не получилось (альтернативное выполнение)
            System.out.println("Что-то то тото");
        } finally {
            System.out.println("Выполняется всегда");
        }
        System.out.println(h);
    }
}

class Humman2 {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws FileNotFoundException { //Можно указать Exception
        if (age == 10) throw new FileNotFoundException("10");
        if (age > 150) throw new IllegalArgumentException("Возраст большой");
        if (age < 0) throw new IllegalArgumentException("Не может быть null");
        this.age = age;
    }

    @Override
    public String toString() {
        return "Humman2{" +
                "age=" + age +
                '}';
    }
}

