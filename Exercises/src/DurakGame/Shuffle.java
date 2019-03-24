package DurakGame;

public class Shuffle {
    Shuffle() {
        this.deckSize = init.getSize();
    }

    Init init = new Init();
    int deckSize;

    void doShuffle(StandardCardDeck[] cards) {
        StandardCardDeck[] shuffeled = new StandardCardDeck[cards.length];
        for (int i = 0; i < cards.length; i++) {
            shuffeled[i] = cards[i];
            //algorithm to shuffle cards
            System.out.println(shuffeled[i]);
        }

    }
}
