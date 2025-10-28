/*Необходимо реализовать метод таким образом, чтобы
он выводил на экран квадрат из символов ‘*’ размером х,
у которого х символов в ряд и х
символов в высоту.*/
public class Cycle_7 {
    public static void main(String[] args) {
        square(2);
        System.out.println();
        square(4);
    }
    public static void square(int x) {
        for (int i = 0; i < x; i++) {       //вертикаль
            for (int j = 1; j < x; j++) {   //горизонталь
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
