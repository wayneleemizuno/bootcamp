public class Deck {
  private Card[] cards;

  public Deck() {
    this.cards = new Card[13 * Suite.values().length];
    int idx = 0;
    for (int i = 1; i <= 13; i++) {
      for (Suite suite : Suite.values()) {
        this.cards[idx] = new Card(i, suite);
        idx++;
      }
    }
  }

  public Card[] getCards() {
    return this.cards;
  }

  // shuffle (random)

  // Class -> 5-card combination -> boolean

  public static void main(String[] args) {

  }

}
