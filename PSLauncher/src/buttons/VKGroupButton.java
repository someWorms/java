package buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class VKGroupButton {
    public JButton vk = getButton();

    @SuppressWarnings("exeption")
    private JButton getButton(){
        JButton button = new JButton("Группа ВК");
        button.setSize(100,50);
        button.setMaximumSize(button.getSize());
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Desktop.isDesktopSupported()){
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        desktop.browse(new URI("https://vk.com/projectspaceteam"));
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    } catch (URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });

        return button;
    }

}
