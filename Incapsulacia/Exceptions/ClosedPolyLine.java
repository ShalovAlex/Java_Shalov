package Exceptions;
import java.util.Arrays;

class ClosedPolyLine extends Line implements Line.Measurable {
    Point[] points;

    public ClosedPolyLine(Point... points) {
        this.points = points;
    }

    @Override
    public double length() {
        if (points == null || points.length < 2) {
            return 0.0;
        }
        double sum = 0;
        for (int i = 0; i < points.length; i++) {
            Point current = points[i];
            Point next = points[(i + 1) % points.length];
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

