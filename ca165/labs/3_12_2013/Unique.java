public class Unique {

  public static boolean uniqueElements(int[] numbers) {

    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[j] == numbers[i]) return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.print("How many numbers? ");
    int[] nums1 = new int[Console.readInt()];
    System.out.print("Enter the numbers: ");
    for (int i = 0; i < nums1.length; i++) {
      nums1[i] = Console.readInt();
    }
    boolean test = uniqueElements(nums1);
    if (test) System.out.println("They are unique elements.");
    else System.out.println("They are not unique elements");
  }
}
