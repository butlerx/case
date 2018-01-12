import java.io.*;
import java.util.*;

class IsPerfect {
  static boolean isPerfect(int n) {
    return (n == sumFacs(n));
  }

  static int sumFacs(int n) {
    int sum = 0;
    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        sum = sum + i;
      }
    }
    return (sum);
  }

  public static void main(String[] args) {
    for (int i = 1000; i > 0; i--) {
      if (isPerfect(i)) {
        System.out.print(i + ", ");
      }
    }
  }
}
