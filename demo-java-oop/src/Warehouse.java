import java.math.BigDecimal;

public class Warehouse {
  private String name;
  private Product[] inventory;
  private BigDecimal operatingBudget;

  public Warehouse(String name, int capacity, BigDecimal initialBudget) {
    this.name = name;
    this.inventory = new Product[capacity];
    this.operatingBudget = initialBudget;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBudget(BigDecimal budget) {
    this.operatingBudget = budget;
  }

  public String getName() {
    return this.name;
  }

  public double getBudget() {
    return this.operatingBudget.doubleValue();
  }

  public boolean addProduct(Product product) {
    for (int i = 0; i < this.inventory.length; i++) {
      if (this.inventory[i] == null) {
        this.inventory[i] = product;
        return true;
      }
    }
    return false;

  }

  public double getInventoryValue() {
    BigDecimal inventoryValue = BigDecimal.ZERO;
    for (int i = 0; i < this.inventory.length; i++) {
      if (this.inventory[i] == null) {
        continue;
      }
      inventoryValue = inventoryValue.add(BigDecimal.valueOf(this.inventory[i].totalValue()));
    }
    return inventoryValue.doubleValue();
  }

  public Product searchProduct(String keyword) {
    for (int i = 0; i < this.inventory.length; i++) {
      if (inventory[i] == null)
        continue;
      if (this.inventory[i].getName().toLowerCase().contains(keyword.toLowerCase())) {
        return this.inventory[i];
      }
    }
    return null;
  }

  public void generateReport() {
    for (int i = 0; i < this.inventory.length; i++) {
      if (this.inventory[i] == null) {
        continue;
      }
      String productName = this.inventory[i].getName();
      double productValue = this.inventory[i].totalValue();
      int quantity = this.inventory[i].getQuantity();
      if (productName.length() > 10) {
        System.out
            .println(productName.substring(0, 10) + "..." + "|  Qty:" + quantity + "|  total value: " + productValue);
      } else {
        System.out.println(productName + "|  Qty:" + quantity + "|  total value: " + productValue);
      }

    }
  }

  public static void main(String[] args) {
    Product p1 = new Product(100101, "Wireless Mechanical Keyboard", 125.50, 45);
    Product p2 = new Product(100102, "UltraWide Gaming Monitor", 450.00, 12);
    Product p3 = new Product(100103, "Ergonomic Office Chair", 299.99, 20);
    Product p4 = new Product(100104, "USB-C Docking Station", 89.00, 60);
    Product p5 = new Product(100105, "4K Webcam", 110.00, 35);
    Product p6 = new Product(100106, "Noise Cancelling Headphones", 350.00, 25);
    Product p7 = new Product(100107, "Portable 2TB SSD", 180.00, 50);
    Product p8 = new Product(100108, "Smart LED Desk Lamp", 45.00, 100);
    Product p9 = new Product(100109, "Vertical Ergonomic Mouse", 65.00, 80);
    Product p10 = new Product(100110, "Aluminum Laptop Stand", 35.00, 150);

    Warehouse myWarehouse = new Warehouse("Mainland Pirated Tech", 20, BigDecimal.valueOf(9478775.33));

    System.out.println("Operating Budget: " + myWarehouse.getBudget());

    myWarehouse.addProduct(p1);
    // System.out.println("added: " + myWarehouse.inventory[0].getName());
    myWarehouse.addProduct(p2);
    // System.out.println("added: " + myWarehouse.inventory[1].getName());
    myWarehouse.addProduct(p3);
    // System.out.println("added: " + myWarehouse.inventory[2].getName());
    myWarehouse.addProduct(p4);
    // System.out.println("added: " + myWarehouse.inventory[3].getName());
    myWarehouse.addProduct(p5);
    // System.out.println("added: " + myWarehouse.inventory[4].getName());
    myWarehouse.addProduct(p6);
    // System.out.println("added: " + myWarehouse.inventory[5].getName());
    myWarehouse.addProduct(p7);
    // System.out.println("added: " + myWarehouse.inventory[6].getName());
    myWarehouse.addProduct(p8);
    // System.out.println("added: " + myWarehouse.inventory[7].getName());
    myWarehouse.addProduct(p9);
    // System.out.println("added: " + myWarehouse.inventory[8].getName());
    myWarehouse.addProduct(p10);
    // System.out.println("added: " + myWarehouse.inventory[9].getName());

    System.out.println("Total Inventory Value: " + myWarehouse.getInventoryValue());

    System.out.println("Found: " + myWarehouse.searchProduct("Laptop"));
    System.out.println("Found: " + myWarehouse.searchProduct("LED"));
    System.out.println("Found: " + myWarehouse.searchProduct("Pizza"));

    myWarehouse.generateReport();

  }

}
