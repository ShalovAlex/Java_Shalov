public class AA {
    int x = 9;              // BB наследует поле
    int w = 11;
    //private int num = 8;  // данную переменную не наследует BB
    void m() {              // BB наследует метод
        System.out.println("A");
    }
}

class BB extends AA {       //Класс ВВ наследуется от класса АА
    //int w = 4;          // Затемнение !!! так не надо
    {
        w = 4;          // надо так (блок инициализации)
    }
    int y;
    @Override       // Проверка, что выполнено переопределение
    void m() {              // BB переопределяет наследуемый метод из АА
        System.out.println("И");
    }
}
