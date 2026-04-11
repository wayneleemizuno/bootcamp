import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    // Scanner for collecting user input
    Scanner s = new Scanner(System.in);
    System.out.println("Please enter a number:");
    int number = s.nextInt();

    if (number % 2 == 0) {
      System.out.println("You entered an even number.");
    } else {
      System.out.println("You entered an odd number.");
    }

  }
}
