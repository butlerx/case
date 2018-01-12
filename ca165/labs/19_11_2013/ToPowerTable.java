public class ToPowerTable {
  public static void power(int num, int toPow) {
    System.out.println("N" + "\t" + "Ans");
    for (int i = 1; i <= toPow; i++) System.out.println(num + "^" + i + "\t" + Math.pow(num, i));
  }

  public static void main(String[] a) {
    System.out.print("Enter number to find the power of and to what power: ");
    power(Console.readInt(), Console.readInt());
  }
}
