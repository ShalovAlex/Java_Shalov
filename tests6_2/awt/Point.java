package awt;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Метод для вычисления расстояния между двумя точками
    public double distanceTo(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    // Метод для нахождения минимального расстояния между двумя точками
    public static double minDistance(Point p1, Point p2) {
        return p1.distanceTo(p2);
    }

    // Геттеры
    public double getX() { return x; }
    public double getY() { return y; }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}