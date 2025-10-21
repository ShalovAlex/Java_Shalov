/*Необходимо реализовать метод таким образом, чтобы
он возвращал деление x на y, и при
этом гарантировал, что не будет выкинута ошибка деления на 0. При делении на 0
следует вернуть из метода число 0. Подсказка: смотри
ограничения на операции типов данных.*/
public class Condition_2 {
    public static void main(String[] args) {
        System.out.println(safeDiv(5, 0));
        System.out.println(safeDiv(8, 2));
    }
    public static int safeDiv(int x, int y) {
        if (y == 0)
            return 0;
        else
            return x / y;
    }
}