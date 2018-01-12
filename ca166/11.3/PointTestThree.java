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

  void midPoint(Point p) {
    x = (x + p.x) / 2;
    y = (y + p.y) / 2;
  }
}

class PointTestThree {
  public static void main(String[] args) {
    Point dotOne = new Point();
    dotOne.getPoint();
    Point dotTwo = new Point();
    dotTwo.getPoint();
    Point mid = new Point();
    mid = dotOne;
    mid.midPoint(dotTwo);
    double distanceInt = Math.round(mid.distance() * 100);
    //System.out.println(distanceInt);
    double distance = distanceInt / 100;
    System.out.println(
        "The mid-point(" + mid.x + "," + mid.y + ") is " + distance + " from the origin");
  }
}
