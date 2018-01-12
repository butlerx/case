class StudentTest {

  public static void main(String[] args) {
    Student[] students = {
      new Student("Mary Smith", "CA"),
      new PGStudent("Bill Smart", "PhD", "Dr Jim Murphy"),
      new Student("Pat Kelly", "EE")
    };
    printout(students);
  }

  private static void printout(Student[] s) {
    for (int i = 0; i < s.length; i++) {
      s[i].put();
    }
  }
}
