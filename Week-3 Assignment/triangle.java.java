public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;
    static int count = 0;

    public Triangle() {
        this.p1 = new Point(0, 0);
        this.p2 = new Point(4, 0);
        this.p3 = new Point(0, 3);
        count++;
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
        this.p3 = new Point(p3);
        count++;
    }

    public Triangle(Triangle t) {
        this.p1 = new Point(t.p1);
        this.p2 = new Point(t.p2);
        this.p3 = new Point(t.p3);
        count++;
    }

    public Point getP1() { return this.p1; }
    public Point getP2() { return this.p2; }
    public Point getP3() { return this.p3; }

    public void setP1(Point p1) { this.p1 = new Point(p1); }
    public void setP2(Point p2) { this.p2 = new Point(p2); }
    public void setP3(Point p3) { this.p3 = new Point(p3); }

    public float perimeter() {
        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p2, p3);
        Line l3 = new Line(p3, p1);
        return l1.length() + l2.length() + l3.length();
    }

    public float area() {
        return 0.5f * Math.abs(
            p1.getX() * (p2.getY() - p3.getY()) +
            p2.getX() * (p3.getY() - p1.getY()) +
            p3.getX() * (p1.getY() - p2.getY())
        );
    }

    public void move(int dx, int dy) {
        this.p1.move(dx, dy);
        this.p2.move(dx, dy);
        this.p3.move(dx, dy);
    }

    public boolean isEqual(Triangle t) {
        return this.p1.isEqual(t.p1) && this.p2.isEqual(t.p2) && this.p3.isEqual(t.p3);
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Triangle [P1: " + p1 + ", P2: " + p2 + ", P3: " + p3 + "]";
    }
}