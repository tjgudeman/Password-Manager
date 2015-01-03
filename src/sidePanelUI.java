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

import javax.swing.ScrollPaneConstants;


public class sidePanelUI {
	private JPanel sidePanel;
	
//	private JButton editButton;
	
	
	private JTextField passwordCTField;
	private JTextField accountNTField;
	private JTextField userNTField;
	private JTextField emailTField;
	private JTextField passwordTField;
	private JButton editButton;
	private JLabel descripLabel;
	private JLabel accountNLabel;
	private JLabel userNLabel;
	private JLabel emailLabel;
	private JLabel passwordLabel;
	private JScrollPane descriptionScrollPane;
	private JTextArea descripTField;
	private JLabel passwordCLabel;
	private JPanel EditPanel;
	
	
	public sidePanelUI(){
		sidePanel = new JPanel();
		sidePanel.setForeground(new Color(0, 0, 0));
		sidePanel.setBorder(new TitledBorder(new LineBorder(
						    new Color(0, 0, 0), 2, true), "Details", 
						    TitledBorder.LEFT, TitledBorder.TOP, 
						    null, new Color(0, 0, 0)));
		sidePanel.setBounds(10, 46, 205, 484);
		sidePanel.setBackground(new Color(255, 246, 230));
		sidePanel.setLayout(null);
		
		JPanel viewPanel = new JPanel();
		viewPanel.setBounds(9, 21, 186, 303);
		viewPanel.setBackground(new Color(255, 246, 230));
		sidePanel.add(viewPanel);
		viewPanel.setLayout(null);
		
		editButton = new JButton("Edit");
		editButton.setBounds(0, 19, 57, 23);
		
		viewPanel.add(editButton);
		
		descripLabel = new JLabel("Description:");
		descripLabel.setBounds(0, 53, 83, 14);
		viewPanel.add(descripLabel);
		
		accountNLabel = new JLabel("Account Name:");
		accountNLabel.setBounds(0, 120, 97, 14);
		viewPanel.add(accountNLabel);
		
		accountNTField = new JTextField();
		accountNTField.setEditable(false);
		accountNTField.setColumns(10);
		accountNTField.setBounds(0, 135, 132, 20);
		viewPanel.add(accountNTField);
		
		userNLabel = new JLabel("User Name:");
		userNLabel.setBounds(0, 166, 83, 14);
		viewPanel.add(userNLabel);
		
		userNTField = new JTextField();
		userNTField.setEditable(false);
		userNTField.setColumns(10);
		userNTField.setBounds(0, 180, 132, 20);
		viewPanel.add(userNTField);
		
		emailLabel = new JLabel("Email:");
		emailLabel.setBounds(0, 211, 83, 14);
		viewPanel.add(emailLabel);
		
		emailTField = new JTextField();
		emailTField.setEditable(false);
		emailTField.setColumns(10);
		emailTField.setBounds(0, 229, 132, 20);
		viewPanel.add(emailTField);
		
		passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(0, 260, 83, 14);
		viewPanel.add(passwordLabel);
		
		passwordTField = new JTextField();
		passwordTField.setEditable(false);
		passwordTField.setColumns(10);
		passwordTField.setBounds(0, 274, 132, 20);
		viewPanel.add(passwordTField);
		
		descriptionScrollPane = new JScrollPane();
		descriptionScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		descriptionScrollPane.setBounds(0, 66, 186, 43);
		viewPanel.add(descriptionScrollPane);
		
		descripTField = new JTextArea();
		descripTField.setEditable(false);
		descripTField.setOpaque(false);
		descripTField.setLineWrap(true);
		descriptionScrollPane.setViewportView(descripTField);
		
		EditPanel = new JPanel();
		EditPanel.setBounds(10, 323, 185, 138);
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
		btnSave.setBounds(0, 104, 89, 23);
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
				userNTField.setEditable(true);
				emailTField.setEditable(true);
				passwordTField.setEditable(true);
				EditPanel.setVisible(true);
			}
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
}

