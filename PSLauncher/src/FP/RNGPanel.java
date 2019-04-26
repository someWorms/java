package FP;

import buttons.RNGGen;

import javax.swing.*;


public class RNGPanel {
    public JPanel randPanel = getPanel();


    private JPanel getPanel() {
        JPanel rngPanel = new JPanel();

        rngPanel.setLayout(new BoxLayout(rngPanel, BoxLayout.X_AXIS));


        rngPanel.add(new RNGGen().generate);
        rngPanel.revalidate();
        return  rngPanel;

    }
}
