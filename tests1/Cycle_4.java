/*
Необходимо реализовать метод таким образом, чтобы он возвращал результат возведения x в степень y.
Подсказка:
для получения степени необходимо умножить единицу на число x, и сделать
это y раз, т.е.два в третьей степени это 1*2*2*2
*/
public class Cycle_4 {
    public static void main(String[] args) {
        System.out.println(pow(2, 5));      //32
    }
    public static int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
}
