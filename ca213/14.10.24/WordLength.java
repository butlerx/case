import java.io.*;
import java.util.*;

class WordLength {
  public static void main(String[] args) {
    TreeMap<Integer, Integer> freq = new TreeMap<>(); // (word,frequency) map
    while (!Console.endOfFile()) {
      String word = Console.readToken();
      int length = word.length();
      if (!freq.containsKey(length)) freq.put(length, 1);
      else {
        int num = freq.get(length) + 1;
        freq.put(length, num);
      }
    }
    System.out.printf("%10s %10s \n", "word length", "frequency");
    for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
      System.out.printf("%10s %10s \n", entry.getKey(), entry.getValue());
    }
  }
}
