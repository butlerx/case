public class ManipulateBertie {
  public static void main(String[] args) {
    String name = "albert einstein";
    String bert = name.substring(2, 6);
    String i = name.substring(8, 9);
    String e = name.substring(7, 8);
    String newName = bert + i + e;

    System.out.println(newName);
  }
}
