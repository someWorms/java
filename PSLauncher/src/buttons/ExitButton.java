package buttons;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitButton {
    public JButton exit = getButton();

    private JButton getButton() {
        JButton button = new JButton("Выход");
        button.setSize(100, 50);
        button.setMaximumSize(button.getSize());

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (JOptionPane.showConfirmDialog(null, "Вы уверены?", "Выход", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        return button;

    }
}
