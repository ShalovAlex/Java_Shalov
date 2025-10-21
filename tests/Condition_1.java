/*Необходимо реализовать метод таким образом, чтобы
он возвращал модуль числа х (если он был положительным,
то таким и остается, если он был отрицательным – то необходимо вернуть его без
знака минус). При реализации метода не использовать методы класса Math.*/
public class Condition_1 {
    public static void main(String[] args) {
        System.out.println(abs(5));
        System.out.println(abs(-3));
    }
    public static int abs(int x) {
        if (x>0)
            return x;
        else if (x<0)
            return x * -1;
        else
            return 0;
    }
}