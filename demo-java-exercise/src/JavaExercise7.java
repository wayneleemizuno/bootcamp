package src;

public class JavaExercise7 {
  // Sum values of an array
  public static void main(String[] args) {
    // Sum up all odd number between 0 - 50
    int sum = 0;
    for (int i = 0; i < 51; i++) {
      if (i % 2 == 1) {
        sum += i;
      }
    }
    System.out.println("The sum is " + sum + ".");
    // System.out.println("The sum is " + sum);
  }
}
