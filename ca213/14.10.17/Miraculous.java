import java.util.*;

class Miraculous {
  static boolean isMiracle(ArrayList<Integer> nums) {
    boolean miracle = true;
    long temp = nums.get(0);
    for (int i = 1; i < nums.size(); i++) {
      temp = temp * 10;
      temp = temp + nums.get(i);
      if (!(temp % (i + 1) == 0)) miracle = false;
    }
    return miracle;
  }

  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>();
    for (int i = 0; i < 10; i++) nums.add(i);
    while (!isMiracle(nums)) {
      Collections.shuffle(nums);
    }
    System.out.println(nums.toString());
  }
}
