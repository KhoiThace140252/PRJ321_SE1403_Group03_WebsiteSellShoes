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
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class SanPhamDAO implements ObjectDAO {

    public static Map<String, SanPham> mapSanPham = layDuLieuTuDatabase();

    @Override
    public boolean add(Object obj) {
        SanPham sp = (SanPham) obj;
        mapSanPham.put(sp.getMaSanPham(), sp);
        try {
            String sql = "insert into SanPham values (?,?,?,?,?,?,?,?,?,?,?)";
            Connection connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, sp.getMaSanPham());
            ppstm.setString(2, sp.getTenSanPham());
            ppstm.setString(3, sp.getGiaGiam());
            ppstm.setString(4, sp.getGiaTien());
            ppstm.setString(5, sp.getSoLuong());
            ppstm.setString(6, sp.getMaNhaCungCap());
            ppstm.setString(7, sp.getMaLoaiSanPham());
            ppstm.setString(8, sp.getHinhAnh());
            ppstm.setString(9, sp.getSoLuongNhap());
            ppstm.setString(10, sp.getSoLuongBan());
            ppstm.setString(11, sp.getTinhtrangsanpham());
            ppstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Hệ thống gặp lỗi " + e.getMessage());
            return false;
        }
        return true;
    }

    public static Map<String, SanPham> layDuLieuTuDatabase() {
        Map<String, SanPham> map = new HashMap<>();
        try {
            ResultSet rs = new ConnectToDatabase().selectData("select * from  SanPham where Soluong > 0");
            while (rs.next()) {
                String maSanPham = rs.getString(1);
                String tenSanPham = rs.getString(2);
                String giaGiam = rs.getString(3);
                String giaTien = rs.getString(4);
                String soLuong = rs.getString(5);
                String maNhaCungCap = rs.getString(6);
                String maLoaiSanPham = rs.getString(7);
                String hinhAnh = rs.getString(8);
                String soLuongNhap = rs.getString(9);
                String soLuongBan = rs.getString(10);
                String tinhtrangSanPham = rs.getString(11);
                SanPham sp = new SanPham(maSanPham, tenSanPham, giaGiam, giaTien, soLuong, maNhaCungCap, maLoaiSanPham, hinhAnh,
                        soLuongNhap, soLuongBan, tinhtrangSanPham);
                map.put(sp.getMaSanPham(), sp);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return map;
    }

    public static Map<String, SanPham> getTinhTrangSanPham() {
        Map<String, SanPham> map = new HashMap<>();
        try {
            ResultSet rs = new ConnectToDatabase().selectData("select * from  SanPham where Tinhtrang='Already'");
            while (rs.next()) {
                String maSanPham = rs.getString(1);
                String tenSanPham = rs.getString(2);
                String giaGiam = rs.getString(3);
                String giaTien = rs.getString(4);
                String soLuong = rs.getString(5);
                String maNhaCungCap = rs.getString(6);
                String maLoaiSanPham = rs.getString(7);
                String hinhAnh = rs.getString(8);
                String soLuongNhap = rs.getString(9);
                String soLuongBan = rs.getString(10);
                String tinhtrangSanPham = rs.getString(11);
                SanPham sp = new SanPham(maSanPham, tenSanPham, giaGiam, giaTien, soLuong, maNhaCungCap, maLoaiSanPham, hinhAnh,
                        soLuongNhap, soLuongBan, tinhtrangSanPham);
                map.put(sp.getMaSanPham(), sp);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return map;
    }

    public SanPham getProductByID(String id) {
        try {
            String sql = "SELECT * FROM `sanpham` WHERE Masanpham=?";
            Connection connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, id);
            ResultSet rs = ppstm.executeQuery();
            if (rs.first()) {
                String masp = rs.getString(1);
                String ten = rs.getString(2);
                String giadagiam = rs.getString(3);
                String giaban = rs.getString(4);
                String soluong = rs.getString(5);
                String nhacungcap = rs.getString(6);
                String maloai = rs.getString(7);
                String hinhanh = rs.getString(8);
                String soluongnhap = rs.getString(9);
                String soluongban = rs.getString(10);
                String tinhtrangSanPham = rs.getString(11);
                SanPham sp = new SanPham(masp, ten, giadagiam, giaban, soluong, nhacungcap, maloai, hinhanh, soluongnhap, soluongban, tinhtrangSanPham);
                return sp;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean updateQuantity(String quantity, String export, String idproduct) {
        String sql = "UPDATE `sanpham` SET `Soluong`=?,`Soluongban`=? WHERE Masanpham=?";
        Connection connect;
        try {
            connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, quantity);
            ppstm.setString(2, export);
            ppstm.setString(3, idproduct);
            ppstm.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean edit(String id, Object obj) {
        SanPham sp = (SanPham) obj;
        mapSanPham.replace(sp.getMaSanPham(), sp);
        String sql = "update SanPham set Ten=?,Giadagiam=?,Giaban=?,Soluong=?,Manhacungcap=?,Maloai=?,Hinhanh=?,Soluongnhap=?,Soluongban=?, Tinhtrang=? where Masanpham=?";
        Connection connect;
        try {
            connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, sp.getTenSanPham());
            ppstm.setString(2, sp.getGiaGiam());
            ppstm.setString(3, sp.getGiaTien());
            ppstm.setString(4, sp.getSoLuong());
            ppstm.setString(5, sp.getMaNhaCungCap());
            ppstm.setString(6, sp.getMaLoaiSanPham());
            ppstm.setString(7, sp.getHinhAnh());
            ppstm.setString(8, sp.getSoLuongNhap());
            ppstm.setString(9, sp.getSoLuongBan());
            ppstm.setString(10, sp.getTinhtrangsanpham());
            ppstm.setString(11, id);
            ppstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public boolean del(String id) {

        String sql = "Update SanPham set Tinhtrang=? where Masanpham='" + id + "'";
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

    public static Map<String, SanPham> searchProduct(String tensp) {
        Map<String, SanPham> map = new HashMap<>();
        try {
            String sql = "select * from  SanPham";
            Connection connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ResultSet rs = ppstm.executeQuery();
            while (rs.next()) {
                String maSanPham = rs.getString(1);
                String tenSanPham = rs.getString(2);
                if (tenSanPham.contains(tensp)) {
                    String giaGiam = rs.getString(3);
                    String giaTien = rs.getString(4);
                    String soLuong = rs.getString(5);
                    String maNhaCungCap = rs.getString(6);
                    String maLoaiSanPham = rs.getString(7);
                    String hinhAnh = rs.getString(8);
                    String soLuongNhap = rs.getString(9);
                    String soLuongBan = rs.getString(10);
                    String tinhtrangSanPham = rs.getString(11);
                    SanPham sp = new SanPham(maSanPham, tenSanPham, giaGiam, giaTien, soLuong, maNhaCungCap, maLoaiSanPham, hinhAnh,
                            soLuongNhap, soLuongBan, tinhtrangSanPham);
                    map.put(sp.getMaSanPham(), sp);
                } else {
                    continue;
                }
            }
        } catch (SQLException ex) {
            return null;
        }
        return map;
    }
}
