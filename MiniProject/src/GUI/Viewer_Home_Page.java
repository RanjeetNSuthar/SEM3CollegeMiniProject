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

 

public class Viewer_Home_Page {

 

 protected JFrame frame;

  public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Viewer_Home_Page window = new Viewer_Home_Page();
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
        
        JMenu mnNewMenu_4 = new JMenu("Tournament");
        mnNewMenu_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
        menuBar.add(mnNewMenu_4);
        
        JMenuItem mntmNewMenuItem_11 = new JMenuItem("Teams");
        mntmNewMenuItem_11.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 frame.setVisible(false);
        		 Viewer_tournament_team window = new  Viewer_tournament_team();
                 window.frame.setVisible(true);
        	}
        });
        mntmNewMenuItem_11.setFont(new Font("Times New Roman", Font.BOLD, 15));
        mnNewMenu_4.add(mntmNewMenuItem_11);
        
        JMenuItem mntmNewMenuItem = new JMenuItem("Singles");
        mntmNewMenuItem.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.setVisible(false);
        		Viewer_tournament_single window = new  Viewer_tournament_single();
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
        		Viewer_Result_team   window = new  Viewer_Result_team();
                window.frame.setVisible(true);
        	}
        });
        mntmNewMenuItem_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
        mnNewMenu_8.add(mntmNewMenuItem_3);
        
        JMenuItem mntmNewMenuItem_4 = new JMenuItem("singles");
        mntmNewMenuItem_4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.setVisible(false);
        		Viewer_Result_single   window = new  Viewer_Result_single ();
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
        lblNewLabel.setIcon(new ImageIcon(Viewer_Home_Page.class.getResource("/Images/teams.jpg")));
        lblNewLabel.setBounds(23, 46, 1293, 653);
        frame.getContentPane().add(lblNewLabel);
    }
}
 