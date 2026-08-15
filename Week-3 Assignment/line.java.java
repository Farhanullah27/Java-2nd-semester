public class Line {
    private Point p1;
    private Point p2;
    static int count = 0;

    public Line() {
        this.p1 = new Point(0, 0);
        this.p2 = new Point(5, 6);
        count++;
    }

    public Line(Point p1, Point p2) {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
        count++;
    }

    public Line(Line l) {
        this.p1 = new Point(l.p1);
        this.p2 = new Point(l.p2);
        count++;
    }

    public Point getP1() { return this.p1; }
    public Point getP2() { return this.p2; }

    public void setP1(Point p1) { this.p1 = new Point(p1); }
    public void setP2(Point p2) { this.p2 = new Point(p2); }

    public float length() {
        return (float) Math.sqrt(Math.pow((this.p2.getX() - this.p1.getX()), 2) + 
                                 Math.pow((this.p2.getY() - this.p1.getY()), 2));
    }

    public float slope() {
        if (this.p2.getX() == this.p1.getX()) {
            return Float.POSITIVE_INFINITY;
        }
        return (float) (this.p2.getY() - this.p1.getY()) / (this.p2.getX() - this.p1.getX());
    }

    public Point midPoint() {
        int midX = (this.p1.getX() + this.p2.getX()) / 2;
        int midY = (this.p1.getY() + this.p2.getY()) / 2;
        return new Point(midX, midY);
    }

    public void move(int dx, int dy) {
        this.p1.move(dx, dy);
        this.p2.move(dx, dy);
    }

    public void isEqual(Line l) {
        if (this.p1.isEqual(l.p1) && this.p2.isEqual(l.p2)) {
            System.out.println("The two lines are equal.");
        } else {
            System.out.println("The two lines are not equal.");
        }
    }

    public void isVertical() {
        if (this.p1.getX() == this.p2.getX()) {
            System.out.println("The line is vertical.");
        } else {
            System.out.println("The line is not vertical.");
        }
    }

    public void isHorizontal() {
        if (this.p1.getY() == this.p2.getY()) {
            System.out.println("The line is horizontal.");
        } else {
            System.out.println("The line is not horizontal.");
        }
    }

    public void parallel(Line l) {
        if (this.slope() == l.slope()) {
            System.out.println("The two lines are parallel.");
        } else {
            System.out.println("The two lines are not parallel.");
        }
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Line [P1: " + this.p1 + ", P2: " + this.p2 + "]";
    }
}