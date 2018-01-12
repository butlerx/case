public class CubeTable {
  public static void cube(int num) {
    System.out.println("N" + "\t" + "Ans");
    for (int i = 1; i <= num; i++) System.out.println(i + "\t" + Math.pow(i, 3));
  }

  public static void main(String[] a) {
    System.out.print("Enter number to cube: ");
    cube(Console.readInt());
  }
}
