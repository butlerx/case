class Student {
  String forename, surname;
  int mark;

  void getName() {
    System.out.print("Enter Student: ");
    mark = Console.readInt();
    forename = Console.readToken();
    surname = Console.readString();
  }

  void putStudent() {
    System.out.print(surname + ", " + forename);
  }

  boolean betterThan(Student s) {
    return (mark > s.mark);
  }
}

class StudentTest {
  public static void main(String[] args) {
    Student best = new Student();
    best.getName(); // least name so far
    while (!Console.endOfFile()) {
      Student tempName = new Student();
      tempName.getName();
      if (tempName.betterThan(best)) best = tempName;
    }
    best.putStudent();
  }
}
