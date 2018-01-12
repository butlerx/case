import java.io.*;
import java.util.*;

class Grep {
  static boolean contains(String s, String i) {
    return (i.contains(s));
  }

  public static void main(String[] args) {
    String s = args[0];
    System.out.println("Enter a text: ");
    ArrayList<String> print = new ArrayList<>();
    while (!Console.endOfFile()) {
      String i = Console.readString();
      if (contains(s, i)) print.add(i);
    }
    for (int i = 0; i < print.size(); i++) {
      System.out.println(print.get(i));
    }
  }
}
