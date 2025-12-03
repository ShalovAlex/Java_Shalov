package Collection_Framework;

import java.util.HashSet;
// не может быть дублей
public class SetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < 100; i++) {
            hashSet.add(i);
        }

        System.out.println(hashSet);
    }
}
