package buttons;

import javax.swing.*;

public class OptionsButton {
    public JButton options = getButton();

    private JButton getButton(){
        JButton button = new JButton("Опции");
        button.setSize(100,50);
        button.setMaximumSize(button.getSize());

        return button;
    }

}
