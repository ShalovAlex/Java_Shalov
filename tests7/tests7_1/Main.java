package tests7_1;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(5, 8);
        Point p2 = p1.clone();

        System.out.println("До изменения:");
        System.out.println("p1: " + p1); // Point{x=5, y=8}
        System.out.println("p2: " + p2); // Point{x=5, y=8}

        // Меняем координаты клона
        p2.x = 15;
        p2.y = 25;

        System.out.println("После изменения клона:");
        System.out.println("p1: " + p1); // Point{x=5, y=8} (не изменился)
        System.out.println("p2: " + p2); // Point{x=15, y=25}
    }
}