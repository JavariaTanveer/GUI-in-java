import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task4 {
    private JFrame frame;
    private JTextField number1TextField;
    private JTextField number2TextField;
    private JButton divideButton;
    private JButton checkArrayButton;
    private JLabel resultLabel;

    public task4() {
        // Create the frame
        frame = new JFrame("Exception Handling GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // Create and add the number 1 label
        JLabel number1Label = new JLabel("Number 1:");
        frame.add(number1Label);

        // Create and add the number 1 text field
        number1TextField = new JTextField(10);
        frame.add(number1TextField);

        // Create and add the number 2 label
        JLabel number2Label = new JLabel("Number 2:");
        frame.add(number2Label);

        // Create and add the number 2 text field
        number2TextField = new JTextField(10);
        frame.add(number2TextField);

        // Create and add the divide button
        divideButton = new JButton("Divide");
        frame.add(divideButton);

        // Create and add the check array button
        checkArrayButton = new JButton("Check Array");
        frame.add(checkArrayButton);

        // Create and add the result label
        resultLabel = new JLabel();
        frame.add(resultLabel);

        // Add action listener to the divide button
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int number1 = Integer.parseInt(number1TextField.getText());
                    int number2 = Integer.parseInt(number2TextField.getText());
                    int result = number1 / number2;
                    resultLabel.setText("Result: " + result);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(frame, "Arithmetic Exception: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input format", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Exception occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Add action listener to the check array button
        checkArrayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int[] arr = {1, 2, 3, 4, 5};
                    int index = Integer.parseInt(number1TextField.getText());
                    int element = arr[index];
                    resultLabel.setText("Array element at index " + index + ": " + element);
                } catch (ArrayIndexOutOfBoundsException ex) {
                    JOptionPane.showMessageDialog(frame, "Array Index Out of Bounds: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input format", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Exception occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public void show() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                task4 gui = new task4();
                gui.show();
            }
        });
    }
}
