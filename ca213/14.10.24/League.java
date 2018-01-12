import java.io.*;
import java.util.*;

class League {
  public static void main(String[] args) {
    TreeMap<String, Integer> league = new TreeMap<>(); // (word,frequency) map
    while (!Console.endOfFile()) {
      String name = Console.readToken();
      int num = Console.readInt();
      league.put(name, num);
    }
    for (Map.Entry<String, Integer> entry : league.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }
}
