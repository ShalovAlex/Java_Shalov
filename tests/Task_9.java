/*Необходимо реализовать метод таким образом, чтобы
он возвращал true если все три
полученных методом числа равны */
public class Task_9 {
    public static void main(String[] args) {
        System.out.println(isEqual(3, 3,3));
        System.out.println(isEqual(2, 15, 2));
    }
    public static boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }
}
