/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Database.ConnectToDatabase;
import Model.DonHang;
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
//import model.*;

/**
 *
 * @author Admin
 */
public class DonHangDAO implements ObjectDAO {
    //Map chứa dữ liệu ở DTB load lên

    public static Map<String, DonHang> mapDonHang = layDuLieuTuDatabase();
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  //format date

    @Override
    public boolean add(Object obj) {
        DonHang dh = (DonHang) obj;
        mapDonHang.put(dh.getId(), dh);
        try {
            String sql = "insert into DonHang values (?,?,?,?,?,?,?,?,?,?)";
            Connection connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, null);
            ppstm.setString(2, dh.getTenKhachHang());
            ppstm.setString(3, dh.getTenSanPham());
            ppstm.setString(4, dh.getTongSoLuong());
            ppstm.setString(5, dh.getTongTien());
            ppstm.setDate(6, Date.valueOf(sdf.format(new java.util.Date())));
            ppstm.setString(7, dh.getDiaChi());
            ppstm.setString(8, dh.getSoDienThoai());
            ppstm.setString(9, dh.getEmail());
            ppstm.setString(10, dh.getTinhTrangDonHang());
            ppstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Hệ thống gặp lỗi " + e.getMessage());
            return false;
        }
        return true;
    }

    public DonHang getDonHangByName(String Name) {
        try {
            String sql = "SELECT * FROM `donhang` WHERE Tenkhachhang=?";
            Connection connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, Name);
            ResultSet rs = ppstm.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);
                String tenKhachHang = rs.getString(2);
                String tenSanPham = rs.getString(3);
                String tongSoLuong = rs.getString(4);
                String tongTien = rs.getString(5);
                Date ngayMua = rs.getDate(6);
                String diaChi = rs.getString(7);
                String soDienThoai = rs.getString(8);
                String email = rs.getString(9);
                String tinhTrangDonHang = rs.getString(10);
                DonHang dh = new DonHang(id, tenKhachHang, tenSanPham, tongSoLuong, tongTien,
                        ngayMua, diaChi, soDienThoai, email, tinhTrangDonHang);
                return dh;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DonHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean edit(String id, Object obj) {
        DonHang dh = (DonHang) obj;
        mapDonHang.replace(dh.getId(), dh);
        String sql = "update DonHang set Tenkhachhang=?,Tensanpham=?,Tongsoluong=?,Tongtien=?,Ngaymua=?,Diachi=?,Sodienthoai=?,Email=?,Tinhtrangdonhang=? where Madonhang=?";
        Connection connect;
        try {
            connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, dh.getTenKhachHang());
            ppstm.setString(2, dh.getTenSanPham());
            ppstm.setString(3, dh.getTongSoLuong());
            ppstm.setString(4, dh.getTongTien());
            ppstm.setDate(5, dh.getNgayMua());
            ppstm.setString(6, dh.getDiaChi());
            ppstm.setString(7, dh.getSoDienThoai());
            ppstm.setString(8, dh.getEmail());
            ppstm.setString(9, dh.getTinhTrangDonHang());
            ppstm.setString(10, id);
            ppstm.executeUpdate();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean del(String id) {
        String sql = "update DonHang set Tinhtrangdonhang=? where Madonhang='" + id + "'";
        try {
            Connection connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, "Not Already");
            ppstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Hệ thống lỗi vì:" + e.getMessage());
            return false;
        }
        return true;
    }

    //Phương thức load dữ liệu từ database
    public static Map<String, DonHang> layDuLieuTuDatabase() {
        Map<String, DonHang> map = new HashMap<>();
        try {
            ResultSet rs = new ConnectToDatabase().selectData("select * from  DonHang");
            while (rs.next()) {
                String id = rs.getString(1);
                String tenKhachHang = rs.getString(2);
                String tenSanPham = rs.getString(3);
                String tongSoLuong = rs.getString(4);
                String tongTien = rs.getString(5);
                Date ngayMua = rs.getDate(6);
                String diaChi = rs.getString(7);
                String soDienThoai = rs.getString(8);
                String email = rs.getString(9);
                String tinhTrangDonHang = rs.getString(10);
                DonHang dh = new DonHang(id, tenKhachHang, tenSanPham, tongSoLuong, tongTien,
                        ngayMua, diaChi, soDienThoai, email, tinhTrangDonHang);
                map.put(dh.getId(), dh);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return map;
    }

    public DonHang getOrderByID(int id) {
        try {
            String sql = "SELECT * FROM `donhang` WHERE Madonhang=?";
            Connection connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setInt(1, id);
            ResultSet rs = ppstm.executeQuery();
            if (rs.first()) {
                String idupdate = rs.getString(1);
                String tenKhachHang = rs.getString(2);
                String tenSanPham = rs.getString(3);
                String tongSoLuong = rs.getString(4);

                String tongTien = rs.getString(5);
                Date ngayMua = rs.getDate(6);
                String diaChi = rs.getString(7);
                String soDienThoai = rs.getString(8);
                String email = rs.getString(9);
                String tinhTrangDonHang = rs.getString(10);
                DonHang dh = new DonHang(idupdate, tenKhachHang, tenSanPham, tongSoLuong, tongTien,
                        ngayMua, diaChi, soDienThoai, email, tinhTrangDonHang);
                return dh;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Map<String, DonHang> searchOrder(String Tensanpham) {
        Map<String, DonHang> map = new HashMap<>();
        try {
            String sql = "SELECT * FROM `donhang` WHERE Tensanpham=?";
            Connection connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, Tensanpham);
            ResultSet rs = ppstm.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);
                String tenKhachHang = rs.getString(2);
                String tenSanPham = rs.getString(3);
                String tongSoLuong = rs.getString(4);
                String tongTien = rs.getString(5);
                Date ngayMua = rs.getDate(6);
                String diaChi = rs.getString(7);
                String soDienThoai = rs.getString(8);
                String email = rs.getString(9);
                String tinhTrangDonHang = rs.getString(10);
                DonHang dh = new DonHang(id, tenKhachHang, tenSanPham, tongSoLuong, tongTien,
                        ngayMua, diaChi, soDienThoai, email, tinhTrangDonHang);
                map.put(dh.getId(), dh);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return map;
    }

}
