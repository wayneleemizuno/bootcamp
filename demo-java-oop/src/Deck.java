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
  public void shuffle() {
    for (int i = 0; i < cards.length; i++) {
      int randomIdx = (int) Math.floor(Math.random() * cards.length);
      Card temp = cards[i];
      cards[i] = cards[randomIdx];
      cards[randomIdx] = temp;
    }

  }

  // Class -> 5-card combination -> boolean

  public static void main(String[] args) {
    Deck deck1 = new Deck();
    deck1.shuffle();

    for (int i = 0; i < deck1.cards.length; i++) {
      System.out.println(deck1.cards[i].getRank() + " " +
          deck1.cards[i].getSuite());
    }

  }

}
