public class TriangleAll {
  public static void main(String[] args) {
    System.out.print("Input the lenght of the first side:");
    double a = Console.readDouble();

    System.out.print("Input the lenght of the second side:");
    double b = Console.readDouble();

    System.out.print("Input the lenght of the third side:");
    double c = Console.readDouble();

    if (((a + b) <= c) || ((a + c) <= b) || ((c + b) <= a)) {
      System.out.println("the triangle is impossible");
    } else {
      if (((a == b) && (a != c)) || ((a != b) && (a == c)) || ((c == b) && (a != c))) {
        System.out.println("the triangle is isosceles");
      }

      if (((a == b) && (a == c)) || ((a == b) && (a == c)) || ((c == b) && (a == c))) {
        System.out.println("the triangle is equilateral");
      }

      if ((a != b) && (a != c) && (c != b)) {
        System.out.println("the triangle is ordinary");
      }
    }
  }
}
