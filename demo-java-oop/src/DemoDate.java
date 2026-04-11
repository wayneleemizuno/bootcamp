import java.time.LocalDate;
import java.time.Month;

public class DemoDate {
  public static void main(String[] args) {
    LocalDate ld1 = LocalDate.of(1987, 9, 24);
    System.out.println(ld1);

    System.out.println(ld1.getMonthValue());
    System.out.println(ld1.getDayOfWeek());

    System.out.println(LocalDate.now());
    LocalDate today = LocalDate.now(); // system date

    LocalDate joinDate = LocalDate.now();
    LocalDate probationEnd = joinDate.plusMonths(3L);
    System.out.println(probationEnd);

    LocalDate firstDayOfYear = LocalDate.of(2026, 1, 1);
    System.out.println(firstDayOfYear.minusDays(1L));

    Month month = joinDate.getMonth();
    System.out.println(month);

    // comparison
    if (probationEnd.isBefore(LocalDate.of(2026, 7, 10))) {
      System.out.println("Yes");
    }

    if (probationEnd.isAfter(LocalDate.of(2026, 7, 1))) {
      System.out.println("Yes");
    }

    if (probationEnd.equals(LocalDate.of(2026, 7, 9))) {
      System.out.println("Yes");
    }

  }
}
