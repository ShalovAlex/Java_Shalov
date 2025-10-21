/*Необходимо реализовать метод таким образом, чтобы
он возвращал максимальное значение из двух полученных методом чисел.
При реализации метода не использовать методы класса Math. */
public class Condition_3 {
    public static void main(String[] args) {
        System.out.println(max(5, 7));
        System.out.println(max(8, -1));
    }

    public static int max(int x, int y) {
        return x > y ? x : y;
    }
}
