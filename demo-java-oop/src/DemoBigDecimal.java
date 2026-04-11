import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    // ! 1 new BigDecimal("0.1")
    BigDecimal bd1 = new BigDecimal("0.1");
    BigDecimal bd2 = new BigDecimal("0.2");

    BigDecimal sum = bd1.add(bd2);
    System.out.println(sum);

    double salary = 22500.99;
    double bonus = 1500.99;
    System.out.println(salary + bonus); // 24001.980000000003
    // ! 2 BigDecimal.valueOf
    BigDecimal bonus2 = BigDecimal.valueOf(1500.99);
    BigDecimal result2 = BigDecimal.valueOf(22500.99).add(BigDecimal.valueOf(1500.99));
    System.out.println(result2); // 24001.98

    // add +
    // subtract -
    // multiply *
    // divide /

    BigDecimal bd3 = BigDecimal.valueOf(0.3);
    BigDecimal bd4 = BigDecimal.valueOf(0.2);
    BigDecimal result3 = bd3.subtract(bd4);
    System.out.println(result3);

    BigDecimal result4 = BigDecimal.valueOf(0.1).multiply(BigDecimal.valueOf(0.2));
    System.out.println(result4);

    // ! Non-terminating decimal expansion
    // BigDecimal result5 = BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3));
    // System.out.println(result5);

    BigDecimal result5 = BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3), 2, RoundingMode.HALF_UP); // HALF -> 5
    System.out.println(result5); // 3.33

    BigDecimal result6 = BigDecimal.valueOf(6.7).divide(BigDecimal.valueOf(2), 1, RoundingMode.HALF_DOWN);
    System.out.println(result6); // 3.3

    System.out.println(BigDecimal.valueOf(20).divide(BigDecimal.valueOf(3), 1, RoundingMode.CEILING));
    System.out.println(BigDecimal.valueOf(20).divide(BigDecimal.valueOf(3), 1, RoundingMode.HALF_UP));

    // ! Avoid Divided by ZERO -> error

  }
}
