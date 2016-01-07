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

		/***********************************************************************************************
		 ********************************* Mail btn Components*******************************************
		 ***********************************************************************************************/

		JLabel lblMail = new JLabel("MAIL");
		lblMail.setFont(new Font("LT Oksana", Font.PLAIN, 14));
		lblMail.setHorizontalAlignment(SwingConstants.CENTER);
		lblMail.setBounds(40, 172, 99, 14);
		panel.add(lblMail);

		URL mailURL = DefaultScreenUI.class.getResource("/big/mail.png");			
		ImageIcon mail = new ImageIcon(mailURL);
		JButton btnMail = new JButton(mail);
		btnMail.setBackground(new Color(245, 147, 43));
		btnMail.setBounds(40, 64, 99, 97);
		btnMail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					listView = new listUI(path, "Mail");
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
		});
		panel.add(btnMail);

		/***********************************************************************************************
		 ********************************* User btn Components*******************************************
		 ***********************************************************************************************/
		JLabel lblUsers = new JLabel("USERS");
		lblUsers.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsers.setFont(new Font("LT Oksana", Font.PLAIN, 14));
		lblUsers.setBounds(40, 402, 99, 14);
		panel.add(lblUsers);

		URL userURL = DefaultScreenUI.class.getResource("/big/user.png");
		ImageIcon user = new ImageIcon(userURL);
		JButton btnUsers = new JButton(user);
		btnUsers.setBackground(new Color(76, 45, 169));
		btnUsers.setBounds(40, 295, 99, 96);
		btnUsers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					listView = new listUI(path, "Users");
					listPanel = listView.getPanel();
					frame.getContentPane().add(listPanel);
					panel.setVisible(false);
					welcomePanel.setVisible(false);
					if(newPanel != null){
						frame.remove(newPanel);
					}
				
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel.add(btnUsers);

		/***********************************************************************************************
		 ********************************* Social btn Components*****************************************
		 ***********************************************************************************************/

		JLabel lblSocial = new JLabel("SOCIAL");
		lblSocial.setHorizontalAlignment(SwingConstants.CENTER);
		lblSocial.setFont(new Font("LT Oksana", Font.PLAIN, 14));
		lblSocial.setBounds(178, 172, 99, 14);
		panel.add(lblSocial);

		URL socialURL = DefaultScreenUI.class.getResource("/big/social.png");
		ImageIcon social = new ImageIcon(socialURL);
		JButton btnSocial = new JButton(social);
		btnSocial.setBackground(new Color(245, 62, 43));
		btnSocial.setBounds(178, 64, 99, 97);
		btnSocial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					listView = new listUI(path, "Social");
//					listView.loadData();
					listPanel = listView.getPanel();
					frame.getContentPane().add(listPanel);
					panel.setVisible(false);
					welcomePanel.setVisible(false);
					if(newPanel != null){
						frame.remove(newPanel);
					}
				
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel.add(btnSocial);

		/***********************************************************************************************
		 ********************************* Buy btn Components********************************************
		 ***********************************************************************************************/

		JLabel lblShopping = new JLabel("SHOPPING");
		lblShopping.setHorizontalAlignment(SwingConstants.CENTER);
		lblShopping.setFont(new Font("LT Oksana", Font.PLAIN, 14));
		lblShopping.setBounds(316, 172, 99, 14);
		panel.add(lblShopping);

		URL buyURL = DefaultScreenUI.class.getResource("/big/shop.png");
		ImageIcon buy = new ImageIcon(buyURL);
		JButton btnPurchase = new JButton(buy);
		btnPurchase.setBackground(new Color(90, 186, 119));
		btnPurchase.setBounds(316, 64, 99, 97);
		btnPurchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					listView = new listUI(path, "Shopping");
//					listView.loadData();
					listPanel = listView.getPanel();
					frame.getContentPane().add(listPanel);
					panel.setVisible(false);
					welcomePanel.setVisible(false);
					if(newPanel != null){
						frame.remove(newPanel);
					}
				
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel.add(btnPurchase);

		/***********************************************************************************************
		 ********************************* Bank btn Components*******************************************
		 ***********************************************************************************************/

		JLabel lblBanking = new JLabel("BANKING");
		lblBanking.setHorizontalAlignment(SwingConstants.CENTER);
		lblBanking.setFont(new Font("LT Oksana", Font.PLAIN, 14));
		lblBanking.setBounds(454, 172, 99, 14);
		panel.add(lblBanking);

		URL bankURL = DefaultScreenUI.class.getResource("/big/bank.png");
		ImageIcon bank = new ImageIcon(bankURL);
		JButton btnBanking = new JButton(bank);
		btnBanking.setBackground(new Color(36, 115, 149));
		btnBanking.setBounds(454, 64, 99, 97);
		btnBanking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					listView = new listUI(path, "Banking");
//					listView.loadData();
					listPanel = listView.getPanel();
					frame.getContentPane().add(listPanel);
					panel.setVisible(false);
					welcomePanel.setVisible(false);
					if(newPanel != null){
						frame.remove(newPanel);
					}
				
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel.add(btnBanking);

		/***********************************************************************************************
		 ********************************* Work btn Components*******************************************
		 ***********************************************************************************************/

		JLabel lblSchoolwork = new JLabel("WORK/EDU");
		lblSchoolwork.setHorizontalAlignment(SwingConstants.CENTER);
		lblSchoolwork.setFont(new Font("LT Oksana", Font.PLAIN, 14));
		lblSchoolwork.setBounds(178, 402, 99, 14);
		panel.add(lblSchoolwork);

		URL workURL = DefaultScreenUI.class.getResource("/big/work.png");
		ImageIcon work = new ImageIcon(workURL);
		JButton btnWork = new JButton(work);
		btnWork.setBackground(new Color(123, 122, 123));
		btnWork.setBounds(178, 295, 99, 96);
		btnWork.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					listView = new listUI(path, "Work/Edu");
//					listView.loadData();
					listPanel = listView.getPanel();
					frame.getContentPane().add(listPanel);
					panel.setVisible(false);
					welcomePanel.setVisible(false);
					if(newPanel != null){
						frame.remove(newPanel);
					}
				
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel.add(btnWork);

		/***********************************************************************************************
		 ********************************* Other btn Components******************************************
		 ***********************************************************************************************/

		JLabel lblOther = new JLabel("OTHER");
		lblOther.setHorizontalAlignment(SwingConstants.CENTER);
		lblOther.setFont(new Font("LT Oksana", Font.PLAIN, 14));
		lblOther.setBounds(316, 402, 99, 14);
		panel.add(lblOther);

		URL otherURL = DefaultScreenUI.class.getResource("/big/other.png");
		ImageIcon other = new ImageIcon(otherURL);
		JButton btnOther = new JButton(other);
		btnOther.setBackground(new Color(189, 39, 124));
		btnOther.setBounds(316, 295, 99, 96);
		btnOther.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					listView = new listUI(path, "Other");
					listPanel = listView.getPanel();
					frame.getContentPane().add(listPanel);
					panel.setVisible(false);
					welcomePanel.setVisible(false);
					if(newPanel != null){
						frame.remove(newPanel);
					}
				
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel.add(btnOther);

		/***********************************************************************************************
		 ********************************* All btn Components********************************************
		 ***********************************************************************************************/

		JLabel lblAll = new JLabel("ALL");
		lblAll.setHorizontalAlignment(SwingConstants.CENTER);
		lblAll.setFont(new Font("LT Oksana", Font.PLAIN, 14));
		lblAll.setBounds(454, 402, 99, 14);
		panel.add(lblAll);

		URL allURL = DefaultScreenUI.class.getResource("/big/all.png");
		ImageIcon all = new ImageIcon(allURL);
		JButton btnAll = new JButton(all);
		btnAll.setBackground(new Color(236, 219, 49));
		btnAll.setBounds(454, 295, 99, 96);
		btnAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					listView = new listUI(path, "");
//					listView.loadData();
					listPanel = listView.getPanel();
					frame.getContentPane().add(listPanel);
					panel.setVisible(false);
					welcomePanel.setVisible(false);
					if(newPanel != null){
						frame.remove(newPanel);
					}
				
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel.add(btnAll);
		/***********************************************************************************************
		 ********************************* Tool Bar Components*******************************************
		 ***********************************************************************************************/

		URL backUrl = DefaultScreenUI.class.getResource("/toolbar/backward.png");
		ImageIcon back = new ImageIcon(backUrl);

		URL frontUrl = DefaultScreenUI.class.getResource("/toolbar/foreward.png");
		ImageIcon front = new ImageIcon(frontUrl);
		
		URL homeUrl = DefaultScreenUI.class.getResource("/toolbar/home.png"); 
		ImageIcon home = new ImageIcon(homeUrl);

		URL newieUrl = DefaultScreenUI.class.getResource("/toolbar/add.png");
		ImageIcon newie = new ImageIcon(newieUrl);

		URL refreshUrl = DefaultScreenUI.class.getResource("/toolbar/refresh.png");
		ImageIcon refresh = new ImageIcon(refreshUrl);

		/***********************************************************************************************
		 ********************************* Menu Bar Components*******************************************
		 ***********************************************************************************************/

		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, frame.getWidth(), 15);

		/***********************************************************************************************
		 ************************************ File Menu******************************************
		 ***********************************************************************************************/
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmSave = new JMenuItem("Save");
//		URL mntmSaveURL = DefaultScreenUI.class.getResource("/menubar/FileMenu.save1/png");
		mntmSave.setIcon(new ImageIcon("C:/Users/trevor.gudeman/Desktop/Workspace/Password-Manager/menubar/FileMenu/save1.png"));
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
		mntmExit.setIcon(new ImageIcon("C:/Users/trevor.gudeman/Desktop/Workspace/Password-Manager/FileMenu/exit3.png"));
		
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
		//URL mnNewAccountURL = DefaultScreenUI.resource.
		mnNewAccount.setIcon(new ImageIcon("C:/Users/trevor.gudeman/Desktop/Workspace/Password-Manager/AccountMenu/create1.png"));
		mnAccount.add(mnNewAccount);

		JMenuItem mntmNewMenuItem = new JMenuItem("Mail Account");
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
				newView.setStatus("Mail");
				panel.setVisible(false);
				newPanel = newView.getPanel();
				newPanel.setVisible(true);
				frame.getContentPane().add(newPanel);
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon("menubar\\AccountMenu\\mail59.png"));
		mnNewAccount.add(mntmNewMenuItem);
				


		JMenuItem mntmSocialAccount = new JMenuItem("Social Account");
		mntmSocialAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listPanel != null) {
					listPanel.setVisible(false);
					frame.remove(listPanel);
				}
				if(newUI.naPanel != null){
					newUI.naPanel.setVisible(false);
				}
				WelcomePanelUI.welcomePanel.setVisible(true);
				newView = new newUI(path);
				newView.setStatus("Social");
				panel.setVisible(false);
				newPanel = newView.getPanel();
				newPanel.setVisible(true);
				frame.getContentPane().add(newPanel);
			}
		});
		
		mntmSocialAccount.setIcon(new ImageIcon(
				"menubar\\AccountMenu\\social.png"));
		mnNewAccount.add(mntmSocialAccount);

		JMenuItem mntmShoppingAccount = new JMenuItem("Shopping Account");
		mntmShoppingAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listPanel != null) {
					listPanel.setVisible(false);
					frame.remove(listPanel);
				}
				if(newUI.naPanel != null){
					newUI.naPanel.setVisible(false);
				}
				WelcomePanelUI.welcomePanel.setVisible(true);
				newView = new newUI(path);
				panel.setVisible(false);
				newView.setStatus("Shopping");
				newPanel = newView.getPanel();
				newPanel.setVisible(true);
				frame.getContentPane().add(newPanel);
			}
		});
		mntmShoppingAccount.setIcon(new ImageIcon(
				"menubar\\AccountMenu\\shopping232.png"));
		mnNewAccount.add(mntmShoppingAccount);

		JMenuItem mntmBankingAccount = new JMenuItem("Banking Account");
		mntmBankingAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listPanel != null) {
					listPanel.setVisible(false);
					frame.remove(listPanel);
				}
				if(newUI.naPanel != null){
					newUI.naPanel.setVisible(false);
				}
				WelcomePanelUI.welcomePanel.setVisible(true);
				newView = new newUI(path);
				panel.setVisible(false);
				newView.setStatus("Banking");
				newPanel = newView.getPanel();
				newPanel.setVisible(true);
				frame.getContentPane().add(newPanel);
			}
		});
		mntmBankingAccount.setIcon(new ImageIcon(
				"menubar\\AccountMenu\\banking.png"));
		mnNewAccount.add(mntmBankingAccount);

		JMenuItem mntmUserAccount = new JMenuItem("User Account");
		mntmUserAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listPanel != null) {
					listPanel.setVisible(false);
					frame.remove(listPanel);
				}
				if(newUI.naPanel != null){
					newUI.naPanel.setVisible(false);
				}
				WelcomePanelUI.welcomePanel.setVisible(true);
				newView = new newUI(path);
				panel.setVisible(false);
				newView.setStatus("Users");
				newPanel = newView.getPanel();
				newPanel.setVisible(true);
				frame.getContentPane().add(newPanel);
			}
		});
		mntmUserAccount.setIcon(new ImageIcon("menubar\\AccountMenu\\user.png"));
		mnNewAccount.add(mntmUserAccount);

		JMenuItem mntmWorkeduAccount = new JMenuItem("Work/EDU Account");
		mntmWorkeduAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listPanel != null) {
					listPanel.setVisible(false);
					frame.remove(listPanel);
				}
				if(newUI.naPanel != null){
					newUI.naPanel.setVisible(false);
				}
				WelcomePanelUI.welcomePanel.setVisible(true);
				newView = new newUI(path);
				panel.setVisible(false);
				newView.setStatus("Work/Edu");
				newPanel = newView.getPanel();
				newPanel.setVisible(true);
				frame.getContentPane().add(newPanel);
			}
		});
		mntmWorkeduAccount.setIcon(new ImageIcon(
				"menubar\\AccountMenu\\university2.png"));
		mnNewAccount.add(mntmWorkeduAccount);

		JMenuItem mntmOtherAccount = new JMenuItem("Other Account");
		mntmOtherAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listPanel != null) {
					listPanel.setVisible(false);
					frame.remove(listPanel);
					
				}
				if(newUI.naPanel != null){
					newUI.naPanel.setVisible(false);
				}
				WelcomePanelUI.welcomePanel.setVisible(true);
				newView = new newUI(path);
				panel.setVisible(false);
				newView.setStatus("Other");
				newPanel = newView.getPanel();
				frame.getContentPane().add(newPanel);
			}
		});
		mnNewAccount.add(mntmOtherAccount);
		
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

	public Container getframe() {
		return frame;
	}
}
