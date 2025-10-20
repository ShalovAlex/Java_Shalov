/*Необходимо реализовать метод таким образом,
чтобы он принимал число x и возвращал true если оно положительное.*/
public class Task_4 {
    public static void main(String[] args) {
        System.out.println(isPositive(3));
        System.out.println(isPositive(-5));
    }
    public static boolean isPositive(int x) {
        return x > 0;
    }
}