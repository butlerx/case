public class NumberSplit {
  public static void main(String[] args) {
    System.out.print("Enter a five digit number: ");
    double number = Console.readDouble();
    int line1 = (int) number / 10000;
    System.out.println(line1);

    int number2 = (int) number % 10000;
    int line2 = (int) number2 / 1000;
    System.out.println(line2);

    int number3 = (int) number2 % 1000;
    int line3 = (int) number3 / 100;
    System.out.println(line3);

    int number4 = (int) number3 % 100;
    int line4 = (int) number4 / 10;
    System.out.println(line4);

    int number5 = (int) number4 % 10;
    System.out.println(number5);
  }
}
