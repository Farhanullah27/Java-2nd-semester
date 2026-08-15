public class Point {
    private int x;
    private int y;
    static int count = 0;

    public Point() {
        this.x = 2;
        this.y = 4;
        count++;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        count++;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
        count++;
    }

    public int getX() { return this.x; }
    public int getY() { return this.y; }

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }

    public float distanceFromOrigin() {
        return (float) Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public void add(Point p) {
        this.x += p.x;
        this.y += p.y;
    }

    public void subtraction(Point p) {
        this.x -= p.x;
        this.y -= p.y;
    }

    public boolean isOrigin() {
        return (this.x == 0 && this.y == 0);
    }

    public boolean isEqual(Point p) {
        return (this.x == p.x && this.y == p.y);
    }

    public String quadrant() {
        if (this.x > 0 && this.y > 0) return "First Quadrant";
        if (this.x < 0 && this.y > 0) return "Second Quadrant";
        if (this.x < 0 && this.y < 0) return "Third Quadrant";
        if (this.x > 0 && this.y < 0) return "Fourth Quadrant";
        return "Point lies on Axis or Origin";
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}