class Guess {
  public static boolean member(int x, int[] w) {
    for (int i = 0; i < w.length; i++) {
      if (x == w[i]) {
        return (x == w[i]);
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] guess = new int[100];
    int random;
    for (int i = 0; i < guess.length; i++) {
      random = (int) (Math.random() * 1000) + 1;
      for (int j = 0; j < guess.length; j++) {
        if (member(random, guess)) {
          j--;
          j = guess.length;
        } else {
          guess[i] = random;
          j = guess.length;
        }
      }
    }
    System.out.print("What is your guess(to stop put in 0): ");
    int check = Console.readInt();
    while (check != 0) {
      if (member(check, guess)) {
        System.out.println("Well done you have guessed right");
        check = 0;
      } else {
        System.out.print("Nope try again: ");
        check = Console.readInt();
      }
    }
  }
}
