import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class GymMember {
  private String name;
  private double weight;
  private double height;
  private LocalDate joinDate;
  private LocalDate[] checkInHistory;

  public GymMember(LocalDate joinDate) {
    this.joinDate = joinDate;
    this.checkInHistory = new LocalDate[0];
  }

  public GymMember(String name, double weight, double height, LocalDate joinDate) {
    this.name = name;
    this.weight = weight;
    this.height = height;
    this.joinDate = joinDate;
    this.checkInHistory = new LocalDate[0];
  }

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

  public LocalDate getJoinDate() {
    return this.joinDate;
  }

  public GymMemberTier getMemberTier() {
    long joinedMonths = ChronoUnit.MONTHS.between(joinDate, LocalDate.now());
    if (joinedMonths >= 48) {
      return GymMemberTier.DIAMOND;
    } else if (joinedMonths >= 36) {
      return GymMemberTier.EMERALD;
    } else if (joinedMonths >= 24) {
      return GymMemberTier.RUBY;
    } else if (joinedMonths >= 12) {
      return GymMemberTier.SAPPHIRE;
    } else {
      return GymMemberTier.OPAL;
    }
  }

  public double bmi() {
    return this.weight / (this.height * this.height);
  }

  public String getBmiStatus() {
    double bmi = this.bmi();
    String status = "";
    if (bmi < 18.5) {
      status = "Underweight";
    } else if (bmi >= 18.5 && bmi < 25) {
      status = "Normal";
    } else if (bmi >= 25 && bmi < 30) {
      status = "Overweight";
    } else {
      status = "Obese";
    }
    return status;
  }

  // * redundant
  // public boolean isAnniversay() {
  // if (joinDate.getMonth().equals(LocalDate.now().getMonth())
  // && joinDate.getDayOfMonth() == LocalDate.now().getDayOfMonth()) {
  // return true;
  // }
  // return false;
  // }
  // * avoid time change at midnight
  // public boolean isAnniversay() {
  // return joinDate.getMonth().equals(LocalDate.now().getMonth())
  // && joinDate.getDayOfMonth() == LocalDate.now().getDayOfMonth();
  // }

  public boolean isAnniversay() {
    LocalDate today = LocalDate.now();
    return joinDate.getMonth().equals(today.getMonth())
        && joinDate.getDayOfMonth() == today.getDayOfMonth();
  }

  public double monthlyFee() {
    double monthlyFee = 50;
    GymMemberTier tier = this.getMemberTier();
    if (tier.equals(GymMemberTier.DIAMOND)) {
      monthlyFee *= 0.7;
    } else if (tier.equals(GymMemberTier.EMERALD) || tier.equals(GymMemberTier.RUBY)) {
      monthlyFee *= 0.85;
    }
    return monthlyFee;
  }

  public void checkIn(LocalDate date) {
    LocalDate[] newHistory = new LocalDate[this.checkInHistory.length + 1];
    for (int i = 0; i < checkInHistory.length; i++) {
      newHistory[i] = this.checkInHistory[i];
    }
    newHistory[newHistory.length - 1] = date;
    this.checkInHistory = newHistory;
  }

  public static void main(String[] args) {
    GymMember m1 = new GymMember("Grog", 69, 1.69, LocalDate.of(2024, 3, 7));

    System.out.println("BMI: " + m1.bmi() + " (" + m1.getBmiStatus() + ")");
    System.out.println("Anniversary? " + m1.isAnniversay());
    System.out.println("Membership Tier: " + m1.getMemberTier() + " (" + m1.getMemberTier().getDesc() + ")");
    System.out.println("Monthly Membership Fee: $ " + m1.monthlyFee());

    m1.checkIn(LocalDate.of(2026, 2, 10));
    m1.checkIn(LocalDate.of(2026, 2, 19));
    m1.checkIn(LocalDate.of(2026, 3, 1));
    m1.checkIn(LocalDate.now());
    for (int i = 0; i < m1.checkInHistory.length; i++) {
      System.out.println(m1.checkInHistory[i]);
    }
    ;

  }

}
