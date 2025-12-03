package Collection_Framework.tests.tests1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class tests1 {
    static void main(String[] args) {
        int N = 8;
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }
        System.out.println("Исходный список: " + list);

        for (int i = 0; i < N; i += 2) {
            Collections.swap(list, i, i + 1);
        }
        System.out.println("Список после замены: " + list);
    }
}
