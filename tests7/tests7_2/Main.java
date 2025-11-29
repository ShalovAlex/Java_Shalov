package tests7_2;

import tests7_1.Point;

public class Main {
    public static void main(String[] args) {
        Point startPoint = new Point(1, 1);
        Point endPoint = new Point(5, 5);

        Line original = new Line(startPoint, endPoint);
        Line clone = original.clone();

        System.out.println("Оригинал: " + original);
        System.out.println("Клон: " + clone);
        System.out.println("Один объект? " + (original == clone)); // false
        System.out.println("start один объект? " + (original.start == clone.start)); // false
        System.out.println("end один объект? " + (original.end == clone.end)); // false
        System.out.println("Линии равны? " + original.equals(clone)); // true
    }
}