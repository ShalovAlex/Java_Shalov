package Collection_Framework.tests.tests3;

import java.util.ArrayList;

public class tests3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("До: " + numbers);
        reverse(numbers);
        System.out.println("После: " + numbers);
    }
    public static void reverse(ArrayList<Integer> list) {
        int n = list.size() - 1;
        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(n - i));
            list.set(n - i, temp);
        }
    }
}
