public class OOP_22 {
    OOP_2 start;
    OOP_2 end;

    public OOP_22(OOP_2 start, OOP_2 end) {
        this.start = start;
        this.end = end;
    }

    public OOP_22(int x1, int y1, int x2, int y2) {
        this.start = new OOP_2(x1, y1);
        this.end = new OOP_2(x2, y2);
    }

    public int getLength() {
        int deltaX = end.x - start.x;
        int deltaY = end.y - start.y;
        return (int) Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }
}
