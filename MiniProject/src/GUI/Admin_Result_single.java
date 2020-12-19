package GUI;

import java.awt.EventQueue;

 

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import java.awt.Toolkit;

public class Admin_Result_single {

 

    protected JFrame frame;
    protected JTable table;
    private JTextField textField;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JComboBox comboBox;
    private JFormattedTextField formattedTextField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JLabel lblNewLabel;
    

 

   
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Admin_Result_single  window = new  Admin_Result_single ();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

 

   
    public Admin_Result_single () {
        initialize();
    }

 

    
    private void initialize() {
        frame = new JFrame();
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Admin_Result_single.class.getResource("/Images/Mylogo.png")));
        frame.getContentPane().setForeground(Color.WHITE);
        frame.setBounds(100, 100, 967, 576);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("TOURNAMENTS");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lblNewLabel_1.setBounds(416, 11, 221, 40);
        frame.getContentPane().add(lblNewLabel_1);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(20, 84, 903, 235);
        frame.getContentPane().add(panel_1);
        panel_1.setLayout(null);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(28, 0, 849, 415);
        panel_1.add(scrollPane);
        
        table = new JTable();
        table.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		
        		try {
					
    				
    				int row = table.getSelectedRow();				
    				String sn = (table.getModel().getValueAt(row,0)).toString();
    				
    				
    				    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","1111999");
    					PreparedStatement st = con.prepareStatement("select * from  result_single where Tournament_No = '"+sn+"'");
    					ResultSet rs = st.executeQuery();
    					
    					    
    					rs.next();
    							
    					 textField.setText(Integer.toString((rs.getInt("Tournament_No"))));
    					 comboBox.setSelectedItem(rs.getString("SPORT_NAME"));
    					 formattedTextField.setText(rs.getString("Date_Of_Tournament"));
						 textField_3.setText(rs.getString("VENUE"));
						 textField_4.setText(rs.getString("ENTRY_FEE"));
						 textField_5.setText(rs.getString("CONTACT_NO"));
						 textField_6.setText(rs.getString("Timing"));
						 textField_1.setText(rs.getString("Winner"));
						 textField_2.setText(rs.getString("RunnerUp"));
						 
										
    				
    							
    			           
    						con.close();
    						st.close();
    						}
    						catch(Exception e2)
    						{
    						  System.out.println(e2);	
    						}
        	}
        });
        
        table.setForeground(Color.BLUE);
        scrollPane.setViewportView(table);
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        	},
        	new String[] {
        		"Tournament_No", "SPORT_NAME", "DATE", "VENUE", "ENRTY_FEE", "TIME", "CONTACT_NO.", "Winner", "RunnerUp"
        	}
        ));
        
        JLabel lblNewLabel_3 = new JLabel("yyyy-mm-dd");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_3.setForeground(Color.BLUE);
        lblNewLabel_3.setBounds(581, 340, 180, 26);
        frame.getContentPane().add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("Tournament_No:");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel_4.setBounds(20, 341, 171, 20);
        frame.getContentPane().add(lblNewLabel_4);
        
        textField = new JTextField();
        textField.setEditable(false);
        textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
        textField.setBounds(20, 360, 171, 28);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel_4_1 = new JLabel("Sport Name:");
        lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel_4_1.setBounds(235, 341, 108, 20);
        frame.getContentPane().add(lblNewLabel_4_1);
        
        JLabel lblNewLabel_4_1_1 = new JLabel("Date:");
        lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel_4_1_1.setBounds(530, 341, 60, 20);
        frame.getContentPane().add(lblNewLabel_4_1_1);
        
        JLabel lblNewLabel_4_1_2 = new JLabel("Venue:");
        lblNewLabel_4_1_2.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel_4_1_2.setBounds(20, 397, 60, 20);
        frame.getContentPane().add(lblNewLabel_4_1_2);
        
        JLabel lblNewLabel_4_1_3 = new JLabel("EntryFee:");
        lblNewLabel_4_1_3.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel_4_1_3.setBounds(487, 455, 96, 20);
        frame.getContentPane().add(lblNewLabel_4_1_3);
        
        JLabel lblNewLabel_4_1_4 = new JLabel("Time:");
        lblNewLabel_4_1_4.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel_4_1_4.setBounds(20, 455, 60, 20);
        frame.getContentPane().add(lblNewLabel_4_1_4);
        
        JLabel lblNewLabel_4_1_5 = new JLabel("Contact No:");
        lblNewLabel_4_1_5.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel_4_1_5.setBounds(168, 455, 132, 20);
        frame.getContentPane().add(lblNewLabel_4_1_5);
        
        textField_3 = new JTextField();
        textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        textField_3.setColumns(10);
        textField_3.setBounds(20, 416, 300, 26);
        frame.getContentPane().add(textField_3);
        
        textField_4 = new JTextField();
        textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        textField_4.setColumns(10);
        textField_4.setBounds(487, 475, 253, 26);
        frame.getContentPane().add(textField_4);
        
        textField_5 = new JTextField();
        textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
        textField_5.setColumns(10);
        textField_5.setBounds(171, 475, 272, 26);
        frame.getContentPane().add(textField_5);
        
        textField_6 = new JTextField();
        textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
        textField_6.setColumns(10);
        textField_6.setBounds(20, 473, 108, 26);
        frame.getContentPane().add(textField_6);
        
        comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cricket", "Football", "Volleyball", "Kabaddi", "Basketball"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setBounds(235, 361, 262, 26);
		frame.getContentPane().add(comboBox);
		
		    formattedTextField = new JFormattedTextField();
			formattedTextField.setColumns(3);
			formattedTextField.setBounds(530, 363, 213, 26);
			frame.getContentPane().add(formattedTextField);
			
			JLabel lblNewLabel_3_1 = new JLabel("hh:mm:ss");
			lblNewLabel_3_1.setForeground(Color.BLUE);
			lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_3_1.setBounds(70, 454, 180, 26);
			frame.getContentPane().add(lblNewLabel_3_1);
        try {
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","1111999");
			String query = "Select * from result_single ";
			PreparedStatement pst= con.prepareStatement(query);
			ResultSet rs = pst.executeQuery();			
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
			JButton btnNewButton = new JButton("Back");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.setVisible(false);
					Admin_Home_Page window = new Admin_Home_Page();
                    window.initialize();
                    window.frame.setVisible(true);
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnNewButton.setBackground(Color.BLACK);
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setBounds(0, 0, 89, 23);
			frame.getContentPane().add(btnNewButton);
			
			JLabel lblNewLabel_4_1_2_1 = new JLabel("Winner:");
			lblNewLabel_4_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 17));
			lblNewLabel_4_1_2_1.setBounds(350, 397, 108, 20);
			frame.getContentPane().add(lblNewLabel_4_1_2_1);
			
			JLabel lblNewLabel_4_1_2_2 = new JLabel("RunnerUp");
			lblNewLabel_4_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 17));
			lblNewLabel_4_1_2_2.setBounds(529, 397, 108, 20);
			frame.getContentPane().add(lblNewLabel_4_1_2_2);
			
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textField_1.setColumns(10);
			textField_1.setBounds(350, 418, 146, 26);
			frame.getContentPane().add(textField_1);
			
			textField_2 = new JTextField();
			textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textField_2.setColumns(10);
			textField_2.setBounds(530, 419, 213, 24);
			frame.getContentPane().add(textField_2);
			
			JButton btnNewButton_1 = new JButton("Remove");
			btnNewButton_1.setForeground(Color.WHITE);
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int option = JOptionPane.showConfirmDialog(null, "Are you sure, The selected record will be permanently removed from the system","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
					if (option == JOptionPane.YES_OPTION)
					{
					try {lblNewLabel.setVisible(false);	
					
    				
					
    				String sn = textField.getText();
    				
    				
    				    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","1111999");
    					PreparedStatement st = con.prepareStatement("delete from  result_single where Tournament_No = '"+sn+"'");
    					st.executeUpdate();
    							
    					 textField.setText("");
    					 comboBox.setSelectedItem("");
    					 formattedTextField.setText("");
						 textField_3.setText("");
						 textField_4.setText("");
						 textField_5.setText("");
						 textField_6.setText("");
						 textField_1.setText("");
						 textField_2.setText("");
						 
										
    				
    							
    			           
    						con.close();
    						st.close();
    						}
    						catch(Exception e2)
    						{
    							lblNewLabel.setVisible(true);	
    						}
				 try {
        				Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","1111999");
        				String query = "Select * from result_single ";
        				PreparedStatement pst= con.prepareStatement(query);
        				ResultSet rs = pst.executeQuery();			
        				table.setModel(DbUtils.resultSetToTableModel(rs));
        		 }catch(Exception e3)
        			{
        				e3.printStackTrace();
        			}
					}
				
				}
			});
			btnNewButton_1.setBackground(new Color(138, 43, 226));
			btnNewButton_1.setBounds(771, 365, 114, 136);
			frame.getContentPane().add(btnNewButton_1);
			
			lblNewLabel = new JLabel("Select row first");
			lblNewLabel.setVisible(false);
			lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 14));
			lblNewLabel.setForeground(Color.RED);
			lblNewLabel.setBounds(771, 340, 114, 21);
			frame.getContentPane().add(lblNewLabel);
			
		   }
		catch(Exception e3)
		{
			e3.printStackTrace();
		}
    }
}
