class Date implements Comparable<Date> { // dates

  private int day, month, year;

  Date(int day0, int month0, int year0) {
    day = day0;
    month = month0;
    year = year0;
  }

  public String toString() {
    return "" + day + "/" + month + "/" + year;
  }

  public int compareTo(Date d) {
    return ((year * 360 + month * 30 + day) - (d.year * 360 + d.month * 30 + d.day));
  }

  private int elapsedDays() {
    // Number of days elapsed from 1/1/1900 to this date
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
