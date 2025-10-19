/* Метод принимает символ х, который представляет собой один из “0 1 2 3 4 5 6 7 8 9”.
Необходимо реализовать метод таким образом, чтобы он преобразовывал символ в соответствующее число.
При реализации метода не использовать методы класса Character. Подсказка: код символа ‘0’ — это число 48
 */
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        System.out.println("Введите любую цифру");
        char x = new Scanner(System.in).next().charAt(0);
        int number = charToNumber(x);
        System.out.println(number);
    }
    public static int charToNumber(char x) {
        return x - '0';
    }
}