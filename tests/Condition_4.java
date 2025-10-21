/*Необходимо реализовать метод таким образом, чтобы
он возвращал строку, которая включает два принятых методом числа и корректно
выставленный знак операции сравнения (больше, меньше, или равно).*/
public class Condition_4 {
    public static void main(String[] args) {
        System.out.println(makeDecision(5, 7));
        System.out.println(makeDecision(8, -1));
        System.out.println(makeDecision(4, 4));
    }
    public static String makeDecision(int x, int y) {
        if (x > y) {
            return x + " > " + y;
        } else if (x < y) {
            return x + " < " + y;
        } else {
            return x + " == " + y;
        }
    }
}
