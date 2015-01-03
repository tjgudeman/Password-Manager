import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;


public class LoginGUI extends JFrame{
	private JLabel top;
	private JTextField textField;
	private JPasswordField passwordField;
<<<<<<< HEAD
	private Login login;
	private DefaultScreenUI dsu;
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
	private Login login;
	private DefaultScreenUI dsu;
>>>>>>> 0feb6e793c2980dccd3f720995334ce2f37cefb6
	private String un;
	private String pass;
<<<<<<< HEAD
=======
	private DefaultScreenUI launch;
	private SignUpGUI sugView = new SignUpGUI();
>>>>>>> parent of cc973a0... Class update
=======
>>>>>>> origin/master
<<<<<<< HEAD
=======
>>>>>>> fa41949a09fa10d0f3cf3cd4cd68d5de505acf16
>>>>>>> 0feb6e793c2980dccd3f720995334ce2f37cefb6
	public LoginGUI() {
		launch = new DefaultScreenUI();
		this.setSize(480, 245);
		this.setResizable(false);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		getContentPane().setBackground(new Color(255, 246, 230));
		getContentPane().setLayout(null);
		
		JPanel nPanel = new JPanel();
		nPanel.setBounds(0, 0, 474, 56);
		getContentPane().add(nPanel);
		nPanel.setBackground(new Color(100, 160, 206));
		
		top = new JLabel();
		top = new JLabel("Login");
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("Sans Serif", Font.PLAIN, 35));
		top.setForeground(Color.white);
		nPanel.add(top);
		
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setBounds(130, 88, 69, 14);
		getContentPane().add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(209, 85, 122, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setBounds(130, 125, 69, 14);
		getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(209, 122, 122, 20);
		getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("DialogInput", Font.BOLD, 13));
		btnLogin.setBackground(new Color(154, 202, 141));
		btnLogin.setBounds(245, 153, 102, 39);
		getContentPane().add(btnLogin);
		btnLogin.addActionListener(new ActionListener() { 
<<<<<<< HEAD
			  public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
//				  Check log-in credentials
//				  login = new Login(/* Username and Password */);
				  dsu = new DefaultScreenUI();
				  frame.dispose();
=======
>>>>>>> 0feb6e793c2980dccd3f720995334ce2f37cefb6
				  un = textField.getText();
				  pass = passwordField.getText();
<<<<<<< HEAD
=======
			  public void actionPerformed(ActionEvent e) { 
				  launch.setVisible(true);
				  setVisible(false);
				  sugView.setVisible(false);
>>>>>>> parent of cc973a0... Class update
=======
>>>>>>> origin/master
<<<<<<< HEAD
=======
>>>>>>> fa41949a09fa10d0f3cf3cd4cd68d5de505acf16
>>>>>>> 0feb6e793c2980dccd3f720995334ce2f37cefb6
				  
				  login = new Login(un, pass);
				  frame.dispose();
			  } 
			} );
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("DialogInput", Font.BOLD, 13));
		btnCancel.setBackground(new Color(154, 202, 141));
		btnCancel.setBounds(122, 153, 102, 39);
		getContentPane().add(btnCancel);
		btnCancel.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
<<<<<<< HEAD
				  frame.dispose();
<<<<<<< HEAD
=======
				  setVisible(false);
				 // PmMockupUI.setVisible(false);
>>>>>>> parent of cc973a0... Class update
=======
>>>>>>> origin/master
			  } 
			} );
	}
}
