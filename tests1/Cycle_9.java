/*Необходимо реализовать метод таким образом, чтобы
он выводил на экран треугольник из символов ‘*’ у которого х символов в высоту,
а количество символов в ряду совпадает с
номером строки, при этом треугольник выровнен по правому краю. Подсказка: перед
символами ‘*’ следует выводить необходимое количество пробелов.*/
public class Cycle_9 {
    public static void main(String[] args) {
        rightTriangle(3);
        rightTriangle(4);
    }

    public static void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {         // Выводим пробелы
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {       // Выводим звёздочки
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
