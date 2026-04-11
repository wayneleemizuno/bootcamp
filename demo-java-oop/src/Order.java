import java.math.BigDecimal;

public class Order {
  // id
  private String address;
  private Item[] items;

  public Order() {

  }

  public Order(Item[] items) {
    this.items = items;
  }

  // return type should always be primitive (Best Practice)
  public double totalAmount() {
    // sum
    BigDecimal sum = BigDecimal.ZERO;
    for (int i = 0; i < this.items.length; i++) {
      Item item = this.items[i];
      double subTotal = item.subTotal();
      sum = sum.add(BigDecimal.valueOf(subTotal));
    }
    return sum.doubleValue();
  }

  public static void main(String[] args) {

  }
}