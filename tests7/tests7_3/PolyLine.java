package tests7_3;
import tests7_1.Point;
class PolyLine {
    Point[] points;

    public PolyLine(Point... points) {
        this.points = points;
    }

    public double length() {
        if (points.length < 2) {
            return 0.0;
        }

        double sum = 0;
        for (int i = 1; i < points.length; i++) {
            double len1 = points[i].x - points[i-1].x;
            double len2 = points[i].y - points[i-1].y;
            sum += Math.sqrt(len1 * len1 + len2 * len2);
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PolyLine{");
        for (int i = 0; i < points.length; i++) {
            sb.append(points[i]);
            if (i < points.length - 1) {
                sb.append(" -> ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolyLine polyLine = (PolyLine) obj;

        // Проверяем одинаковую длину массивов
        if (points.length != polyLine.points.length) {
            return false;
        }

        // Проверяем каждую точку
        for (int i = 0; i < points.length; i++) {
            if (!points[i].equals(polyLine.points[i])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        for (Point point : points) {
            result = 31 * result + point.hashCode();
        }
        return result;
    }
}