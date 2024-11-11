import java.awt.Point;

public class PointTester {
  public static void main(String[] args) {
    Point point = new Point(2, 5);
    System.out.println(point);
    double x = point.getX();
    double y = point.getY();
    point.setLocation(y, x);
    Point newPoint = new Point(point);
    assert point.equals(newPoint);
  }
}
