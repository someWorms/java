package DurakGame;

public class Init {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size == 54 | size == 36) {
            this.size = size;
            generateStandartDeck();
        } else {
            this.size = 36;
            System.out.println("Колода установлена по умолчанию...");
        }
    }

    void generateStandartDeck() {

        CardSuits suitDiamonds = CardSuits.DIAMONDS;
        CardSuits suitSpades = CardSuits.SPADES;
        CardSuits suitClubs = CardSuits.CLUBS;
        CardSuits suitHearts = CardSuits.HEARTS;

        StandardCardDeck scdSix = StandardCardDeck.SIX;
        StandardCardDeck scdSeven = StandardCardDeck.SEVEN;
        StandardCardDeck scdEight = StandardCardDeck.EIGHT;
        StandardCardDeck scdNine = StandardCardDeck.NINE;
        StandardCardDeck scdTen = StandardCardDeck.TEN;
        StandardCardDeck scdJack = StandardCardDeck.JACK;
        StandardCardDeck scdQueen = StandardCardDeck.QUEEN;
        StandardCardDeck scdKing = StandardCardDeck.KING;
        StandardCardDeck scdAce = StandardCardDeck.ACE;

        StandardCardDeck[] diamondDeck = new StandardCardDeck[]{
                scdSix, scdSeven, scdEight,
                scdNine, scdTen, scdJack,
                scdQueen, scdKing, scdAce
        };
        StandardCardDeck[] spadesDeck = new StandardCardDeck[]{
                scdSix, scdSeven, scdEight,
                scdNine, scdTen, scdJack,
                scdQueen, scdKing, scdAce
        };
        StandardCardDeck[] clubsDeck = new StandardCardDeck[]{
                scdSix, scdSeven, scdEight,
                scdNine, scdTen, scdJack,
                scdQueen, scdKing, scdAce
        };
        StandardCardDeck[] heartsDeck = new StandardCardDeck[]{
                scdSix, scdSeven, scdEight,
                scdNine, scdTen, scdJack,
                scdQueen, scdKing, scdAce
        };

        toShuffle(diamondDeck);


    }


    void toShuffle(StandardCardDeck[] dD) {
        Shuffle shuffle = new Shuffle();
        shuffle.doShuffle(dD);
    }
}
