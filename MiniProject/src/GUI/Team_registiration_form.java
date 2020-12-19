package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

 

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

 

public class Team_registiration_form extends JFrame {

 

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTable table;
    private JLabel lblNewLabel_9;
    private JRadioButton rdbtnNewRadioButton;
    private JRadioButton rdbtnNewRadioButton_1;
    private  JLabel lblNewLabel_10;
    private  Connection con;
    protected JTextField textField_3;
    protected JTextField textField_4;

 

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Team_registiration_form frame = new Team_registiration_form();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

 

    /**
     * Create the frame.
     */
    public Team_registiration_form() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(Team_registiration_form.class.getResource("/Images/Mylogo.png")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1297, 888);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("COLLEGE NAME");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblNewLabel.setBounds(10, 75, 130, 31);
        contentPane.add(lblNewLabel);
        
        textField = new JTextField();
        textField.setBounds(220, 75, 249, 41);
        contentPane.add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("SPORT NAME ");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblNewLabel_1.setBounds(10, 128, 122, 31);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("CAPTAIN NAME");
        lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblNewLabel_2.setBounds(10, 165, 185, 44);
        contentPane.add(lblNewLabel_2);
        
        textField_1 = new JTextField();
        textField_1.setBounds(220, 179, 249, 31);
        contentPane.add(textField_1);
        textField_1.setColumns(10);
        
        JLabel lblNewLabel_3 = new JLabel("CONTACT NUMBER");
        lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblNewLabel_3.setBounds(10, 221, 168, 39);
        contentPane.add(lblNewLabel_3);
        
        textField_2 = new JTextField();
        textField_2.setBounds(220, 223, 249, 38);
        contentPane.add(textField_2);
        textField_2.setColumns(10);
        
        JLabel lblNewLabel_4 = new JLabel("GENDER");
        lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblNewLabel_4.setBounds(10, 271, 112, 56);
        contentPane.add(lblNewLabel_4);
        
        rdbtnNewRadioButton = new JRadioButton("MALE");
        rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
        rdbtnNewRadioButton.setBounds(220, 275, 86, 49);
        contentPane.add(rdbtnNewRadioButton);
        
        rdbtnNewRadioButton_1 = new JRadioButton("FEMALE");
        rdbtnNewRadioButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        rdbtnNewRadioButton_1.setBounds(327, 277, 111, 44);
        contentPane.add(rdbtnNewRadioButton_1);
        
         ButtonGroup gen = new ButtonGroup();
            gen.add(rdbtnNewRadioButton);
            gen.add(rdbtnNewRadioButton_1);
            
            JScrollPane scrollPane = new JScrollPane();
            scrollPane.setBounds(45, 360, 902, 267);
            contentPane.add(scrollPane);
            
            table = new JTable();
            scrollPane.setViewportView(table);
            table.setModel(new DefaultTableModel(
                new Object[][] {
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
                    "SR.N0.", "NAME", "DOB", "AADHAR NUMBER"
                }
            ));
            
            JButton btnNewButton = new JButton("SUBMIT");
            btnNewButton.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            
            		
               try {
            		lblNewLabel_9.setVisible(false);  
            		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","1111999");
    				 PreparedStatement st = con.prepareStatement("insert into team_registrations values(null,?,?,?,?,?,?,?,?)");
    				 String g = null;
    				 if (rdbtnNewRadioButton.isSelected())
    				 {     g = "Male";           }
    				 else if (rdbtnNewRadioButton_1.isSelected())
    				 {     g = "Female"  ;      }
    				 else {  lblNewLabel_9.setVisible(true);      }
    					 
    				 String colln=  textField.getText();
    				 String sn =     textField_4.getText();
    				 String cana =  textField_1.getText();
    				 String cono =   textField_2.getText();
    				 String gender =   g ;
    				 String dat =   (java.time.LocalDate.now()).toString();
    				 String ti =   (java.time.LocalTime.now()).toString();
    				 String tono =  textField_3.getText();
    				 
    				 
    				    st.setString(1, colln);
    				    st.setString(2, sn);
    				    st.setString(3, cana);
    				    st.setString(4, cono);
    				    st.setString(5, gender);
    				    st.setString(6, dat);
    				    st.setString(7, ti);
    				    st.setString(8, tono);
    		           int count =  st.executeUpdate();
    		            st.close();
    			    	con.close();
    			    	
    				   }
            	
            		catch(Exception e7)
            		{      lblNewLabel_9.setVisible(true);  System.out.println(e7);       }
            		
            		try {
            			 
            			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","1111999");
    				    java.sql.Statement st1 = con.createStatement();
    				    ResultSet rs = st1.executeQuery(" select RegNo from team_registrations ORDER BY RegNo desc limit 1;");
    				    rs.next();
    				    int regno = rs.getInt(1);
    				    st1.close();
    				    int rcount = table.getRowCount();
    				   
    				    try {
    	            			lblNewLabel_9.setVisible(false);  
    	    	    	     String query = "Create table _"+regno+" (Srno int(5) Auto_increment primary key, name varchar(30), dob date , Aadno Varchar(20))";
       	    				 PreparedStatement st2 = con.prepareStatement(query);
       	    				 st2.executeUpdate();
       	    				 if (table.isEditing()) { table.getCellEditor().stopCellEditing();}
       	    				 for(int i = 0;i<rcount;i++)
       	    					    
         				    {        
    	    				       	 String query1 = "insert into _"+regno+" values(null,?,?,?)"; 					       	    						
       	    	    				 PreparedStatement st3 = con.prepareStatement(query1);
       	    	    				
       	    	    				 String na = (String)  table.getModel().getValueAt(i,1);       	    	    				 
       	    	    				 String db = (String)  table.getModel().getValueAt(i,2);
       	    	    				 String an = (String)  table.getModel().getValueAt(i,3);
       	    	    				
       	    	    				 
       	    	    				    
       	    	    				    st3.setString(1, na);
       	    	    				    st3.setString(2, db);
       	    	    				    st3.setString(3, an);
       	    	    				    int count1 =  st3.executeUpdate();
       	    	    				    st3.close();
       	    	    				   
       	    	    			    	lblNewLabel_10.setVisible(true);   
       	    				 }
    				    }
       	    			 catch(Exception e8) {lblNewLabel_9.setVisible(true);
       	    			
       	    			
       	    			 System.out.println(e8);  }
    				     con.close(); }
       	    			 catch(Exception e9) {lblNewLabel_9.setVisible(true);   }
         				   
         				    }            		
            });
            btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
            btnNewButton.setBounds(406, 638, 235, 51);
            contentPane.add(btnNewButton);
            
            JLabel lblNewLabel_5 = new JLabel("TEAM REGISTRATION ");
            lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
            lblNewLabel_5.setBounds(450, 8, 308, 56);
            contentPane.add(lblNewLabel_5);
            
            JLabel lblNewLabel_6 = new JLabel("TEAM DETAILS");
            lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
            lblNewLabel_6.setBounds(395, 320, 211, 44);
            contentPane.add(lblNewLabel_6);
            
            JLabel lblNewLabel_7 = new JLabel("IT IS COMPULSORY TO FILL EVERY FIELD");
            lblNewLabel_7.setForeground(Color.BLUE);
            lblNewLabel_7.setBackground(Color.LIGHT_GRAY);
            lblNewLabel_7.setFont(new Font("Times New Roman", Font.ITALIC, 15));
            lblNewLabel_7.setBounds(10, 34, 442, 31);
            contentPane.add(lblNewLabel_7);
            
            JLabel lblNewLabel_8 = new JLabel("Fill the team details starting with the captain's name");
            lblNewLabel_8.setForeground(Color.BLUE);
            lblNewLabel_8.setFont(new Font("Tahoma", Font.ITALIC, 14));
            lblNewLabel_8.setBounds(45, 324, 384, 37);
            contentPane.add(lblNewLabel_8);
            
            JButton btnNewButton_1 = new JButton("Back");
            btnNewButton_1.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		 Team_registiration_form t1 = new  Team_registiration_form();
            		t1.setVisible(false);
            		Participant_Tournament_team window = new  Participant_Tournament_team();
                    window.frame.setVisible(true);
            	}
            });
            btnNewButton_1.setForeground(Color.WHITE);
            btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
            btnNewButton_1.setBackground(Color.BLACK);
            btnNewButton_1.setBounds(0, 0, 89, 23);
            contentPane.add(btnNewButton_1);
            
            lblNewLabel_9 = new JLabel("Invalid Entry!");
            lblNewLabel_9.setVisible(false);
            lblNewLabel_9.setBackground(Color.LIGHT_GRAY);
            lblNewLabel_9.setForeground(Color.RED);
            lblNewLabel_9.setFont(new Font("Tahoma", Font.ITALIC, 14));
            lblNewLabel_9.setBounds(543, 153, 122, 31);
            contentPane.add(lblNewLabel_9);
            
            lblNewLabel_10 = new JLabel("Registration Successful");
            lblNewLabel_10.setVisible(false);
            lblNewLabel_10.setBackground(Color.LIGHT_GRAY);
            lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 18));
            lblNewLabel_10.setForeground(Color.GREEN);
            lblNewLabel_10.setBounds(669, 650, 235, 29);
            contentPane.add(lblNewLabel_10);
            
            JLabel lblNewLabel_8_1 = new JLabel("yyyy-mm-dd");
            lblNewLabel_8_1.setForeground(Color.BLUE);
            lblNewLabel_8_1.setFont(new Font("Tahoma", Font.ITALIC, 14));
            lblNewLabel_8_1.setBounds(566, 327, 147, 31);
            contentPane.add(lblNewLabel_8_1);
            
            JLabel lblNewLabel_11 = new JLabel("Tournament No:");
            lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 15));
            lblNewLabel_11.setBounds(529, 75, 136, 23);
            contentPane.add(lblNewLabel_11);
            
            textField_3 = new JTextField();
            textField_3.setEditable(false);
            textField_3.setBounds(669, 73, 122, 31);
            contentPane.add(textField_3);
            textField_3.setColumns(10);
            
            textField_4 = new JTextField();
            textField_4.setEditable(false);
            textField_4.setColumns(10);
            textField_4.setBounds(220, 128, 249, 31);
            contentPane.add(textField_4);
            
    }
}