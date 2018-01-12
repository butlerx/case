import java.io.*;
import java.util.*;

class ListNum {
  public static void main(String[] args) {
    ArrayList<Integer> even = new ArrayList<>();
    ArrayList<Integer> odd = new ArrayList<>();
    while (!Console.endOfFile()) {
      int test = Console.readInt();
      if (test % 2 == 0) {
        even.add(test);
      } else odd.add(test);
      //	System.out.println(1);
    }
    for (int i = 0; i < even.size(); i++) {
      System.out.print(even.get(i) + " ");
    }
    System.out.println("");
    for (int i = 0; i < odd.size(); i++) {
      System.out.print(odd.get(i) + " ");
    }
    System.out.println("");
  }
}
