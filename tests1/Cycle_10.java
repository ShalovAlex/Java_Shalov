/*Данный метод считывает с консоли введенное
пользователем число и выводит, угадал ли пользователь то, что было загадано,
или нет. Перепишите этот метод таким образом, чтобы он запускался до тех пор,
пока пользователь не угадает число. После этого выведите на экран количество
попыток, которое потребовалось пользователю, чтобы угадать число.

Ответом на задание является измененный метод.*/
public class Cycle_10 {
    public static void main(String[] args) {
        guessGame();
    }
    public static void guessGame() {
        int random = 3;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("What number am I thinking (0 to 9)? :");
            int x = sc.nextInt();
            if (x < 0 || x > 9) {
                System.out.println("Please enter a number between 0 and 9");
                continue;
            }
            count++;
            if (x != random) {
                System.out.println("No, try again");
            } else {
                System.out.println("Yes, it`s " + random);
                System.out.println("Number of count: " + count);
                break;
            }
        }
    }
}