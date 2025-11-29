package tests8_1;

public class Sum {
    public static void main(String[] args) {
        double sum = 0.0;

        for (String arg : args) {
            try {
                sum += Double.parseDouble(arg);
            } catch (NumberFormatException e) {
                continue;
            }
        }
        if (sum == (int) sum) {
            System.out.println((int) sum);
        } else {
            System.out.println(sum);
        }
    }
}