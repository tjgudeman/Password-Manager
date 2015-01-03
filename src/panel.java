import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSlider;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Font;


public class panel extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	public panel() {
		getContentPane().setLayout(null);
		
		JPanel naPanel = new JPanel();
	    naPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "New Account", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
	    naPanel.setBounds(224, 11, 589, 484);
	    naPanel.setBackground(new Color(255, 246, 230));
		getContentPane().add(naPanel);
		naPanel.setLayout(null);
		
		JLabel lblAccountName = new JLabel("Account Name: ");
		lblAccountName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAccountName.setBounds(52, 53, 88, 14);
		naPanel.add(lblAccountName);
		
		textField = new JTextField();
		textField.setBounds(150, 50, 170, 20);
		naPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(94, 119, 46, 14);
		naPanel.add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setBounds(150, 116, 170, 20);
		naPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setBounds(70, 187, 70, 14);
		naPanel.add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConfirmPassword.setBounds(37, 246, 103, 14);
		naPanel.add(lblConfirmPassword);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescription.setBounds(63, 307, 77, 14);
		naPanel.add(lblDescription);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(150, 307, 170, 123);
		naPanel.add(textPane);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(150, 184, 170, 20);
		naPanel.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(150, 243, 170, 20);
		naPanel.add(passwordField_1);
		
		JLabel lblCategory = new JLabel("Category:\r\n");
		lblCategory.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCategory.setBounds(351, 53, 57, 14);
		naPanel.add(lblCategory);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mail", "Social", "Shopping", "Banking", "Users", "Work/Edu", "Other"}));
		comboBox.setBounds(418, 50, 124, 20);
		naPanel.add(comboBox);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBackground(Color.WHITE);
		panel.setBounds(330, 144, 249, 286);
		naPanel.add(panel);
		panel.setLayout(null);
		
		JCheckBox chckbxLowerCase = new JCheckBox("lower case");
		chckbxLowerCase.setBackground(Color.WHITE);
		chckbxLowerCase.setBounds(6, 17, 97, 23);
		panel.add(chckbxLowerCase);
		
		JCheckBox chckbxUpperCase = new JCheckBox("upper case");
		chckbxUpperCase.setBackground(Color.WHITE);
		chckbxUpperCase.setBounds(6, 56, 97, 23);
		panel.add(chckbxUpperCase);
		
		JCheckBox chckbxNumbers = new JCheckBox("numbers");
		chckbxNumbers.setBackground(Color.WHITE);
		chckbxNumbers.setBounds(6, 95, 97, 23);
		panel.add(chckbxNumbers);
		
		JCheckBox chckbxSpecialCharacters = new JCheckBox("special characters");
		chckbxSpecialCharacters.setBackground(Color.WHITE);
		chckbxSpecialCharacters.setBounds(6, 132, 111, 23);
		panel.add(chckbxSpecialCharacters);
		
		JLabel lblLength = new JLabel("Length");
		lblLength.setHorizontalAlignment(SwingConstants.CENTER);
		lblLength.setBounds(6, 169, 174, 14);
		panel.add(lblLength);
		
		JSlider slider = new JSlider();
		slider.setBackground(Color.WHITE);
		slider.setBounds(6, 194, 174, 23);
		panel.add(slider);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(190, 197, 49, 20);
		panel.add(textField_3);
		
		JLabel lblPassword_1 = new JLabel("Password: ");
		lblPassword_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword_1.setBounds(6, 247, 59, 14);
		panel.add(lblPassword_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(75, 244, 164, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblPasswordGenerator = new JLabel("Password Generator");
		lblPasswordGenerator.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasswordGenerator.setBounds(351, 119, 191, 14);
		naPanel.add(lblPasswordGenerator);
		
		JButton button = new JButton("Cancel");
		button.setFont(new Font("DialogInput", Font.BOLD, 13));
		button.setBackground(new Color(154, 202, 141));
		button.setBounds(150, 434, 102, 39);
		naPanel.add(button);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("DialogInput", Font.BOLD, 13));
		btnSubmit.setBackground(new Color(154, 202, 141));
		btnSubmit.setBounds(351, 434, 102, 39);
		naPanel.add(btnSubmit);
	}
}
