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
    System.out.print("(" + x + "," + y + ")");
  }

  double distance() // distance from the origin
      {
    return (Math.sqrt(x * x + y * y));
  }
}

class PointTestTwo {
  public static void main(String[] args) {
    Point dotOne = new Point();
    dotOne.getPoint();
    Point dotTwo = new Point();
    dotTwo.getPoint();
    double lengthOne = dotOne.distance();
    double lengthTwo = dotTwo.distance();
    if (lengthOne < lengthTwo) {
      System.out.print("The Point ");
      dotOne.putPoint();
      System.out.println(" is closest to the origin.");
    } else {
      if (lengthOne == lengthTwo) {
        System.out.println("The points are the same distance away.");
      } else {
        System.out.print("The Point ");
        dotTwo.putPoint();
        System.out.println(" is closest to the origin.");
      }
    }
  }
}
