package buttons;

import javax.swing.*;

public class PlayButton {
    public JButton play = getButton();

    private JButton getButton(){
        JButton button = new JButton("Играть");
        button.setSize(100,50);
        button.setMaximumSize(button.getSize());

        return button;
    }
}
