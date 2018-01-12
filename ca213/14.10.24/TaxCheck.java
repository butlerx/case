import java.io.*;
import java.util.*;

class TaxCheck {
  public static void main(String[] args) {
    HashSet<String> tax = new HashSet<>();
    try {
      Scanner taxpayer = new Scanner(new File("taxpayers.txt"));
      while (taxpayer.hasNextLine()) {
        String line = taxpayer.nextLine();
        tax.add(line);
      }
      Scanner unemployed = new Scanner(new File("unemployed.txt"));
      while (unemployed.hasNextLine()) {
        String line = unemployed.nextLine();
        if (tax.contains(line)) {
          System.out.println(line + " is dodgy");
        }
      }

    } catch (FileNotFoundException e) {
    }
    ;
  }
}
