class Date {

  private int day, month, year; // the date

  // Constructors
  public Date() {};

  void get() {
    // Read a day, month, and year from the keyboard
    // (assumed a valid post-1900 date).
    System.out.println("Enter a day: ");
    int day = Console.readInt();
    System.out.println("Enter a month: ");
    int month = Console.readInt();
    System.out.println("Enter a year: ");
    int year = Console.readInt();
  }

  void put() {
    // Write the date (as typified by 10/7/2002)
    System.out.println(day + "/" + month + "/" + year);
  }

  boolean postDates(Date d) {
    // Does this date occur on or after d?
    return (year >= d.year && month >= d.month && day);
  }

  private int elapsedDays() {
    // The number of days elapsed from 1/1/1900 to this date
    int days = (year - 1900) * 365 + (year - 1901) / 4;
    int k = 1;
    while (k < month) {
      int daysInMonth;
      if (k == 9 || k == 4 || k == 6 || k == 11) daysInMonth = 30;
      else if (k == 2) {
        if (year % 4 == 0 && year != 1900) daysInMonth = 29;
        else daysInMonth = 28;
      } else daysInMonth = 31;
      days = days + daysInMonth;
      k++;
    }
    return days + day;
  }
}
