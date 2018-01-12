import java.util.Random;

public class Dice {
  public static void main(String[] args) {
    Random generator = new Random();
    System.out.print("How many throws: ");
    int run = Console.readInt();
    int[] roleCounter = new int[11];
    for (int i = 0; i < run; i++) {
      int diceOne = generator.nextInt(6) + 1;
      int diceTwo = generator.nextInt(6) + 1;
      int role = diceOne + diceTwo;
      for (int k = 2; k <= 12; k++) {
        if (role == k) roleCounter[k - 2] = roleCounter[k - 2] + 1;
      }
    }
    for (int i = 0; i < roleCounter.length; i++) System.out.println(i + 2 + ":\t" + roleCounter[i]);
  }
}
