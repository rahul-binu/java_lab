import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialCalculator extends JFrame {
    private JTextField inputTextField, resultTextField;
    private JButton calculateButton;

    public FactorialCalculator() {
        // Set up the JFrame
        setTitle("Factorial Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        inputTextField = new JTextField(10);
        resultTextField = new JTextField(10);
        resultTextField.setEditable(false); // Make result field read-only
        calculateButton = new JButton("Calculate");

        // Set up layout
        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter a number: "));
        panel.add(inputTextField);
        panel.add(new JLabel("Factorial: "));
        panel.add(resultTextField);
        panel.add(calculateButton);

        // Add action listener to the button
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateFactorial();
            }
        });

        // Add panel to the frame
        add(panel);

        // Make the frame visible
        setVisible(true);
    }

    private void calculateFactorial() {
        // Get the input value from the text field
        int inputValue;
        try {
            inputValue = Integer.parseInt(inputTextField.getText());
        } catch (NumberFormatException ex) {
            inputValue = 0; // Default to 0 for invalid input
        }

        // Calculate factorial
        long factorialResult = calculateFactorialRecursive(inputValue);

        // Display result in the result text field
        resultTextField.setText(String.valueOf(factorialResult));
    }

    private long calculateFactorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorialRecursive(n - 1);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FactorialCalculator();
            }
        });
    }
}
