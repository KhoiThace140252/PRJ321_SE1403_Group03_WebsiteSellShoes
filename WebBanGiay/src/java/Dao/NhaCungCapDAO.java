/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Database.ConnectToDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import Model.*;

/**
 *
 * @author Admin
 */
public class NhaCungCapDAO implements ObjectDAO {

    public static Map<String, NhaCungCap> mapNhaCungCap = layDuLieuTuDatabase();

    @Override
    public boolean add(Object obj) {
        NhaCungCap ncc = (NhaCungCap) obj;
        mapNhaCungCap.put(ncc.getMaNhaCungCap(), ncc);
        try {
            String sql = "insert into NhaCungCap values (?,?,?,?,?,?,?)";
            Connection connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, ncc.getMaNhaCungCap());
            ppstm.setString(2, ncc.getTenNhaCungCap());
            ppstm.setString(3, ncc.getDiaChi());
            ppstm.setString(4, ncc.getSoDienThoai());
            ppstm.setString(5, ncc.getLogo());
            ppstm.setString(6, ncc.getMota());
            ppstm.setString(7, ncc.getTinhtrangncc());
            ppstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Hệ thống gặp lỗi " + e.getMessage());
            return false;
        }
        return true;
    }
//Phương thức lấy dữ liệu từ database lên sử dụng

    public static Map<String, NhaCungCap> layDuLieuTuDatabase() {
        Map<String, NhaCungCap> map = new HashMap<>();
        try {
            ResultSet rs = new ConnectToDatabase().selectData("select * from  NhaCungCap");
            while (rs.next()) {
                String maNhaCungCap = rs.getString(1);
                String tenNhaCungCap = rs.getString(2);
                String diaChi = rs.getString(3);
                String soDienThoai = rs.getString(4);
                String logo = rs.getString(5);
                String mota = rs.getString(6);
                String tinhtrangncc = rs.getString(7);
                NhaCungCap ncc = new NhaCungCap(maNhaCungCap, tenNhaCungCap, diaChi, soDienThoai, logo, mota, tinhtrangncc);
                map.put(ncc.getMaNhaCungCap(), ncc);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return map;
    }

    public NhaCungCap getSupplierByID(String idsupplier) {
        try {
            String sql = "SELECT * FROM `nhacungcap` WHERE Manhacungcap=?";
            Connection connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, idsupplier);
            ResultSet rs = ppstm.executeQuery();
            if (rs.first()) {
                String Idsupplier = rs.getString(1);
                String Namesupplier = rs.getString(2);
                String Address = rs.getString(3);
                String Phone = rs.getString(4);
                String Logo = rs.getString(5);
                String mota = rs.getString(6);
                String tinhtrangncc = rs.getString(7);
                NhaCungCap ncc = new NhaCungCap(Idsupplier, Namesupplier, Address, Phone, Logo, mota, tinhtrangncc);
                return ncc;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean edit(String id, Object obj) {
        NhaCungCap ncc = (NhaCungCap) obj;
        mapNhaCungCap.replace(ncc.getMaNhaCungCap(), ncc);
        String sql = "update NhaCungCap set Tennhacungcap=?,Diachi=?,Sodienthoai=?,Logo=?,Mota=?, TinhtrangNcc=? where Manhacungcap=?";
        Connection connect;
        try {
            connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, ncc.getTenNhaCungCap());
            ppstm.setString(2, ncc.getDiaChi());
            ppstm.setString(3, ncc.getSoDienThoai());
            ppstm.setString(4, ncc.getLogo());
            ppstm.setString(5, ncc.getMota());
            ppstm.setString(6, ncc.getTinhtrangncc());
            ppstm.setString(7, id);
            ppstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean del(String id, String status) {

        String sql = "Update nhacungcap set TinhtrangNcc=? where Manhacungcap='" + id + "'";
        try {
            Connection connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, status);
            ppstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Hệ thống lỗi vì:" + e.getMessage());
            return false;
        }
        return true;
    }

    public static Map<String, NhaCungCap> serchSupplier(String namesuppiler) {
        Map<String, NhaCungCap> map = new HashMap<>();
        try {
            String sql = "select * from  NhaCungCap where Tennhacungcap=?";
            Connection connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, namesuppiler);
            ResultSet rs = ppstm.executeQuery();
            while (rs.next()) {
                String maNhaCungCap = rs.getString(1);
                String tenNhaCungCap = rs.getString(2);
                String diaChi = rs.getString(3);
                String soDienThoai = rs.getString(4);
                String logo = rs.getString(5);
                String mota = rs.getString(6);
                String tinhtrangncc = rs.getString(7);
                NhaCungCap ncc = new NhaCungCap(maNhaCungCap, tenNhaCungCap, diaChi, soDienThoai, logo, mota, tinhtrangncc);
                map.put(ncc.getMaNhaCungCap(), ncc);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return map;
    }
}
