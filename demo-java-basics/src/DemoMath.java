public class DemoMath {
  public static void main(String[] args) {
    // ! PI
    double pi = Math.PI;
    System.out.println(pi);
    double radius = 3.5;
    double area = radius * radius * Math.PI;
    System.out.println(area);

    // ! sqrt
    System.out.println(Math.sqrt(9)); // 3

    // ! round
    System.out.println(Math.round(10.453)); // 10.0
    System.out.println(Math.round(10.722)); // 11.0

    // ! pow
    double result = Math.pow(2, 3);
    System.out.println(result); // 8.0

    double bmi = 76 / Math.pow(1.76, 2);

    // ! abs
    int x = -2;
    System.out.println(Math.abs(x)); // 2

    // ! max / min
    int[] arr = new int[] { 10, 4, 8, 99, -2 };
    for (int i = 0; i < arr.length; i++) {
      int maxNum = arr[0];
      int minNum = arr[0];
      maxNum = Math.max(arr[i], maxNum);
      minNum = Math.min(arr[i], minNum);
    }

    // ! floor, ceil
    System.out.println(Math.floor(10.9)); // 10
    System.out.println(Math.ceil(10.1)); // 11.0

    // ! random
    double number = Math.random(); // 0 - 1
    // 100 - 1000
    // (Math.random() * 1000) + 100
    // HW 1 - 49 random
    // output: int[] -> 6 numbers (marksix) (no duplicate)
  }
}
