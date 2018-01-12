public class DcuUserName {
  public static void main(String[] args) {
    System.out.print("Enter your first name: ");
    String firstName = Console.readString();
    String firstLetter = firstName.substring(0, 1);

    System.out.print("Enter your second name: ");
    String secondName = Console.readString();
    String nameSecond = secondName.substring(0, 5);

    System.out.print("Enter a number: ");
    String number = Console.readString();

    String userName = nameSecond + firstLetter + number;
    System.out.println("Your DCU username is " + userName);
  }
}
