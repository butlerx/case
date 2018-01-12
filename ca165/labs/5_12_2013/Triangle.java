public class Triangle {
  public static void main(String[] args) {
    System.out.print("What is the value of n? ");
    int n = Console.readInt();
    int first = 1;
    System.out.print("n: 0 ");
    for (int i = 0; i < n; i++) {
      System.out.print(" ");
    }
    System.out.println(first);
    //calculate and print triangle
    int[] previousArray = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      System.out.print("n: " + i + " ");
      for (int j = 0; j < (n - i); j++) {
        System.out.print(" ");
      }
      int[] currentArray = new int[i + 1];
      currentArray[0] = 1;
      currentArray[currentArray.length - 1] = 1;
      //set interior elements
      for (int j = 1; j < currentArray.length - 1; j++) {
        currentArray[j] = previousArray[j] + previousArray[j - 1];
      }
      //print active line
      for (int j = 0; j < currentArray.length; j++) {
        System.out.print(currentArray[j] + " ");
      }
      System.out.println();
      for (int j = 0; j < currentArray.length; j++) {
        previousArray[j] = currentArray[j];
      }
    }
  }
}
