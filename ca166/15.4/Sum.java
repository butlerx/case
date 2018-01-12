import java.io.*;

class Sum {
  public static void main(String[] args) {
    try {
      RandomAccessFile in = new RandomAccessFile("ints.dat", "r");
      int sum = 0;
      while (in.getFilePointer() < in.length()) {
        int k = in.readInt();
        sum = sum + k;
      }
      in.close();
      System.out.println("The sum of all the Numbers is " + sum);
    } catch (IOException e) {
      System.out.println("File unreadable");
      e.printStackTrace();
    }
  }
}
