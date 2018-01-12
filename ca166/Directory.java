// Cian Butler, 13373596
//
// CA166, Assessed Exercise 1, Level 4
//
// My program performs as required by the problem specification.
//
// This is my own work. I have not received assistance beyond what is
// normal, and I have cited any sources from which I have borrowed. I
// have not given a copy of my work, or part of my work, to anyone. I
// I am aware that copying or giving a copy may have serious
// consequences, including an outright fail for the module.

class Person {
  private String forename, surname, number;

  void getInfo() { //gathers the info of a person
    forename = Console.readToken();
    surname = Console.readToken();
    number = Console.readString();
  }

  void printInfo() { //prints out the info of a person
    System.out.printf("%-30.30s  %-30.30s\n", surname + ", " + forename, number);
  }

  boolean compareSName(Person other) { //checks which surname is alphabetically first
    return (surname.compareTo(other.surname) < 0);
  }

  boolean compareFName(Person other) { //checks which forname is alphabetically first
    return (forename.compareTo(other.forename) < 1);
  }
}

class Population //
 {
  private Person[] phonebook =
      new Person[1000]; //an array to store people that supports up to 1000 people

  int
      getPeople() { //runs and collects people till the user wishes to stop and places them in an array
    int count = 0;
    while (!Console.endOfFile()) {
      Person tempName = new Person();
      tempName.getInfo();
      phonebook[count] = tempName;
      count++;
    }
    return count;
  }

  void printBook() { //prints out all of the array with data in it
    int i = 0;
    while (phonebook[i] != null) {
      phonebook[i].printInfo();
      i++;
    }
  }

  void swap(Person[] phonebook, int i, int j) { //swaps the positions of people around in the array
    Person tmp = new Person();
    tmp = phonebook[i];
    phonebook[i] = phonebook[j];
    phonebook[j] = tmp;
  }

  void sort(
      int count) { //goes through and check if the array is alphabetical and moves the names if not
    for (int i = 0; phonebook[i] != null; i++) {
      int minIndex = i;
      for (int j = i + 1; j < count; j++) {
        if (phonebook[j].compareSName(phonebook[minIndex])) minIndex = j;
        else if ((phonebook[j].compareSName(phonebook[minIndex]))) {
          if (phonebook[j].compareFName(phonebook[minIndex])) minIndex = j;
        }
      }
      swap(phonebook, i, minIndex);
    }
  }
}

public class Directory {
  public static void main(String[] args) {
    Population phoneBook = new Population(); //creates pphonebook directory
    int count = phoneBook.getPeople(); //fills up the directory
    phoneBook.sort(count); //sorts the directory alphabetically
    phoneBook.printBook(); //prints out now sorted directory
  }
}
