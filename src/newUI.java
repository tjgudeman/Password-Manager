import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class newUI{
	private JPanel naPanel;
	private JComboBox comboBox;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> origin/master
	private JCheckBox chckbxLowerCase;
	private JCheckBox chckbxUpperCase;
	private JCheckBox chckbxNumbers;
	private JCheckBox chckbxSpecialCharacters;
	private JTextField gp_field;
	private JTextField pl_field;
	private Password pw;
<<<<<<< HEAD
=======
>>>>>>> 7cd740c21442231b53eed16657774e9f6d85b8f1
=======
>>>>>>> origin/master
>>>>>>> fa41949a09fa10d0f3cf3cd4cd68d5de505acf16
>>>>>>> 0feb6e793c2980dccd3f720995334ce2f37cefb6
	
	public newUI(){
		naPanel = new JPanel();
		naPanel.setVisible(true);
	    naPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "New Account", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
	    naPanel.setBounds(225, 46, 589, 484);
	    naPanel.setBackground(new Color(255, 246, 230));
		naPanel.setLayout(null);
		
		JLabel lblAccountName = new JLabel("Account Name: ");
		lblAccountName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAccountName.setBounds(37, 53, 103, 14);
		naPanel.add(lblAccountName);
		
		JTextField an_field = new JTextField();
		an_field.setBounds(150, 50, 170, 20);
		naPanel.add(an_field);
		an_field.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(94, 119, 46, 14);
		naPanel.add(lblEmail);
		
		JTextField e_field = new JTextField();
		e_field.setBounds(150, 116, 170, 20);
		naPanel.add(e_field);
		e_field.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setBounds(70, 187, 70, 14);
		naPanel.add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConfirmPassword.setBounds(10, 246, 130, 14);
		naPanel.add(lblConfirmPassword);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescription.setBounds(63, 307, 77, 14);
		naPanel.add(lblDescription);
		
		JPasswordField p_field = new JPasswordField();
		p_field.setBounds(150, 184, 170, 20);
		naPanel.add(p_field);
		
		JPasswordField cp_field = new JPasswordField();
		cp_field.setBounds(150, 243, 170, 20);
		naPanel.add(cp_field);
		
		JLabel lblCategory = new JLabel("Category:\r\n");
		lblCategory.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCategory.setBounds(351, 53, 57, 14);
		naPanel.add(lblCategory);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mail", "Social", "Shopping", "Banking", "Users", "Work/Edu", "Other"}));
		comboBox.setBounds(418, 50, 124, 20);
		naPanel.add(comboBox);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBackground(Color.WHITE);
		panel.setBounds(330, 144, 249, 286);
		naPanel.add(panel);
		panel.setLayout(null);
		
		chckbxLowerCase = new JCheckBox("lower case");
		chckbxLowerCase.setBackground(Color.WHITE);
		chckbxLowerCase.setBounds(6, 17, 97, 23);
		panel.add(chckbxLowerCase);
		
		chckbxUpperCase = new JCheckBox("upper case");
		chckbxUpperCase.setBackground(Color.WHITE);
		chckbxUpperCase.setBounds(6, 43, 97, 23);
		panel.add(chckbxUpperCase);
		
		chckbxNumbers = new JCheckBox("numbers");
		chckbxNumbers.setBackground(Color.WHITE);
		chckbxNumbers.setBounds(6, 69, 97, 23);
		panel.add(chckbxNumbers);
		
		chckbxSpecialCharacters = new JCheckBox("special characters");
		chckbxSpecialCharacters.setBackground(Color.WHITE);
		chckbxSpecialCharacters.setBounds(6, 95, 174, 23);
		panel.add(chckbxSpecialCharacters);
		
		JLabel lblLength = new JLabel("Length:");
		lblLength.setHorizontalAlignment(SwingConstants.CENTER);
		lblLength.setBounds(6, 139, 49, 14);
		panel.add(lblLength);
		
		pl_field = new JTextField();
		pl_field.setColumns(10);
		pl_field.setBounds(52, 136, 49, 20);
		panel.add(pl_field);
		
		JLabel lblPassword_1 = new JLabel("Password: ");
		lblPassword_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword_1.setBounds(6, 247, 71, 14);
		panel.add(lblPassword_1);
		
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> origin/master
		gp_field = new JTextField();
		gp_field.setBounds(83, 244, 156, 20);
		panel.add(gp_field);
		gp_field.setColumns(10);
<<<<<<< HEAD
=======
		JTextField textField_4 = new JTextField();
		textField_4.setBounds(83, 244, 156, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
>>>>>>> 7cd740c21442231b53eed16657774e9f6d85b8f1
=======
>>>>>>> origin/master
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(150, 307, 170, 116);
		naPanel.add(editorPane);
		
		JButton btnGenerate = new JButton("Generate");
		btnGenerate.setFont(new Font("DialogInput", Font.BOLD, 13));
		btnGenerate.setBounds(6, 184, 233, 33);
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pw = new Password();
				String genPass = pw.generateNewPassword(getChckbxLowerCase(), getChckbxUpperCase(), 
														getChckbxNumbers(), getChckbxSpecialCharacters(), getPLength());
				gp_field.setText(genPass);
			}
		});
		panel.add(btnGenerate);
		
		JLabel lblPasswordGenerator = new JLabel("Password Generator");
		lblPasswordGenerator.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasswordGenerator.setBounds(351, 119, 191, 14);
		naPanel.add(lblPasswordGenerator);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("DialogInput", Font.BOLD, 13));
		btnCancel.setBackground(new Color(154, 202, 141));
		btnCancel.setBounds(185, 434, 102, 39);
		naPanel.add(btnCancel);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSubmit.setFont(new Font("DialogInput", Font.BOLD, 13));
		btnSubmit.setBackground(new Color(154, 202, 141));
		btnSubmit.setBounds(404, 434, 102, 39);
		naPanel.add(btnSubmit);
	}
	
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> origin/master
	public boolean getChckbxLowerCase(){
		if(chckbxLowerCase.isSelected() == true){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean getChckbxUpperCase(){
		if(chckbxUpperCase.isSelected() == true){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean getChckbxNumbers(){
		if(chckbxNumbers.isSelected() == true){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean getChckbxSpecialCharacters(){
		if(chckbxSpecialCharacters.isSelected() == true){
			return true;
		}
		else{
			return false;
		}
	}
	
	public int getPLength(){
		String s = pl_field.getText();
		int pass = Integer.parseInt(s);
		return pass;
	}
	
	
<<<<<<< HEAD
=======
>>>>>>> 7cd740c21442231b53eed16657774e9f6d85b8f1
=======
>>>>>>> origin/master
>>>>>>> fa41949a09fa10d0f3cf3cd4cd68d5de505acf16
>>>>>>> 0feb6e793c2980dccd3f720995334ce2f37cefb6
	public JPanel getPanel(){
		naPanel.setVisible(true);
		return naPanel;
	}
	
	public void Visible(boolean b) {
		naPanel.setVisible(b);
		
	}
	
	public void setStatus(String s){
		comboBox.setSelectedItem(s);
	}

}
