public class Primitives {
  // Primitives - Raw data type
  // int, double, short, long
  // double, float
  // boolean
  // char
  public static void main(String[] args) {
    int appleCount = 100;
    double applePrice = 4.56;
    System.out.println(appleCount);
    System.out.println(applePrice);
    System.out.println("On Sale");

    boolean isElderly = true;
    boolean isNotElderly = false;
    System.out.println(isElderly);
    System.out.println(isNotElderly);

    // char: single character only
    // use single quotation mark ''
    char c1 = 'a';
    char c2 = '$';
    char none = ' ';
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(none);
    // maximum value for int is about 21 billion, for values larger than that, use
    // long
    int i5 = 2100000000;
    int i7 = 1_000_000_000;

    // long - 2^63
    long many = 2_350_455_508_861L;

    // byte (-128 to 127)
    byte by1 = 127;

    // short (-32768 to 32767)
    short sht1 = 32767;
    short sht3 = -30000;
    // byte and short are rarely use these days

    double d1 = 100.99;
    double d2 = 100.99;
    float f1 = 100.99f;

  }
}