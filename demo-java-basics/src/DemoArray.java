import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    int age = 10;
    int johnAge = 18;
    int maryAge = 17;

    int[] ages = new int[3];
    ages[0] = age;
    ages[1] = johnAge;
    ages[2] = maryAge;
    // swap John's and Mary's age
    int temp = ages[1];
    ages[1] = ages[2];
    ages[2] = temp;

    System.out.println(ages[0]);
    System.out.println(ages[1]);
    System.out.println(ages[2]);

    for (int i = 0; i < ages.length; i++) {
      System.out.println(ages[i]);
    }

    int[] arr = new int[100];
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i + 100;
    }

    // Two ways to declare an array
    char[] chs = new char[4];
    chs[0] = 'a';
    chs[1] = 'b';
    chs[2] = 'c';
    chs[3] = 'd';

    double[] prices = new double[] { 99.99, 50.3, 100.0 };
    for (int i = 0; i < prices.length; i++) {
      System.out.println(prices[i]);
    }
    // Sum up all prices
    double totalPrice = 0;
    for (int i = 0; i < prices.length; i++) {
      totalPrice += prices[i];
    }
    System.out.println("The total price is: " + totalPrice);

    double minPrice = prices[0];
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < minPrice) {
        minPrice = prices[i];
      }
    }
    // HW: find the max value

    // int[], double[], String[], char[]
    char[] chs2 = new char[] { 'a', 'e', 'i', 'o', 'u' };
    String name = "Mary";
    // check if the name contains any char values in chs2
    boolean containVowel = false;
    loopName: for (int i = 0; i < name.length(); i++) {
      for (int j = 0; j < chs2.length; j++) {
        if (name.charAt(i) == chs2[j]) {
          containVowel = true;
          break loopName;
        }
      }
    }
    System.out.println("Does the name contain any vowels? - " + containVowel);

    int[] arr2 = new int[] { 100, 4, 99, 55, 17 };
    // move the first number to the end of the array -> 4, 99, 55, 17, 100
    for (int i = 0; i < arr2.length - 1; i++) {
      int backup = arr2[0];
      arr2[i] = arr2[i + 1];
      arr2[i + 1] = backup;
    }
    System.out.println(Arrays.toString(arr2));

    int[] arr3 = new int[] { 100, 4, 200, 55, 17 };
    // Move the largest number to the end of the array (x, x, x, x, 200)

    for (int i = 0; i < arr3.length - 1; i++) {
      if (arr3[i] > arr3[i + 1]) {
        int tempNum = arr3[i];
        arr3[i] = arr3[i + 1];
        arr3[i + 1] = tempNum;
      }
    }
    System.out.println(Arrays.toString(arr3));

    // Sorting
    int[] arr4 = new int[] { 100, 4, 200, 55, 17 };
    for (int i = 0; i < arr4.length - 1; i++) {
      for (int j = 0; j < arr4.length - i - 1; j++) {
        if (arr4[j] > arr4[j + 1]) {
          int temp2 = arr4[j];
          arr4[j] = arr4[j + 1];
          arr4[j + 1] = temp2;
        }
      }
    }
    System.out.println(Arrays.toString(arr4));

    String str = "abcdefg";
    // reverse the string > gfedcba
    String reversedStr = "";

    for (int i = str.length() - 1; i >= 0; i--) {
      reversedStr += str.charAt(i);
    }
    str = reversedStr;
    System.out.println(str);
  }
}
