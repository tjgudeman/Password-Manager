import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;


public class WelcomePanelUI {
	private JPanel welcomePanel;
	
	public WelcomePanelUI(){
		welcomePanel = new JPanel();
		welcomePanel.setForeground(new Color(0, 0, 0));
		welcomePanel.setBorder(new TitledBorder(new LineBorder(
						    new Color(0, 0, 0), 2, true), "Welcome", 
						    TitledBorder.LEFT, TitledBorder.TOP, 
						    null, new Color(0, 0, 0)));
		welcomePanel.setBounds(10, 46, 205, 484);
		welcomePanel.setBackground(new Color(255, 246, 230));
		welcomePanel.setLayout(null);
		
		JLabel howToLabel = new JLabel("How-to Create New Account");
		howToLabel.setBounds(10, 24, 185, 22);
		welcomePanel.add(howToLabel);
		
		JTextArea howToTextArea = new JTextArea();
		howToTextArea.setWrapStyleWord(true);
		howToTextArea.setLineWrap(true);
		howToTextArea.setBackground(new Color(255, 246, 230));
		howToTextArea.setText("1. To create an account, click on the plus sign in the upper hand tool bar, or under the drop down menu \"Account\", go to \"Add Account\" and select the account you want to create.\r\n\r\n2. Fill in the necessary information. Remember, a description is not required, but is recommended.\r\n\r\n3. Once you have filled out all the necessary information, click save.");
		howToTextArea.setEditable(false);
		howToTextArea.setBounds(10, 57, 185, 382);
		welcomePanel.add(howToTextArea);
		
	}
	
	public JPanel getPanel(){
		welcomePanel.setVisible(true);
		return welcomePanel;
	}
}
