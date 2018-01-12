import java.util.*;

class WordCheck {
  public static void main(String[] args) {
    HashSet<String> ws = new HashSet<>();
    while (!Console.endOfFile()) {
      String w = Console.readToken();
      if (ws.contains(w)) System.out.println("Occurred previously");
      else {
        ws.add(w);
        System.out.println("First occurrence");
      }
    }
  }
}
