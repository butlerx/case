class Histogram {
  public static void main(String[] args) {
    int[] histogram = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    while (!Console.endOfFile()) {
      int check = Console.readInt();
      histogram[check / 10]++;
    }
    System.out.print("00-09: ");
    for (int j = 0; j < histogram[0]; j++) {
      System.out.print("*");
    }
    System.out.println();
    for (int i = 1; i < 10; i++) {
      System.out.print((i * 10) + "-" + ((i * 10) + 9) + ": ");
      for (int j = 0; j < histogram[i]; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
