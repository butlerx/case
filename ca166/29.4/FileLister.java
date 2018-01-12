import java.io.*;

class FileLister {
  static void listFiles(File f) {
    File[] files = f.listFiles();
    for (File file : files) {
      if (file.isDirectory()) listFiles(file);
      else System.out.println(file.getName());
    }
  }

  public static void main(String[] args) {
    String dirName = args[0];
    File theDirectory = new File(dirName);
    listFiles(theDirectory);
  }
}
