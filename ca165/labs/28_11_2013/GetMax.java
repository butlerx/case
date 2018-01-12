public class GetMax {
  public static void main(String[] args) {
    // Ask the user how many numbers in the array
    System.out.print("How many elements?");
    int size = Console.readInt();

    // create the array of the appropriate size
    int[] number = new int[size];

    // Now use a for loop to read in all the numbers
    System.out.print("Enter " + size + " numbers:");
    for (int i = 0; i < number.length; i++) number[i] = Console.readInt();

    // Now find the maximum number in the array, and print it
    int max = 0;
    for (int i = 0; i < size; i++) {
      if (number[i] > max) max = number[i];
    }
    System.out.println("The biggest number was " + max);
  }
}
