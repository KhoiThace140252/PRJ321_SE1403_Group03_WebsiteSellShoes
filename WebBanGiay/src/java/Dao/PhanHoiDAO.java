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
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class PhanHoiDAO implements ObjectDAO {

    public static Map<String, PhanHoi> mapPhanHoi = loadPhanHoi();
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  //format date

    public static Map<String, PhanHoi> loadPhanHoi() {
        Map<String, PhanHoi> map = new HashMap<>();
        try {
            ResultSet rs = new ConnectToDatabase().selectData("SELECT * FROM `phanhoi`");
            while (rs.next()) {
                int Idphanhoi = rs.getInt(1);
                String Chude = rs.getString(2);
                String Tentaikhoan = rs.getString(3);
                String Email = rs.getString(4);
                String Noidung = rs.getString(5);
                Date currentDate = rs.getDate(6);
                PhanHoi ph = new PhanHoi(Idphanhoi, Chude, Tentaikhoan, Email, Noidung, currentDate);
                map.put(ph.getChude(), ph);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return map;
    }

    public PhanHoi getFeedbackByID(String idfeedback) {
        try {
            String sql = "SELECT * FROM `phanhoi` WHERE Idphanhoi=?";
            Connection connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, idfeedback);
            ResultSet rs = ppstm.executeQuery();
            if (rs.first()) {
                int Idphanhoi = rs.getInt(1);
                String Chude = rs.getString(2);
                String Tentaikhoan = rs.getString(3);
                String Email = rs.getString(4);
                String Noidung = rs.getString(5);
                Date datetime = rs.getDate(6);
                PhanHoi ph = new PhanHoi(Idphanhoi, Chude, Tentaikhoan, Email, Noidung, datetime);
                return ph;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(Object obj) {
        PhanHoi ph = (PhanHoi) obj;
        mapPhanHoi.put(ph.getTentaikhoan(), ph);
        try {
            String sql = "insert into phanhoi values (?,?,?,?,?,?)";
            Connection getConnect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = getConnect.prepareStatement(sql);
            ppstm.setInt(1, ph.getIdphanhoi());
            ppstm.setString(2, ph.getChude());
            ppstm.setString(3, ph.getTentaikhoan());
            ppstm.setString(4, ph.getEmail());
            ppstm.setString(5, ph.getNoidung());
            ppstm.setDate(6, Date.valueOf(sdf.format(new java.util.Date())));
            ppstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Hệ thống gặp lỗi " + e.getMessage());
            return false;
        }
        return true;
    }

    public static Map<String, PhanHoi> searchComment(String chude) {
        Map<String, PhanHoi> map = new HashMap<>();
        try {
            String sql = "SELECT * FROM `phanhoi` WHERE Chude=?";
            Connection connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, chude);
            ResultSet rs = ppstm.executeQuery();
            while (rs.next()) {
                int Idphanhoi = rs.getInt(1);
                String Chude = rs.getString(2);
                String Tentaikhoan = rs.getString(3);
                String Email = rs.getString(4);
                String Noidung = rs.getString(5);
                Date currentDate = rs.getDate(6);
                PhanHoi ph = new PhanHoi(Idphanhoi + 1, Chude, Tentaikhoan, Email, Noidung, currentDate);
                map.put(ph.getTentaikhoan(), ph);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return map;
    }

}
