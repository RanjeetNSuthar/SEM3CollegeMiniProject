package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

 

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

 

public class Single_registration_form extends JFrame {

 

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    protected JTextField textField_4;
    private  JLabel lblNewLabel_6;
    protected JTextField textField_5;
    private JLabel lblNewLabel_8;

 

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Single_registration_form frame = new Single_registration_form();
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
    public Single_registration_form() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(Single_registration_form.class.getResource("/Images/Mylogo.png")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1212, 686);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("SINGLE REGISTRATION ");
        lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        lblNewLabel.setBounds(369, 24, 347, 49);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("COLLEGE NAME");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
        lblNewLabel_1.setBounds(28, 118, 136, 34);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("SPORT NAME");
        lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
        lblNewLabel_2.setBounds(27, 181, 122, 28);
        contentPane.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("NAME");
        lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
        lblNewLabel_3.setBounds(28, 236, 94, 28);
        contentPane.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("GENDER");
        lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
        lblNewLabel_4.setBounds(28, 275, 94, 34);
        contentPane.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("DOB");
        lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
        lblNewLabel_5.setBounds(32, 378, 77, 38);
        contentPane.add(lblNewLabel_5);
        
        textField = new JTextField();
        textField.setBounds(212, 111, 267, 41);
        contentPane.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setBounds(212, 235, 267, 32);
        contentPane.add(textField_1);
        textField_1.setColumns(10);
        
        JRadioButton rdbtnNewRadioButton = new JRadioButton("MALE");
        rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
        rdbtnNewRadioButton.setBounds(212, 281, 111, 23);
        contentPane.add(rdbtnNewRadioButton);
        
        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("FEMALE");
        rdbtnNewRadioButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
        rdbtnNewRadioButton_1.setBounds(340, 281, 111, 23);
        contentPane.add(rdbtnNewRadioButton_1);
        
         ButtonGroup gen = new ButtonGroup();
            gen.add(rdbtnNewRadioButton);
            gen.add(rdbtnNewRadioButton_1);
        
        
        JComboBox comboBox_1 = new JComboBox();
        comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        comboBox_1.setBounds(212, 382, 57, 30);
        contentPane.add(comboBox_1);
        
        JComboBox comboBox_2 = new JComboBox();
        comboBox_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
        comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
        comboBox_2.setBounds(298, 383, 71, 28);
        contentPane.add(comboBox_2);
        
        JComboBox comboBox_3 = new JComboBox();
        comboBox_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010"}));
        comboBox_3.setBounds(399, 382, 94, 28);
        contentPane.add(comboBox_3);
        
        JButton btnNewButton = new JButton("SUBMIT");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 try {
        			 lblNewLabel_8.setVisible(false);
        			 lblNewLabel_6.setVisible(false);  
             		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","1111999");
     				 PreparedStatement st = con.prepareStatement("insert into single_registrations values(null,?,?,?,?,?,?,?,?)");
     				 String g = null;
     				 if (rdbtnNewRadioButton.isSelected())
     				 {     g = "Male";           }
     				 else if (rdbtnNewRadioButton_1.isSelected())
     				 {     g = "Female"  ;      }
     				 else {  lblNewLabel_6.setVisible(true);      }
     					 
     				 String colln=  textField.getText();
     				 String sn =   textField_5.getText();
     				 String pana =  textField_1.getText();
     				 String gender =   g ;
     				 String cono =   textField_3.getText();
       				 String db =   ((String) comboBox_3.getSelectedItem())+"-"+((String) comboBox_2.getSelectedItem())+"-"+((String) comboBox_1.getSelectedItem());
     				 String aano =   textField_2.getText();
     				 String tono =  textField_4.getText();
     				 
     				 
     				    st.setString(1, colln);
     				    st.setString(2, sn);
     				    st.setString(3, pana);
     				    st.setString(4, gender);
     				    st.setString(5, cono);
     				    st.setString(6, db);
     				    st.setString(7, aano);
     				    st.setString(8, tono);
     		           int count =  st.executeUpdate();
     		            st.close();
     			    	con.close();
     			    	lblNewLabel_8.setVisible(true);
     			    	
     				   }
             	
             		catch(Exception e7)
             		{     lblNewLabel_6.setVisible(true);  System.out.println(e7);       }
        	}
        });
        btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        btnNewButton.setBounds(156, 503, 237, 70);
        contentPane.add(btnNewButton);
        
        lblNewLabel_6 = new JLabel(" Invalid Entry !");
        lblNewLabel_6.setVisible(false);
        lblNewLabel_6.setForeground(Color.RED);
        lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        lblNewLabel_6.setBounds(217, 469, 188, 34);
        contentPane.add(lblNewLabel_6);
        
        JLabel lblNewLabel_5_1 = new JLabel("AADHAR NO:");
        lblNewLabel_5_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
        lblNewLabel_5_1.setBounds(28, 436, 144, 38);
        contentPane.add(lblNewLabel_5_1);
        
        textField_2 = new JTextField();
        textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField_2.setBounds(212, 436, 281, 30);
        contentPane.add(textField_2);
        textField_2.setColumns(10);
        
        JLabel lblNewLabel_3_1 = new JLabel("CONTACT NO:");
        lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
        lblNewLabel_3_1.setBounds(28, 330, 136, 28);
        contentPane.add(lblNewLabel_3_1);
        
        textField_3 = new JTextField();
        textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField_3.setColumns(10);
        textField_3.setBounds(212, 328, 267, 30);
        contentPane.add(textField_3);
        
        JLabel lblNewLabel_1_1 = new JLabel("TOURNAMENT NO:");
        lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
        lblNewLabel_1_1.setBounds(563, 118, 153, 34);
        contentPane.add(lblNewLabel_1_1);
        
        textField_4 = new JTextField();
        textField_4.setEditable(false);
        textField_4.setBounds(714, 118, 94, 34);
        contentPane.add(textField_4);
        textField_4.setColumns(10);
        
        JLabel lblNewLabel_7 = new JLabel("day");
        lblNewLabel_7.setForeground(Color.BLUE);
        lblNewLabel_7.setBounds(212, 409, 46, 14);
        contentPane.add(lblNewLabel_7);
        
        JLabel lblNewLabel_7_1 = new JLabel("Month");
        lblNewLabel_7_1.setForeground(Color.BLUE);
        lblNewLabel_7_1.setBounds(298, 409, 46, 14);
        contentPane.add(lblNewLabel_7_1);
        
        JLabel lblNewLabel_7_2 = new JLabel("Year");
        lblNewLabel_7_2.setForeground(Color.BLUE);
        lblNewLabel_7_2.setBounds(399, 409, 46, 14);
        contentPane.add(lblNewLabel_7_2);
        
        JButton btnNewButton_1 = new JButton("Back");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Participant_Tournament_single window = new Participant_Tournament_single();
                window.frame.setVisible(true);
        	}
        });
        btnNewButton_1.setBackground(Color.BLACK);
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnNewButton_1.setForeground(Color.WHITE);
        btnNewButton_1.setBounds(0, 0, 89, 23);
        contentPane.add(btnNewButton_1);
        
        textField_5 = new JTextField();
        textField_5.setEditable(false);
        textField_5.setBounds(212, 179, 267, 34);
        contentPane.add(textField_5);
        textField_5.setColumns(10);
        
        lblNewLabel_8 = new JLabel("Registration Successful");
        lblNewLabel_8.setVisible(false);
        lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
        lblNewLabel_8.setForeground(Color.GREEN);
        lblNewLabel_8.setBounds(166, 584, 215, 28);
        contentPane.add(lblNewLabel_8);
    }
}