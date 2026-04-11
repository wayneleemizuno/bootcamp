public class StringII {
  public static void main(String[] args) {
    // create object in literal pool which can be repeatedly used
    String s1 = "hello";
    String s2 = "hello";
    System.out.println(s2.equals(s1));// * true -> check if they have the same string VALUE

    // new -> produce new object
    String s3 = new String("hello");
    String s4 = new String("hello");

    System.out.println(s1 == s2); // * true -> check if they have the same address
    // * don't use == for object comparision
    // ! For class object (non-primitive) always use .equals for comparision
    System.out.println(s3 == s4); // false
    System.out.println(s1 == s3); // false
    System.out.println(s2 == s4); // false
    // ! == is used for primitive comparision
  }
}
