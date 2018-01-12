import java.io.*;
import java.util.*;

class TaxCheck {
  public static void main(String[] args) {
    try {
      Scanner inputOne = new Scanner(new File("unemployed.txt"));
      Scanner inputTwo = new Scanner(new File("taxpayers.txt"));
      ArrayList<String> noJob = new ArrayList<>();
      ArrayList<String> dodgy = new ArrayList<>();
      while (inputOne.hasNextLine()) {
        noJob.add(inputOne.nextLine());
      }
      while (inputTwo.hasNextLine()) {
        if (!inputTwo.hasNext()) {
          break;
        } else {
          String in = inputTwo.nextLine();
          for (int i = 0; i < noJob.size(); i++) {
            if (in.equals(noJob.get(i))) {
              dodgy.add(in);
            }
          }
        }
      }
      inputOne.close();
      inputTwo.close();
      for (int i = 0; i < dodgy.size(); i++) System.out.println(dodgy.get(i));
    } catch (IOException e) {
      System.out.println("File unreadable");
      e.printStackTrace(); //optional, for additional info
    }
  }
}
