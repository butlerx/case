public class SortString {
  //write a swap method
  static void swap(String[] names, int i, int j) {
    String tmp = names[i];
    names[i] = names[j];
    names[j] = tmp;
  }

  public static void main(String[] args) {
    //enter an array
    System.out.println("How many words? ");
    int size = Console.readInt();
    String names[] = new String[size];
    System.out.println("Enter " + size + " names: ");
    for (int i = 0; i < names.length; i++) {
      names[i] = Console.readString();
    }

    //sort the array in alphabetical order
    for (int i = 0; i < names.length - 1; i++) {
      int firstLetter = i;
      for (int j = i + 1; j < names.length; j++) {
        if (names[j].compareTo(names[firstLetter]) < 0) {
          firstLetter = j;
        }
      }
      swap(names, i, firstLetter);
    }

    System.out.println();
    //print the array
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i] + " ");
    }
  }
}
