class Rev {
  static void writRev(String[] s, int n) {
    System.out.print(s[n - 1]);
    if (n > 1) writRev(s, n - 1);
  }

  public static void main(String[] args) {
    System.out.print("Enter number for the array: ");
    String[] s = new String[Console.readInt()];
    System.out.print("Enter Strings to reverse: ");
    for (int i = 0; i < s.length; i++) s[i] = Console.readString();
    System.out.print("enter a number: ");
    writRev(s, Console.readInt());
  }
}
