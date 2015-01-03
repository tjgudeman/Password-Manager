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

import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.JEditorPane;

public class DefaultScreenUI extends JFrame {

	private JPanel panel;
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
	

	public DefaultScreenUI() {
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

		ImageIcon mail = new ImageIcon("big\\mail.png");
		JButton btnMail = new JButton(mail);
		btnMail.setBackground(new Color(245, 147, 43));
		btnMail.setBounds(40, 64, 99, 97);
		btnMail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listView = new listUI();
				listPanel = listView.getPanel();
				frame.getContentPane().add(listPanel);
				panel.setVisible(false);
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

		ImageIcon user = new ImageIcon("big\\user.png");
		JButton btnUsers = new JButton(user);
		btnUsers.setBackground(new Color(76, 45, 169));
		btnUsers.setBounds(40, 295, 99, 96);
		panel.add(btnUsers);

		/***********************************************************************************************
		 ********************************* Social btn Components*****************************************
		 ***********************************************************************************************/

		JLabel lblSocial = new JLabel("SOCIAL");
		lblSocial.setHorizontalAlignment(SwingConstants.CENTER);
		lblSocial.setFont(new Font("LT Oksana", Font.PLAIN, 14));
		lblSocial.setBounds(178, 172, 99, 14);
		panel.add(lblSocial);

		ImageIcon social = new ImageIcon("big\\social.png");
		JButton btnSocial = new JButton(social);
		btnSocial.setBackground(new Color(245, 62, 43));
		btnSocial.setBounds(178, 64, 99, 97);
		panel.add(btnSocial);

		/***********************************************************************************************
		 ********************************* Buy btn Components********************************************
		 ***********************************************************************************************/

		JLabel lblShopping = new JLabel("SHOPPING");
		lblShopping.setHorizontalAlignment(SwingConstants.CENTER);
		lblShopping.setFont(new Font("LT Oksana", Font.PLAIN, 14));
		lblShopping.setBounds(316, 172, 99, 14);
		panel.add(lblShopping);

		ImageIcon buy = new ImageIcon("big\\shop.png");
		JButton btnPurchase = new JButton(buy);
		btnPurchase.setBackground(new Color(90, 186, 119));
		btnPurchase.setBounds(316, 64, 99, 97);
		panel.add(btnPurchase);

		/***********************************************************************************************
		 ********************************* Bank btn Components*******************************************
		 ***********************************************************************************************/

		JLabel lblBanking = new JLabel("BANKING");
		lblBanking.setHorizontalAlignment(SwingConstants.CENTER);
		lblBanking.setFont(new Font("LT Oksana", Font.PLAIN, 14));
		lblBanking.setBounds(454, 172, 99, 14);
		panel.add(lblBanking);

		ImageIcon bank = new ImageIcon("big\\bank.png");
		JButton btnBanking = new JButton(bank);
		btnBanking.setBackground(new Color(36, 115, 149));
		btnBanking.setBounds(454, 64, 99, 97);
		panel.add(btnBanking);

		/***********************************************************************************************
		 ********************************* Work btn Components*******************************************
		 ***********************************************************************************************/

		JLabel lblSchoolwork = new JLabel("WORK/EDU");
		lblSchoolwork.setHorizontalAlignment(SwingConstants.CENTER);
		lblSchoolwork.setFont(new Font("LT Oksana", Font.PLAIN, 14));
		lblSchoolwork.setBounds(178, 402, 99, 14);
		panel.add(lblSchoolwork);

		ImageIcon work = new ImageIcon("big\\work.png");
		JButton btnWork = new JButton(work);
		btnWork.setBackground(new Color(123, 122, 123));
		btnWork.setBounds(178, 295, 99, 96);
		panel.add(btnWork);

		/***********************************************************************************************
		 ********************************* Other btn Components******************************************
		 ***********************************************************************************************/

		JLabel lblOther = new JLabel("OTHER");
		lblOther.setHorizontalAlignment(SwingConstants.CENTER);
		lblOther.setFont(new Font("LT Oksana", Font.PLAIN, 14));
		lblOther.setBounds(316, 402, 99, 14);
		panel.add(lblOther);

		ImageIcon other = new ImageIcon("big\\other.png");
		JButton btnOther = new JButton(other);
		btnOther.setBackground(new Color(189, 39, 124));
		btnOther.setBounds(316, 295, 99, 96);
		panel.add(btnOther);

		/***********************************************************************************************
		 ********************************* All btn Components********************************************
		 ***********************************************************************************************/

		JLabel lblAll = new JLabel("ALL");
		lblAll.setHorizontalAlignment(SwingConstants.CENTER);
		lblAll.setFont(new Font("LT Oksana", Font.PLAIN, 14));
		lblAll.setBounds(454, 402, 99, 14);
		panel.add(lblAll);

		ImageIcon all = new ImageIcon("big\\all.png");
		JButton btnAll = new JButton(all);
		btnAll.setBackground(new Color(236, 219, 49));
		btnAll.setBounds(454, 295, 99, 96);
		panel.add(btnAll);
		/***********************************************************************************************
		 ********************************* Tool Bar Components*******************************************
		 ***********************************************************************************************/

		ImageIcon back = new ImageIcon("toolbar\\backward.png");

		ImageIcon front = new ImageIcon("toolbar\\foreward.png");

		ImageIcon home = new ImageIcon("toolbar\\home.png");

		ImageIcon newie = new ImageIcon("toolbar\\add.png");

		ImageIcon refresh = new ImageIcon("toolbar\\refresh.png");

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
		mntmSave.setIcon(new ImageIcon("menubar\\FileMenu\\save1.png"));
		mnFile.add(mntmSave);

		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.setIcon(new ImageIcon("menubar\\FileMenu\\logout8.png"));
		mnFile.add(mntmLogout);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setIcon(new ImageIcon("C:menubar\\FileMenu\\exit3.png"));
		mnFile.add(mntmExit);
		
		/***********************************************************************************************
		 ********************************* Account Menu********************************************
		 ***********************************************************************************************/

		JMenu mnAccount = new JMenu("Account");
		menuBar.add(mnAccount);
		
		
		JMenu mnNewAccount = new JMenu("New Account");
		mnNewAccount.setIcon(new ImageIcon("menubar\\AccountMenu\\create1.png"));
		mnAccount.add(mnNewAccount);

		JMenuItem mntmNewMenuItem = new JMenuItem("Mail Account");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(listPanel != null) {
					listPanel.setVisible(false);
					frame.remove(listPanel);
					System.out.println("removed listPanel");
				}
				newView = new newUI();
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
					System.out.println("removed listPanel");
				}
				newView = new newUI();
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
					System.out.println("removed listPanel");
				}
				newView = new newUI();
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
					System.out.println("removed listPanel");
				}
				newView = new newUI();
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
					System.out.println("removed listPanel");
				}
				newView = new newUI();
				panel.setVisible(false);
				newView.setStatus("User Account");
				newPanel = newView.getPanel();
				newPanel.setVisible(true);
				frame.getContentPane().add(newPanel);
			}
		});
		mntmUserAccount
				.setIcon(new ImageIcon("menubar\\AccountMenu\\user.png"));
		mnNewAccount.add(mntmUserAccount);

		JMenuItem mntmWorkeduAccount = new JMenuItem("Work/EDU Account");
		mntmWorkeduAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listPanel != null) {
					listPanel.setVisible(false);
					frame.remove(listPanel);
					System.out.println("removed listPanel");
				}
				newView = new newUI();
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
					System.out.println("removed listPanel");
				}
				newView = new newUI();
				panel.setVisible(false);
				newView.setStatus("Other");
				newPanel = newView.getPanel();
				frame.getContentPane().add(newPanel);
			}
		});
		mnNewAccount.add(mntmOtherAccount);

		JMenuItem mnRemoveAccount = new JMenuItem("Remove Account");
		mnRemoveAccount.setIcon(new ImageIcon("menubar\\AccountMenu\\remove.png"));
		mnAccount.add(mnRemoveAccount);
		
		/***********************************************************************************************
		 *************************************Help Menu*******************************************
		 ***********************************************************************************************/

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenuItem mntmHowto = new JMenuItem("How-To ");
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
		frame.getContentPane().add(toolBar);
		toolBar.setBackground(new Color(154, 202, 141));
		
		JButton btnBack = new JButton(back);
		btnBack.setBackground(new Color(255, 160, 81));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Change this to new(instances) instead of invisibility
//				listView.Visible(false);
//				newView.Visible(false);
//				panel.setVisible(true);
			}
		});
		toolBar.add(btnBack);
		JButton btnFront = new JButton(front);
		btnFront.setBackground(new Color(255, 160, 81));
		btnFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Change this to new(instances) instead of invisibility				
//				listView.Visible(true);
//				newView.Visible(false);
//				panel.setVisible(false);
			}
		});
		toolBar.add(btnFront);
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
>>>>>>> 0feb6e793c2980dccd3f720995334ce2f37cefb6
<<<<<<< HEAD
		
=======
>>>>>>> 7cd740c21442231b53eed16657774e9f6d85b8f1
=======
		
>>>>>>> origin/master
<<<<<<< HEAD
=======
>>>>>>> fa41949a09fa10d0f3cf3cd4cd68d5de505acf16
>>>>>>> 0feb6e793c2980dccd3f720995334ce2f37cefb6
		JButton btnNewButton_1 = new JButton(home);
		btnNewButton_1.setBackground(new Color(255, 160, 81));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(listPanel != null){
					frame.remove(listPanel);
				}
				if(newPanel != null){
					frame.remove(newPanel);
				}
				panel.setVisible(true);
			}
		});
		
				toolBar.add(btnNewButton_1);
				JButton btnNewButton = new JButton(newie);
				btnNewButton.setBackground(new Color(255, 160, 81));
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
<<<<<<< HEAD
=======
						newView = new newUI();
						panel.setVisible(false);
						if(listPanel != null){
							frame.remove(listPanel);
						}
						newPanel = newView.getPanel();
						frame.getContentPane().add(newPanel);
=======
<<<<<<< HEAD
>>>>>>> 0feb6e793c2980dccd3f720995334ce2f37cefb6
<<<<<<< HEAD
						if(listPanel != null) {
							listPanel.setVisible(false);
							frame.remove(listPanel);
							System.out.println("removed listPanel");
						}
						newView = new newUI();
						panel.setVisible(false);
						newPanel = newView.getPanel();
						newPanel.setVisible(true);
						frame.getContentPane().add(newPanel);
						
=======
						newView = new newUI();
						panel.setVisible(false);
						if(listPanel != null){
=======
						if(listPanel != null) {
							listPanel.setVisible(false);
>>>>>>> origin/master
							frame.remove(listPanel);
							System.out.println("removed listPanel");
						}
						newView = new newUI();
						panel.setVisible(false);
						newPanel = newView.getPanel();
						newPanel.setVisible(true);
						frame.getContentPane().add(newPanel);
<<<<<<< HEAD
>>>>>>> 7cd740c21442231b53eed16657774e9f6d85b8f1
=======
						
>>>>>>> origin/master
<<<<<<< HEAD
=======
>>>>>>> fa41949a09fa10d0f3cf3cd4cd68d5de505acf16
>>>>>>> 0feb6e793c2980dccd3f720995334ce2f37cefb6
					}
				});
				toolBar.add(btnNewButton);
				JButton btnRefresh = new JButton(refresh);
				btnRefresh.setBackground(new Color(255, 160, 81));
				toolBar.add(btnRefresh);

	}

	public Container getframe() {
		return frame;
	}
}
