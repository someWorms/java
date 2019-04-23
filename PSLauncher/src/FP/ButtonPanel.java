package FP;

import buttons.*;

import javax.swing.*;
import java.awt.*;

public class ButtonPanel {
    public JPanel bPanel = getPanel();


    private JPanel getPanel() {
        JPanel buttonPanel = new JPanel();

        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

        buttonPanel.add(Box.createRigidArea(new Dimension(1, 30)));
        buttonPanel.add(new PlayButton().play);

        buttonPanel.add(Box.createRigidArea(new Dimension(1, 10)));
        buttonPanel.add(new VKGroupButton().vk);

        buttonPanel.add(Box.createRigidArea(new Dimension(1, 10)));
        buttonPanel.add(new OptionsButton().options);

        buttonPanel.add(Box.createRigidArea(new Dimension(1, 10)));
        buttonPanel.add(new ExitButton().exit);
        return buttonPanel;
    }
}
