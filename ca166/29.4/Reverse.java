class Reverse {
  static String rev(String s) {
    char c = s.charAt(s.length() - 1);
    if (s.length() == 1) return Character.toString(c);
    return c + rev(s.substring(0, s.length() - 1));
  }

  public static void main(String[] args) {
    System.out.print("Enter a String to reverse: ");
    String i = Console.readString();
    String word = rev(i);
    System.out.println("The reverse of " + i + " is " + word);
  }
}
