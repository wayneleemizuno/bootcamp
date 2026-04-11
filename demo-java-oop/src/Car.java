public class Car {
  // color
  // brand
  // year
  private String color;
  private String brand;
  private int year;

  public String getColor() {
    return this.color;
  }

  public String getBrand() {
    return this.brand;
  }

  public int getYear() {
    return this.year;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public static void main(String[] args) {
    // 2 car objects
    Car c1 = new Car();
    c1.setColor("blue");
    String c1Colour = c1.getColor();
    System.out.println(c1Colour);
    c1.setBrand("BMW");
    String c1Brand = c1.getBrand();
    System.out.println(c1Brand);
    c1.setYear(2008);
    int c1Year = c1.getYear();
    System.out.println(c1Year);

    Car c2 = new Car();
    c2.setBrand("Toyota");
    c2.setColor("silver");
    c2.setYear(1990);
    String c2Brand = c2.getBrand();
    String c2Color = c2.getColor();
    int c2Year = c2.getYear();
    System.out.println(c2Brand);
    System.out.println(c2Color);
    System.out.println(c2Year);

  }
}
