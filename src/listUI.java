import java.awt.*;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.AbstractTableModel;

import java.util.ArrayList;
import java.util.regex.PatternSyntaxException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class listUI extends JFrame{
	private JTextField s_field ;
	private JPanel listPanel;
	private Container cp;
	private String filename;
	private String category;
	private Object value;
	private BufferedReader s;
	private JTable table;
	private sidePanelUI sideView;
	private JPanel sidePanel;
	private JFrame frame;
	private String f;
	
	public listUI(String filename, String category) throws IOException{
		f = filename;
		this.category = category;
		JToolBar inTb = new JToolBar();
		inTb.setFloatable(false);
		inTb.setBounds(228, 14, 230, 42);
		
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
	    listPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Browser", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
	    listPanel.setBounds(0, 46, 796, 484);
	    listPanel.setBackground(new Color(255, 246, 230));
		listPanel.setLayout(null);
		listPanel.setVisible(true);
		
		JLabel lblAccountName_1 = new JLabel("Account Name");
		lblAccountName_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccountName_1.setBounds(218, 74, 113, 14);
		listPanel.add(lblAccountName_1);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(333, 74, 113, 14);
		listPanel.add(lblUsername);
		
		JLabel lblDescription = new JLabel("Password");
		lblDescription.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescription.setBounds(448, 74, 113, 14);
		listPanel.add(lblDescription);
		
		JLabel lblCategory = new JLabel("Description");
		lblCategory.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategory.setBounds(561, 74, 113, 14);
		listPanel.add(lblCategory);
		
		JLabel lblPassword = new JLabel("Category");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(674, 74, 113, 14);
		listPanel.add(lblPassword);
		
		JLabel lblSearch = new JLabel("Search Account Name: ");
		lblSearch.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSearch.setBounds(483, 42, 164, 14);
		listPanel.add(lblSearch);
		
		s_field = new JTextField();
		s_field.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					loadData();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		s_field.setBounds(657, 39, 130, 20);
		listPanel.add(s_field);
		s_field.setColumns(10);
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		table.setBounds(228, 99, 558, 374);
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				// TODO Auto-generated method stub
				if(table.getSelectedRow() > -1){
//					System.out.print
					String an = table.getValueAt(table.getSelectedRow(), 0).toString();
					String e = table.getValueAt(table.getSelectedRow(), 1).toString();
					String p = table.getValueAt(table.getSelectedRow(), 2).toString();
					String d = table.getValueAt(table.getSelectedRow(), 3).toString();
					String c = table.getValueAt(table.getSelectedRow(), 4).toString();
					String k = table.getValueAt(table.getSelectedRow(), 5).toString();
					
					sideView.setters(f, an, e, p, d, c, k);
					
				}
				
			}
			
		});
		listPanel.add(table);
		
		loadData();
		 //Test
		sideView = new sidePanelUI();
		sidePanel = sideView.getPanel();
		sidePanel.setVisible(true);
		listPanel.add(sidePanel);
//		getSidePanel();
		
	}
	
	public JPanel getSidePanel(){
		return sidePanel;
	}
	
	public JPanel getPanel(){
		return listPanel;
	}
	
	
	public void loadData() throws IOException
	{
		String columns[] =  {"Account Name", "Email", "Password", "Description", "Category", "Key"};
	    DefaultTableModel tableModel = new DefaultTableModel(){
	    	@Override
	    	public boolean isCellEditable(int row, int column){
	    		return false;
	    	}
	    };
	    
	    tableModel.setColumnIdentifiers(columns);
	    table.setModel(tableModel);
	    String line;
	    BufferedReader reader;
        try{       
            reader = new BufferedReader(new FileReader(f));
            while((line = reader.readLine()) != null) 
            {
            	String array[] = new String[6];
            	array = line.split(",");
            	String nLine = "";
            	String s = s_field.getText().toLowerCase();
    			if(array[4].equals(category) || category == "")
    			{
    				if((array[0].toLowerCase().contains(s) || array[1].toLowerCase().contains(s)))
    				{
	    				for(int i = 0; i < array.length; i++){
	    					nLine += array[i] + ",";
	    				}
    				tableModel.addRow(nLine.split(","));
    				}
    			}
    			
            }
            reader.close();
            table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            table.removeColumn(table.getColumnModel().getColumn(table.getColumnCount() - 1));
         }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error");
            e.printStackTrace();
        }

	}
	public String getsearchString(){
		return s_field.getText();
	}
}

