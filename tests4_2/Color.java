/*Инициализация. Виды инициализаторов*/
public class Color {

    int r, g, b;

    public Color(int g, int r, int b) {
        this.g = g;
        this.r = r;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Color{" +
                "r=" + r +
                ", g=" + g +
                ", b=" + b +
                '}';
    }
}
