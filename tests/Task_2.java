/* Необходимо реализовать метод таким образом,
чтобы он возвращал результат сложения двух последних знаков числа х,
предполагая, что знаков в числе не менее двух. */
public class Task_2 {
    public static void main(String[] args) {
        System.out.println(sumLastNums(4568));
    }
    public static int sumLastNums(int x) {
        int a = x % 10;
        int b = (x % 100) / 10 ;
        return a+b;
    }
}
