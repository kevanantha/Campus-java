public class MainPoint {
  public static void main(String[] args) {
    Point p1 = new Point(1, 2);
    Point p2 = new Point(1.0, 2.0);
    System.out.println(p1);
    System.out.println(p2);

    ArrayList<Point> p = new ArrayList<>();
    p.add(p1);

    Point p3 = new Point(1, 10);
    if (p.contains(p3)) {
      System.out.println("Duplicate!");
    } else {
      p.add(p3);
      System.out.println("Addional success!");
    }

    if (p.contains.(p2)) {
      System.out.println("Duplicate!");
    } else {
      p.add(p2);
      System.out.println("Addional success!");
    }

    // Circle c1 = new Circle(10, p1);
    // Circle c2 = new Circle(5.5, new Point(3, 4.5));
    // TDPoint td = new TDPoint(3, 4, 5);
    // System.out.println(c1);
    // System.out.println(c2);
    // System.out.println(td);

    // // With Inheritance
    // Point p3 = new TDPoint(1, 2, 3);
    // System.out.println(p3.getXNum());
    // System.out.println( ((TDPoint) p3).getZNum());
    // System.out.println(p3.toString());
  }
}
