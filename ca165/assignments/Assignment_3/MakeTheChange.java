public class MakeTheChange {
  public static void main(String[] args) {
    System.out.print("How many cents (1-99): ");
    int money = Console.readInt();

    int fifty = (int) money / 50;
    System.out.println("50: " + fifty);

    int remainderOne = (int) money % 50;
    int twenty = (int) remainderOne / 20;
    System.out.println("20: " + twenty);

    int remainderTwo = (int) remainderOne % 20;
    int ten = (int) remainderTwo / 10;
    System.out.println("10: " + ten);

    int remainderThree = (int) remainderTwo % 10;
    int five = (int) remainderThree / 5;
    System.out.println("5: " + five);

    int remainderFour = (int) remainderThree % 5;
    int two = (int) remainderFour / 2;
    System.out.println("2: " + two);

    int one = (int) remainderFour % 2;
    System.out.println("1: " + one);
  }
}
