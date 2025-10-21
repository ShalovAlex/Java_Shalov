/*Необходимо реализовать метод таким образом, чтобы
он возвращал true, если одно из
принятых методом чисел равно шести, или их сумма равна шести, или разница между
ними равна шести.*/
public class Condition_9 {
    public static void main(String[] args) {
        System.out.println(magic6(5,7));
        System.out.println(magic6(8,2));
        System.out.println(magic6(1,6));
    }
    public static boolean magic6(int x, int y) {
        int sum = x + y;
        int raz1 = x - y;
        int raz2 = y - x;
        if (x==6 || y==6 || sum==6 || raz1==6 || raz2==6)
            return true;
        else
            return false;
    }
}
