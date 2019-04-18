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


        JButton buttonStart = new JButton("Enter your account");
        buttonStart.setBounds(10, 700, 100, 50);
        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField username = new JTextField();
                JPasswordField password = new JPasswordField();
                Object[] message = {"Username:", username,
                        "Password:", password
                };
                int login = JOptionPane.showConfirmDialog(entryMenuFrame, message, "Login", JOptionPane.OK_CANCEL_OPTION);


                //Check for correct n database.

            }
        });
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
    //Добавить loginMenu
    //Добавить Db
}