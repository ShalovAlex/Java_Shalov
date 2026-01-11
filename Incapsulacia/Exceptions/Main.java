package Exceptions;

public class Main {
    public static double calculateTotalLength(Line.Measurable... lines) {
        double sum = 0;
        for (Line.Measurable line : lines) {
            sum += line.length();
        }
        return sum;
    }

    public static void main(String[] args) {
        PolyLine line1 = new PolyLine(
                new Point(0, 0),
                new Point(3, 4),
                new Point(6, 0)
        );

        ClosedPolyLine line2 = new ClosedPolyLine(
                new Point(0, 0),
                new Point(0, 5),
                new Point(5, 5),
                new Point(5, 0)
        );

        double totalLength = calculateTotalLength(line1, line2);
        System.out.println("Суммарная длина: " + totalLength);
    }
}