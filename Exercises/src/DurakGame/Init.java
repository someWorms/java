package DurakGame;

public class Init {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if(size == 54 | size == 36)
        this.size = size;
        else{
            this.size = 36;
            System.out.println("Колода установлена по умолчанию...");
        }
    }

    void deckSize(){
        Shuffle shuffle = new Shuffle();
    }
}
