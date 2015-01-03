import java.awt.*;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class listUI {
	private JTextField s_field ;
	private JPanel listPanel;
	private Container cp;
	
	public listUI(){
		JToolBar inTb = new JToolBar();
		inTb.setBounds(10, 14, 285, 42);
		
		ImageIcon tmail = new ImageIcon("listTool\\mail.png");
		JButton tbtnMail = new JButton(tmail);
		tbtnMail.setBackground(new Color(245, 147, 43));
		inTb.add(tbtnMail);
		
		
		ImageIcon tuser = new ImageIcon("listTool\\user.png");
		JButton tbtnUsers = new JButton(tuser);
		tbtnUsers.setBackground(new Color(76, 45, 169));
		inTb.add(tbtnUsers);
		
		ImageIcon tsocial = new ImageIcon("listTool\\social.png");
		JButton tbtnSocial = new JButton(tsocial);
		tbtnSocial.setBackground(new Color(245, 62, 43));
		inTb.add(tbtnSocial);
		
		ImageIcon tbuy = new ImageIcon("listTool\\shop.png");
		JButton tbtnPurchase = new JButton(tbuy);
		tbtnPurchase.setBackground(new Color(90, 186, 119));
		inTb.add(tbtnPurchase);
		
		ImageIcon tbank = new ImageIcon("listTool\\bank.png");
		JButton tbtnBanking = new JButton(tbank);
		tbtnBanking.setBackground(new Color(36, 115, 149));
		tbtnBanking.setPreferredSize(new Dimension(40, 40));
		inTb.add(tbtnBanking);
		
		ImageIcon twork = new ImageIcon("listTool\\work.png");
		JButton tbtnWork = new JButton(twork);
		tbtnWork.setBackground(new Color(123, 122, 123));
		inTb.add(tbtnWork);
		
		ImageIcon tother = new ImageIcon("listTool\\other.png");
		JButton tbtnOther = new JButton(tother);
		tbtnOther.setBackground(new Color(189, 39, 124));
		inTb.add(tbtnOther);
		
		ImageIcon tall = new ImageIcon("listTool\\all.png");
		JButton tbtnAll = new JButton(tall);
		tbtnAll.setBackground(new Color(236, 219, 49));
		inTb.add(tbtnAll);
		
	    listPanel = new JPanel();
	    listPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Browser", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
	    listPanel.setBounds(225, 46, 589, 484);
	    listPanel.setBackground(new Color(255, 246, 230));
		listPanel.setLayout(null);
		listPanel.add(inTb);
		listPanel.setVisible(true);
		
		JLabel lblAccountName_1 = new JLabel("Account Name");
		lblAccountName_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccountName_1.setBounds(10, 74, 113, 14);
		listPanel.add(lblAccountName_1);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(125, 74, 113, 14);
		listPanel.add(lblUsername);
		
		JLabel lblPassword_2 = new JLabel("Password");
		lblPassword_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword_2.setBounds(240, 74, 113, 14);
		listPanel.add(lblPassword_2);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setBounds(353, 74, 113, 14);
		listPanel.add(lblDate);
		
		JLabel lblDescription_1 = new JLabel("Description");
		lblDescription_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescription_1.setBounds(466, 74, 113, 14);
		listPanel.add(lblDescription_1);
		
		JLabel lblSearch = new JLabel("Search: ");
		lblSearch.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSearch.setBounds(353, 42, 86, 14);
		listPanel.add(lblSearch);
		
		s_field = new JTextField();
		s_field.setBounds(449, 39, 130, 20);
		listPanel.add(s_field);
		s_field.setColumns(10);
		
		JTable table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Account Name", "Username", "Password", "Date", "Description"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Object.class, String.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.setBounds(10, 89, 569, 384);
		listPanel.add(table);
	}
	
	public JPanel getPanel(){
		return listPanel;
	}

}
