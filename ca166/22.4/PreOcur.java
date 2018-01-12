import java.util.*;

class PreOcur {
  public static void main(String[] args) {
    ArrayList<String> words = new ArrayList<>();

    int occurrences = 0;
    while (!Console.endOfFile()) {
      String in = Console.readString();
      for (String i : words) {
        if (in.equals(i)) {
          occurrences++;
        }
      }
      words.add(in);
      System.out.println(occurrences + " Previous occurrences");
      occurrences = 0;
    }
  }
}
