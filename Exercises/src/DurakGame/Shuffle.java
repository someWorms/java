package DurakGame;

public class Shuffle {
    Shuffle() {
        this.deckSize = init.getSize();
    }

    Init init = new Init();
    int deckSize;

    void doShuffle(StandardCardDeck[] cards) {
        StandardCardDeck[] shuffled = new StandardCardDeck[cards.length];


        int[] collector = new int[cards.length];
        for (int i = 0; i < cards.length; i++) {

            int x = (int) (Math.random() * cards.length);

            //idk how it works but it works
            for (int j = 0; j <= i; ) {
                if (collector[j] == x) {
                    x = (int) (Math.random() * cards.length);
                    j = 0;
                }else {
                    j++;
                }
            }
            shuffled[i] = cards[x];
            collector[i] = x;


            System.out.println(shuffled[i] + " номер коллектора " + collector[i]);

        }
    }
}
