/*Необходимо реализовать метод таким образом, чтобы
он возвращал true, если два любых
числа (из трех принятых) можно сложить так, чтобы получить третье.*/
public class Condition_6_7 {
    public static boolean sum3(int x, int y, int z) {
        if (x+y==z || y+z==x || x+z==y)
            return true;
        else
            return false;
    }

    /*Необходимо реализовать метод таким образом, чтобы
    он возвращал сумму чисел x и y.
    Однако, если сумма попадает в диапазон от [10, 19], то надо вернуть число 20.*/
    public static int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19)
            return 20;
        else
            return sum;
    }
}