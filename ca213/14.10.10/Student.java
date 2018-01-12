class Student {
  private String name; // name of student
  private String programme; // student�s programme

  Student(String name0, String programme0) {
    name = name0;
    programme = programme0;
  }

  void put() { // print student details
    System.out.println(name + ": " + programme);
  }
}
