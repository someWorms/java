package DurakGame;

public class Shuffle {
    Shuffle() {
        this.deckSize = init.getSize();
    }

    Init init = new Init();
    int deckSize;

    void doShuffle(StandardCardDeck[] cards) {
        StandardCardDeck[] shuffled = new StandardCardDeck[cards.length];

        int[] collector = new int[8];
        for (int i = 0; i < cards.length; i++) {

            int x = (int)(Math.random()*8);

            for (int j = 0; j < 8; j++) {
                if(collector[j] == x){
                    x = (int)(Math.random()*8);
                    j = 0;
                }else
                    break;
            }
            shuffled[i] = cards[x];
            collector[i]=x;


            System.out.println(shuffled[i] + " номер коллектора " + collector[i]);

        }
    }
}
