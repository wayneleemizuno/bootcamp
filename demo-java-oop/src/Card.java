public class Card {
  private int rank; // 1-13
  private Suite suite; // DIAMOND, HEART, SPADE, CLUB

  public Card(int rank, Suite suite) {
    this.rank = rank;
    this.suite = suite;
  }

  public int getRank() {
    return this.rank;
  }

  public Suite getSuite() {
    return this.suite;
  }

}
