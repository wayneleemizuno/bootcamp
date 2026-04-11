public enum GymMemberTier {
  OPAL(1, "Entry Level"), //
  SAPPHIRE(2, "Standard"), //
  RUBY(3, "Premium"), //
  EMERALD(4, "Exclusive"), //
  DIAMOND(5, "Ultimate"); //

  private int value;
  private String desc;

  private GymMemberTier(int value, String desc) {
    this.value = value;
    this.desc = desc;
  }

  public int getValue() {
    return this.value;
  }

  public String getDesc() {
    return this.desc;
  }
}
