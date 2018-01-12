class Date {

  private int day, month, year;

  Date(int day0, int month0, int year0) {
    day = day0;
    month = month0;
    year = year0;
  }

  Date() {}

  void get() {
    day = Console.readInt();
    month = Console.readInt();
    year = Console.readInt();
  }

  void put() {
    System.out.printf("%02d/%02d/%02d\n", day, month, year);
  }

  boolean compare(Date d) {
    if (year < d.year) {
      //System.out.println("True 1");
      return true;
    } else {
      if (month < d.month && year == d.year) {
        //System.out.println("True 2");
        return true;
      } else {
        if (day < d.day && month == d.month && year == d.year) {
          //System.out.println("True 3");
          return true;
        } else {
          //System.out.println("false");
          return false;
        }
      }
    }
  }
}

class SortDates {

  private static void sort(Date[] ds, int n) {
    // Sort array ds[0..n-1] using insertion sort
    int j = 0; // ds[j..] to be sorted
    while (j < n - 1) {
      // find minimum in ds[j..]
      int min = j;
      int i = j + 1;
      // ds[min] is minimum in ds[j..i-1]
      while (i < n) {
        if (ds[i].compare(ds[min])) {
          min = i;
        }
        i++;
      }
      // ds[min] is minimum in ds[j..]
      // swap ds[j] and ds[min]
      Date temp = ds[j];
      ds[j] = ds[min];
      ds[min] = temp;
      // advance
      j++;
    }
  }

  public static void main(String[] args) {
    Date[] days = new Date[1000]; //
    int n = 0; // days[0..n-1] significant
    while (!Console.endOfFile()) {
      Date tempDate = new Date();
      tempDate.get();
      days[n] = tempDate;
      n++;
    }
    sort(days, n); // sort entries
    // print dates in ascending order
    for (int i = 0; i < n; i++) days[i].put();
  }
}
