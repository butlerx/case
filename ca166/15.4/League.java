import java.io.*;

class League {
  public static void main(String[] args) {
    try {
      RandomAccessFile leag = new RandomAccessFile("league.dat", "r");
      while (leag.getFilePointer() < leag.length()) {
        String name = leag.readUTF();
        int won = leag.readInt();
        int draw = leag.readInt();
        int lost = leag.readInt();
        System.out.println(
            "The team "
                + name
                + " won "
                + won
                + " of their games, drew "
                + draw
                + " and lost "
                + lost
                + " games in the league");
      }
      leag.close();
    } catch (IOException e) {
      System.out.println("File unreadable");
      e.printStackTrace();
    }
  }
}
