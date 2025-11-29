package tests8_3;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        EColor ec1 = Enum.valueOf(EColor.class, "GREEN");
        EColor ec2 = EColor.valueOf("GREEN");

        TrafficLight tl1 = new TrafficLight(ec1);
        TrafficLight tl2 = new TrafficLight(ec2);
        System.out.println(tl1 == tl2);

    }
}

class TrafficLight {
    private ColorLabel color;

    public TrafficLight(ColorLabel color) {
        this.color = color;
    }
    public String next() {
        return color.toString();
    }
}

interface ColorLabel{}

enum EColor implements ColorLabel {                   //Аналогичен Color
    RED, GREEN, YELLOW
}

class Color {                               // Перечислимый класс
    private String txt;
    public static final List<Color> cls = new ArrayList<>();
    public static final Color RED = new Color("Red");
    public static final Color GREEN = new Color("Green");
    public static final Color YELLOW = new Color("Yellow");

    static {
        cls.add(RED);
        cls.add(GREEN);
        cls.add(YELLOW);
    }

    public Color(String txt) {
        this.txt = txt;
    }

    @Override
    public String toString() {
        return txt;
    }
    public int ordinal() {
        return cls.indexOf(this);
    }

    public int compareTo(Color o) {
        return ordinal()-o.ordinal();
    }
}