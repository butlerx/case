public class Searcher {
  public static boolean search(int[] numbers, int value) {
    int count = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == value) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] scores = {20, 15, 13, 7, 25, 10};

    boolean containsFive = search(scores, 5); // would be false
    boolean containsSeven = search(scores, 7); // would be true
    if (containsFive) System.out.println("it contains Five");
    if (containsSeven) System.out.println("it contains Seven");
  }
}
