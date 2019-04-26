package FP;

import buttons.RNGGen;

import javax.swing.*;
import java.awt.*;


public class RNGFrame {

    public RNGFrame() {
        JFrame jFrame = new JFrame();
//        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//        for (String s : fonts)
//            System.out.println(s);



        jFrame.setVisible(true);
        jFrame.setResizable(false);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame.setSize(600 + 16, 400 + 39);
        jFrame.setLocation(dim.width / 2 - jFrame.getSize().width / 2, dim.height / 2 - jFrame.getSize().height / 2);

        jFrame.add(new RNGPanel().randPanel, BorderLayout.SOUTH);
        jFrame.add(new rngComponent());
        jFrame.revalidate();



    }
    static class rngComponent extends JComponent{
        @Override
        protected void paintComponent(Graphics g) {
            Font f = new Font("Serif", Font.BOLD, 30);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setFont(f);
            g2d.drawString(new RNGGen().getGen(), 100, 50);

        }
    }
}
