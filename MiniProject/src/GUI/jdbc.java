package GUI;

import java.sql.*;

import javax.swing.*;


public class jdbc {
   
	public static void main (String[] args) throws Exception
	{   String query="select * from emp1";
		String url="jdbc:mysql://localhost:3306/jdbc_demo";
	    String uname="root";
	    String pass = "1111999";
		new jdbc();
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while (rs.next())
			System.out.println(rs.getInt(1)+" "+rs.getString(2)); 
		
		st.close();
		con.close();
    }
	
}
	

