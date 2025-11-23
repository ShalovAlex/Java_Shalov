package ru.courses.geometry;

import java.util.ArrayList;
import java.util.List;

public class Polyline {
    private final List<Point> points;

    public Polyline() {
        this.points = new ArrayList<>();
    }

    public Polyline(List<Point> points) {
        this.points = new ArrayList<>();
        for (Point point : points) {
            this.points.add(new Point(point.getX(), point.getY()));
        }
    }

    public void addPoint(Point point) {
        points.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }

    public double length() {
        if (points.size() < 2) return 0;

        double totalLength = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            totalLength += points.get(i).distanceTo(points.get(i + 1));
        }
        return totalLength;
    }
}
