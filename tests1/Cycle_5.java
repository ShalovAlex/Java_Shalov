/*
Необходимо реализовать метод таким образом, чтобы
он возвращал количество знаков в числе x. x может принимать значения от 0 и выше.
*/
public class Cycle_5 {
    public static void main(String[] args) {
        System.out.println(numLen(12567));      //5
    }

    public static int numLen(long x) {
        int count = 0;
        while (x > 0) {
            count+=1;
            x /= 10;
        }
        return count;
    }
}
