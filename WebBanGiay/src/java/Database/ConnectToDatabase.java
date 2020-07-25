/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

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

    /**
     * tao mot constructor ko tham so
     */
    public ConnectToDatabase() {

    }

    /**
     * lay connect
     *
     * @return connection ket noi
     */
    public static Connection getConnect() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");//tao driver
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost//node229396-webbangiay.j.layershift.co.uk", "root", "ZIOnrl19459");//ket noi den csdl       
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error when you connect to database!Error is: " + e.getMessage());
        }
        return connection;//ket noi
    }

    /**
     * Ham thuc thi cau lenh sql
     *
     * @param sql cau lenh sql
     * @throws Exception
     */
    public void excuteSql(String sql) throws Exception {
        Connection connect = getConnect();//lay ket noi
        Statement stmt = connect.createStatement();//tao stmt chuan bi thuc hien ket noi
        stmt.executeUpdate(sql);//thuc hien cau lenh sql
    }

    /**
     * Ham tao result get gia tri
     *
     * @param sql cau lenh sql
     * @return rs
     * @throws Exception
     */
    public ResultSet selectData(String sql) throws Exception {
        Connection connect = getConnect();//lay ket noi
        Statement stmt = connect.createStatement();//tao stmt chuan bi thuc hien ket noi
        ResultSet rs = stmt.executeQuery(sql);//thuc hien cau lenh sql
        return rs;//gia tri
    }
}
