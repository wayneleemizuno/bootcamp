public class DemoWrapperClass {
  public static void main(String[] args) {
    // Primitives
    // Wrapper Class
    byte b1 = 100; // primitive
    Byte b2 = 100; // class

    short s1 = 100;
    Short s2 = 100;

    int x1 = 100;
    if (x1 == 100) {

    }
    // ! for classes, always use methods for comparison
    Integer x2 = 100;
    // * left > right -> return 1
    // * left < right -> return -1
    // * left == right -> return 0
    if (x2.compareTo(100) > 0) { // check if x2 is larger than 100

    }
    if (x2.compareTo(100) < 0) { // check if x2 is smaller than 100

    }
    if (x2.equals(100)) { // check if x2 equals to 100

    }
    if (!x2.equals(100)) { // check if x2 is not equal to 100

    }

    long l1 = 100;
    Long l2 = 100L;

    float f1 = 9.0f;
    Float f2 = 9.0f;

    double d1 = 100.99;
    Double d2 = 100.99;

    char ch1 = 'c';
    Character ch2 = 'c';
    if (ch2.equals('c')) {
      System.out.println("equals");
    }
    if (ch2.compareTo('a') > 0) {
      System.out.println("ASCII left > right");
    }

    boolean o1 = true;
    Boolean o2 = true;

    // Internal Cache
    Integer k1 = 127;
    Integer k2 = 127;
    System.out.println(k1.equals(k2)); // true
    System.out.println(k1 == k2); // true

    Integer k3 = 128;
    Integer k4 = 128;
    System.out.println(k3.equals(k4)); // true
    System.out.println(k3 == k4); // false

    // ! -128 to 127 (Java defines a range of commonly used numbers)
    // * 128 is not within the range, therefore it's created as a new object -> k3
    // == k4 -> false

    // * Implicit Promotion (between Primitives)
    float f10 = 1000L;
    double d10 = 10.9f;
    float f12 = 19;
    byte b10 = 127;
    double d11 = b10; // OK (assign a byte value into a double variable)
    int x10 = 'a';
    double d12 = 'a';

    // * Auto-box & Un-box (between Wrapper Classes and Primitives)
    // auto-box (e.g. long -> Long)
    Long l30 = 100L;
    Integer i30 = 100; // int -> Integer
    Character ch30 = 'x';
    // un-box (e.g. Long -> long)
    long l31 = l30;

    // ! Implicit Promotion and Auto-box / un-box cannot be done at the same time

  }
}
