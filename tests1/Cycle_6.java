/*Необходимо реализовать метод таким образом, чтобы
он возвращал true, если все знаки
числа одинаковы, и false в ином случае.
 */
public class Cycle_6 {
    public static void main(String[] args) {
        System.out.println(equalNum(1111));
        System.out.println(equalNum(1211));
    }

    public static boolean equalNum(int x) {
        if (x < 10) return true;
        int lastN = x % 10;
        while (x > 0) {
            int num = x % 10;
            if (num != lastN) {
                return false;
            }
            x /= 10;
        }
        return true;
    }
}
