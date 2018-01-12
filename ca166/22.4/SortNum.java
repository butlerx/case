import java.util.*;

class SortNum {
  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>();
    while (!Console.endOfFile()) {
      int in = Console.readInt();
      nums.add(in);
    }
    Collections.sort(nums);
    for (int i = 0; i < nums.size(); i++) {
      System.out.println(nums.get(i));
    }
  }
}
