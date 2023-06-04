import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class task1 {
 public static void main(String[] args)
 {
	 JFrame frame = new JFrame("Add Two Numbers");
	 JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));
	 JTextField textField1 = new JTextField(10);
	 JTextField textField2 = new JTextField(10);
	 JLabel resultLabel = new JLabel("");
	 panel.add(new JLabel("Enter first number:"));
	 panel.add(textField1);
	 panel.add(new JLabel("Enter second number:"));
	 panel.add(textField2);
	 panel.add(new JLabel("Result:"));
	 panel.add(resultLabel);
	 JButton addButton = new JButton("Add");
	 addButton.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
	 
	 try {
	 int num1 = Integer.parseInt(textField1.getText());
	 int num2 = Integer.parseInt(textField2.getText());
	 int sum = num1 + num2;
	 resultLabel.setText(String.valueOf(sum));
	 } catch (NumberFormatException ex) {
	 resultLabel.setText("Invalid input");
	 }
	 }
	 });
	 frame.add(panel, BorderLayout.CENTER);
	 frame.add(addButton, BorderLayout.SOUTH);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.pack();
	 frame.setVisible(true);
 }
 }