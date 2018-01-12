public class SwapMax {
  static void swap(int[] num, int x, int y) {
    int temp = num[x];
    num[x] = num[y];
    num[y] = temp;
  }

  public static void main(String[] args) {
    // Ask the user how many numbers in the array
    System.out.print("How many elements? ");
    int size = Console.readInt();

    // create the array of the appropriate size
    int[] number = new int[size];

    // Now use a for loop to read in all the numbers
    System.out.println("Enter " + size + " numbers:");
    for (int i = 0; i < number.length; i++) number[i] = Console.readInt();
    System.out.println("the number in index postion 0 is " + number[0]);
    // Now find the maximum number in the array, and print it
    int max = 0;
    int index = 0;
    for (int i = 0; i < size; i++) {
      if (number[i] > max) {
        max = number[i];
        index = i;
      }
    }
    swap(number, 0, index);
    System.out.println("the number in index postion 0 is " + number[0]);
  }
}
