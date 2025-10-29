import java.util.Scanner;
import java.io.File;

public class FinalProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.println("Введите путь к файлу");
            String path = scanner.nextLine();

            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if (!fileExists || isDirectory) {
                System.out.println("Указанный файл не существует или указанный путь является путём к папке, \n" +
                        "а не к файлу: " + path);
                continue;
            }
            count += 1;
            System.out.println("Путь указан верно. Это файл номер " + count);
        }
    }
}