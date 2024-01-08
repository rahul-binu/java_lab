import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class SumCalculator implements ActionListener {

    JFrame f;
    JTextField t1, t2, t3;

    public SumCalculator() {
        f = new JFrame("Sum Calculator");
        JLabel l = new JLabel("Enter First Number");
        JLabel l2 = new JLabel("Enter Second Number");
        JTextArea ta = new JTextArea("hai");

        t1 = new JTextField("0");
        t2 = new JTextField("0");
        t3 = new JTextField("0");
        JButton b = new JButton("SUM");

        l.setBounds(100, 70, 100, 20);
        l2.setBounds(200, 70, 100, 20);
        t1.setBounds(100, 100, 100, 20);
        t2.setBounds(200, 100, 100, 20);
        t3.setBounds(100, 200, 200, 20);
        b.setBounds(150, 150, 80, 20);
        ta.setBounds(300, 300, 50, 20);

        b.addActionListener(this); // Register the ActionListener

        f.add(l);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b);
        f.add(l2);
        f.add(ta);
        f.setSize(800, 800);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == ("SUM")) {
            String fNo = t1.getText();
            String sNo = t2.getText();
            int n1 = Integer.parseInt(fNo);
            int n2 = Integer.parseInt(sNo);
            int res = n1 + n2;
            // JOptionPane.showMessageDialog(f, "SUM: " + res);
            // String resData = Integer.parseString(res);
            // ta.append(resData) ;
            // append for text area;
            t3.setText("SUM : " + Integer.toString(res) + "\n");
        }
    }

    public static void main(String arg[]) {
        new SumCalculator();
    }
}
