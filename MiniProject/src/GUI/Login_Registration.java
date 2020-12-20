package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Login_Registration {
    
	protected JFrame frame;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JComboBox comboBox;
	private JLabel lblNewLabel_1_1_1;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Registration window = new Login_Registration();
					
					window.initialize2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	protected void initialize2() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Login_Registration.class.getResource("/Images/Mylogo.png")));
		frame.getContentPane().setBackground(new Color(204, 255, 204));
		frame.getContentPane().setForeground(Color.BLUE);
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		frame.setBounds(100, 100, 564, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USERTYPE :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(31, 106, 128, 17);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int flag = 0;
				         lblNewLabel_4.setVisible(false);
				  try {  lblNewLabel_1_1_1.setVisible(false);
					     String adminpassword = "Sachintendulkar10";
			    	     Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","1111999");
						 PreparedStatement st = con.prepareStatement("insert into Login values(?,?,?,?,?)");
						 
						 LocalDate Date = java.time.LocalDate.now();
						 LocalTime Time = java.time.LocalTime.now();
						 
						 String ut =  (String)comboBox.getSelectedItem();
						 String un =  textField_1.getText();
						 String p =   String.valueOf(passwordField.getPassword());
						 String d =   Date.toString();
						 String t =   Time.toString();
						
						    if(ut.equals("Admin"))
						    {
						     String ap =JOptionPane.showInputDialog("Enter Password in order to be an Admin");
						    		 if(ap.equals(adminpassword))
						          {  lblNewLabel_3.setVisible(false);
						    	    st.setString(1, ut);
								    st.setString(2,un);
								    st.setString(3,p);
								    st.setString(4,d);
								    st.setString(5,t);
								    								   							  								    
								    int count =  st.executeUpdate();
										
								    st.close();
								    con.close();
						          }
						          else{
						        	  flag = 1;
						        	  lblNewLabel_4.setVisible(false);
						        	  lblNewLabel_3.setVisible(true);
						              }
						    }
						    else {
						    	    st.setString(1, ut);
								    st.setString(2,un);
								    st.setString(3,p);
								    st.setString(4,d);
								    st.setString(5,t);
						    int count =  st.executeUpdate();
								
								st.close();
						    	con.close();
						         }
						  if (flag == 0)  
						  { lblNewLabel_4.setVisible(true);}
						}
						
			      catch(Exception e1)
					 {
			    	  lblNewLabel_1_1_1.setVisible(true);
			    	  lblNewLabel_4.setVisible(false);
			    	  System.out.println(e1);
			    	 
					 }
				 
			
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setBounds(167, 361, 168, 29);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblUsername = new JLabel("USERNAME :");
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblUsername.setBounds(31, 168, 128, 17);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD :");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_1.setBounds(31, 225, 128, 17);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(169, 164, 209, 29);
		frame.getContentPane().add(textField_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(169, 225, 209, 29);
		frame.getContentPane().add(passwordField);
		
		lblNewLabel_1_1_1 = new JLabel("The Entered Username is't allowed or it already exists please try another one !");
	    lblNewLabel_1_1_1.setForeground(Color.RED);
		lblNewLabel_1_1_1.setVisible(false);
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblNewLabel_1_1_1.setBounds(10, 298, 494, 17);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblLoginRegistrationForm = new JLabel("LOGIN REGISTRATION FORM");
		lblLoginRegistrationForm.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblLoginRegistrationForm.setBounds(116, 31, 262, 17);
		frame.getContentPane().add(lblLoginRegistrationForm);
		
	    comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Participant", "Viewer"}));
		comboBox.setBounds(169, 98, 209, 29);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				loginform lf= new loginform();
				lf.initialize();
				lf.frmLoginform.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setBounds(0, 0, 76, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("It is compulsory to fill each field");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setBounds(31, 59, 304, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Only letters numbers or underscore are allowed.");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setBounds(169, 193, 291, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Only  numbers are allowed.");
		lblNewLabel_2_1.setForeground(Color.BLUE);
		lblNewLabel_2_1.setBounds(169, 255, 291, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
	    lblNewLabel_3 = new JLabel("Incorrect Admin Password!");
	    lblNewLabel_3.setVisible(false); 
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBounds(169, 124, 291, 29);
		frame.getContentPane().add(lblNewLabel_3);
		
	    lblNewLabel_4 = new JLabel("Registration Successful.");
		lblNewLabel_4.setVisible(false);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(141, 326, 262, 24);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
