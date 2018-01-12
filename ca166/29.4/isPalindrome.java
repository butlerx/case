class Palindrome {
  static boolean isPalindrome(String w) {
    return (w == rev(w));
  }

  static String rev(String s) {
    char c = s.charAt(s.length() - 1);
    if (s.length() == 1) return Character.toString(c);
    return c + rev(s.substring(0, s.length() - 1));
  }

  public static void main(String[] args) {
    System.out.print("Enter a String: ");
    String i = Console.readString();
    if (test(i)) System.out.println("is a palindrome");
    else System.out.println("is not a palindrome");
  }
}
