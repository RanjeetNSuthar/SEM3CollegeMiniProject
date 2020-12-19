package GUI;

import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.Toolkit;

public class loginform  {
	private JLabel lblNewLabel_3;
	
    private JComboBox comboBox;
	protected JFrame frmLoginform;
	private JTextField textField;
	private JPasswordField passwordField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			
			public void run() {
				try {
					loginform window = new loginform();
					window.initialize();
					window.frmLoginform.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	
	}

	
	protected void initialize() {
		frmLoginform = new JFrame();
		
		frmLoginform.setResizable(false);
		frmLoginform.setIconImage(Toolkit.getDefaultToolkit().getImage(loginform.class.getResource("/Images/Mylogo.png")));
		frmLoginform.getContentPane().setBackground(Color.WHITE);
		frmLoginform.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(47, 79, 79));
		panel_1.setForeground(new Color(112, 128, 144));
		panel_1.setBounds(10, 11, 824, 455);
		frmLoginform.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 250, 210));
		panel.setBounds(10, 11, 382, 433);
		panel_1.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		ImageIcon icon = new ImageIcon(loginform.class.getResource("/Images/Mylogo.png"));
		lblNewLabel_1.setIcon(icon);
		lblNewLabel_1.setBounds(0, 0, 382, 433);
		panel.add(lblNewLabel_1);

				
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			      try { int flag=0;
				
			    	    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","1111999");
						PreparedStatement st = con.prepareStatement("select * from login");
						ResultSet rs = st.executeQuery();
						String ut =  (String)comboBox.getSelectedItem();
						String un =  textField.getText();
					    String p =   String.valueOf(passwordField.getPassword());
						   
						    
							while(rs.next())
								
							{  
								if( ut.equals(rs.getString(1))  && un.equals(rs.getString(2)) && p.equals(rs.getString(3)))
								{   
									
									// next window open
									
									lblNewLabel_3.setVisible(false);
									frmLoginform.setVisible(false);
									flag = 1;
									if(ut.equals("Admin"))
									{
									Admin_Home_Page window = new Admin_Home_Page();
				                    window.initialize();
				                    window.frame.setVisible(true);
									}
									if(ut.equals("Participant"))
									{
										Participant_Home_Page window = new Participant_Home_Page();
					                    window.initialize();
					                    window.frame.setVisible(true);
									}
									if(ut.equals("Viewer"))
									{
										Viewer_Home_Page window = new Viewer_Home_Page();
					                    window.initialize();
					                    window.frame.setVisible(true);
									}
									
									
									 
								}
							}  
							  
					    	 
								if(flag==0)
								{
									lblNewLabel_3.setVisible(true);
									
								}
								
								st.close();
						    	con.close();
						}
						
			      catch(Exception e1)
					 {
			    	  lblNewLabel_3.setVisible(true);
					 }
			     
			
			}});
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 127, 80));
		btnNewButton.setBounds(459, 308, 253, 31);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLoginform.setVisible(false);
				Login_Registration lr= new Login_Registration();
				lr.initialize2();
				lr.frame.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(521, 375, 130, 30);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Usertype :");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel.setBounds(420, 106, 104, 43);
		panel_1.add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblUsername.setBounds(420, 170, 104, 28);
		panel_1.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblPassword.setBounds(420, 235, 104, 28);
		panel_1.add(lblPassword);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 248, 220));
		textField.setBounds(552, 172, 220, 31);
		panel_1.add(textField);
		textField.setColumns(10);
		
	    comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Participant", "Viewer"}));
		comboBox.setMaximumRowCount(3);
		comboBox.setBounds(551, 112, 221, 30);
		panel_1.add(comboBox);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(552, 235, 220, 31);
		panel_1.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("Institute  Level  Sports  Management");
		lblNewLabel_2.setBackground(new Color(0, 0, 0));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Cambria", Font.BOLD, 19));
		lblNewLabel_2.setBounds(420, 26, 335, 53);
		panel_1.add(lblNewLabel_2);
		
	    lblNewLabel_3 = new JLabel("Invalid Entry ! ");
		lblNewLabel_3.setVisible(false);
		lblNewLabel_3.setEnabled(true);
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblNewLabel_3.setBounds(414, 73, 358, 31);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("If you are new then register first.");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_4.setForeground(new Color(255, 204, 0));
		lblNewLabel_4.setBounds(486, 350, 296, 20);
		panel_1.add(lblNewLabel_4);
		frmLoginform.setTitle("LoginForm");
		frmLoginform.setBounds(100, 100, 860, 516);
		frmLoginform.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}	
