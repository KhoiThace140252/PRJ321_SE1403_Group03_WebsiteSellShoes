/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class ConnectToDatabase {
	public ConnectToDatabase(){
		
	}
	public static Connection getConnect(){
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/group3", "root","");
			System.out.println("Connect success");
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Error when you connect to database!Error is: "+e.getMessage());
		}
		return connection;
	}
	public static void main(String[] args) {
		System.out.println(getConnect());
	}
	public  void excuteSql(String sql) throws Exception{
		Connection connect =getConnect();
		Statement stmt =    connect.createStatement();
		stmt.executeUpdate(sql);
	}
	public ResultSet selectData(String sql) throws Exception{
		Connection connect =getConnect();
		Statement stmt =   connect.createStatement();
		ResultSet rs=	stmt.executeQuery(sql);
		return rs;
	}
}