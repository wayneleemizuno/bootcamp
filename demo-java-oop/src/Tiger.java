public class Tiger {
  private Colour colour;

  public Tiger(Colour colour) {
    this.colour = colour;
  }

  public void setColour(Colour colour) {
    this.colour = colour;
  }

  public Colour getColour() {
    return this.colour;
  }

  public static void main(String[] args) {
    Tiger tiger1 = new Tiger(Colour.WHITE);

    if (tiger1.getColour() == Colour.WHITE) {
      System.out.println("It's a " + Colour.WHITE.toString().toLowerCase() + " tiger!");
    }

  }
}
