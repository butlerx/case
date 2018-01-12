public class Palindrome {

  public static boolean isPalindrome(String sentence) {
    int length = sentence.length() - 1;
    String reverse = "";
    for (int i = length; i >= 0; i--) {
      reverse = reverse + sentence.charAt(i);
    }
    //reverse the order of the
    if (sentence.equals(reverse)) return true;
    else return false;
  }

  public static void main(String[] a) {
    System.out.print("Enter a word to check if it is a palindrome: ");
    if (isPalindrome(Console.readString())) {
      System.out.println("This is a palindrome");
    } else System.out.println("This is not a palindrome");
  }
}
