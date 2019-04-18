package banking;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Init {
    public Init() {
        JFrame entryMenuFrame = new JFrame("Banking");
        entryMenuFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        entryMenuFrame.setLayout(null);
        entryMenuFrame.setVisible(true);
        entryMenuFrame.setSize(600, 800);
        entryMenuFrame.setResizable(false);
        entryMenuFrame.setLocationRelativeTo(null);


        JButton buttonStart = new JButton("Start Game");
        buttonStart.setBounds(10, 700, 100, 50);
        entryMenuFrame.add(buttonStart);

        JButton buttonExit = new JButton("Exit Game");
        //ну блять как эта ебаная кнопка высчитывает поозицию
        buttonExit.setBounds(475, 700, 100, 50);
        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (JOptionPane.showConfirmDialog(entryMenuFrame, "Confirm your exit", "Banking", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                    System.exit(0);
            }
        });
        entryMenuFrame.add(buttonExit);

    }


}
