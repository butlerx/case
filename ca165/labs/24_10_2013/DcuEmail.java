public class DcuEmail {
  public static void main(String[] args) {
    System.out.print("Enter your first name: ");
    String firstName = Console.readString();

    System.out.print("Enter your second name: ");
    String secondName = Console.readString();

    System.out.print("Enter a number: ");
    String number = Console.readString();

    String mail = "@mail.dcu.ie";

    String email = firstName + "." + secondName + number + mail;
    System.out.println("Your DCU email is " + email);
  }
}
