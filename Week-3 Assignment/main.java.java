public class Main {
    public static void main(String[] args) {
        // Test Point
        Point p1 = new Point(1, 3);
        Point p2 = new Point(9, 8);
        Point p3 = new Point(3, 9);
        System.out.println("Point 1: " + p1 + " | Quadrant: " + p1.quadrant());

        // Test Line
        Line l1 = new Line(p1, p2);
        System.out.println(l1);
        System.out.printf("Line length: %.2f\n", l1.length());
        System.out.printf("Line slope: %.2f\n", l1.slope());

        // Test Triangle
        Triangle t1 = new Triangle(p1, p2, p3);
        System.out.println(t1);
        System.out.printf("Triangle Perimeter: %.2f\n", t1.perimeter());
        System.out.printf("Triangle Area: %.2f\n", t1.area());

        // Display Object Counts
        System.out.println("\nTotal Points created: " + Point.getCount());
        System.out.println("Total Lines created: " + Line.getCount());
        System.out.println("Total Triangles created: " + Triangle.getCount());
    }
}