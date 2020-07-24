/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Database.ConnectToDatabase;
import Model.LoaiSanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class LoaiSanPhamDAO implements ObjectDAO {

    public static Map<String, LoaiSanPham> mapLoaiSanPham = layDuLieuTuDatabase();

    @Override
    public boolean add(Object obj) {
        LoaiSanPham sp = (LoaiSanPham) obj;
        mapLoaiSanPham.put(sp.getMaLoai(), sp);
        try {
            String sql = "insert into LoaiSanPham values (?,?,?,?)";
            Connection connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, sp.getMaLoai());
            ppstm.setString(2, sp.getTenLoai());
            ppstm.setString(3, sp.getMaNhaCungCap());
            ppstm.setString(4, sp.getMoTaLoai());
            ppstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Hệ thống gặp lỗi " + e.getMessage());
            return false;
        }
        return true;
    }
//phương thức load dữ liệu từ database

    public static Map<String, LoaiSanPham> layDuLieuTuDatabase() {
        Map<String, LoaiSanPham> map = new HashMap<>();
        try {
            ResultSet rs = new ConnectToDatabase().selectData("select * from  LoaiSanPham");
            while (rs.next()) {
                String maLoai = rs.getString(1);
                String tenLoai = rs.getString(2);
                String maNhaCungCap = rs.getString(3);
                String moTa = rs.getString(4);
                LoaiSanPham sp = new LoaiSanPham(maLoai, tenLoai, maNhaCungCap, moTa);
                map.put(sp.getMaLoai(), sp);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return map;
    }

    public LoaiSanPham getTypeProductByID(String idtype) {
        try {
            String sql = "SELECT * FROM `loaisanpham` WHERE Maloai=?";
            Connection connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, idtype);
            ResultSet rs = ppstm.executeQuery();
            if (rs.first()) {
                String maloai = rs.getString(1);
                String tenloai = rs.getString(2);
                String manhacungcap = rs.getString(3);
                String mota = rs.getString(4);
                LoaiSanPham lsp = new LoaiSanPham(maloai, tenloai, manhacungcap, mota);
                return lsp;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean edit(String id, Object obj) {
        LoaiSanPham sp = (LoaiSanPham) obj;
        mapLoaiSanPham.replace(sp.getMaLoai(), sp);
        String sql = "update LoaiSanPham set Tenloai=?,Manhacungcap=?,Mota=? where Maloai=?";
        Connection connect;
        try {
            connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, sp.getTenLoai());
            ppstm.setString(2, sp.getMaNhaCungCap());
            ppstm.setString(3, sp.getMoTaLoai());
            ppstm.setString(4, id);
            ppstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public boolean del(String id) {
        mapLoaiSanPham.remove(id);
        String sql = "delete from LoaiSanPham where Maloai='" + id + "'";
        try {
            new ConnectToDatabase().excuteSql(sql);
        } catch (Exception e) {
            System.out.println("Hệ thống lỗi vì:" + e.getMessage());
            return false;
        }
        return true;
    }

    public static Map<String, LoaiSanPham> searchType(String type) {
        Map<String, LoaiSanPham> map = new HashMap<>();
        try {
            String sql = ("select * from  LoaiSanPham where Tenloai=?");
            Connection connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, type);
            ResultSet rs = ppstm.executeQuery();
            while (rs.next()) {
                String maLoai = rs.getString(1);
                String tenLoai = rs.getString(2);
                String maNhaCungCap = rs.getString(3);
                String moTa = rs.getString(4);
                LoaiSanPham sp = new LoaiSanPham(maLoai, tenLoai, maNhaCungCap, moTa);
                map.put(sp.getMaLoai(), sp);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return map;
    }

}
