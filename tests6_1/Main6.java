import java.util.Arrays;

class Point3 {
    int x;
    int y;

    public Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static int getLine6Length(String str) {
        return str.length();
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
class Line3 {
}

interface Measurable {
    double length();
}

class PolyLine6 extends Line3 implements Measurable {
    Point3[] points;

    public PolyLine6(Point3... points) {
        this.points = points;
    }

    @Override
    public double length() {
        if (points == null || points.length < 2) {
            return 0.0;
        }
        double sum = 0;
        for (int i = 0; i < points.length - 1; i++) {
            double dx = points[i].x - points[i + 1].x;
            double dy = points[i].y - points[i + 1].y;
            sum += Math.sqrt(dx * dx + dy * dy);
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Ломаная линия=" + Arrays.toString(points);
    }
}

class ClosedPolyLine extends Line3 implements Measurable {
    Point3[] points;

    public ClosedPolyLine(Point3... points) {
        this.points = points;
    }

    @Override
    public double length() {
        if (points == null || points.length < 2) {
            return 0.0;
        }
        double sum = 0;
        for (int i = 0; i < points.length; i++) {
            Point3 current = points[i];
            Point3 next = points[(i + 1) % points.length];
            double dx = current.x - next.x;
            double dy = current.y - next.y;
            sum += Math.sqrt(dx * dx + dy * dy);
        }
        return sum;
    }
    @Override
    public String toString() {
        return "Замкнутая линия=" + Arrays.toString(points);
    }
}