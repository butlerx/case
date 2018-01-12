public class NumPal {

  public static boolean isPalindrome(int[] numbers) {

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == numbers[(numbers.length) - 1 - i]) ;
      else return false;
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
    boolean test = isPalindrome(nums1);
    if (test) System.out.println("Those numbers are the same when reversed.");
    else System.out.println("Those numbers are not the same when reversed.");
  }
}
