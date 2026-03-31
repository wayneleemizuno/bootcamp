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

    if (age == 20 || age == 30){
      System.out.println("You get a prize.");
    } else {
      System.out.println("Thank you for participating.");
    }

  }
}
