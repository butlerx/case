public class BlackListen {
  public static String translate(String word) {
    String[] english = {
      "hello",
      "hi",
      "pardon me",
      "excuse me",
      "my",
      "friend",
      "sir",
      "madam",
      "miss",
      "stranger",
      "where",
      "is",
      "the",
      "you",
      "tell",
      "know",
      "far",
      "old",
      "attractive",
      "happy",
      "nearby",
      "restroom",
      "restaurant",
      "hotel",
      "pub",
      "bank",
      "Hello",
      "Hi",
      "Pardon Me",
      "Excuse Me",
      "My",
      "Friend",
      "Sir",
      "Madam",
      "Miss",
      "Stranger",
      "Where",
      "Is",
      "The",
      "You",
      "Tell",
      "Know",
      "Far",
      "Old",
      "Attractive",
      "Happy",
      "Nearby",
      "Restroom",
      "Restaurant",
      "Hotel",
      "Pub",
      "Bank",
      "hello.",
      "hi.",
      "pardon me.",
      "excuse me.",
      "my.",
      "friend.",
      "sir.",
      "madam.",
      "miss.",
      "stranger.",
      "where.",
      "is.",
      "the.",
      "you.",
      "tell.",
      "know.",
      "far.",
      "old.",
      "attractive.",
      "happy.",
      "nearby.",
      "restroom.",
      "restaurant.",
      "hotel.",
      "pub.",
      "bank.",
      "Hello.",
      "Hi.",
      "Pardon Me.",
      "Excuse Me.",
      "My.",
      "Friend.",
      "Sir.",
      "Madam.",
      "Miss.",
      "Stranger.",
      "Where.",
      "Is.",
      "The.",
      "You.",
      "Tell.",
      "Know.",
      "Far.",
      "Old.",
      "Attractive.",
      "Happy.",
      "Nearby.",
      "Restroom.",
      "Restaurant.",
      "Hotel.",
      "Pub.",
      "Bank.",
      "hello,",
      "hi,",
      "pardon me,",
      "excuse me,",
      "my,",
      "friend,",
      "sir,",
      "madam,",
      "miss,",
      "stranger,",
      "where,",
      "is,",
      "the,",
      "you,",
      "tell,",
      "know,",
      "far,",
      "old,",
      "attractive,",
      "happy,",
      "nearby,",
      "restroom,",
      "restaurant,",
      "hotel,",
      "pub,",
      "bank,",
      "Hello,",
      "Hi,",
      "Pardon Me,",
      "Excuse Me,",
      "My,",
      "Friend,",
      "Sir,",
      "Madam,",
      "Miss,",
      "Stranger,",
      "Where,",
      "Is,",
      "The,",
      "You,",
      "Tell,",
      "Know,",
      "Far,",
      "Old,",
      "Attractive,",
      "Happy,",
      "Nearby,",
      "Restroom,",
      "Restaurant,",
      "Hotel,",
      "Pub,",
      "Bank,",
    };
    String[] pirate = {
      "ahoy",
      "yo-ho-ho",
      "avast",
      "arrr",
      "me",
      "me bucko",
      "matey",
      "proud beauty",
      "comely wench",
      "scurvy dog",
      "whar",
      "be",
      "th'",
      "ye",
      "be tellin'",
      "be knowin'",
      "many leagues",
      "barnacle-covered",
      "comely",
      "grog-filled",
      "broadside",
      "head",
      "galley",
      "fleabag inn",
      "Skull & Scuppers",
      "buried treasure",
      "Ahoy",
      "Yo-Ho-Ho",
      "Avast",
      "Arrr",
      "Me",
      "Me Bucko",
      "Matey",
      "Proud Beauty",
      "Comely Wench",
      "Scurvy Dog",
      "Whar",
      "Be",
      "Th'",
      "Ye",
      "Be Tellin'",
      "Be Knowin'",
      "Many Leagues",
      "Barnacle-Covered",
      "Comely",
      "Grog-Filled",
      "Broadside",
      "Head",
      "Galley",
      "Fleabag Inn",
      "Skull & Scuppers",
      "Buried Treasure",
      "ahoy.",
      "yo-ho-ho.",
      "avast.",
      "arrr.",
      "me.",
      "me bucko.",
      "matey.",
      "proud beauty.",
      "comely wench.",
      "scurvy dog.",
      "whar.",
      "be.",
      "th'.",
      "ye.",
      "be tellin'.",
      "be knowin'.",
      "many leagues.",
      "barnacle-covered.",
      "comely.",
      "grog-filled.",
      "broadside.",
      "head.",
      "galley.",
      "fleabag inn.",
      "Skull & Scuppers.",
      "buried treasure.",
      "Ahoy.",
      "Yo-Ho-Ho.",
      "Avast.",
      "Arrr.",
      "Me.",
      "Me Bucko.",
      "Matey.",
      "Proud Beauty.",
      "Comely Wench.",
      "Scurvy Dog.",
      "Whar.",
      "Be.",
      "Th'.",
      "Ye.",
      "Be Tellin'.",
      "Be Knowin'.",
      "Many Leagues.",
      "Barnacle-Covered.",
      "Comely.",
      "Grog-Filled.",
      "Broadside.",
      "Head.",
      "Galley.",
      "Fleabag Inn.",
      "Skull & Scuppers.",
      "Buried Treasure.",
      "ahoy,",
      "yo-ho-ho,",
      "avast,",
      "arrr,",
      "me,",
      "me bucko,",
      "matey,",
      "proud beauty,",
      "comely wench,",
      "scurvy dog,",
      "whar,",
      "be,",
      "th',",
      "ye,",
      "be tellin',",
      "be knowin',",
      "many leagues,",
      "barnacle-covered,",
      "comely,",
      "grog-filled,",
      "broadside,",
      "head,",
      "galley,",
      "fleabag inn,",
      "Skull & Scuppers,",
      "buried treasure,",
      "Ahoy,",
      "Yo-Ho-Ho,",
      "Avast,",
      "Arrr,",
      "Me,",
      "Me Bucko,",
      "Matey,",
      "Proud Beauty,",
      "Comely Wench,",
      "Scurvy Dog,",
      "Whar,",
      "Be,",
      "Th',",
      "Ye,",
      "Be Tellin',",
      "Be Knowin',",
      "Many Leagues,",
      "Barnacle-Covered,",
      "Comely,",
      "Grog-Filled,",
      "Broadside,",
      "Head,",
      "Galley,",
      "Fleabag Inn,",
      "Skull & Scuppers,",
      "Buried Treasure,"
    };
    for (int i = 0; i < english.length; i++) {
      if (word.equals(english[i])) word = pirate[i];
    }
    return word;
  }

  public static String translateBack(String word) {
    String[] english = {
      "hello",
      "hi",
      "pardon me",
      "excuse me",
      "my",
      "friend",
      "sir",
      "madam",
      "miss",
      "stranger",
      "where",
      "is",
      "the",
      "you",
      "tell",
      "know",
      "far",
      "old",
      "attractive",
      "happy",
      "nearby",
      "restroom",
      "restaurant",
      "hotel",
      "pub",
      "bank",
      "Hello",
      "Hi",
      "Pardon Me",
      "Excuse Me",
      "My",
      "Friend",
      "Sir",
      "Madam",
      "Miss",
      "Stranger",
      "Where",
      "Is",
      "The",
      "You",
      "Tell",
      "Know",
      "Far",
      "Old",
      "Attractive",
      "Happy",
      "Nearby",
      "Restroom",
      "Restaurant",
      "Hotel",
      "Pub",
      "Bank",
      "hello.",
      "hi.",
      "pardon me.",
      "excuse me.",
      "my.",
      "friend.",
      "sir.",
      "madam.",
      "miss.",
      "stranger.",
      "where.",
      "is.",
      "the.",
      "you.",
      "tell.",
      "know.",
      "far.",
      "old.",
      "attractive.",
      "happy.",
      "nearby.",
      "restroom.",
      "restaurant.",
      "hotel.",
      "pub.",
      "bank.",
      "Hello.",
      "Hi.",
      "Pardon Me.",
      "Excuse Me.",
      "My.",
      "Friend.",
      "Sir.",
      "Madam.",
      "Miss.",
      "Stranger.",
      "Where.",
      "Is.",
      "The.",
      "You.",
      "Tell.",
      "Know.",
      "Far.",
      "Old.",
      "Attractive.",
      "Happy.",
      "Nearby.",
      "Restroom.",
      "Restaurant.",
      "Hotel.",
      "Pub.",
      "Bank.",
      "hello,",
      "hi,",
      "pardon me,",
      "excuse me,",
      "my,",
      "friend,",
      "sir,",
      "madam,",
      "miss,",
      "stranger,",
      "where,",
      "is,",
      "the,",
      "you,",
      "tell,",
      "know,",
      "far,",
      "old,",
      "attractive,",
      "happy,",
      "nearby,",
      "restroom,",
      "restaurant,",
      "hotel,",
      "pub,",
      "bank,",
      "Hello,",
      "Hi,",
      "Pardon Me,",
      "Excuse Me,",
      "My,",
      "Friend,",
      "Sir,",
      "Madam,",
      "Miss,",
      "Stranger,",
      "Where,",
      "Is,",
      "The,",
      "You,",
      "Tell,",
      "Know,",
      "Far,",
      "Old,",
      "Attractive,",
      "Happy,",
      "Nearby,",
      "Restroom,",
      "Restaurant,",
      "Hotel,",
      "Pub,",
      "Bank,",
    };
    String[] pirate = {
      "ahoy",
      "yo-ho-ho",
      "avast",
      "arrr",
      "me",
      "me bucko",
      "matey",
      "proud beauty",
      "comely wench",
      "scurvy dog",
      "whar",
      "be",
      "th'",
      "ye",
      "be tellin'",
      "be knowin'",
      "many leagues",
      "barnacle-covered",
      "comely",
      "grog-filled",
      "broadside",
      "head",
      "galley",
      "fleabag inn",
      "Skull & Scuppers",
      "buried treasure",
      "Ahoy",
      "Yo-Ho-Ho",
      "Avast",
      "Arrr",
      "Me",
      "Me Bucko",
      "Matey",
      "Proud Beauty",
      "Comely Wench",
      "Scurvy Dog",
      "Whar",
      "Be",
      "Th'",
      "Ye",
      "Be Tellin'",
      "Be Knowin'",
      "Many Leagues",
      "Barnacle-Covered",
      "Comely",
      "Grog-Filled",
      "Broadside",
      "Head",
      "Galley",
      "Fleabag Inn",
      "Skull & Scuppers",
      "Buried Treasure",
      "ahoy.",
      "yo-ho-ho.",
      "avast.",
      "arrr.",
      "me.",
      "me bucko.",
      "matey.",
      "proud beauty.",
      "comely wench.",
      "scurvy dog.",
      "whar.",
      "be.",
      "th'.",
      "ye.",
      "be tellin'.",
      "be knowin'.",
      "many leagues.",
      "barnacle-covered.",
      "comely.",
      "grog-filled.",
      "broadside.",
      "head.",
      "galley.",
      "fleabag inn.",
      "Skull & Scuppers.",
      "buried treasure.",
      "Ahoy.",
      "Yo-Ho-Ho.",
      "Avast.",
      "Arrr.",
      "Me.",
      "Me Bucko.",
      "Matey.",
      "Proud Beauty.",
      "Comely Wench.",
      "Scurvy Dog.",
      "Whar.",
      "Be.",
      "Th'.",
      "Ye.",
      "Be Tellin'.",
      "Be Knowin'.",
      "Many Leagues.",
      "Barnacle-Covered.",
      "Comely.",
      "Grog-Filled.",
      "Broadside.",
      "Head.",
      "Galley.",
      "Fleabag Inn.",
      "Skull & Scuppers.",
      "Buried Treasure.",
      "ahoy,",
      "yo-ho-ho,",
      "avast,",
      "arrr,",
      "me,",
      "me bucko,",
      "matey,",
      "proud beauty,",
      "comely wench,",
      "scurvy dog,",
      "whar,",
      "be,",
      "th',",
      "ye,",
      "be tellin',",
      "be knowin',",
      "many leagues,",
      "barnacle-covered,",
      "comely,",
      "grog-filled,",
      "broadside,",
      "head,",
      "galley,",
      "fleabag inn,",
      "Skull & Scuppers,",
      "buried treasure,",
      "Ahoy,",
      "Yo-Ho-Ho,",
      "Avast,",
      "Arrr,",
      "Me,",
      "Me Bucko,",
      "Matey,",
      "Proud Beauty,",
      "Comely Wench,",
      "Scurvy Dog,",
      "Whar,",
      "Be,",
      "Th',",
      "Ye,",
      "Be Tellin',",
      "Be Knowin',",
      "Many Leagues,",
      "Barnacle-Covered,",
      "Comely,",
      "Grog-Filled,",
      "Broadside,",
      "Head,",
      "Galley,",
      "Fleabag Inn,",
      "Skull & Scuppers,",
      "Buried Treasure,"
    };
    for (int i = 0; i < pirate.length; i++) {
      if (word.equals(pirate[i])) word = english[i];
    }
    return word;
  }

  public static void printArray(String[] array) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] != null) System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  public static int randomArrr(String[] sentence, int i) {
    if (i % 2 == 0) {
      String currentString = sentence[i];
      String testEnd = currentString.substring(currentString.length() - 1, currentString.length());
      if (testEnd.equals(".")) {
        i++;
        sentence[i] = "Arrr";
      }
    }
    return i;
  }

  public static void main(String[] args) {
    String[] sentence = new String[(int) Math.pow(2, 8)];
    String word = Console.readToken();
    int i = 0;
    while (word != null) {
      // deal with the word
      sentence[i] = translateBack(word);
      /*if(!(sentence[0].equals("Arrr")))
      {
      	sentence[1] = sentence[0];
      	sentence[0] = "Arrr";
      	i =i + 1;
      }
      i = randomArrr(sentence, i);*/
      i++;
      // read in the next word
      word = Console.readToken();
    }
    printArray(sentence);
  }
}
