public class AverageThree {
  public static void main(String[] args) {
    System.out.print("Enter Three Numbers ");
    double numOne = Console.readDouble();
    double numTwo = Console.readDouble();
    double numThree = Console.readDouble();
    double sum = numOne + numTwo + numThree;
    double average = sum / 3;
    System.out.print("The average is ");
    System.out.print(average);
  }
}
