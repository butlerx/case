public class Arrays {
  public static void main(String[] args) {
    int[] rowOne = new int[10];
    for (int i = 0; i < rowOne.length; i++) {
      rowOne[i] = i + 1;
      System.out.print(rowOne[i] + " ");
    }
    System.out.println("");

    int[] rowTwo = new int[11];
    for (int i = 0; i < rowTwo.length; i++) {
      rowTwo[i] = i * 2;
      System.out.print(rowTwo[i] + " ");
    }
    System.out.println("");

    int[] rowThree = new int[10];
    for (int i = 0; i < rowThree.length; i++) {
      rowThree[i] = (i + 1) * (i + 1);
      System.out.print(rowThree[i] + " ");
    }
    System.out.println("");

    int[] rowFour = new int[10];
    for (int i = 0; i < rowFour.length; i++) {
      rowFour[i] = 0;
      System.out.print(rowFour[i] + " ");
    }
    System.out.println("");

    int[] rowFive = new int[10];
    for (int i = 0; i < 4; i++) {
      rowFive[i] = (i + 1) * (i + 1);
      System.out.print(rowFive[i] + " ");
    }
    rowFive[5] = 9;
    rowFive[6] = 7;
    rowFive[7] = 4;
    rowFive[8] = 9;
    rowFive[9] = 11;
    for (int i = 5; i <= 9; i++) {
      System.out.print(rowFive[i] + " ");
    }
    System.out.println("");
  }
}
