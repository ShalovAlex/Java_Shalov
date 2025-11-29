package tests8_2;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        double sum = 0.0;

        for (String arg : args) {
            Scanner scanner = new Scanner(arg);
            if (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
            }
            scanner.close();
        }

        if (sum == (int) sum) {
            System.out.println((int) sum);
        } else {
            System.out.println(sum);
        }
    }
}
