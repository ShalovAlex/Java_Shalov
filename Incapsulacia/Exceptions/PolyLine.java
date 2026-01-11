package Exceptions;

import java.util.Arrays;

class PolyLine extends Line implements Line.Measurable {
    Point[] points;

    public PolyLine(Point... points) {
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
