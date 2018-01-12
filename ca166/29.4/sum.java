class Sum {
  static int sum(int n) {
    if (n == 0) return n;
    return n % 10 + sum(n / 10);
  }

  public static void main(String[] args) {
    System.out.print("Enter a natural number: ");
    int i = Console.readInt();
    int num = sum(i);
    System.out.println("The sum of " + i + " is " + num);
  }
}
