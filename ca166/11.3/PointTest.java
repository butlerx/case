class Point {
  double x, y; // cooordinates

  void getPoint() // read coordinates
      {
    System.out.print("Enter coordinates: ");
    x = Console.readDouble();
    y = Console.readDouble();
  }

  void putPoint() // write point
      {
    System.out.println("(" + x + "," + y + ")");
  }

  double distance() // distance from the origin
      {
    return (Math.sqrt(x * x + y * y));
  }
}

class PointTest {
  public static void main(String[] args) {
    Point dot = new Point();
    dot.getPoint();
    double length = dot.distance();
    System.out.println("The point is " + length + "from the origin.");
  }
}
