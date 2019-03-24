package DurakGame;

import java.awt.desktop.SystemEventListener;

public enum StandardCardDeck {
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13),
    ACE(14);

    private int pow;
    StandardCardDeck(int power){
        this.pow = power;
    }
    int getPower(){
        return pow;
    }
}
