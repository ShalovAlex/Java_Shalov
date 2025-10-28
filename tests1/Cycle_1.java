/*Необходимо реализовать метод таким образом, чтобы
он возвращал строку, в которой будут записаны все числа от 0 до x (включительно).
x может принимать значения от 0 и выше.*/
public class Cycle_1 {
    public static void main(String[] args) {
        System.out.println(listNums(5));        //0 1 2 3 4 5
    }
    public static String listNums(int x) {
        for (int i=0; i<=x; i++) {
            System.out.print(i+" ");
        }
        return "";
    }
}
