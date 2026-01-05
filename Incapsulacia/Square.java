public class Square {
    private int x;
    private int y;
    private int sideLength;
    public Square(int x, int y, int sideLength) {
        this.x = x;
        this.y = y;
        setSideLength(sideLength);
    }
    public int getX() {return x;}
    public int getY() {return y;}
    public int getSideLength() {return sideLength;}
    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}

    public void setSideLength(int sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Длина стороны должна быть положительной");
        }
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return "Квадрат в точке (" + x + ", " + y + ") со стороной " + sideLength;
    }
}