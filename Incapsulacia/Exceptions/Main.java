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
        StringMeasurableAdapter stringAdapter = new StringMeasurableAdapter("Hello World");

        double totalLength = calculateTotalLength(line1, line2, stringAdapter);
        System.out.println("Суммарная длина: " + totalLength);

        double stringLength = calculateTotalLength(
                new StringMeasurableAdapter("Test String")
        );
        System.out.println("Длина строки: " + stringLength);
    }
}