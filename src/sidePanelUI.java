import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.ScrollPaneConstants;


public class sidePanelUI {
	private JPanel sidePanel;
	
//	private JButton editButton;
	
	
	private JTextField passwordCTField;
	private JTextField accountNTField;
	private JTextField emailTField;
	private JTextField passwordTField;
	private JButton editButton;
	private JLabel descripLabel;
	private JLabel accountNLabel;
	private JLabel emailLabel;
	private JLabel passwordLabel;
	private JLabel passwordCLabel;
	private JPanel EditPanel;
	private JTextField descripTField;
	private String key;
	private String category;
	private String f;
	private DataDriver dd;
	
	public void setters(String filename, String an, String e, String p, String d, String c, String k) {
		accountNTField.setText(an);
		emailTField.setText(e);
		passwordTField.setText(p);
		passwordCTField.setText(p);
		descripTField.setText(d);
		
		f = filename;
		category = c;
		key = k;
		
		accountNTField.setEditable(false);
		emailTField.setEditable(false);
		passwordTField.setEditable(false);
		passwordCTField.setEditable(false);
		descripTField.setEditable(false);
//		editButton.setEnabled(true);
		
		EditPanel.setVisible(false);
		
		
	}
	public JTextField getPasswordCTField() {
		return passwordCTField;
	}

	public void setPasswordCTField(JTextField passwordCTField) {
		this.passwordCTField = passwordCTField;
	}

	public JTextField getAccountNTField() {
		return accountNTField;
	}

	public void setAccountNTField(String accountNTField) {
		this.accountNTField.setText(accountNTField);
	}

	public JTextField getEmailTField() {
		return emailTField;
	}

	public void setEmailTField(JTextField emailTField) {
		this.emailTField = emailTField;
	}

	public JTextField getPasswordTField() {
		return passwordTField;
	}

	public void setPasswordTField(JTextField passwordTField) {
		this.passwordTField = passwordTField;
	}

	public JTextField getDescripTField() {
		return descripTField;
	}

	public void setDescripTField(JTextField descripTField) {
		this.descripTField = descripTField;
	}

	public sidePanelUI(){
		sidePanel = new JPanel();
		sidePanel.setForeground(new Color(0, 0, 0));
		sidePanel.setBorder(new TitledBorder(new LineBorder(
						    new Color(0, 0, 0), 2, true), "Details", 
						    TitledBorder.LEFT, TitledBorder.TOP, 
						    null, new Color(0, 0, 0)));
		sidePanel.setBounds(10, 20, 205, 396);
		sidePanel.setBackground(new Color(255, 246, 230));
		sidePanel.setLayout(null);
		
		JPanel viewPanel = new JPanel();
		viewPanel.setBounds(9, 21, 186, 257);
		viewPanel.setBackground(new Color(255, 246, 230));
		sidePanel.add(viewPanel);
		viewPanel.setLayout(null);
		
		editButton = new JButton("Edit");
		editButton.setEnabled(false);
		editButton.setBounds(0, 19, 57, 23);
		
		viewPanel.add(editButton);
		
		descripLabel = new JLabel("Description:");
		descripLabel.setBounds(0, 155, 83, 14);
		viewPanel.add(descripLabel);
		
		accountNLabel = new JLabel("Account Name:");
		accountNLabel.setBounds(0, 53, 97, 14);
		viewPanel.add(accountNLabel);
		
		accountNTField = new JTextField();
		accountNTField.setEditable(false);
		accountNTField.setColumns(10);
		accountNTField.setBounds(0, 68, 132, 20);
		viewPanel.add(accountNTField);
		
		emailLabel = new JLabel("Email:");
		emailLabel.setBounds(0, 99, 83, 14);
		viewPanel.add(emailLabel);
		
		emailTField = new JTextField();
		emailTField.setEditable(false);
		emailTField.setColumns(10);
		emailTField.setBounds(0, 117, 132, 20);
		viewPanel.add(emailTField);
		
		passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(0, 211, 83, 14);
		viewPanel.add(passwordLabel);
		
		passwordTField = new JTextField();
		passwordTField.setEditable(false);
		passwordTField.setColumns(10);
		passwordTField.setBounds(0, 226, 132, 20);
		viewPanel.add(passwordTField);
		
		descripTField = new JTextField();
		descripTField.setEditable(false);
		descripTField.setBounds(0, 180, 132, 20);
		viewPanel.add(descripTField);
		descripTField.setColumns(10);
		
		EditPanel = new JPanel();
		EditPanel.setBounds(9, 289, 185, 92);
		EditPanel.setVisible(false);
		EditPanel.setBackground(new Color(255, 246, 230));
		sidePanel.add(EditPanel);
		EditPanel.setLayout(null);
		
		passwordCLabel = new JLabel("Confirm Password:");
		passwordCLabel.setBounds(0, 0, 132, 14);
		EditPanel.add(passwordCLabel);
		
		passwordCTField = new JTextField();
		passwordCTField.setBounds(0, 13, 132, 20);
		EditPanel.add(passwordCTField);
		passwordCTField.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(0, 59, 89, 23);
		btnSave.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dd = new DataDriver();
				try {
					accountNTField.setEditable(false);
					emailTField.setEditable(false);
					passwordTField.setEditable(false);
					passwordCTField.setEditable(false);
					descripTField.setEditable(false);
					editButton.setEnabled(true);
					
					editButton.setEnabled(false);
					EditPanel.setVisible(false);
					dd.editData(f, accountNTField.getText(),
					emailTField.getText(),
					passwordTField.getText(),
					descripTField.getText(),
					category,
					key);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		EditPanel.add(btnSave);
		
		editButton.addMouseListener(new mListener());
	}
	
	
	public JPanel getPanel(){
		sidePanel.setVisible(true);
		return sidePanel;
	}
	
	public class mListener implements MouseListener{

		public void mouseClicked(MouseEvent e) {
			Object src = e.getSource();
			
			if(src == editButton){
				descripTField.setEditable(true);
				descripTField.setOpaque(true);
				accountNTField.setEditable(true);
				emailTField.setEditable(true);
				passwordTField.setEditable(true);
				EditPanel.setVisible(true);
				passwordCTField.setEditable(true);
			}
			
		}


		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}


		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}


		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
}

