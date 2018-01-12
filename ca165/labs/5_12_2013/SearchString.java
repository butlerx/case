public class SearchString {
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

    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i] + " ");
    }
    //search the array
    System.out.println("What are you searching for? ");
    String searchTerm = Console.readString();
    int low = 0;
    int hi = names.length - 1;
    int index = -1;
    while (low <= hi) {
      //get mid
      int mid = (hi + low) / 2;
      //if low do this
      if (searchTerm.compareTo(names[mid]) < 0) {
        hi = mid - 1;
      }
      //if high do this
      else if (searchTerm.compareTo(names[mid]) > 0) {
        low = mid + 1;
      } else { // must be equal, found it
        index = mid;
        break;
      }
    }
    System.out.println("Search term is at position " + index);
  }
}
