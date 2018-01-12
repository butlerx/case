public class CircleOverlap {
  public static void main(String[] args) {
    System.out.print("Radius 1:");
    double radius1 = Console.readDouble();
    double xcenter1 = 0;
    double ycenter1 = 0;
    System.out.print("Radius 2:");
    double radius2 = Console.readDouble();
    double xcenter2 = 40;
    double ycenter2 = 0;

    if ((radius1 + radius2) >= 40) {
      if ((radius1 - radius2) >= 40 || (radius2 - radius1) >= 40) {
        System.out.println("the circles are mutually contained");
      } else {
        System.out.println("the circles are overlapping");
      }
    } else {
      System.out.println("the circles are Disjoint");
    }
  }
}
