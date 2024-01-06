import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AreaOfCircle extends JFrame {
    private JTextField radiusTextField;
    private JLabel resultLabel;

    public AreaOfCircle() {
        setTitle("Circle Area Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JLabel radiusLabel = new JLabel("Enter Radius:");
        radiusTextField = new JTextField(10);
        JButton calculateButton = new JButton("Calculate");
        resultLabel = new JLabel("Area: ");

        // Set layout
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Add components to the frame
        add(radiusLabel);
        add(radiusTextField);
        add(calculateButton);
        add(resultLabel);

        // Add action listener to the button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateArea();
            }
        });
    }

    private void calculateArea() {
        try {
            // Get the radius from the text field
            double radius = Double.parseDouble(radiusTextField.getText());

            // Calculate the area of the circle (π * r * r)
            double area = Math.PI * Math.pow(radius, 2);

            // Display the result in the label
            resultLabel.setText("Area: " + String.format("%.2f", area));
        } catch (NumberFormatException ex) {
            // Handle the case where the input is not a valid number
            resultLabel.setText("Invalid input. Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        // Create and show the GUI
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AreaOfCircle().setVisible(true);
            }
        });
    }
}
