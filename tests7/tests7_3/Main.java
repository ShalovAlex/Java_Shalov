package tests7_3;
import tests7_1.Point;
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(6, 0);

        // Создаем ломанные линии
        PolyLine line1 = new PolyLine(p1, p2, p3);
        PolyLine line2 = new PolyLine(new Point(0, 0), new Point(3, 4), new Point(6, 0));
        PolyLine line3 = new PolyLine(p1, p2); // Другая ломанная
        PolyLine line4 = new PolyLine(p1, p3, p2); // Точки в другом порядке

        System.out.println("line1: " + line1);
        System.out.println("line2: " + line2);
        System.out.println("line3: " + line3);
        System.out.println("line4: " + line4);

        System.out.println("line1.equals(line2): " + line1.equals(line2)); // true
        System.out.println("line1.equals(line3): " + line1.equals(line3)); // false
        System.out.println("line1.equals(line4): " + line1.equals(line4)); // false

        System.out.println("Длина line1: " + line1.length());
        System.out.println("Длина line3: " + line3.length());

        // Проверка хэш-кодов
        System.out.println("line1.hashCode(): " + line1.hashCode());
        System.out.println("line2.hashCode(): " + line2.hashCode());
        System.out.println("line3.hashCode(): " + line3.hashCode());
    }
}
