class Circle {
  double radius, diameter, circumference, area;

  void getCircle() // read coordinates
      {
    System.out.print("Enter the radius: ");
    radius = Console.readDouble();
  }

  void putCircle() {
    System.out.print("Radius = " + radius + ", ");
    System.out.print("Area = " + (Math.PI * Math.pow(radius, 2)) + ", ");
    System.out.println("Circumference = " + (Math.PI * radius * 2));
  }
}

class TestCircle {
  public static void main(String[] args) {
    Circle c = new Circle();
    c.getCircle();
    c.putCircle();
  }
}
