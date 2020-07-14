/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.ChiTietSanPham;
import Database.ConnectToDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class ChiTietSanPhamDAO implements ObjectDAO {

    public static Map<String, ChiTietSanPham> mapChiTietSanPham = layDuLieuTuDatabase();

    //kiểm tra thông tin sản phẩm này đã có trong database chưa
    public boolean checkProductIDDuplicate(String maSanPham) {
        ChiTietSanPham ctsp = mapChiTietSanPham.get(maSanPham);
        return (ctsp != null) ? true : false;
    }

    @Override
    public boolean add(Object obj) {
        ChiTietSanPham ncc = (ChiTietSanPham) obj;
        mapChiTietSanPham.put(ncc.getMasp(), ncc);
        try {
            String sql = "insert into Thongtinsanpham values (?,?,?,?,?,?,?)";
            Connection getConnect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = getConnect.prepareStatement(sql);
            ppstm.setString(1, ncc.getMasp());
            ppstm.setString(2, ncc.getMoTa1());
            ppstm.setString(3, ncc.getHinhAnhChiTiet());
            ppstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Hệ thống gặp lỗi " + e.getMessage());
            return false;
        }
        return true;
    }
//Phương thức lấy dữ liệu từ database lên sử dụng

    public static Map<String, ChiTietSanPham> layDuLieuTuDatabase() {
        Map<String, ChiTietSanPham> map = new HashMap<>();
        try {
            ResultSet rs = new ConnectToDatabase().selectData("select * from  Thongtinsanpham");
            while (rs.next()) {
                String maSanPham = rs.getString(1);
                String moTa1 = rs.getString(2);
                String hinhAnhChiTiet = rs.getString(3);
                ChiTietSanPham ncc = new ChiTietSanPham(maSanPham, moTa1, hinhAnhChiTiet);
                map.put(ncc.getMasp(), ncc);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return map;
    }

    @Override
    public boolean edit(String id, Object obj) {
        ChiTietSanPham ncc = (ChiTietSanPham) obj;
        mapChiTietSanPham.replace(ncc.getMasp(), ncc);
        String sql = "update Thongtinsanpham set mota1=?,mota2=?,mota3=?,mota4=?,mota5=?,hinhanhchitiet=? where Masanpham=?";
        Connection getConnect;
        try {
            getConnect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = getConnect.prepareStatement(sql);
            ppstm.setString(1, ncc.getMoTa1());
            ppstm.setString(2, ncc.getHinhAnhChiTiet());
            ppstm.setString(3, id);
            ppstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public boolean del(String id) {
        mapChiTietSanPham.remove(id);
        String sql = "delete from Thongtinsanpham where Masanpham='" + id + "'";
        try {
            new ConnectToDatabase().excuteSql(sql);
        } catch (Exception e) {
            System.out.println("Hệ thống lỗi vì:" + e.getMessage());
            return false;
        }
        return true;
    }

    public static Map<String, ChiTietSanPham> searchDetail(String maSp) {
        Map<String, ChiTietSanPham> map = new HashMap<>();
        try {
            String sql = "SELECT * FROM `thongtinsanpham` WHERE Masanpham=?";
            Connection connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, maSp);
            ResultSet rs = ppstm.executeQuery();
            while (rs.next()) {
                String maSanPham = rs.getString(1);
                String moTa1 = rs.getString(2);
                String hinhAnhChiTiet = rs.getString(3);
                ChiTietSanPham ncc = new ChiTietSanPham(maSanPham, moTa1, hinhAnhChiTiet);
                map.put(ncc.getMasp(), ncc);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return map;
    }

}
