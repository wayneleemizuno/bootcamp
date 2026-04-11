// class
public class Person {
  // attribute
  private String name;
  private double height;
  private double weight;

  // constructor
  public Person() {

  }

  public Person(String name, double height, double weight) {
    this.name = name;
    this.height = height;
    this.weight = weight;
  }

  // Instance methods (object methods)
  public void setName(String name) {
    this.name = name;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public String getName() {
    return this.name;
  }

  public double getHeight() {
    return this.height;
  }

  public double getWeight() {
    return this.weight;
  }

  // Method -> Presentation (APIE: Encapsulation)

  public boolean isOverweight() {
    if (this.weight > 100) {
      return true;
    }
    return false; // base case
  }

  public double bmi() {
    return this.weight / (this.height * this.height);
  }

  public String bmiStatus() {
    String bmiStatus = "";
    double bmi = this.bmi();
    if (bmi >= 25) {
      bmiStatus = "Obese";
    } else if (bmi >= 23 && bmi < 25) {
      bmiStatus = "Overweight";
    } else if (bmi >= 18.5 && bmi < 23) {
      bmiStatus = "Normal";
    } else {
      bmiStatus = "Underweight";
    }
    return bmiStatus;
  }

  // void -> return nothing

  // Runtime
  // JVM executes main method
  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setName("John Doe");
    p1.setHeight(1.65);
    p1.setWeight(56);
    String p1Name = p1.getName();
    double p1Height = p1.getHeight();
    double p1Weight = p1.getWeight();
    double p1Bmi = p1.bmi();
    String p1BmiStatus = p1.bmiStatus();
    System.out.println(
        p1Name + ", height: " + p1Height + "m, weight: " + p1Weight + "kg, BMI: " + p1Bmi + " (" + p1BmiStatus + ")");

    Person p2 = new Person();
    p2.setName("Jane Doe");
    p2.setHeight(1.59);
    p2.setWeight(76);
    String p2Name = p2.getName();
    double p2Height = p2.getHeight();
    double p2Weight = p2.getWeight();
    double p2Bmi = p2.bmi();
    String p2BmiStatus = p2.bmiStatus();
    System.out.println(
        p2Name + ", height: " + p2Height + "m, weight: " + p2Weight + "kg, BMI: " + p2Bmi + " (" + p2BmiStatus + ")");

  }
}
