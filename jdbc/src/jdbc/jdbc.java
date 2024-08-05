package jdbc;

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;


public class jdbc {
	public static void main(String [] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/jdbcjava";
	String userName="root";
	String passWord="root";
	String query="select * from employee";
	Connection con=DriverManager.getConnection(url,userName,passWord);
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(query);
	System.out.println("Connected");
	while(rs.next()){
	System.out.println("Id is "+rs.getInt(1));
	System.out.println("Name is "+rs.getString(2));
	System.out.println("Salary is "+rs.getInt(3));}
    con.close();
    }
}