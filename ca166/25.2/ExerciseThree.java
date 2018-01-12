public class ExerciseThree {
  public static int sumFac(int n) {
    int sum = 0;
    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        sum = sum + i;
      }
    }
    return sum;
  }

  public static boolean isPerfect(int n) {
    if (n == 0) {
      return false;
    } else {
      int sum = sumFac(n);
      if (sum == n) {
        return true;
      } else return false;
    }
  }

  public static void main(String[] args) {
    System.out.println("to end the programme enter a negative");
    System.out.print("What number would you like to check is perfect: ");
    int i = Console.readInt();
    while (!Console.endOfFile()) {
      if (isPerfect(i)) {
        System.out.println("Perfect!");
      } else System.out.println("Not perfect");
      System.out.print("What number would you like to check is perfect: ");
      i = Console.readInt();
    }
  }
}
