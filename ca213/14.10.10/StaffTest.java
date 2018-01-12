class StaffTest {
  public static void main(String[] args) {
    Staff personnel = new Staff();
    Employee e1 = new Employee("Mike", "Sales");
    Employee e2 = new Tradesman("Fred", "Engineering", "Welder");
    Employee e3 = new Employee("Pat", "Sales");
    Employee e4 = new Tradesman("Jean", "Finishing", "Painter");
    Employee e5 = new Employee("Bill", "Marketing");
    Employee e6 = new Tradesman("Anne", "Engineering", "Fitter");
    Employee e7 = new Tradesman("Paul", "Design", "Draughtsman");
    Employee e8 = new Tradesman("Eddy", "Finishing", "Painter");
    Employee e9 = new Employee("John", "Despatch");
    personnel.hire(e1);
    personnel.hire(e2);
    personnel.hire(e3);
    personnel.hire(e4);
    personnel.hire(e5);
    personnel.hire(e6);
    personnel.hire(e7);
    personnel.hire(e8);
    personnel.hire(e9);
    personnel.put();
    System.out.println();
    personnel.fire(e1);
    personnel.fire(e5);
    personnel.fire(e9);
    personnel.put();
    System.out.println();
    personnel.fire(new Tradesman("Eddy", "Finishing", "Painter"));
    personnel.put();
  }
}
