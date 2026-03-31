public class StringDemo {
  public static void main(String[] args) {
    String s1 = "hello";
    String s2 = "Dog";
    String s3 = "Wayne";
    String s4 = "hello!";
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

    

  }
}
