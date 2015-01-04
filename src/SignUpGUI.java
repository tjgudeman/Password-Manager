import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JSlider;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class SignUpGUI extends JFrame{
	private JFrame frame;
	private JLabel top;
	private JLabel about;
	private JTextField fn_field;
	private String fn;
	private JTextField ln_field;
	private String ln;
	private JTextField e_field;
	private String e;
	private JTextField re_field;
	private String re;
	private JPasswordField p_field;
	private String p;
	private JPasswordField cp_field;
	private String cp;
	private JTextField un_field;
	private String un;
	private JProgressBar progressBar;
	private SignUp su;
	private Password pClass;
	private JButton btn_cpError;
	private JButton btn_reError;
	private JButton btn_eError;
	private JButton btn_fnError;
	private JButton btn_unError;
	private JButton btn_unError2;
	private JButton btn_lnError;
	private JButton btn_pError;
	private boolean accountTest;
	

	public SignUpGUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame = new JFrame();
		frame.setVisible(true);
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 5));
		getContentPane().setBackground(new Color(255, 246, 230));
		frame.setSize(522, 503);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
		getContentPane().setLayout(null);
		
		JPanel nPanel = new JPanel();
		nPanel.setBounds(0, 0, 506, 56);
		getContentPane().add(nPanel);
		nPanel.setBackground(new Color(100, 160, 206));
		
		top = new JLabel("Sign Up");
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("Sans Serif", Font.PLAIN, 35));
		top.setForeground(Color.white);
		nPanel.add(top);
		
		about = new JLabel("To get started with your account, please fill out the following form.");
		about.setHorizontalAlignment(SwingConstants.CENTER);
		about.setBounds(0, 56, 506, 20);
		about.setFont(new Font("Tahoma", Font.PLAIN, 14));
		about.setForeground(new Color(0, 0, 0));
		getContentPane().add(about);

/***********************************************************************************************
 *********************************First Name Components*****************************************
 ***********************************************************************************************/
		
		JLabel lblFirstName = new JLabel("* First Name:");
		lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstName.setBounds(46, 108, 81, 14);
		getContentPane().add(lblFirstName);
		
		fn_field = new JTextField();
		fn_field.setBounds(140, 105, 102, 20);
		getContentPane().add(fn_field);
		fn_field.setColumns(10);
		
/***********************************************************************************************
 *********************************Last Name Components******************************************
 ***********************************************************************************************/		

		JLabel lblLastName = new JLabel("* Last Name: ");
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setBounds(257, 108, 81, 14);
		getContentPane().add(lblLastName);
		
		ln_field = new JTextField();
		ln_field.setBounds(348, 105, 112, 20);
		getContentPane().add(ln_field);
		ln_field.setColumns(10);
		
/***********************************************************************************************
 *********************************Email Components**********************************************
 ***********************************************************************************************/	
		
		JLabel lblEmail = new JLabel("* Email: ");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(46, 156, 81, 14);
		getContentPane().add(lblEmail);
		
		e_field = new JTextField();
		e_field.setBounds(140, 153, 320, 20);
		getContentPane().add(e_field);
		e_field.setColumns(10);
		
		JLabel lblrEmail = new JLabel("Recovery Email: ");
		lblrEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblrEmail.setBounds(27, 205, 100, 14);
		getContentPane().add(lblrEmail);
		
		re_field = new JTextField();
		re_field.setBounds(140, 202, 320, 20);
		getContentPane().add(re_field);
		re_field.setColumns(10);
		
/***********************************************************************************************
 *********************************Password Components*******************************************
 ***********************************************************************************************/
		
		JLabel lblPassword = new JLabel("* Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setBounds(46, 302, 81, 14);
		getContentPane().add(lblPassword);
		
		JLabel lblPasswordStrength = new JLabel("Password Strength");
		lblPasswordStrength.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasswordStrength.setBounds(331, 282, 146, 14);
		getContentPane().add(lblPasswordStrength);
		
		p_field = new JPasswordField();
		p_field.setBounds(140, 299, 146, 20);
		getContentPane().add(p_field);
		progressBar = new JProgressBar();
		p_field.getDocument().addDocumentListener(new DocumentListener(){
			public void changedUpdate(DocumentEvent e) {
                updateLabel(e);
            }

            public void insertUpdate(DocumentEvent e) {
                updateLabel(e);
            }

            public void removeUpdate(DocumentEvent e) {
                updateLabel(e);
            }

            private void updateLabel(DocumentEvent e) {
//            	pClass = new Password(p);
    
            	
            }
        });
		
		JLabel lblConfirmPassword = new JLabel("* Confirm Password:");
		lblConfirmPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConfirmPassword.setBounds(10, 352, 117, 14);
		getContentPane().add(lblConfirmPassword);
		
		cp_field = new JPasswordField();
		cp_field.setBounds(140, 349, 146, 20);
		getContentPane().add(cp_field);
		
/***********************************************************************************************
 *********************************Sign Up btn Components****************************************
 ***********************************************************************************************/
		
		JButton btnSignUP = new JButton("Sign Up");
		btnSignUP.setFont(new Font("DialogInput", Font.BOLD, 13));
		btnSignUP.setBackground(new Color(154, 202, 141));
		btnSignUP.setBounds(294, 403, 102, 39);
		getContentPane().add(btnSignUP);
		btnSignUP.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent ae) {
				setters();
				if (AccountTest() == true){
					su.AccountCreate(fn, ln, e, re, p, un);
					frame.dispose();
					
					JOptionPane.showMessageDialog(getContentPane(),
		  			"Hello " + fn + "!\n" +
		  			"Thank you for creating an account!\n" +
		  			"Please Login with your username and password.",
		  			"Welcome!",
		  			JOptionPane.INFORMATION_MESSAGE,
		  			new ImageIcon("otherJunk\\like3.png"));
				}
			  } 
			} );
		
/***********************************************************************************************
 *********************************User name Components******************************************
 ***********************************************************************************************/
		
		JLabel lblUsername = new JLabel("* Username:");
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setBounds(46, 254, 81, 14);
		getContentPane().add(lblUsername);
		
		un_field = new JTextField();
		un_field.setBounds(140, 251, 146, 20);
		getContentPane().add(un_field);
		un_field.setColumns(10);
		
/***********************************************************************************************
 *********************************Cancel btn Components*****************************************
 ***********************************************************************************************/
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("DialogInput", Font.BOLD, 13));
		btnCancel.setBackground(new Color(154, 202, 141));
		btnCancel.setBounds(140, 403, 102, 39);
		btnCancel.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  frame.dispose();
			  } 
			} );
		getContentPane().add(btnCancel);
		
/***********************************************************************************************
 *********************************Error btns Components*****************************************
 ***********************************************************************************************/
		
		btn_lnError = new JButton(new ImageIcon("otherJunk\\error.png"));
		btn_lnError.setBounds(472, 105, 20, 20);
		btn_lnError.setBackground(new Color(255, 246, 230));
		btn_lnError.setVisible(false);
		btn_lnError.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  JOptionPane.showMessageDialog(getContentPane(),
	  						"Please enter your last name.",
	  						"Error!",
	  						JOptionPane.INFORMATION_MESSAGE,
	  						new ImageIcon("otherJunk\\error.png"));
			  } 
			} );
		getContentPane().add(btn_lnError);
		
		btn_unError = new JButton(new ImageIcon("otherJunk\\error.png"));
		btn_unError.setBounds(298, 251, 20, 20);
		btn_unError.setBackground(new Color(255, 246, 230));
		btn_unError.setVisible(false);
		btn_unError.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  JOptionPane.showMessageDialog(getContentPane(),
	  						"Please enter a username.",
	  						"Error!",
	  						JOptionPane.INFORMATION_MESSAGE,
	  						new ImageIcon("otherJunk\\error.png"));
			  } 
			} );
		getContentPane().add(btn_unError);
		
		btn_unError2 = new JButton(new ImageIcon("otherJunk\\error.png"));
		btn_unError2.setBounds(298, 251, 20, 20);
		btn_unError2.setBackground(new Color(255, 246, 230));
		btn_unError2.setVisible(false);
		btn_unError2.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  JOptionPane.showMessageDialog(getContentPane(),
	  						"Username is unavailable, please enter a different one.",
	  						"Error!",
	  						JOptionPane.INFORMATION_MESSAGE,
	  						new ImageIcon("otherJunk\\error.png"));
			  } 
			} );
		getContentPane().add(btn_unError2);
		
		btn_eError = new JButton(new ImageIcon("otherJunk\\error.png"));
		btn_eError.setBounds(472, 153, 20, 20);
		btn_eError.setBackground(new Color(255, 246, 230));
		btn_eError.setVisible(false);
		btn_eError.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  JOptionPane.showMessageDialog(getContentPane(),
	  						"Please enter a valid email address.",
	  						"Error!",
	  						JOptionPane.INFORMATION_MESSAGE,
	  						new ImageIcon("otherJunk\\error.png"));
			  } 
			} );
		getContentPane().add(btn_eError);
		
		btn_reError = new JButton(new ImageIcon("otherJunk\\error.png"));
		btn_reError.setBounds(472, 202, 20, 20);
		btn_reError.setBackground(new Color(255, 246, 230));
		btn_reError.setVisible(false);
		btn_reError.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  JOptionPane.showMessageDialog(getContentPane(),
	  						"Please enter a valid recovery email address.",
	  						"Error!",
	  						JOptionPane.INFORMATION_MESSAGE,
	  						new ImageIcon("otherJunk\\error.png"));
			  } 
			} );
		getContentPane().add(btn_reError);
		
		btn_fnError = new JButton(new ImageIcon("otherJunk\\error.png"));
		btn_fnError.setBounds(247, 105, 20, 20);
		btn_fnError.setBackground(new Color(255, 246, 230));
		btn_fnError.setVisible(false);
		btn_fnError.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  JOptionPane.showMessageDialog(getContentPane(),
	  						"Please enter your first name.",
	  						"Error!",
	  						JOptionPane.INFORMATION_MESSAGE,
	  						new ImageIcon("otherJunk\\error.png"));
			  } 
			} );
		getContentPane().add(btn_fnError);
		
		btn_pError = new JButton(new ImageIcon("otherJunk\\error.png"));
		btn_pError.setBounds(298, 299, 20, 20);
		btn_pError.setBackground(new Color(255, 246, 230));
		btn_pError.setVisible(false);
		btn_pError.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  JOptionPane.showMessageDialog(getContentPane(),
						  						"Please enter a password.",
						  						"Error!",
						  						JOptionPane.INFORMATION_MESSAGE,
						  						new ImageIcon("otherJunk\\error.png"));
			  } 
			} );
		getContentPane().add(btn_pError);
		
		btn_cpError = new JButton(new ImageIcon("otherJunk\\error.png"));
		btn_cpError.setBounds(298, 299, 20, 20);
		btn_cpError.setBackground(new Color(255, 246, 230));
		btn_cpError.setVisible(false);
		btn_cpError.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  JOptionPane.showMessageDialog(getContentPane(),
						  						"Passwords do not match.",
						  						"Error!",
						  						JOptionPane.INFORMATION_MESSAGE,
						  						new ImageIcon("otherJunk\\error.png"));
			  } 
			} );
		getContentPane().add(btn_cpError);
		
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setMinimum(0);
		progressBar.setMaximum(3);
		progressBar.setBounds(331, 302, 146, 14);
		getContentPane().add(progressBar);
		
		JLabel lblRequired = new JLabel("* required");
		lblRequired.setHorizontalAlignment(SwingConstants.CENTER);
		lblRequired.setForeground(Color.BLACK);
		lblRequired.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblRequired.setBounds(0, 77, 506, 20);
		getContentPane().add(lblRequired);
		
		frame.add(getContentPane());
	}

	public void setters(){
		fn = fn_field.getText();
		ln = ln_field.getText();
		e = e_field.getText();
		re = re_field.getText();
		p = p_field.getText();
		cp = cp_field.getText();
		un = un_field.getText();
	}
	
	public Boolean AccountTest(){
		su = new SignUp(fn, ln, e, re, p, cp, un);
	  	if (su.isPasswordTest() == false){
	  		btn_pError.setVisible(true);
	  	}
	  	else{
	  		btn_pError.setVisible(false);
			if(su.isPasswordConfirmTest() == false){
				btn_cpError.setVisible(true);
			}
			else{
				btn_cpError.setVisible(false);
			}
	  	}
		
		if(su.isEmailRecoveryTest() == false){
			btn_reError.setVisible(true);
		}
		else{
			btn_reError.setVisible(false);
		}
		
		if(su.isEmailTest() == false){
			btn_eError.setVisible(true);
		}
		else{
			btn_eError.setVisible(false);
		}
		
		if(su.isFirstNameTest() == false){
			btn_fnError.setVisible(true);
		}
		else{
			btn_fnError.setVisible(false);
			
		}
		
		if(su.isLastNameTest() == false){
			btn_lnError.setVisible(true);
		}
		else{
			btn_lnError.setVisible(false);
		}
		if(su.isUsernameTest() == false){
			btn_unError.setVisible(true);
		}
		else{
			btn_unError.setVisible(false);
		}
		if(su.UserCheck() == false){
			btn_unError2.setVisible(true);
		}
		else{
			btn_unError2.setVisible(false);
		}
		
		if(su.isPasswordTest() && su.isPasswordConfirmTest() && su.isEmailRecoveryTest()
		   && su.isEmailTest() && su.isFirstNameTest() && su.isLastNameTest()
		   && su.isUsernameTest() && su.UserCheck()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String getFn(){
		return fn;
	}
	
	public String getLn() {
		return ln;
	}

	public String getE() {
		return e;
	}

	public String getRe() {
		return re;
	}

	public String getP() {
		return p;
	}

	public String getCp() {
		return cp;
	}

	public String getUn() {
		return un;
	}
}
