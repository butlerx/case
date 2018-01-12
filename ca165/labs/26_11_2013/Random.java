import java.util.Random;

public class Random {
  public static void main(String[] args) {
    Random generator = new Random();
    System.out.print("How many numbers do you want to generate: ");
    int run = Console.readInt();
    int[] count = new int[10];
    for (int i = 0; i < run; i++) {
      int num = generator.nextInt(10);
      for (int j = 0; j < 10; j++) {
        if (num == j) count[j] = count[j] + 1;
      }
    }
  }
}
