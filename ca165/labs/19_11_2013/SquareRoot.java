public class SquareRoot {
  public static void root(int num) {
    System.out.println("N" + "\t" + "Ans");
    for (int i = 1; i <= num; i++) System.out.println(i + "\t" + Math.sqrt(i));
  }

  public static void main(String[] a) {
    System.out.print("Enter number to get the Square root of: ");
    root(Console.readInt());
  }
}
