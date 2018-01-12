class MagicSquare {
  public static boolean member(int[][] w, int size) {
    for (int j = 0; j < size; j++) {
      for (int i = 1; i < size; i++) {
        if (w[i - 1][j] == w[i][j]) {
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.print("Enter number of rows then square matrix of integers: ");
    int size = Console.readInt();
    int[][] square = new int[size][size];
    for (int j = 0; j < size; j++) {
      for (int i = 0; i < size; i++) {
        square[j][i] = Integer.parseInt(Console.readToken());
      }
    }
    /*for(int j = 0; j < size; j++)//check square went in correctly
    {
    	for(int i = 0; i < size; i++)
    	{
    		System.out.print(square[j][i]);
    	}
    	System.out.println();
    }*/
    int check = 0;
    int checkTemp = 0;
    for (int i = 0; i < size; i++) {
      check = check + square[0][i];
    }
    for (int i = 1; i < size; i++) {
      for (int j = 0; j < size; j++) {
        checkTemp = checkTemp + square[i][j];
      }
      if (check != checkTemp) {
        System.out.println("That's not a magic square");
        System.exit(0);
      }
      checkTemp = 0;
    }
    for (int i = 1; i < size; i++) {
      for (int j = 0; j < size; j++) {
        checkTemp = checkTemp + square[j][i];
      }
      if (check != checkTemp) {
        System.out.println("That's not a magic square");
        System.exit(0);
      }
      checkTemp = 0;
    }
    if (member(square, size)) {
      System.out.print("That's not a magic square as all numbers need to be unique.");
    } else System.out.println("That's a magic square");
  }
}
