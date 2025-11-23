public class A1_1 {
    public static void main(String[] args) {
        A1 a = new A1();
        a.met();            //A1
        B1 b = new B1();
        b.met();            //B1
        A1  ab = new B1();
        ab.met();           //B1        //полиморфный вызов метода

        A1.staticmet();  //Static A1    //не полиморфный вызов метода
        B1.staticmet();  //Static B1
        A1.staticmet(); //Static A1

        System.out.println(a.x);    //1    // вообще не вызов метода
        System.out.println(b.x);    //2
        System.out.println(ab.x);   //1
    }
}
