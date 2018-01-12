class DateTest {

  public static void main(String[] args) {
    Bag<Date> ds = new Bag<Date>();
    ds.add(new Date(22, 03, 2007));
    ds.add(new Date(29, 8, 2009));
    ds.add(new Date(22, 03, 2014));
    ds.add(new Date(24, 12, 2004));
    ds.add(new Date(22, 05, 2017));
    Date today = new Date(17, 10, 2014);
    int num = ds.numGreater(today);
    System.out.print(num);
  }
}
