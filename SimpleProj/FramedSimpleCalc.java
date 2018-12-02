

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class FramedSimpleCalc {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                CalcFrame frame = new CalcFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //frame.setPreferredSize(new Dimension(200, 300));
                frame.setVisible(true);
            }
        });
    }

}
class CalcFrame extends JFrame{
    public CalcFrame() {
        setTitle("Калькулятор");
        CalcPanel panel = new CalcPanel();
        add(panel);
        pack();

    }
}

class CalcPanel extends JPanel{
    public CalcPanel(){
        setLayout(new BorderLayout());

        res = 0;
        last = "=";
        start = true;


        display = new JButton("0");
        display.setEnabled(false);
        add(display, BorderLayout.NORTH);

        ActionListener ins = new InsertAction();
        ActionListener command = new CommandAct();

        panel = new JPanel();
        panel.setLayout(new GridLayout(4,4));

        addButton("7", ins);
        addButton("8", ins);
        addButton("9", ins);
        addButton("/", command);

        addButton("4", ins);
        addButton("5", ins);
        addButton("6", ins);
        addButton("*", command);

        addButton("1", ins);
        addButton("2", ins);
        addButton("3", ins);
        addButton("-", command);

        addButton("0", ins);
        addButton(".", ins);
        addButton("=", command);
        addButton("+", command);

        add(panel, BorderLayout.CENTER);

    }

    private void addButton(String label, ActionListener listener){
        JButton button = new JButton(label);
        button.addActionListener(listener);
        panel.add(button);
    }

    private class InsertAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String input = e.getActionCommand();
            if (start){
                display.setText("");
                start = false;
            }
            display.setText(display.getText() + input);
        }
    }
    private class CommandAct implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();
            if (start){
                if (cmd.equals("-")){
                    display.setText(cmd);
                    start = false;
                }else last = cmd;
            }else {
                calc(Double.parseDouble(display.getText()));
                last = cmd;
                start = true;
            }
        }
    }




    public void calc(double x){
       switch (last){
           case "+": res +=x; break;
           case "-": res -=x; break;
           case "*": res *=x; break;
           case "/": res /=x; break;
           case "=": res =x; break;
       }
        display.setText(" " + res);
    }

    private double res;
    private String last;
    private boolean start;
    private JButton display;
    private JPanel panel;
}


