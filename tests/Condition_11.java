/*Метод принимает число x,
обозначающее день недели. Необходимо реализовать метод таким образом, чтобы он
возвращал строку, которая будет обозначать текущий день недели, где 1- это
понедельник, а 7 – воскресенье. Если число не от 1 до 7 то верните текст “это
не день недели”. Вместо if в данной задаче
используйте switch.*/
public class Condition_11 {
    public static void main(String[] args) {
        System.out.println(day(5));
    }
    public static String day(int x) {
        switch (x) {
            case 1: return "понедельник";
            case 2: return "вторник";
            case 3: return "среда";
            case 4: return "четверг";
            case 5: return "пятница";
            case 6: return "суббота";
            case 7: return "воскресенье";
            default:
                return "это не день недели";
        }
    }
}
