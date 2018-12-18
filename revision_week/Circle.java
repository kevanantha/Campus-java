public class Circle {
  private double radius;
  private Point center;

  public Circle(double radius, Point center) {
    setRadius(radius);
    setCenter(center);
  }

  public double getRadius() {
    return radius;
  }
  public void setRadius(double radius) {
    this.radius = radius;
  }

  public Point getCenter() {
    return center;
  }
  public void setCenter(Point center) {
    this.center = center;
  }

  public String toString() {
    return "A circle with radius " + radius + " and centered at" + center;
  }
}
