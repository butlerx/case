public class Five {
  public static void main(String[] args) {
    int[] list = new int[5];
    for (int i = 0; i < list.length; i++) {
      System.out.println("enter 1 number");
      list[i] = Console.readInt();
    }
    for (int i = 1; i <= list.length; i++) System.out.println(list[list.length - i]);
    for (int i = 0; i < list.length; i++) System.out.println(list[i]);
  }
}
