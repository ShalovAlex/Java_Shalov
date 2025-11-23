import java.util.ArrayList;
import java.util.List;

class Student1 {
    String name;                                        //каждый студен состоит из имени
    private List<Integer> grades = new ArrayList<>();   // оценок (поле запривачено)
    private Rule rule;

    public Student1(String name, Rule rule) {           //конструктор, который задает имя
        this.name = name;
        this.rule = rule;
    }

    public void  addGrade(int x) {                  // добавляет оценку
        if (rule.check(x)) grades.add(x);
    }

    public List<Integer> getGrades() {              // защитное копирование
        return new ArrayList<>(grades);
    }

    @Override                                   //приводит к строке
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }

    interface Rule {
        boolean check(int x);   //Принимает число, возвращает true или false
    }
}

