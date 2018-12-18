public class Point {
  private double xNum;
  private double yNum;

  public Point(double xNum, double yNum) {
    setXNum(xNum);
    setYNum(yNum);
  }

  public double getXNum() {
    return this.xNum;
  }

  public void setXNum(double xNum) {
    this.xNum = xNum;
  }

  public double getYNum() {
    return this.yNum;
  }

  public void setYNum(double yNum) {
    this.yNum = yNum;
  }

  public String toString() {
    return "(" + xNum + ", " + yNum + ")";
  }

  public boolean equals(Point p) {
    return xNum == p.xNum && yNum == p.yNum;
  }

  public boolean equals(Object p) {
    Point ap = (Point) p;
    return xNum == ap.xNum && yNum == ap.yNum;
  }
}
