package Exceptions;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static int getLineLength(String str) {
        return str.length();
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
