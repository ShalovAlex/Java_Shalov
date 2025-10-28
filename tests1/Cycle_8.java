/*Необходимо реализовать метод таким образом, чтобы
он выводил на экран треугольник из символов ‘*’ у которого х символов в высоту,
а количество символов в ряду совпадает с номером строки.*/
public class Cycle_8 {
    public static void main(String[] args) {
        leftTriangle(2);
        System.out.println();
        leftTriangle(4);
    }

    public static void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {       //вертикаль
            for (int j = 1; j < i; j++) {   //горизонталь
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
