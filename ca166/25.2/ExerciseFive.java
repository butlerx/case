public class ExerciseFive {
  public static int max(int i, int j, int k) {
    if (i >= j && i >= k) return i;
    else {
      if (j >= i && j >= k) // j is the maximum
      return j;
      else { // k is the maximum
        return k;
      }
    }
  }

  public static int sumSmall(int i, int j, int k) {
    // Return the sum of the smaller two among i, j, and k
    return i + j + k - max(i, j, k);
  }

  public static boolean isTriangle(int i, int j, int k) {
    // Do positives i, j, k constitute a triangle?
    return max(i, j, k) < sumSmall(i, j, k); // see note below
  }

  public static String typeTriangle(int i, int j, int k) {
    if (i == j && i == k && j == k) return "You have a equilateral triangle";
    else {
      if (i == j || i == k || j == k) return "You have a isosceles triangle";
      else return "You have a scalene triangle";
    }
  }

  public static void main(String[] args) {
    System.out.print("Enter three positive lengths: ");
    int b = Console.readInt();
    int c = Console.readInt();
    int d = Console.readInt();
    if (isTriangle(b, c, d)) System.out.println(typeTriangle(b, c, d));
    else System.out.println("You don't have a triangle");
  }
}
