import java.util.Random;

public class RandomNum {
  public static void main(String[] args) {
    Random generator = new Random();
    System.out.print("How many numbers do you want to generate: ");
    int run = Console.readInt();
    System.out.print("What is the number of values: ");
    int limit = Console.readInt();
    int[] count = new int[limit];
    for (int i = 0; i < run; i++) {
      int num = generator.nextInt(limit);
      for (int j = 0; j < limit; j++) {
        if (num == j) count[j] = count[j] + 1;
      }
    }
    for (int i = 0; i < count.length; i++) System.out.println(i + ":\t" + count[i]);
  }
}
