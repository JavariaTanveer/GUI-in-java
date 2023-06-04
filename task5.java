import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task5 {
    private JFrame frame;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public task5() {
        // Create the frame
        frame = new JFrame("Figure 6 GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.getContentPane().setLayout(null);

        // Create and add the text field 1 label
        JLabel label1 = new JLabel("Enter String :");
        label1.setBounds(44, 20, 79, 14);
        frame.getContentPane().add(label1);

        // Create and add the text field 1
        textField1 = new JTextField(20);
        textField1.setBounds(154, 20, 166, 20);
        frame.getContentPane().add(textField1);

        // Create and add the text field 2 label
        JLabel label2 = new JLabel("Enter Phone No:");
        label2.setBounds(44, 45, 136, 14);
        frame.getContentPane().add(label2);

        // Create and add the text field 2
        textField2 = new JTextField(20);
        textField2.setBounds(154, 45, 166, 20);
        frame.getContentPane().add(textField2);

        // Create and add the check phone button
        JButton checkPhoneButton = new JButton("Check Phn");
        checkPhoneButton.setBounds(150, 76, 83, 23);
        frame.getContentPane().add(checkPhoneButton);

        // Create and add the array exception button
        JButton arrayExceptionButton = new JButton("Array Exception");
        arrayExceptionButton.setBounds(243, 76, 109, 23);
        frame.getContentPane().add(arrayExceptionButton);
        
                // Create and add the get length button
                JButton getLengthButton = new JButton("GET LENGTH");
                getLengthButton.setBounds(44, 76, 93, 23);
                frame.getContentPane().add(getLengthButton);
                
                        // Add action listener to the get length button
                        getLengthButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    String text = textField1.getText();
                                    if (text.length() == 0) {
                                        throw new NullPointerException("String length is 0");
                                    }
                                    textField3.setText("Length: " + text.length());
                                } catch (NullPointerException ex) {
                                    JOptionPane.showMessageDialog(frame, "NullPointerException " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        });

        // Create and add the text field 3 label
        JLabel label3 = new JLabel("Answer : ");
        label3.setBounds(88, 113, 60, 14);
        frame.getContentPane().add(label3);

        // Create and add the text field 3
        textField3 = new JTextField(20);
        textField3.setBounds(179, 110, 166, 20);
        frame.getContentPane().add(textField3);

        // Add action listener to the check phone button
        checkPhoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String text = textField2.getText();
                    if (text.length() == 11) {
                        textField3.setText("Valid phone No");
                    } else {
                        throw new RuntimeException("Invalid phone No");
                    }
                } catch (RuntimeException ex) {
                    JOptionPane.showMessageDialog(frame, "RuntimeException: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Add action listener to the array exception button
        arrayExceptionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String text = textField1.getText();
                    char character = text.charAt(10);
                    textField3.setText("Char at index 10: " + character);
                } catch (StringIndexOutOfBoundsException ex) {
                    JOptionPane.showMessageDialog(frame, "StringIndexOutOfBoundsException: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
                task5 gui = new task5();
                gui.show();
            }
        });
    }
}
