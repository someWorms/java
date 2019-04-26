package buttons;

import FP.MainFrame;
import FP.RNGFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RNGGen {
    private int n;

    public JButton generate = getButton();

    private  JButton getButton() {
        JButton button = new JButton("Generate");
        button.setSize(100, 50);
        button.setMaximumSize(button.getSize());

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n++;//(int)Math.random()*40000;
                System.out.println(n);

            }
        });

        return button;

    }
    public String getGen(){
        String s = String.valueOf(n);
        return s;
    }
}
