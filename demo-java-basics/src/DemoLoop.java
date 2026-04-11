public class DemoLoop {
  public static void main(String[] args) {
    // i, j, k used for FOR LOOP
    // initialisation -> int i = 0
    // iteration continue criteria -> i < 3
    // when each iteration ends -> i++
    for (int i = 0; i < 3; i++) {
      System.out.println("hello");
    }

    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0 && i != 0) {
        System.out.println(i);
      }
    }

    for (int i = 0; i < 100; i++) {
      if (i > 50 && i % 3 == 0) {
        System.out.println(i);
      }
    }

    String s1 = "hello";
    boolean containsL = false;
    for (int i = 0; i < s1.length(); i++) {
      System.out.println(s1.charAt(i));
      if (s1.charAt(i) == 'l') {
        containsL = true;
        break; // break nearest loop
      }
    }
    System.out.println(containsL);

    String s2 = "94734082356";
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < s2.length(); i++) {
      int digit = s2.charAt(i) - '0';
      if (digit % 2 == 0 && digit > max) {
        max = digit;
      }
    }
    System.out.println(max);

    String s3 = "83ahs0nd";
    String letters = "";
    for (int i = 0; i < s3.length(); i++) {
      char currentChar = s3.charAt(i);
      if (currentChar >= 97 && currentChar <= 122) {
        letters = letters += currentChar;
      }
    }
    System.out.println(letters);

    String s4 = "725094849";
    int largestIndex = 0;
    int largestDigit = 0;
    for (int i = 0; i < s4.length(); i++) {
      int currentDigit = s4.charAt(i) - '0';
      if (currentDigit >= largestDigit && i > largestIndex) {
        largestDigit = currentDigit;
        largestIndex = i;
      }
    }
    System.out.println("The largest index is " + largestIndex + " & " + "the largest digit is " + largestDigit + ".");
  }
}
