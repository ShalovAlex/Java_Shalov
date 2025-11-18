public class OOP_11 {
    public static void main(String[] args) {
        OOP_1 oop1 = new OOP_1(1, 3);
        OOP_1 oop2 = new OOP_1(1, 3);
        OOP_1 oop3 = new OOP_1(5, 8);
        System.out.println(oop1);
        System.out.println(oop2);
        System.out.println(oop3);
        System.out.println(oop1==oop2);
        System.out.println(oop1==oop3);
        System.out.println(oop2==oop3);
    }
}