package FP;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainFrame {
    public MainFrame() {
        JFrame jFrame = new JFrame();
        JMenuBar jMenuBar = new JMenuBar();


        //Основной фрейм
        jFrame.setVisible(true);
        jFrame.setResizable(false);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame.setSize(1200 + 16, 600 + 39);
        jFrame.setLocation(dim.width / 2 - jFrame.getSize().width / 2, dim.height / 2 - jFrame.getSize().height / 2);


        jFrame.add(new ImagePanel());

        jFrame.add(new ButtonPanel().bPanel, BorderLayout.EAST);

        //Бар Меню

        JMenu file = new JMenu("File");
        JMenu options = new JMenu("Options");
        file.add(new JMenuItem("Open"));

        JMenuItem devTools = file.add(new JMenuItem("Dev Tools"));
        devTools.setEnabled(false);
        file.add(new JMenuItem("DevTools"));

        file.addSeparator();
        JMenu games = new JMenu("Games");
        //games.add("Random Number");
        JMenuItem randNum = games.add(new JMenuItem("Random Number"));
        randNum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RNGFrame();
            }
        });
        games.add("Click me");
        file.add(games);
        file.addSeparator();
        JMenuItem exit = file.add(new JMenuItem("Exit", 'E'));
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        exit.setAccelerator(KeyStroke.getKeyStroke("ctrl E"));


        jMenuBar.add(file);
        jMenuBar.add(options);
        jFrame.setJMenuBar(jMenuBar);


        jFrame.revalidate();
    }

    class ImagePanel extends JPanel {

        Image image;

        public ImagePanel() {
            image = Toolkit.getDefaultToolkit().createImage("D:\\Development\\Java\\Git\\PSLauncher\\images\\KBINTF7VVZCCBHJR7JQGFWVP7Q.gif");
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (image != null) {
                g.drawImage(image, 0, 0, this);
            }
        }

    }

}
