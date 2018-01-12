class Point {
  double x, y;

  void get() {
    x = Console.readDouble();
    y = Console.readDouble();
  }

  double distance(Point other) {
    int d, xAll, yAll;
    xAll = (x - x.point) * (x - x.point);
    yAll = (y - y.point) * (y - y.point);
    return d = math.sqrt(xAll + yAll);
  }
}
