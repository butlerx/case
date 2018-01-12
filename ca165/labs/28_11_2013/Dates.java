import java.util.Random;

public class Dates {
  public static void main(String[] args) {
    Random generator = new Random();
    String[] months = {
      "January",
      "Febuary",
      "March",
      "April",
      "May",
      "June",
      "July",
      "August",
      "September",
      "October",
      "November",
      "December"
    };

    int month;
    int day = 0;
    System.out.print("How many dates to generate? ");
    int count = Console.readInt();
    for (int i = 0; i < count; i++) {
      month = generator.nextInt(12);
      if (month == 1) day = generator.nextInt(28) + 1;
      else if (month == 8 || month == 3 || month == 5 || month == 10)
        day = generator.nextInt(30) + 1;
      else day = generator.nextInt(31) + 1;

      System.out.println(day + " " + months[month]);
    }
  }
}
