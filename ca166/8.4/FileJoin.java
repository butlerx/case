import java.io.*;
import java.util.*;

class FileJoin {
  public static void main(String[] args) {
    try {
      Scanner inputOne = new Scanner(new File(args[0]));
      Scanner inputTwo = new Scanner(new File(args[1]));
      PrintWriter fin = new PrintWriter(args[2]);
      while (inputOne.hasNextLine()) {
        fin.println(inputOne.nextLine());
      }
      while (inputTwo.hasNextLine()) {
        fin.println(inputTwo.nextLine());
      }
      inputOne.close();
      inputTwo.close();
      fin.close();
    } catch (IOException e) {
      System.out.println("File unreadable");
      e.printStackTrace(); //optional, for additional info
    }
  }
}
