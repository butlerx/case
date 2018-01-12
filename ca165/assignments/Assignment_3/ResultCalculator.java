public class ResultCalculator {
  public static void main(String[] args) {
    System.out.print("Enter the written exam mark (percentage): ");
    int written = Console.readInt();
    int writtenPercent = (written * 40);

    System.out.print("Enter the programming exam mark (percentage): ");
    int programming = Console.readInt();
    int programmingPercent = (programming * 30);

    System.out.print("Enter the assignment mark (percentage): ");
    int assignment = Console.readInt();
    int assignmentPercent = (assignment * 15);

    System.out.print("Enter the lab mark (percentage): ");
    int lab = Console.readInt();
    int labPercent = (lab * 15);

    int result = (int) (assignmentPercent + writtenPercent + programmingPercent + labPercent) / 100;

    System.out.println("Your resultm is " + result + "%");
  }
}
