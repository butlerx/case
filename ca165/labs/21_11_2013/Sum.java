public class Sum {
  public static void main(String[] args) {
    int[] list = {5, 60, 4, 54, 30, 20, 9};
    int sum = 0;
    for (int i = 0; i < list.length; i++) {
      sum = sum + list[i];
    }
    System.out.println(sum);
  }
}
