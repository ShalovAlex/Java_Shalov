/*Необходимо реализовать метод таким образом, чтобы он возвращал true если любое из
принятых чисел делит другое нацело.*/
public class Task_8 {
    public static void main(String[] args) {
        System.out.println(isDivisor(3, 6));
        System.out.println(isDivisor(2, 15));
    }
    public static boolean isDivisor(int a, int b) {
        return (a % b == 0) || (b % a == 0);
    }
}
