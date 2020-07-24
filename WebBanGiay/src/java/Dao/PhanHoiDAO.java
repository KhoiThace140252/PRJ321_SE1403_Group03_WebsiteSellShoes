/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Database.ConnectToDatabase;
import Model.PhanHoi;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class PhanHoiDAO implements ObjectDAO {

     public static Map<String, PhanHoi> mapPhanHoi = loadPhanHoi();//tao map luu thong tin phan hoi
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  //format date

    /**
     * Ham load phan hoi
     *
     * @return map chua thong tin phan hoi
     */
    public static Map<String, PhanHoi> loadPhanHoi() {
        Map<String, PhanHoi> map = new HashMap<>();//tao mot map 
        try {
            ResultSet rs = new ConnectToDatabase().selectData("SELECT * FROM `phanhoi`");//cau lenh sql
            while (rs.next()) {//vong lap get cac gia tri
                int Idphanhoi = rs.getInt(1);//id phan hoi
                String Chude = rs.getString(2);//chu de
                String Tentaikhoan = rs.getString(3);//ten tai khoan
                String Email = rs.getString(4);//email
                String Noidung = rs.getString(5);//noi dung
                Date currentDate = rs.getDate(6);//current date
                PhanHoi ph = new PhanHoi(Idphanhoi, Chude, Tentaikhoan, Email, Noidung, currentDate);//ph chua thong tin phan hoi
                map.put(ph.getChude(), ph);//add vao map
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;//neu load that bai
        }

        return map;//neu load thanh cong
    }

    /**
     * Ham lay thong tin phan hoi bang id
     *
     * @param idfeedback id phan hoi
     * @return ph
     */
    public PhanHoi getFeedbackByID(String idfeedback) {
        try {
            String sql = "SELECT * FROM `phanhoi` WHERE Idphanhoi=?";//cau lenh sql
            Connection connect = ConnectToDatabase.getConnect();//lay ket noi
            PreparedStatement ppstm = connect.prepareStatement(sql);//thuc hien cau lenh sql
            ppstm.setString(1, idfeedback);//set gia tri
            ResultSet rs = ppstm.executeQuery();//rs get gia tri
            if (rs.first()) {//neu co gia tri
                int Idphanhoi = rs.getInt(1);//id phan hoi
                String Chude = rs.getString(2);//chu de
                String Tentaikhoan = rs.getString(3);//ten tai khoan
                String Email = rs.getString(4);//email
                String Noidung = rs.getString(5);//noi dung
                Date datetime = rs.getDate(6);//date
                PhanHoi ph = new PhanHoi(Idphanhoi, Chude, Tentaikhoan, Email, Noidung, datetime);//luu thong tin vao ph
                return ph;//neu thanh cong
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;//neu that bai
    }

    /**
     * Ham them san pham
     *
     * @param obj cac gia tri can them
     * @return true neu thanh cong hoac false neu that bai
     */
    public boolean add(Object obj) {
        PhanHoi ph = (PhanHoi) obj;//Mot object ph chua cac gia tri
        mapPhanHoi.put(ph.getTentaikhoan(), ph);//them vao map
        try {
            String sql = "insert into phanhoi values (?,?,?,?,?,?)";//cau lenh sql
            Connection getConnect = ConnectToDatabase.getConnect();//lay ket noi
            PreparedStatement ppstm = getConnect.prepareStatement(sql);//thuc hien cau lenh sql
            ppstm.setInt(1, ph.getIdphanhoi());//id phan hoi
            ppstm.setString(2, ph.getChude());//chu de
            ppstm.setString(3, ph.getTentaikhoan());//ten tai khoan
            ppstm.setString(4, ph.getEmail());//email
            ppstm.setString(5, ph.getNoidung());//noi dung
            ppstm.setDate(6, Date.valueOf(sdf.format(new java.util.Date())));//currentDate
            ppstm.executeUpdate();//thuc hien cau lenh
        } catch (Exception e) {
            System.out.println("Hệ thống gặp lỗi " + e.getMessage());
            return false;//neu that bai
        }
        return true;//neu thanh cong
    }

    @Override
    public boolean del(String id) {
         try {
             String sql="DELETE FROM `phanhoi` WHERE Idphanhoi=?";
             Connection getConnect = ConnectToDatabase.getConnect();//lay ket noi
             PreparedStatement ppstm = getConnect.prepareStatement(sql);//thuc hien cau lenh sql
             ppstm.setInt(1,Integer.parseInt(id));
             ppstm.executeUpdate();
             return true;
         } catch (SQLException ex) {
             Logger.getLogger(PhanHoiDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
         return false;
    } 
    /**
     * Ham lay chu de
     *
     * @param chude chu de cap nhat
     * @return map
     */
    public static Map<String, PhanHoi> searchComment(String chude) {
        Map<String, PhanHoi> map = new HashMap<>();//tao mot map
        try {
            String sql = "SELECT * FROM `phanhoi` WHERE Chude=?";//cau lenh sql
            Connection connect = ConnectToDatabase.getConnect();//lay ket noi
            PreparedStatement ppstm = connect.prepareStatement(sql);//thuc hien cau lenh sql
            ppstm.setString(1, chude);//lay gia tri
            ResultSet rs = ppstm.executeQuery();//rs get gia tri
            while (rs.next()) {//vong lap lay thong tin dua vao map
                int Idphanhoi = rs.getInt(1);//id phan hoi
                String Chude = rs.getString(2);//chu de
                String Tentaikhoan = rs.getString(3);//ten tai khoan
                String Email = rs.getString(4);//email
                String Noidung = rs.getString(5);//noi dung
                Date currentDate = rs.getDate(6);//curent date
                PhanHoi ph = new PhanHoi(Idphanhoi + 1, Chude, Tentaikhoan, Email, Noidung, currentDate);
                map.put(ph.getTentaikhoan(), ph);//dua vao map
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;//that bai
        }

        return map;//thanh cong
    }


}
