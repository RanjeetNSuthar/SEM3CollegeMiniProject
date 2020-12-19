package GUI;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.border.CompoundBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLoginRegTable {

	protected JFrame frame;
	protected JTable table_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLoginRegTable window = new AdminLoginRegTable();
					window.initialize();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	protected void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(AdminLoginRegTable.class.getResource("/Images/Mylogo.png")));
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(10, 11, 1330, 707);
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(24, 72, 269, 616);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Usertype :");
		lblNewLabel_2.setFont(new Font("Sitka Small", Font.PLAIN, 17));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 50, 134, 22);
		panel_1.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(10, 72, 249, 33);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Username :");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Sitka Small", Font.PLAIN, 17));
		lblNewLabel_2_1.setBounds(10, 145, 134, 22);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Date :");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Sitka Small", Font.PLAIN, 17));
		lblNewLabel_2_2.setBounds(10, 236, 134, 22);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Time :");
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setFont(new Font("Sitka Small", Font.PLAIN, 17));
		lblNewLabel_2_3.setBounds(10, 322, 134, 22);
		panel_1.add(lblNewLabel_2_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 163, 249, 33);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 252, 249, 33);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 340, 249, 33);
		panel_1.add(textField_3);
		
		JButton btnNewButton = new JButton("Remove");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					
					int row = table_1.getSelectedRow();				
					String uname = (table_1.getModel().getValueAt(row,1)).toString();
					
					
					    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","1111999");
						Statement st = con.createStatement();
						int count = st.executeUpdate("delete from Login where username = '"+uname+"'");
				
								
								textField.setText("");
								textField_1.setText("");
								textField_2.setText("");
								textField_3.setText("");
												
				          
							con.close();
							st.close();
							}
							catch(Exception e2)
							{
							  System.out.println(e2);	
							}
							
			try {
				Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","1111999");
				String query = "Select logintype ,username,Date, Time from Login ";
				PreparedStatement pst= con.prepareStatement(query);
				ResultSet rs = pst.executeQuery();			
				table_1.setModel(DbUtils.resultSetToTableModel(rs));
			}
			catch(Exception e3)
			{
				e3.printStackTrace();
			}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(90, 392, 89, 23);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Controls");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBackground(new Color(64, 64, 64));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(24, 28, 284, 33);
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(374, 66, 901, 616);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		
		scrollPane.setBounds(51, 56, 778, 503);
		panel_2.add(scrollPane);
		
		table_1 = new JTable();
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
					
				
				int row = table_1.getSelectedRow();				
				String uname = (table_1.getModel().getValueAt(row,1)).toString();
				
				
				    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","1111999");
					PreparedStatement st = con.prepareStatement("select * from login where username = '"+uname+"'");
					ResultSet rs = st.executeQuery();
					
					    
						while(rs.next())
							
						{  
				
							textField.setText(rs.getString("logintype"));
							textField_1.setText(rs.getString("username"));
							textField_2.setText(rs.getString("Date"));
							textField_3.setText(rs.getString("Time"));
											
			          } 
						con.close();
						st.close();
						}
						catch(Exception e2)
						{
						  System.out.println(e2);	
						}
						}
		});
		scrollPane.setViewportView(table_1);
		table_1.setFillsViewportHeight(true);
		table_1.setBorder(new CompoundBorder());
		table_1.setColumnSelectionAllowed(true);
		table_1.setCellSelectionEnabled(true);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"", "", "", null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Usertype", "Username", "Date ", "Time"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_1.getColumnModel().getColumn(0).setPreferredWidth(86);
		table_1.getColumnModel().getColumn(0).setMinWidth(69);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(93);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(88);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(84);
		
		JLabel lblLoginInformation = new JLabel("Login Information");
		lblLoginInformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginInformation.setForeground(new Color(255, 255, 255));
		lblLoginInformation.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblLoginInformation.setBackground(Color.WHITE);
		lblLoginInformation.setBounds(374, 28, 901, 33);
		panel.add(lblLoginInformation);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(AdminLoginRegTable.class.getResource("/Images/matrixcharacters-1440x810.png")));
		lblNewLabel_1.setBounds(318, 0, 46, 707);
		panel.add(lblNewLabel_1);
		try {
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","1111999");
			String query = "Select logintype ,username,Date, Time from Login ";
			PreparedStatement pst= con.prepareStatement(query);
			ResultSet rs = pst.executeQuery();			
			table_1.setModel(DbUtils.resultSetToTableModel(rs));
			
			JButton btnNewButton_1 = new JButton("Back");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.setVisible(false);
					Admin_Home_Page window = new Admin_Home_Page();
                    window.initialize();
                    window.frame.setVisible(true);
				}
			});
			btnNewButton_1.setForeground(Color.WHITE);
			btnNewButton_1.setBackground(Color.BLACK);
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnNewButton_1.setBounds(0, 0, 89, 23);
			panel.add(btnNewButton_1);
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}
}
