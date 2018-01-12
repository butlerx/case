public class Comma {
  public static void main(String[] args) {
    System.out.print("Enter a num >= 1000: ");
    String num = Console.readString();

    String numCom = "";

    if (num.length() == 4) {
      String firstNum = num.substring(0, 1);
      String secondNum = num.substring(1, 4);
      numCom = firstNum + "," + secondNum;
    }

    if (num.length() == 5) {
      String firstNum = num.substring(0, 2);
      String secondNum = num.substring(2, 5);
      numCom = firstNum + "," + secondNum;
    }

    if (num.length() == 6) {
      String firstNum = num.substring(0, 3);
      String secondNum = num.substring(3, 6);
      numCom = firstNum + "," + secondNum;
    }

    System.out.println(numCom);
  }
}
