package flipkart.flipkart_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App
{
	public static void main(String[] args) throws Exception
	{
		String jdbc_url="jdbc:oracle:thin:@localhost:1521:XE";
		
		String user="SYSTEM";
		
		String pass="tiger";
		
		System.out.println("Hellow world 1");
		
		System.out.println("Hello world 2nnnn");
		
		Connection con=DriverManager.getConnection(jdbc_url, user, pass);
		
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery("select * from movies");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
		}
	}
}