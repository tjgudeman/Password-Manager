import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;


public class LoginGUI extends JFrame{
	private JFrame frame;
	private JLabel top;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btn_lnError;
	private Login login;
	private DefaultScreenUI dsu;
	private String u, p;
	
	
	public LoginGUI() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(480, 245);
		frame.setResizable(false);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
		getContentPane().setBackground(new Color(255, 246, 230));
		getContentPane().setLayout(null);
		frame.add(getContentPane());
		
		JPanel nPanel = new JPanel();
		nPanel.setBounds(0, 0, 434, 56);
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
		lblUsername.setBounds(118, 102, 69, 14);
		getContentPane().add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(197, 99, 122, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setBounds(118, 133, 69, 14);
		getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(197, 130, 122, 20);
		getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("DialogInput", Font.BOLD, 13));
		btnLogin.setBackground(new Color(154, 202, 141));
		btnLogin.setBounds(245, 174, 102, 39);
		getContentPane().add(btnLogin);
		
		//Logic for Login Button
		btnLogin.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  setters();
				  login = new Login(u, p); //PAssing username and Password
				  String file = login.rotate(u);
				  String path = new String("C:\\PasswordManager\\master.pwm");
				  try {
					if(login.readFile(path, u, p) == true){
						btn_lnError.setVisible(false);
						dsu = new DefaultScreenUI(file);
						frame.dispose();
						PmMockupUI.host.dispose();
					  }
					else{
						btn_lnError.setVisible(true);
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			  } 
			} );
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("DialogInput", Font.BOLD, 13));
		btnCancel.setBackground(new Color(154, 202, 141));
		btnCancel.setBounds(97, 174, 102, 39);
		getContentPane().add(btnCancel);
		
		JLabel lblNewLabel = new JLabel("* Username and Password are both case sensitive");
		lblNewLabel.setForeground(new Color(100, 149, 237));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 63, 414, 14);
		getContentPane().add(lblNewLabel);
		btnCancel.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  frame.dispose();
				//  frame.setVisible(false); // **For debugging
			  } 
			} );
		
		// Handling error with a login item
		URL error = DefaultScreenUI.class.getResource("/otherJunk/error.png");
		ImageIcon all = new ImageIcon(error);
		btn_lnError = new JButton(all);
		btn_lnError.setBounds(329, 115, 20, 20);
		btn_lnError.setBackground(new Color(255, 246, 230));
		btn_lnError.setVisible(false);
		btn_lnError.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  JOptionPane.showMessageDialog(getContentPane(),
	  						"Either Username and Password are incorrect",
	  						"Error!",
	  						JOptionPane.INFORMATION_MESSAGE,
	  						new ImageIcon("otherJunk\\error.png"));
			  } 
			} );
		getContentPane().add(btn_lnError);
		
	}
	
	public void setters(){
		u = textField.getText();
		p = passwordField.getText();
	}
}
