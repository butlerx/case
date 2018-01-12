import java.io.*;

class StudentPer {
  public static void main(String[] args) {
    try {
      String courseName;
      int studentNum = 0;
      int courseNum = 0;
      int students;
      PrintWriter larger = new PrintWriter("larger.txt");
      while (!Console.endOfFile()) {
        courseName = Console.readToken();
        courseNum++;
        students = Console.readInt();
        studentNum = studentNum + students;
        if (students >= 30) {
          larger.println(courseName);
        }
      }
      System.out.println("The average number of students per course is " + studentNum / courseNum);
      larger.close();
    } catch (IOException e) {
      System.out.println("File handling failure!");
    }
  }
}
