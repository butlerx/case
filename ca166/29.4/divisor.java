class divisor {
  static int gcd(int m, int n) { // gcd of m,n assuming 0<=m<=n
    if (m == 0) return n;
    else return gcd(n % m, m);
  }

  public static void main(String[] args) {
    System.out.print("Enter two number is find the greatest common divisor of them: ");
    int i = Console.readInt();
    int j = Console.readInt();
    int num = gcd(i, j);
    System.out.println("The greatest common divisor of " + i + " and " + j + " is " + num);
  }
}
