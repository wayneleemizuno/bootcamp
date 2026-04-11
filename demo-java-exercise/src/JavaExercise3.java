package src;

public class JavaExercise3 {
  public static void main(String[] args) {
    // Take a character and check whether it is:
    // 1. Vowel (a, e, i, o, u – both lowercase and uppercase)
    // 2. Consonant (anothor 21 letters)
    // 3. Not an alphabet
    char ch = 'k';
    String letter = Character.toString(ch).toUpperCase();

    if (ch >= 65 && ch <= 122) {
      if (letter.equals("A") || letter.equals("E") || letter.equals("I") || letter.equals("O") || letter.equals("U")) {
        System.out.println("It's a vowel");
      } else {
        System.out.println("It's a consonant.");
      }
    } else {
      System.out.println("It's not an alphabet.");
    }

    // Take salary and years of experience, then calculate and print bonus
    // Experience ≥ 10 years → 20% bonus
    // 5–9 years → 10% bonus
    // < 5 years → 5% bonus
    int exp = 5;
    int salary = 150_000;
    int bonus;
    if (exp >= 10) {
      bonus = salary *= 0.2;
    } else if (exp >= 5 && exp <= 9) {
      bonus = salary *= 0.1;
    } else {
      bonus = salary *= 0.05;
    }
    System.out.println(bonus);
  }
}
