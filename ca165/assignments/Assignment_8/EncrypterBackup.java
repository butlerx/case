public class Encrypter {
  public static String encrypt(int key, String unencrypted) {
    Character[] letterUnencrypted = {
      'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
      'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
      'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3',
      '4', '5', '6', '7', '8', '9', '@', '£', '$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+',
      '{', '[', '}', ']', '|', '<', ',', '.', '>', '/', '?', '~', '`', '€'
    };
    Character[] letterEncrypted = new Character[letterUnencrypted.length];
    int length = letterUnencrypted.length - key;
    int keyOne = key;
    int keyTwo = key;
    for (int i = 0; i < length; i++) {
      letterEncrypted[keyOne] = letterUnencrypted[i];
      keyOne++;
    }
    for (int i = 0; i < keyTwo; i++) {
      letterEncrypted[i] = letterUnencrypted[length];
      length++;
    }
    String encrypted = "";
    for (int i = 0; i < unencrypted.length(); i++) {
      for (int j = 0; j < letterUnencrypted.length; j++) {
        Character character = unencrypted.charAt(i);
        if (character == (letterUnencrypted[j])) encrypted = encrypted + letterEncrypted[j];
      }
    }
    return encrypted;
  }

  public static String decrypt(int key, String encrypted) {
    Character[] letterUnencrypted = {
      'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
      'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
      'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3',
      '4', '5', '6', '7', '8', '9', '@', '£', '$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+',
      '{', '[', '}', ']', '|', '<', ',', '.', '>', '/', '?', '~', '`', '€'
    };
    Character[] letterEncrypted = new Character[letterUnencrypted.length];
    int length = letterUnencrypted.length - key;
    int keyOne = key;
    int keyTwo = key;
    for (int i = 0; i < length; i++) {
      letterEncrypted[keyOne] = letterUnencrypted[i];
      keyOne++;
    }
    for (int i = 0; i < keyTwo; i++) {
      letterEncrypted[i] = letterUnencrypted[length];
      length++;
    }
    String decrypted = "";
    for (int i = 0; i < encrypted.length(); i++) {
      for (int j = 0; j < letterEncrypted.length; j++) {
        Character character = encrypted.charAt(i);
        if (character == (letterEncrypted[j])) decrypted = decrypted + letterUnencrypted[j];
      }
    }
    return decrypted;
  }

  public static void main(String[] args) {
    System.out.print("Do you want to encrypt or decrypt? ");
    String ans = Console.readString();
    if (ans.equals("encrypt")) {
      System.out.print("Enter a key to encrypt with: ");
      int key = Console.readInt();
      System.out.print("Enter a message to encrypt: ");
      String encrypted = encrypt(key, Console.readString());
      System.out.println("The encrypted message is: " + encrypted);
    } else {
      System.out.print("Enter a key to decrypt with: ");
      int key = Console.readInt();
      System.out.print("Enter a message to decrypt: ");
      String decrypted = decrypt(key, Console.readString());
      System.out.println("The decrypted message is: " + decrypted);
    }
  }
}
