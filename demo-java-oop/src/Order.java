import java.math.BigDecimal;

public class Order {
  // id
  private String address;
  private Item[] items;

  public Order(Item[] items) {
    this.items = items;
  }

  public Order() {
    this.items = new Item[0];
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getAddress() {
    return this.address;
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

  public void addItem(Item item) {
    Item[] newItemList = new Item[items.length + 1];
    for (int i = 0; i < items.length; i++) {
      newItemList[i] = items[i];
    }
    newItemList[newItemList.length - 1] = item;
    items = newItemList;
  }

  public static void main(String[] args) {

  }
}