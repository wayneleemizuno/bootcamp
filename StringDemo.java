public class StringDemo {
  public static void main(String[] args) {
    String s1 = "hello";
    String s2 = "Dog";
    String s3 = "Wayne";
    String s4 = "Hello";
    char c1 = 'g';

    s1 = s1 + "!";
    System.out.println(s1);
    // length()
    System.out.println(s1.length());

    // find the 3rd character in s3
    System.out.println(s3.charAt(0));
    System.out.println(s3.charAt(1));
    // find the last character in s3
    System.out.println(s3.charAt(s3.length() - 1));
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    System.out.println(s4.equals(s1));

    String s5 = "";
    System.out.println(s5.isEmpty());
    System.out.println(s4.isEmpty());
    if (s5.isEmpty()) {
      System.out.println("This string is empty.");
    }

    String s6 = " ";
    System.out.println(s6.isEmpty());
    System.out.println(s6.isBlank());

    String lowerCase = s4.toLowerCase();
    String upperCase = s4.toUpperCase();
    System.out.println(lowerCase);
    System.out.println(upperCase);

    if (s4.contains("ll")) {
      System.out.println("contains ll");
    }

    if (s4.contains("lll")) {
      System.out.println("contains lll");
    } else {
      System.out.println("It doesn't contain lll.");
    }

    if (s4.startsWith("He")) {
      System.out.println("Starts with He");
    }

    if (s4.endsWith("llo")) {
      System.out.println("Ends with llo");
    }

    String s10 = "Bootcamp";
    String s11 = s10.replace("o", "x");
    System.out.println(s11);

    String s12 = s10.replace("Boot", "");
    System.out.println(s12);

    String s13 = "chlorophyll";
    String ss = s13.substring(4, 9);
    System.out.println(ss); // rophy
    System.out.println(s13.substring(7));

    String s14 = "bootcamp";
    System.out.println(s14.indexOf("o"));
    System.out.println(s14.indexOf("camp"));
    System.out.println(s14.indexOf("java"));
    System.out.println(s14.indexOf("CAMP"));
    System.out.println(s14.indexOf(97));

    System.out.println(s14.lastIndexOf('o'));
    System.out.println(s14.lastIndexOf("mp"));

    String s15 = "  hello world  ";
    String trimmed = s15.trim();
    System.out.println(trimmed);
    String replaced = s15.replace(" ", "");
    System.out.println(replaced);

    String s16 = "hello";
    String s17 = "world";
    System.out.println(s16 + " " + s17);
    String combined = s16.concat(" ").concat(s17);
    System.out.println(combined);


    String s18 = "abc";
    String s19 = "def";
    System.out.println(s18.compareTo(s19));


    String s20 = "hello";
    String s21 = "HeLLo";
    if (s20.equalsIgnoreCase(s21)) {
      System.out.println("They are the same word.");
    } else {
      System.out.println("They are different words.");
    }
  }
}
