import java.math.BigDecimal;
import java.time.LocalDate;

public class Customer {
  // attributes
  private String firstName;
  private String lastName;
  private LocalDate dob;
  private Order[] orders; // ! Array (Custom Class)

  // constructors
  public Customer() {
    // ! advanced
    this.orders = new Order[0];
  }

  public Customer(Order[] orders) {
    this.orders = orders;
  }

  public Customer(String firstName, String lastName, LocalDate dob) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dob = dob;
  }

  // methods
  public void addOrder(Order newOrder) {
    Order[] newOrders = new Order[this.orders.length + 1];
    for (int i = 0; i < this.orders.length; i++) {
      newOrders[i] = this.orders[i];
    }
    newOrders[newOrders.length - 1] = newOrder;
    this.orders = newOrders;
  } // ? do the same for items

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public LocalDate getDob() {
    return this.dob;
  }

  public int getBirthYear() {
    return this.dob.getYear();
  }

  // isVip(), total amount of all orders > 100,000
  public boolean isVip() {
    return this.totalOrderAmount() > 100_000;
  }

  public double totalOrderAmount() {
    BigDecimal sum = BigDecimal.ZERO;
    for (int i = 0; i < this.orders.length; i++) {
      sum = sum.add(BigDecimal.valueOf(this.orders[i].totalAmount()));
    }
    return sum.doubleValue();

  }

  public static void main(String[] args) {
    Customer c1 = new Customer();
    Customer c2 = new Customer("John", "Doe", LocalDate.of(1993, 12, 3));
    Customer c3 = new Customer("Jane", "Doe", LocalDate.of(1999, 3, 16));

    System.out.println(c3.getBirthYear());
    // 2 orders
    // Order 1: 2 items
    // Order 2: 1 item

    // Customer c4.isVip -> true

    Item apples = new Item("apple", 3.5, 10);
    Item goldBars = new Item("goldbar", 99_999, 5);
    Item tShirts = new Item("T-shirt", 129.9, 8);

    Item[] items = new Item[2];
    items[0] = apples;
    items[1] = tShirts;

    Item[] items2 = new Item[1];
    items2[0] = goldBars;

    Order o1 = new Order(items);
    Order o2 = new Order(items2);

    Order[] orders = new Order[2];
    orders[0] = o1;
    orders[1] = o2;

    Customer c4 = new Customer(orders);
    c4.setFirstName("Tommy");
    System.out.println(c4.getFirstName() + " has spent "
        + c4.totalOrderAmount());
    System.out.println(c4.getFirstName() + " is a VIP? - " + c4.isVip());

  }

}
