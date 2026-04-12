import java.math.BigDecimal;

public class Product {
  private Integer id;
  private String name;
  private double price;
  private int quantity;

  public Product(Integer id, String name, double price, int quantity) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public Integer getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public double getPrice() {
    return this.price;

  }

  public int getQuantity() {
    return this.quantity;
  }

  public double totalValue() {
    return BigDecimal.valueOf(price).multiply(BigDecimal.valueOf(quantity)).doubleValue();
  }

}
