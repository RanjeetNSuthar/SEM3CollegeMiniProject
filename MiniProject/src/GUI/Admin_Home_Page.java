package GUI;

import java.awt.EventQueue;

 

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import net.proteanit.sql.DbUtils;

import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JPanel;

 

public class Admin_Home_Page {

 

 protected JFrame frame;

  public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Admin_Home_Page window = new Admin_Home_Page();
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
       
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Admin_Home_Page.class.getResource("/Images/Mylogo.png")));
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(0, 0, 1350, 47);
        frame.getContentPane().add(menuBar);
        
        JMenu mnNewMenu = new JMenu("Manager");
        mnNewMenu.setFont(new Font("Times New Roman", Font.BOLD, 20));
        menuBar.add(mnNewMenu);
        
        JMenuItem mntmNewMenuItem_13 = new JMenuItem("Login Registration");
        mntmNewMenuItem_13.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.setVisible(false);
        		AdminLoginRegTable window = new AdminLoginRegTable();
				window.initialize();
				window.frame.setVisible(true);
				
        	}
        });
        
        JMenu mnNewMenu_1 = new JMenu("Tournament Registration");
        mnNewMenu_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        mnNewMenu.add(mnNewMenu_1);
        
        JMenuItem mntmNewMenuItem_8 = new JMenuItem("Teams");
        mntmNewMenuItem_8.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.setVisible(false);
        		Admin_Manager_team_registration window = new Admin_Manager_team_registration();
				window.initialize();
				window.frame.setVisible(true);
        	}
        });
        mntmNewMenuItem_8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        mnNewMenu_1.add(mntmNewMenuItem_8);
        
        JMenuItem mntmNewMenuItem_8_1 = new JMenuItem("Singles");
        mntmNewMenuItem_8_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.setVisible(false);
        		
        		Admin_Manager_single_registration window = new Admin_Manager_single_registration();
				window.initialize();
				window.frame.setVisible(true);
        	}
        });
        mntmNewMenuItem_8_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        mnNewMenu_1.add(mntmNewMenuItem_8_1);
        mntmNewMenuItem_13.setFont(new Font("Times New Roman", Font.BOLD, 15));
        mnNewMenu.add(mntmNewMenuItem_13);
        
        JMenuItem mntmNewMenuItem_2 = new JMenuItem("Close");
        mntmNewMenuItem_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
        mnNewMenu.add(mntmNewMenuItem_2);
        
        Component horizontalStrut = Box.createHorizontalStrut(57);
        menuBar.add(horizontalStrut);
        
        JMenu mnNewMenu_4 = new JMenu("Tournament");
        mnNewMenu_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
        menuBar.add(mnNewMenu_4);
        
        JMenuItem mntmNewMenuItem_11 = new JMenuItem("Teams");
        mntmNewMenuItem_11.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 frame.setVisible(false);
        		 Admin_team_registration window = new  Admin_team_registration();
                 window.frame.setVisible(true);
        	}
        });
        mntmNewMenuItem_11.setFont(new Font("Times New Roman", Font.BOLD, 15));
        mnNewMenu_4.add(mntmNewMenuItem_11);
        
        JMenuItem mntmNewMenuItem = new JMenuItem("Singles");
        mntmNewMenuItem.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.setVisible(false);
        		Admin_Tournament_Single window = new  Admin_Tournament_Single();
                window.frame.setVisible(true);
        	}
        });
        mntmNewMenuItem.setFont(new Font("Times New Roman", Font.BOLD, 15));
        mnNewMenu_4.add(mntmNewMenuItem);
        
        JMenuItem mntmNewMenuItem_1 = new JMenuItem("Close");
        mntmNewMenuItem_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        mnNewMenu_4.add(mntmNewMenuItem_1);
        
        Component horizontalStrut_1 = Box.createHorizontalStrut(58);
        menuBar.add(horizontalStrut_1);
        
        JMenu mnNewMenu_8 = new JMenu("Result");
        mnNewMenu_8.setFont(new Font("Times New Roman", Font.BOLD, 20));
        menuBar.add(mnNewMenu_8);
        
        JMenuItem mntmNewMenuItem_3 = new JMenuItem("Teams");
        mntmNewMenuItem_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.setVisible(false);
        		Admin_Result_team  window = new  Admin_Result_team ();
                window.frame.setVisible(true);
        	}
        });
        mntmNewMenuItem_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
        mnNewMenu_8.add(mntmNewMenuItem_3);
        
        JMenuItem mntmNewMenuItem_4 = new JMenuItem("singles");
        mntmNewMenuItem_4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.setVisible(false);
        		Admin_Result_single  window = new  Admin_Result_single ();
                window.frame.setVisible(true);
        	}
        });
        mntmNewMenuItem_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
        mnNewMenu_8.add(mntmNewMenuItem_4);
        
        JMenuItem mntmNewMenuItem_5 = new JMenuItem("Close");
        mntmNewMenuItem_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
        mnNewMenu_8.add(mntmNewMenuItem_5);
        
        JButton btnNewButton = new JButton("LOGOUT");
        btnNewButton.setSelectedIcon(new ImageIcon(Admin_Home_Page.class.getResource("/Images/Logout.jpg")));
        btnNewButton.setBackground(Color.BLACK);
        btnNewButton.setForeground(Color.RED);
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.setVisible(false);
        		loginform window = new loginform();
				window.initialize();
				window.frmLoginform.setVisible(true);
        	}
        });
        btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnNewButton.setBounds(1170, 0, 180, 47);
        frame.getContentPane().add(btnNewButton);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(49, 82, 46, 14);
        frame.getContentPane().add(lblNewLabel);
        
        JPanel panel = new JPanel();
        panel.setBounds(10, 58, 1330, 660);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(10, 5, 1310, 644);
        panel.add(panel_1);
        panel_1.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(Admin_Home_Page.class.getResource("/Images/homepage.jpg")));
        lblNewLabel_1.setBounds(0, 0, 1300, 644);
        panel_1.add(lblNewLabel_1);
    }
}
 