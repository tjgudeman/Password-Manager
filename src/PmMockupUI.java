import javax.swing.*;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class PmMockupUI extends JFrame{
	private JLabel welcome;
	private JLabel about;
	private LoginGUI liView;
	private SignUpGUI sugView;
	
	public PmMockupUI() {
		this.setSize(480, 533);
		this.setResizable(false);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel nPanel = new JPanel();
		getContentPane().add(nPanel, BorderLayout.NORTH);
		nPanel.setBackground(new Color(100, 160, 206));
		
		JPanel cPanel = new JPanel();
		cPanel.setBackground(new Color(255, 246, 230));
		getContentPane().add(cPanel, BorderLayout.CENTER);
		
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
		btnLogIn.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  liView = new LoginGUI();
//				  sugView.dispose();
			  } 
			} );
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setFont(new Font("DialogInput", Font.BOLD, 13));
		btnSignUp.setBounds(50, 326, 119, 54);
		btnSignUp.setBackground(new Color(154, 202, 141));
		cPanel.add(btnSignUp);
		btnSignUp.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  sugView = new SignUpGUI();
			  } 
			} );	
	}
}
