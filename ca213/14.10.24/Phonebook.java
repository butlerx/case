import java.io.*;
import java.util.*;

class PhoneBook {
  public static void main(String[] args) {
    TreeMap<String, Integer> book = new TreeMap<>(); // (word,frequency) map
    while (!Console.endOfFile()) {
      String name = Console.readToken();
      String temp = Console.readToken();
      if (temp.equals("?")) {
        if (book.containsKey(name)) {
          System.out.println(book.get(name));
        } else System.out.println("Can\'t find " + name);
      } else {
        int num = Integer.parseInt(temp);
        book.put(name, num);
      }
    }
  }
}
