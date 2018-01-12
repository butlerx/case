//
//
// Cian Butler, 13373596
//
// CA166, Assessed Exercise 2, Level 5
//
// My program falls short of the requirements in the following ways:
// None
//
//  I have read and agree with the staement below that this is my own work.
//
// This is my own work. I have not received assistance beyond what is
// normal, and I have cited any sources from which I have borrowed. I
// have not given a copy of my work, or part of my work, to anyone. I
// I am aware that copying or giving a copy may have serious
//  consequences, including an outright fail for the module.
//
//

import java.io.*;
import java.util.*;

class StockManage {
  public static void printBookInfo(String books) {
    try {
      RandomAccessFile inDat = new RandomAccessFile(books, "r");
      System.out.printf("%-13s  %-19s  %-40s  %5s\n", "ISBN", "Author", "Title", "Stock");
      while (inDat.getFilePointer() < inDat.length()) {
        String author = inDat.readUTF();
        String title = inDat.readUTF();
        String isbn = inDat.readUTF();
        int level = inDat.readInt();
        System.out.printf("%-13s  %-19s  %-40s  %4s\n", isbn, author, title, level);
      }
      inDat.close();
    } catch (IOException e) {
      System.out.println("File unreadable");
      e.printStackTrace(); //optional, for additional info
    }
  }

  public static void updateBookInfo() {
    try {
      RandomAccessFile inDat = new RandomAccessFile("books.dat", "r");
      Scanner inTxt = new Scanner(new File("transactions.txt"));
      RandomAccessFile out = new RandomAccessFile("updated.dat", "rw");
      final int authorLen = 19; // max length of author's name;
      final int titleLen = 41; // max length of title;
      final int isbnLen = 13; // max length of isbn;
      final int levelLen = 4; // max length of level;
      final int recordSize = 2 + authorLen + titleLen + isbnLen + levelLen; //size of records is 79
      String isbnUpdate = inTxt.next();
      while (inDat.getFilePointer() < inDat.length()) {
        out.writeUTF(String.format("%-" + authorLen + "s", inDat.readUTF()));
        out.writeUTF(String.format("%-" + titleLen + "s", inDat.readUTF()));
        String isbn = inDat.readUTF();
        int level = inDat.readInt();
        while (isbnUpdate.equals(isbn)) {
          int levelUpdate = inTxt.nextInt();
          level = level + levelUpdate;
          if (!inTxt.hasNext()) {
            break;
          } else {
            isbnUpdate = inTxt.next();
          }
        }
        out.writeUTF(String.format("%-" + isbnLen + "s", isbn));
        out.writeInt(level);
      }
      inTxt.close();
      inDat.close();
      out.close();
    } catch (IOException e) {
      System.out.println("File unreadable");
      e.printStackTrace(); //optional, for additional info
    }
  }

  public static void transactions() {
    try {
      Scanner inTxt = new Scanner(new File("transactions.txt"));
      RandomAccessFile inDat = new RandomAccessFile("books.dat", "r");
      ArrayList<String> isbnList = new ArrayList<>();
      ArrayList<String> titleList = new ArrayList<>();
      while (inDat.getFilePointer() < inDat.length()) {
        String author = inDat.readUTF();
        titleList.add(inDat.readUTF());
        isbnList.add(inDat.readUTF());
        int level = inDat.readInt();
      }
      System.out.printf("%-40s  %5s\n", "Title", "Stock");
      while (inTxt.hasNextLine()) {
        if (!inTxt.hasNext()) {
          break;
        } else {
          String isbn = inTxt.next();
          for (int i = 0; i < isbnList.size(); i++) {
            if (isbn.equals(isbnList.get(i))) {
              isbn = titleList.get(i);
            }
          }
          int level = inTxt.nextInt();
          System.out.printf("%-40s  %4s\n", isbn, level);
        }
      }
      inTxt.close();
      inDat.close();
    } catch (IOException e) {
      System.out.println("File unreadable");
      e.printStackTrace(); //optional, for additional info
    }
  }

  public static void main(String[] args) {
    printBookInfo("books.dat");
    transactions();
    updateBookInfo();
    printBookInfo("updated.dat");
  }
}
