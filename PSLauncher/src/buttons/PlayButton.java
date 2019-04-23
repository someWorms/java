package buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class PlayButton {
    public JButton play = getButton();
    private String defaultPath = System.getProperty("user.home");

    private JButton getButton(){
        JButton button = new JButton("Играть");
        button.setSize(100,50);
        button.setMaximumSize(button.getSize());
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Desktop.isDesktopSupported()){
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        desktop.open(new File(defaultPath + "AppData\\Roaming\\minecraft.exe"));  // ПОКА НЕ РАБОТАЕТ!!
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });

        return button;
    }
}
