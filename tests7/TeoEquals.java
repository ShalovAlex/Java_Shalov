import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TeoEquals {
    public static void main(String[] args) {
        Studentik st1 = new Studentik("Alex");
        Studentik st2 = new Studentik("Alex");
        System.out.println(st1.equals(st2));
    }
}

class Studentik {
    String name;
    List<Integer> marks = new ArrayList<>();

    public Studentik(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true; // если прислали самого себя (рефлексивность)
        if (o == null || getClass() != o.getClass()) return false; // если null, то false
        Studentik studentik = (Studentik) o; //правильный класс (Проверка соответствия типов.)
        return Objects.equals(name, studentik.name) && Objects.equals(marks, studentik.marks); //сравнение
    }                                                                           // ...полей друг с другом

    @Override
    public int hashCode() {
        return Objects.hash(name, marks);
    }
}
