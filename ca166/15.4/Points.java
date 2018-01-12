import java.io.*;

class Points {
  public static void main(String[] args) {
    try {
      RandomAccessFile in = new RandomAccessFile("league.dat", "r");
      RandomAccessFile out = new RandomAccessFile("points.dat", "rw");
      final int nameLen = 30; // max length of team's name;
      final int recordSize = 2 + nameLen /*name*/ + 4 /*points*/; //size of records is 36
      while (in.getFilePointer() < in.length()) {
        String name = in.readUTF();
        int won = in.readInt();
        int draw = in.readInt();
        int lost = in.readInt();
        int points = (3 * won) + draw;
        out.writeUTF(String.format("%-" + nameLen + "s", name)); // pad
        out.writeInt(points);
      }
      in.close();
      out.close();
    } catch (IOException e) {
      System.out.println("File unreadable");
      e.printStackTrace();
    }
  }
}
