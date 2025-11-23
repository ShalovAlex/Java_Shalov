package ru.courses.geometry;

public class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = new Point(start.getX(), start.getY());
        this.end = new Point(end.getX(), end.getY());
    }

    public Line(double x1, double y1, double x2, double y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    public double length() {
        return start.distanceTo(end);
    }

    public Point getStart() { return new Point(start.getX(), start.getY()); }
    public Point getEnd() { return new Point(end.getX(), end.getY()); }

    public void setStart(Point start) { this.start = new Point(start.getX(), start.getY()); }
    public void setEnd(Point end) { this.end = new Point(end.getX(), end.getY()); }

    @Override
    public String toString() {
        return "Line from " + start + " to " + end;
    }
}