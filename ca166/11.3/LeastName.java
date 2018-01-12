class Name { // The name of a person

  String forename, surname; // first and second names

  void get() { // Read name from keyboard
    forename = Console.readToken(); // forename is one word
    surname = Console.readString(); // surname is rest of line
  }

  void put() { // Write name in form "Smith, Fred"
    System.out.println(surname + ", " + forename);
  }

  boolean lte(Name s) { // My name precedes or equals s?
    return (surname.compareTo(s.surname) < 0
        || (surname.equals(s.surname) && forename.compareTo(s.forename) <= 0));
  }
}

class LeastName {
  public static void main(String[] args) {
    Name least = new Name();
    least.get(); // least name so far
    Name tempName = new Name();
    while (!Console.endOfFile()) {
      tempName.get();
      if (tempName.lte(least)) least = tempName;
    }
    least.put();
  }
}
