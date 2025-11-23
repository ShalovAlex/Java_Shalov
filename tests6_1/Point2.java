import java.awt.geom.Point2D;

class Point2 {
    int x, y;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class PolyLine2 {
    Point2[] points;

    public PolyLine2(Point2... points) {
        this.points = points;
    }

    public double length() {
        double sum = 0, len1, len2;
        for (int i = 0; i < points.length - 1; i++) {
            len1 = points[i].x - points[i + 1].x;
            len2 = points[i].y - points[i + 1].y;
            sum += Math.sqrt(len1 * len1 + len2 * len2);
        }
        return sum;
    }
}
class ClosedPolyLine2 extends PolyLine2 {

    public ClosedPolyLine2(Point2... points) {
        super(points);
    }

    @Override
    public double length() {
        double baseLength = super.length();

        if (points.length > 1) {
            double len1 = points[points.length - 1].x - points[0].x;
            double len2 = points[points.length - 1].y - points[0].y;
            double closingLength = Math.sqrt(len1 * len1 + len2 * len2);

            return baseLength + closingLength;
        }

        return baseLength;
    }
}

class Main {
    public static void main(String[] args) {
        Point2 A = new Point2(0, 0);
        Point2 B = new Point2(4, 0);
        Point2 C = new Point2(2, 3);

        // Обычная ломаная
        PolyLine2 openLine = new PolyLine2(A, B, C);
        System.out.println("Длина обычной ломаной: " + openLine.length());

        // Замкнутая ломаная (треугольник)
        ClosedPolyLine2 closedLine = new ClosedPolyLine2(A, B, C);
        System.out.println("Длина замкнутой ломаной: " + closedLine.length());
    }
}