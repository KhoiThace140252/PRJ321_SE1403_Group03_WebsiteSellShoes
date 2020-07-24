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
            String sql = "insert into Thongtinsanpham values (?,?,?,?,?,?)";
            Connection getConnect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = getConnect.prepareStatement(sql);
            ppstm.setString(1, ncc.getMasp());
            ppstm.setString(2, ncc.getMoTa1());
            ppstm.setString(3, ncc.getHinhAnhChiTiet1());
            ppstm.setString(4, ncc.getHinhAnhChiTiet2());
            ppstm.setString(5, ncc.getHinhAnhChiTiet3());
            ppstm.setString(6, ncc.getHinhAnhChiTiet4());
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
                String hinhAnhChiTiet1 = rs.getString(3);
                String hinhAnhChiTiet2 = rs.getString(4);
                String hinhAnhChiTiet3 = rs.getString(5);
                String hinhAnhChiTiet4 = rs.getString(6);
                ChiTietSanPham ncc = new ChiTietSanPham(maSanPham, moTa1, hinhAnhChiTiet1, hinhAnhChiTiet2, hinhAnhChiTiet3, hinhAnhChiTiet4);
                map.put(ncc.getMasp(), ncc);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return map;
    }

    public ChiTietSanPham getDetailProductById(String masp) {
        try {
            String sql = "SELECT * FROM `thongtinsanpham` WHERE Masanpham=?";
            Connection connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, masp);
            ResultSet rs = ppstm.executeQuery();
            if (rs.first()) {
                String idproduct = rs.getString(1);
                String mota1 = rs.getString(2);
                String hinhanhchitiet1 = rs.getString(3);
                String hinhanhchitiet2 = rs.getString(4);
                String hinhanhchitiet3 = rs.getString(5);
                String hinhanhchitiet4 = rs.getString(6);

                ChiTietSanPham ctsp = new ChiTietSanPham(idproduct, mota1, hinhanhchitiet1, hinhanhchitiet2, hinhanhchitiet3, hinhanhchitiet4);
                return ctsp;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean edit(String id, Object obj) {
        ChiTietSanPham ncc = (ChiTietSanPham) obj;
        mapChiTietSanPham.replace(ncc.getMasp(), ncc);
        String sql = "update Thongtinsanpham set mota1=?,Hinhanhchitiet1=?,Hinhanhchitiet2=?,Hinhanhchitiet3=?,Hinhanhchitiet4=? where Masanpham=?";
        Connection getConnect;
        try {
            getConnect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = getConnect.prepareStatement(sql);
            ppstm.setString(1, ncc.getMoTa1());
            ppstm.setString(2, ncc.getHinhAnhChiTiet1());
            ppstm.setString(3, ncc.getHinhAnhChiTiet2());
            ppstm.setString(4, ncc.getHinhAnhChiTiet3());
            ppstm.setString(5, ncc.getHinhAnhChiTiet4());
            ppstm.setString(6, id);
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
                String hinhAnhChiTiet1 = rs.getString(3);
                String hinhAnhChiTiet2 = rs.getString(4);
                String hinhAnhChiTiet3 = rs.getString(5);
                String hinhAnhChiTiet4 = rs.getString(6);
                ChiTietSanPham ncc = new ChiTietSanPham(maSanPham, moTa1, hinhAnhChiTiet1, hinhAnhChiTiet2, hinhAnhChiTiet3, hinhAnhChiTiet4);
                map.put(ncc.getMasp(), ncc);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return map;
    }

}
