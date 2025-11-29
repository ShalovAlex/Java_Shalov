package tests7;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = f1.clone();

        System.out.println("До изменения:");
        System.out.println("f1: " + f1); // 1/2
        System.out.println("f2: " + f2); // 1/2

        // Меняем клон
        f2.num = 5;
        f2.denum = 8;

        System.out.println("После изменения клона:");
        System.out.println("f1: " + f1); // 1/2 (не изменился)
        System.out.println("f2: " + f2); // 5/8
    }
}