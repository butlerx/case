import java.io.*;

class RenameFiles {
  public static void main(String[] args) {
    System.out.print("Rename file: "); // prompt user for file name or end of input
    while (!Console.endOfFile()) {
      String fileName = Console.readToken(); // read name of file to be renamed
      String newName = Console.readString(); // read name of new file name
      File file = new File(fileName);
      File newFile = new File(newName);
      if (!file.exists()) // checks if the file exists or not
      System.out.println("Can't find " + fileName);
      else if (newFile.exists()) //checks if the new name is already a file or not
      System.out.println("Already have " + newName);
      else {
        boolean ok = file.renameTo(newFile); //renames the file
        if (ok) System.out.println("Done!"); //says its succesful
        else
          System.out.println(
              "Cannot rename file " + fileName + " to " + newName); // says its not succesful
      }
      System.out.print("Rename file: "); // prompt for file name or end of input
    }
  }
}
