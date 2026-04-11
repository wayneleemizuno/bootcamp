public class ConditionalDemo {
  public static void main(String[] args) {
    int age = 40;
    // boolean isElderly = age > 60;
    // if (isElderly) {
    // System.out.println("You're old.");
    // } else {
    // System.out.println("You're young.");
    // }

    // if(age>=18){
    // System.out.println("You're an adult.");
    // } else {
    // System.out.println("Go away, kid.");
    // }

    if (age >= 18 && age <= 50) {
      System.out.println("Please enter.");
    } else {
      System.out.println("Go away.");
    }

    if (age == 20 || age == 30) {
      System.out.println("You get a prize.");
    } else {
      System.out.println("Thank you for participating.");
    }

    // swapping two variables
    int x = 9;
    int y = 5;
    int temp = x;
    x = y;
    y = temp;
    System.out.println(x);
    System.out.println(y);

    // find the max between two numbers
    int j = 10;
    int k = 5;
    int max = j;

    if (j > k) {
      max = j;
    } else {
      max = k;
    }
    System.out.println(max);

    // find min among three numbers
    int q = 10;
    int u = 2;
    int t = 8;
    int min = q;

    if (q < u) {
      if (q < t) {
        min = q;
      } else {
        if (u < t) {
          min = u;
        } else {
          min = t;
        }
      }
    }
    System.out.println("The min is " + min);

    int score = 75;
    char grade;
    String comment = "comment";
    // >=90 Grade A
    // >=80 and <90 Grade B
    // >=70 and <80 Grade C
    // A or B > Excellent
    // C > Pass

    if (score >= 90) {
      grade = 'A';
      comment = "Excellent";
    } else if (score >= 80) {
      grade = 'B';
      comment = "Excellent";
    } else {
      grade = 'C';
      comment = "Pass";
    }
    System.out.println("Your grade is " + grade + ". " + comment + ".");

    String s1 = "Java";

    if (s1.charAt(0) == 'J' || s1.length() > 5) {
      System.out.println("hello");
    } else {
      System.out.println("byebye");
    }

    // Switch
    // no AND / OR
    // no Range checking
    // need to break
    char gender = 'M';

    switch (gender) {
      case 'M':
        System.out.println("This is a male.");
        break;
      case 'F':
        System.out.println("This is a female.");
        break;
      default:
        System.out.println("Invalid");
        break;
    }

    int year = 2100;
    boolean isLeapYear = false;

    // if (year % 4 == 0) {
    //   if (year % 100 == 0) {
    //     if (year % 400 == 0) {
    //       isLeapYear = true;
    //     } else {
    //       isLeapYear = false;
    //     }
    //   } else {
    //     isLeapYear = false;
    //   }
    // } else {
    //   isLeapYear = false;
    // }

    if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
      isLeapYear = true;
    } else {
      isLeapYear = false;
    }
    System.out.println("Leap year? " + isLeapYear);


    
  }
}
