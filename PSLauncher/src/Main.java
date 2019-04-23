import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.io.IOException;


public class Main {
    static JFrame mainFrame = getFrame();


    public static void main(String[] args) throws IOException  {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        mainFrame.setSize(1200 + 16, 600 + 39);
        mainFrame.setLocation(dim.width / 2 - mainFrame.getSize().width / 2, dim.height / 2 - mainFrame.getSize().height / 2);


        //Панель кнопок
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        mainFrame.add(buttonPanel, BorderLayout.EAST);

        //Для сдвига всех кнопок по вертикали - второй параметр (по умолчанию 30)
        buttonPanel.add(Box.createRigidArea(new Dimension(1, 30)));

        // кнопка play.
        JButton playButton = new JButton("Играть") {
            {
                setSize(100, 50);
                setMaximumSize(getSize());
            }
        };
        buttonPanel.add(playButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(1, 10)));


        // кнопка Options
        JButton optionButton = new JButton("Опции") {
            {
                setSize(100, 50);
                setMaximumSize(getSize());
            }
        };
        buttonPanel.add(optionButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(1, 10)));


        // кнопка Наша Группа
        JButton vkGroupButton = new JButton("Группа ВК") {
            {
                setSize(100, 50);
                setMaximumSize(getSize());
            }
        };
        vkGroupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        desktop.browse(new URI("https://vk.com/projectspaceteam"));
                    } catch (Exception e1) {
                        e1.getMessage();
                    }
                }
            }
        });
        buttonPanel.add(vkGroupButton);


        // revalidate для отрисовки в случае багов
        mainFrame.revalidate();
        buttonPanel.revalidate();

    }

    static JFrame getFrame() {


        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setResizable(false);


        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        return jFrame;
    }

}
