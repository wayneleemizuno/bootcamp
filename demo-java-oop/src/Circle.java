import java.math.BigDecimal;

public class Circle {
  private double radius;

  // Empty constructor
  public Circle() {

  }

  // All arguments Constructor (with all attribute)
  public Circle(double radius) {
    this.radius = radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public double area() {
    return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(this.radius))
        .multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
  }

  // ? add circumference calculation later

  public static void main(String[] args) {
    Circle circle1 = new Circle(3.76);
    System.out.println(circle1.area());
    System.out.println(new Circle(13.36).area());
  }
}
