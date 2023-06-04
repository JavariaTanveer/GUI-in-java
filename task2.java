import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task2 {
    private JFrame frame;
    private JLabel label;
    private JTextField textField;
    private JButton showButton;
    private JButton exitButton;
    private int arraySize;

    public task2(int size) {
        arraySize = size;

        // Create the frame
        frame = new JFrame("GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // Create and add the label
        label = new JLabel("Enter Text:");
        frame.add(label);

        // Create and add the text field
        textField = new JTextField(20);
        frame.add(textField);

        // Create and add the show button
        showButton = new JButton("Show");
        frame.add(showButton);

        // Create and add the exit button
        exitButton = new JButton("Exit");
        frame.add(exitButton);

        // Add action listeners to the buttons
        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String inputText = textField.getText();
                    if (inputText.length() > arraySize) {
                        throw new Exception("Input length exceeds array size");
                    }
                    textField.setText("Showing Text in the Text Field: " + inputText);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Exit button Clicked", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public void show() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        int arraySize = 10; // Set the desired array size

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                task2 gui = new task2(arraySize);
                gui.show();
            }
        });
    }
}
