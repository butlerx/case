class Comma {
  static void writeNum(int n) {

    if (n < 1000) {
      System.out.print(n);
    } else {
      writeNum(n / 1000);
      System.out.print(",");
      System.out.prinf("%03d", n % 1000);
    }
  }

  public static void main(String[] args) {
    System.out.print("Enter a number: ");
    int i = Console.readInt();
    writeNum(i);
  }
}
