public class TDPoint extends Point {
  private double zNum;

  public TDPoint(double zNum, double xNum, double yNum) {
    super(xNum, yNum);
    setZNum(zNum);
  }
  
  public double getZNum() {
    return zNum;
  }

  public void setZNum(double zNum) {
    this.zNum = zNum;
  }

  public String toString() {
    return "(" + getXNum() + ", " + getYNum() + ", " + getZNum() + ")";
  }
}
