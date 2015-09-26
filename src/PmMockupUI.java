import javax.swing.*;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//*** Opening Screen ***

public class PmMockupUI extends JFrame{
	private JLabel welcome;
	private JLabel about;
	private LoginGUI liView;
	private SignUpGUI sugView;
	public static JFrame host;
	
	public PmMockupUI() {
		host = new JFrame();
		host.setSize(480, 533);
		host.setResizable(false);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		host.setLocation(dim.width/2-host.getSize().width/2, dim.height/2-host.getSize().height/2);
		host.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel nPanel = new JPanel();
		host.getContentPane().add(nPanel, BorderLayout.NORTH);
		nPanel.setBackground(new Color(100, 160, 206));
		
		JPanel cPanel = new JPanel();
		cPanel.setBackground(new Color(255, 246, 230));
		host.getContentPane().add(cPanel, BorderLayout.CENTER);
		
		welcome = new JLabel("<html>Welcome to your Password<br>Manager</html>");
		welcome.setHorizontalAlignment(SwingConstants.CENTER);
		welcome.setFont(new Font("Sans Serif", Font.PLAIN, 35));
		welcome.setForeground(Color.white);
		nPanel.add(welcome);
		cPanel.setLayout(null);
		
		about = new JLabel("<html><p style = \"width:454;\">"
							   + "This Program functions as a password manager. "
							   + "You will enter your information for a desired account, and the program "
							   + "will store the information along with the accounts password. So you only"
							   + " need to remember one master password.</p></html>");
		about.setBounds(20, 11, 454, 132);
		about.setFont(new Font("Serif", Font.PLAIN, 18));
		about.setForeground(Color.black);
		cPanel.add(about);
		
		JButton btnLogIn = new JButton("Login");
		btnLogIn.setFont(new Font("DialogInput", Font.BOLD, 13));
		btnLogIn.setBounds(295, 326, 119, 54);
		btnLogIn.setBackground(new Color(154, 202, 141));
		cPanel.add(btnLogIn);
		host.setVisible(true);
		this.setVisible(false);
		
		//Login user. Launch LoginGUI
		btnLogIn.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
	
				  //getContentPane().setVisi ble(false);
				  //Where we need to hide window
				  liView = new LoginGUI();
			  } 
			} );
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setFont(new Font("DialogInput", Font.BOLD, 13));
		btnSignUp.setBounds(50, 326, 119, 54);
		btnSignUp.setBackground(new Color(154, 202, 141));
		cPanel.add(btnSignUp);
		
		//Create new sign up
		btnSignUp.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {	 
				  sugView = new SignUpGUI();
			  } 
			} );	
	}
}
