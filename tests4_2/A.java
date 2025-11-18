public class A {
    int x = 3;  // Инлайн инициализация

    {
        System.out.println("A created");   // Блок инициализации
    }

    A(){
    }
    A(int x) {
        this.x=x;       // Конструктор
    }

}

//class A{                      // this() - Вызов своего конструктора из другого конструктора
//    int x;
//    String str;

//    A(){                              //Вспомогательный конструктор
//        this(3);
//    }

//    A(int x){                         //Вспомогательный конструктор
//        this(3,"txt");
//    }

//    A(int x, String str) {            //Основной конструктор
//        this.x = x;
//        this.str = str;
//    }
//}