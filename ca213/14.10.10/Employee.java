class Employee {
  private String name, department;

  Employee(String x, String y) {
    name = x;
    department = y;
  }

  void put() {
    System.out.println("Name :" + name + "\n" + "Department :" + department);
  }

  boolean equals(Employee other) {
    if (department.compareTo(other.department) == 0) return true;
    else return false;
  }
}
