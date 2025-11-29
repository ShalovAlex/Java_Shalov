package tests8;

import java.io.FileNotFoundException;

public class ObError {
    public static void main(String[] args) throws FileNotFoundException{
        Humman h = new Humman();
        h.setAge(10);
        System.out.println(h);
    }
}

class Humman {
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
        return "Humman{" +
                "age=" + age +
                '}';
    }
}
