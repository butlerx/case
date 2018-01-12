import java.util.*;

class Date {
  int day, month, year;

  void getDate() {
    System.out.print("Enter day month year: ");
    day = Console.readInt();
    month = Console.readInt();
    year = Console.readInt();
  }

  void putDate() {
    System.out.print(day + "/" + month + "/" + year);
  }

  boolean before(Date d) {
    if (year < d.year) return true;
    else {
      if (month < d.month) return true;
      else {
        if (day < d.day) return true;
        else {
          return false;
        }
      }
    }
  }

  /*Date todaysDate()
  {
  	GregorianCalendar gc = new GregorianCalendar();
  	int thisDay = gc.get(GregorianCalendar.DAY_OF_MONTH);
  	int thisMonth = gc.get(GregorianCalendar.MONTH)+1;
  	int thisYear = gc.get(GregorianCalendar.YEAR);
  	Date date = new Date();
  	date.day = thisDay;
  	date.month = thisMonth;
  	date.year = thisYear;
  	return date;
  }*/
  void todaysDate() {
    GregorianCalendar gc = new GregorianCalendar();
    day = gc.get(GregorianCalendar.DAY_OF_MONTH);
    month = gc.get(GregorianCalendar.MONTH) + 1;
    year = gc.get(GregorianCalendar.YEAR);
  }
}

class DateTest {
  public static void main(String[] args) {
    Date today = new Date();
    today.todaysDate();
    Date date = new Date();
    date.getDate();
    date.putDate();
    //today.putDate();
    if (date.before(today)) {
      System.out.println(": past");
    } else System.out.println(": future");
  }
}
