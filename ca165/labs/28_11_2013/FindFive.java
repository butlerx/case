public class FindFive {
  public static void main(String[] args) {
    // Ask the user how many numbers in the array
    System.out.print("How many elements? ");
    int size = Console.readInt();

    // create the array of the appropriate size
    int[] number = new int[size];

    // Now use a for loop to read in all the numbers
    System.out.print("Enter " + size + " numbers:");
    for (int i = 0; i < number.length; i++) number[i] = Console.readInt();

    // Now find the maximum number in the array, and print it
    int count = 0;
    for (int i = 0; i < size; i++) {
      if (number[i] == 5) count++;
    }
    int[] fives = new int[count];
    int j = 0;
    for (int i = 0; i < size; i++) {
      if (number[i] == 5) {
        fives[j] = i;
        j++;
      }
    }
    System.out.println("The fives were in positions ");
    for (int i = 0; i < count; i++) {
      System.out.print(fives[i] + " ");
    }
    System.out.println("");
  }
}
