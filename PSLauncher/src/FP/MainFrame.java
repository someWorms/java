package FP;
import javax.swing.*;
import java.awt.*;

public class MainFrame{
    public MainFrame() {
        JFrame jFrame = new JFrame();

        jFrame.setVisible(true);
        jFrame.setResizable(false);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame.setSize(1200 + 16, 600 + 39);
        jFrame.setLocation(dim.width / 2 - jFrame.getSize().width / 2, dim.height / 2 - jFrame.getSize().height / 2);

        jFrame.add(new ButtonPanel().bPanel, BorderLayout.EAST);



        jFrame.revalidate();
    }
}
