class BestStudent {
  public static void main(String[] args) {
    final int numStudents = 5;
    int bestMark = -1; // Best mark seen so far
    String bestStudent = ""; // Name of best student so far.
    int i = 0; // number of lines read
    while (i < numStudents) {
      int mark = Console.readInt();
      String check = Console.readToken();
      String student = "";
      while (check != "\n") {
        student = student + check;
      }
      // Is this student the best so far?
      if (mark > bestMark) { // Yes, so note the details
        bestMark = mark;
        bestStudent = student;
      }
      ;
      i++;
    }
    // Print result
    System.out.println("The best student is " + bestStudent);
  }
}
