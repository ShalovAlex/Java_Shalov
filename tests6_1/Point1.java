class Point1 {
    int x, y;
    public Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D1 extends Point1{
    int z;

    public Point3D1(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D1{" +
                "z=" + z +
                ", y=" + y +
                ", x=" + x +
                '}';
    }
}

class PointStart {
    public static void main(String[] args) {
        Point3D1 point1 = new Point3D1(1, 2, 3);
        Point3D1 point2 = new Point3D1(6, 5, 4);

        System.out.println(point1);
        System.out.println(point2);
    }
}
