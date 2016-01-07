import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.*;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.JEditorPane;


//***Creates screen when first logged in
public class DefaultScreenUI extends JFrame {

	public static JPanel panel;
	private listUI listView;
	private JPanel listPanel;
	private JPanel newPanel;
	private newUI newView;
	private sidePanelUI sideView;
	private JPanel sidePanel;
	private WelcomePanelUI welcomeView;
	private JPanel welcomePanel;
	private JFrame frame;
	private JMenuBar menuBar;
	private String filename;
	private String path;
	

	public DefaultScreenUI(String filename) {
		path = "C:\\PasswordManager\\" + filename + ".pwm";
		frame = new JFrame();
		frame.setVisible(true);
		panel = new JPanel();
		welcomeView = new WelcomePanelUI();
		welcomePanel = welcomeView.getPanel();


		frame.getContentPane().add(welcomePanel);
		frame.getContentPane().add(panel);
		frame.setSize(830, 590);
		frame.getContentPane().setBackground(new Color(255, 246, 230));
		frame.setResizable(false);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height
				/ 2 - frame.getSize().height / 2);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

		frame.setBackground(new Color(100, 160, 206));
		frame.getContentPane().setLayout(null);

		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2,
				true), "Browser", TitledBorder.LEFT, TitledBorder.TOP, null,
				new Color(0, 0, 0)));
		
		
		panel.setBounds(225, 46, 589, 484);
		panel.setBackground(new Color(255, 246, 230));
		panel.setLayout(null);

		/**********************************Big Btn Components*******************************************/
		
		btnCreate("/big/mail.png", 40, 172, 99, 14, 245, 147, 43, 40, 64, 99, 97, "Mail" ); //Mail Btn
		
		btnCreate("/big/user.png", 40, 402, 99, 14, 76, 45, 169, 40, 295, 99, 96, "Users" ); //Users Btn
		
		btnCreate("/big/social.png", 178, 172, 99, 14, 245, 62, 43, 178, 64, 99, 97, "Social" ); //Social Btn
		
		btnCreate("/big/shop.png", 316, 172, 99, 14, 90, 186, 119, 316, 64, 99, 97, "Shopping" ); //Shopping Btn
		
		btnCreate("/big/bank.png", 454, 172, 99, 14, 36, 115, 149, 454, 64, 99, 97, "Banking" ); //Banking Btn
		
		btnCreate("/big/work.png", 178, 402, 99, 14, 123, 122, 123, 178, 295, 99, 96, "Work/Edu" ); //Work/Edu Btn
		
		btnCreate("/big/other.png", 316, 402, 99, 14, 189, 39, 124, 316, 295, 99, 96, "Other" ); // Other Btn
		
		btnCreate("/big/all.png", 454, 402, 99, 14, 236, 219, 49, 454, 295, 99, 96, "" ); //All Btn


		/**********************************Tool Bar Components*******************************************/
		
		URL homeUrl = DefaultScreenUI.class.getResource("/toolbar/home.png"); 
		ImageIcon home = new ImageIcon(homeUrl);

		URL newieUrl = DefaultScreenUI.class.getResource("/toolbar/add.png");
		ImageIcon newie = new ImageIcon(newieUrl);

		URL refreshUrl = DefaultScreenUI.class.getResource("/toolbar/refresh.png");
		ImageIcon refresh = new ImageIcon(refreshUrl);

		/**********************************Menu Bar Components*******************************************/

		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, frame.getWidth(), 15);

		/**************************************** File Menu *********************************************/
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);

		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.setIcon(new ImageIcon("menubar\\FileMenu\\logout8.png"));
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				PmMockupUI.host.setVisible(true);
				}});
		mnFile.add(mntmLogout);

		JMenuItem mntmExit = new JMenuItem("Exit");		
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				}});
				
		mnFile.add(mntmExit);
		
		/***********************************************************************************************
		 ********************************* Account Menu********************************************
		 ***********************************************************************************************/

		JMenu mnAccount = new JMenu("Account");
		menuBar.add(mnAccount);
		
		
		JMenu mnNewAccount = new JMenu("New Account");
		mnAccount.add(mnNewAccount);
		
		mnNewAccount.add(newJMI("Mail Account", "Mail", "menubar\\AccountMenu\\mail59.png"));
		
		mnNewAccount.add(newJMI("Social Account", "Social", "menubar\\AccountMenu\\social.png"));
		
		mnNewAccount.add(newJMI("Shopping Account", "Shopping", "menubar\\AccountMenu\\shopping232.png"));
		
		mnNewAccount.add(newJMI("Banking Account", "Banking", "menubar\\AccountMenu\\Banking.png"));
		
		mnNewAccount.add(newJMI("User Account", "Users", "menubar\\AccountMenu\\user.png"));
		
		mnNewAccount.add(newJMI("Work/Edu Account", "Work/Edu", "menubar\\AccountMenu\\university2.png"));
		
		mnNewAccount.add(newJMI("Other Account", "Other", null));

		
		/***********************************************************************************************
		 *************************************Help Menu*******************************************
		 ***********************************************************************************************/

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenuItem mntmHowto = new JMenuItem("How-To ");
        mntmHowto.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                        	JOptionPane.showMessageDialog(frame, "1. To create an account, "
                        			+ "click on the plus sign in the upper hand tool bar, or"
                        			+ " under the drop down menu \"Account\", go to \"Add Account\""
                        			+ " and select the account you want to create.\r\n\r\n2. "
                        			+ "Fill in the necessary information. Remember, a description "
                        			+ "is not required, but is recommended.\r\n\r\n3. Once you have"
                        			+ " filled out all the necessary information, click save.");

                        }
        });
        mntmHowto.setIcon(new ImageIcon("menubar\\HelpMenu\\howTo.png"));
        mnHelp.add(mntmHowto);
		JMenuItem mntmAbout = new JMenuItem("About ");
		mntmAbout.setIcon(new ImageIcon("menubar\\HelpMenu\\about.png"));
		mnHelp.add(mntmAbout);
		mntmAbout.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  JOptionPane.showMessageDialog(getContentPane(),
	  						"Hello there," + /*firstname*/  "\n" +
	  						"Password Manager is a program that is designed to\n" +
	  						"help you organize your different accounts and the corresponding\n" +
	  						"passwords for those accounts.\n\n" +
	  						
	  						"This will help you in the fact that\n" +
	  						"you won't have to remember all of your passwords.\n" +
	  						"Also, there is a password manager for when you cannot think\n" +
	  						"of a secure password.\n\n" +
	  						
	  						"Enjoy!",
	  						"About",
	  						JOptionPane.INFORMATION_MESSAGE);
			  } 
			} );
		
		frame.getContentPane().add(menuBar);
		
		/***********************************************************************************************
		 ************************************* Tool Bar Menu *******************************************
		 ***********************************************************************************************/

		JToolBar toolBar = new JToolBar();
		
		toolBar.setBounds(0, 17, frame.getWidth(), 29);
		toolBar.setFloatable(false);
		frame.getContentPane().add(toolBar);
		toolBar.setBackground(new Color(154, 202, 141));
		JButton TBbtnHome = new JButton(home);
		TBbtnHome.setBackground(new Color(255, 160, 81));
		TBbtnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(listPanel != null){
					listPanel.setVisible(false);
					frame.remove(listPanel);
				}
				if(newPanel != null){
					newPanel.setVisible(false);
					frame.remove(newPanel);
				}
				welcomePanel.setVisible(true);
				panel.setVisible(true);
			}
		});
		
				toolBar.add(TBbtnHome);
				JButton TBbtnNew = new JButton(newie);
				TBbtnNew.setBackground(new Color(255, 160, 81));
				TBbtnNew.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(listPanel != null) {
							listPanel.setVisible(false);
							frame.remove(listPanel);
						}
						welcomePanel.setVisible(true);
						newView = new newUI(path);
						panel.setVisible(false);
						newPanel = newView.getPanel();
						frame.getContentPane().add(newPanel);
					}
				});
				toolBar.add(TBbtnNew);
				JButton TBbtnRefresh = new JButton(refresh);
				TBbtnRefresh.setBackground(new Color(255, 160, 81));
				TBbtnRefresh.addActionListener(new ActionListener(){

					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						try {
							listView.loadData();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				});
				toolBar.add(TBbtnRefresh);

	}

	public JMenuItem newJMI(String name, final String type, String icon) {
		JMenuItem mntmNewMenuItem = new JMenuItem(name);
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(listPanel != null) {
					listPanel.setVisible(false);
					frame.remove(listPanel);
				}
				if(newUI.naPanel != null){
					newUI.naPanel.setVisible(false);
				}
				WelcomePanelUI.welcomePanel.setVisible(true);
				newView = new newUI(path);
				newView.setStatus(type);
				panel.setVisible(false);
				newPanel = newView.getPanel();
				newPanel.setVisible(true);
				frame.getContentPane().add(newPanel);
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon(icon));
		
		return mntmNewMenuItem;
	}

	public Container getframe() {
		return frame;
	}
	
	public void btnCreate(String url, int b1, int b2, int b3, int b4, 
									  int r, int g, int b, 
									  int x, int y, int h, int z, 
									  final String cat) {
		JLabel btnLbl = new JLabel();
		if(cat == "") {
			btnLbl = new JLabel("ALL");
		}
		else {
			btnLbl = new JLabel(cat.toUpperCase());
		}
		btnLbl.setFont(new Font("LT Oksana", Font.PLAIN, 14));
		btnLbl.setHorizontalAlignment(SwingConstants.CENTER);
		btnLbl.setBounds(b1, b2, b3, b4);
		panel.add(btnLbl);
		
		URL u = DefaultScreenUI.class.getResource(url);			
		ImageIcon icon = new ImageIcon(u);
		JButton btn = new JButton(icon);
		btn.setBackground(new Color(r, g, b));
		btn.setBounds(x, y, h, z);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnListener(cat);
			}
		});
		panel.add(btn);
		
	}
	
	public void btnListener(String btnName){
		try {
			listView = new listUI(path, btnName);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		listPanel = listView.getPanel();
		frame.getContentPane().add(listPanel);
		panel.setVisible(false);
		welcomePanel.setVisible(false);
		if(newPanel != null){
			frame.remove(newPanel);
		}
	}
}
