public class Task_1 {
    public static void main (String[] args) {
        System.out.println(fraction(5.3));
    }
    public static double fraction(double x) {
        double fractional = x % 1;
        return Math.round(fractional * 1000.0) / 1000.0;
    }
}