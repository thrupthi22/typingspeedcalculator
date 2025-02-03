package swingdemo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TypingSpeedCalculator extends JFrame {
    private JLabel textLabel;
    private JTextField textField;
    private JButton calculateButton;

    public TypingSpeedCalculator() {
        setTitle("Typing Speed Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textLabel = new JLabel("Enter the text to type:");
        textField = new JTextField(20);
        calculateButton = new JButton("Calculate");

        calculateButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                int charactersTyped = text.length();
                int wordsTyped = text.split("\\s+").length;

                // Perform calculations and display the results
                // You can use the same logic as in the previous example

                JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersTyped + " characters per second.");
                JOptionPane.showMessageDialog(null, "You typed " + wordsTyped + " words.");
            }
        });

        add(textLabel);
        add(textField);
        add(calculateButton);

        getContentPane().setBackground(new Color(255, 0, 255)); // Set the background color to magenta

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            public void run() {
                new TypingSpeedCalculator();
            }
        });
    }
}