import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task3 {
    private JFrame frame;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JTextField usernameTextField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel resultLabel;

    public task3() {
        // Create the frame
        frame = new JFrame("Login GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // Create and add the username label
        usernameLabel = new JLabel("Username:");
        frame.add(usernameLabel);

        // Create and add the username text field
        usernameTextField = new JTextField(15);
        frame.add(usernameTextField);

        // Create and add the password label
        passwordLabel = new JLabel("Password:");
        frame.add(passwordLabel);

        // Create and add the password field
        passwordField = new JPasswordField(15);
        frame.add(passwordField);

        // Create and add the login button
        loginButton = new JButton("Login");
        frame.add(loginButton);

        // Create and add the result label
        resultLabel = new JLabel();
        frame.add(resultLabel);

        // Add action listener to the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameTextField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals("test") && password.equals("123")) {
                    resultLabel.setText("Credentials Verified");
                } else {
                    resultLabel.setText("Credentials not Verified");
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
                task3 loginGUI = new task3();
                loginGUI.show();
            }
        });
    }
}
