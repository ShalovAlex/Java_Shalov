class Line {
    public static void main(String[] args) {
        OOP_22 line1 = new OOP_22(1, 3, 5, 8);
        OOP_22 line2 = new OOP_22(10, 11, 15, 19);
        OOP_22 line3 = new OOP_22(line1.end, line2.start);

        System.out.println("Вывод текстового представления Линии 3 на экран: " + line3);

        line3.start.x = 6;
        line3.start.y = 9;
        line3.end.x = 11;
        line3.end.y = 12;

        System.out.println("Вывод текстового представления Линии 3 на экран " +
                "после изменения её состояния: " + line3);

        int totalLength = line1.getLength() + line2.getLength() + line3.getLength();
        System.out.println("Суммарная длина всех линий: " + totalLength);
    }
}
