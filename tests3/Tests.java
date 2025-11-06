import java.util.ArrayList;
import java.util.List;

public class Tests {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(); //размер указывать не обязательно.
//автоматическое увеличение размера по необходимости
        lst.add(5);//просто добавляем
        System.out.println(lst);//просто выводим
        lst.add(0,5);//добавляем с индексом
        System.out.println(lst);//просто выводим
        lst.set(0, 99);//замена
        System.out.println(lst);//просто выводим
        lst.remove(0);//просто удаляем
        System.out.println(lst);//просто выводим
    }
}
