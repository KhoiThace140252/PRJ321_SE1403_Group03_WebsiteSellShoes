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

    /**
     * lay du lieu tu database
     *
     * @param obj
     * @return true: he thong binh thuong, false: he thong gap loi
     */
    @Override
    public boolean add(Object obj) {
        DonHang dh = (DonHang) obj;
        mapDonHang.put(dh.getId(), dh);
        try {
            String sql = "insert into DonHang values (?,?,?,?,?,?,?,?,?,?)";//khai bao cau lenh sql de load du lieu
            Connection connect = ConnectToDatabase.getConnect();//connection voi database
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, null);//truyen gia tri vao cac dau ?
            ppstm.setString(2, dh.getTenKhachHang());//truyen gia tri vao cac dau ?
            ppstm.setString(3, dh.getTenSanPham());//truyen gia tri vao cac dau ?
            ppstm.setString(4, dh.getTongSoLuong());//truyen gia tri vao cac dau ?
            ppstm.setString(5, dh.getTongTien());//truyen gia tri vao cac dau ?
            ppstm.setDate(6, Date.valueOf(sdf.format(new java.util.Date())));//truyen gia tri vao cac dau ?
            ppstm.setString(7, dh.getDiaChi());//truyen gia tri vao cac dau ?
            ppstm.setString(8, dh.getSoDienThoai());//truyen gia tri vao cac dau ?
            ppstm.setString(9, dh.getEmail());//truyen gia tri vao cac dau ?
            ppstm.setString(10, dh.getTinhTrangDonHang());//truyen gia tri vao cac dau ?
            ppstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Hệ thống gặp lỗi " + e.getMessage());
            return false;
        }
        return true;
    }

    /**
     * lay gia tri don hang bang ten cua don hang
     *
     * @param Name
     * @return null: tra ve gia tri rong, return: dh tra ve don hang sau khi tim
     * thay
     */
    public DonHang getDonHangByName(String Name) {
        try {
            String sql = "SELECT * FROM `donhang` WHERE Tenkhachhang=?";//khai bao cau lenh sql
            Connection connect = ConnectToDatabase.getConnect();//connection datatbase
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, Name);
            ResultSet rs = ppstm.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);//tra ve gia tri la id
                String tenKhachHang = rs.getString(2);// tra ve gia tri la ten khach hang
                String tenSanPham = rs.getString(3);//tra ve gia tri la san pham
                String tongSoLuong = rs.getString(4);//tra ve gia tri la so luong
                String tongTien = rs.getString(5);// tra ve gia tri la tong tien
                Date ngayMua = rs.getDate(6); //tra ve gia tri la ngay
                String diaChi = rs.getString(7);// tra ve gia tri la dia chi
                String soDienThoai = rs.getString(8); //tra ve gia tri la so dien thoai
                String email = rs.getString(9);//tra ve gia tri la email
                String tinhTrangDonHang = rs.getString(10);// tra ve gia tri la tinh trang don hang
                DonHang dh = new DonHang(id, tenKhachHang, tenSanPham, tongSoLuong, tongTien,
                        ngayMua, diaChi, soDienThoai, email, tinhTrangDonHang);
                return dh;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DonHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * edit don hang
     *
     * @param id
     * @param obj
     * @return true khi khong xuat hien loi, false khi xuat hien loi
     */
    @Override
    public boolean edit(String id, Object obj) {
        DonHang dh = (DonHang) obj;
        mapDonHang.replace(dh.getId(), dh);
        // khai bao cau lenh sql de lay gia tri database
        String sql = "update DonHang set Tenkhachhang=?,Tensanpham=?,Tongsoluong=?,Tongtien=?,Ngaymua=?,Diachi=?,Sodienthoai=?,Email=?,Tinhtrangdonhang=? where Madonhang=?";
        Connection connect;
        try {
            connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, dh.getTenKhachHang());//truyen gia tri vao cac dau ?
            ppstm.setString(2, dh.getTenSanPham());//truyen gia tri vao cac dau ?
            ppstm.setString(3, dh.getTongSoLuong());//truyen gia tri vao cac dau ?
            ppstm.setString(4, dh.getTongTien());//truyen gia tri vao cac dau ?
            ppstm.setDate(5, dh.getNgayMua());//truyen gia tri vao cac dau ?
            ppstm.setString(6, dh.getDiaChi());//truyen gia tri vao cac dau ?
            ppstm.setString(7, dh.getSoDienThoai());//truyen gia tri vao cac dau ?
            ppstm.setString(8, dh.getEmail());//truyen gia tri vao cac dau ?
            ppstm.setString(9, dh.getTinhTrangDonHang());//truyen gia tri vao cac dau ?
            ppstm.setString(10, id);//truyen gia tri vao cac dau ?
            ppstm.executeUpdate();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     * delete cac san pham trong don hang
     *
     * @param id
     * @return true khi he thong khong co loi, false khi xay ra loi
     */
    @Override
    public boolean del(String id) {
        String sql = "update DonHang set Tinhtrangdonhang=? where Madonhang='" + id + "'";//khai bao cua lenh sql de lay data
        try {
            Connection connect = ConnectToDatabase.getConnect();// connect database
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, "Not Already");//truyen gia tri vao cac dau ?
            ppstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Hệ thống lỗi vì:" + e.getMessage());//print error
            return false;
        }
        return true;
    }

    //Phương thức load dữ liệu từ database
    /**
     *
     * @return map sau khi load du lieu thanh cong
     */
    public static Map<String, DonHang> layDuLieuTuDatabase() {
        Map<String, DonHang> map = new HashMap<>();
        try {
            ResultSet rs = new ConnectToDatabase().selectData("select * from  DonHang");//creat resultset to connect datatbase
            while (rs.next()) {
                String id = rs.getString(1);//lay du lieu cua id
                String tenKhachHang = rs.getString(2);//lay du lieu cua ten khach hang
                String tenSanPham = rs.getString(3);//lay du lieu cua ten san pham
                String tongSoLuong = rs.getString(4);//lay du lieu cua tong so luong
                String tongTien = rs.getString(5);//lay du lieu cua tong tien
                Date ngayMua = rs.getDate(6);//lay du lieu cua mgay mua
                String diaChi = rs.getString(7);//lay du lieu cua dia chi
                String soDienThoai = rs.getString(8);//lay du lieu cua so dien thoai
                String email = rs.getString(9);//lay du lieu cua rmail
                String tinhTrangDonHang = rs.getString(10);//lay du lieu cua tinh trang don hang
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

    /**
     * tao 1 ham DonHang dung de user mua hang bang id
     *
     * @param id
     * @return
     */
    public DonHang getOrderByID(int id) {
        try {
            String sql = "SELECT * FROM `donhang` WHERE Madonhang=?";// khai bao cau lenh sql de lay du lieu tu database
            Connection connect = ConnectToDatabase.getConnect();// connection database
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setInt(1, id);
            ResultSet rs = ppstm.executeQuery();
            if (rs.first()) {
                String idupdate = rs.getString(1);//lay du lieu cua id
                String tenKhachHang = rs.getString(2);//lay du lieu cua ten khach hang
                String tenSanPham = rs.getString(3);//lay du lieu cua tensanpham
                String tongSoLuong = rs.getString(4);//lay du lieu cua tong so luong

                String tongTien = rs.getString(5);//lay du lieu cua tong tien
                Date ngayMua = rs.getDate(6);//lay du lieu cua ngay mua
                String diaChi = rs.getString(7);//lay du lieu cua dia chi
                String soDienThoai = rs.getString(8);//lay du lieu cua so dien thoai
                String email = rs.getString(9);//lay du lieu cua email
                String tinhTrangDonHang = rs.getString(10);//lay du lieu cua tinh trang don hang
                DonHang dh = new DonHang(idupdate, tenKhachHang, tenSanPham, tongSoLuong, tongTien,
                        ngayMua, diaChi, soDienThoai, email, tinhTrangDonHang);
                return dh;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * load du lieu tu database va tim kiem san pham
     *
     * @param Tensanpham
     * @return
     */
    public static Map<String, DonHang> searchOrder(String Tensanpham) {
        Map<String, DonHang> map = new HashMap<>();
        try {
            String sql = "SELECT * FROM `donhang` WHERE Tensanpham=?";//khai bao cau lenh sql de lay du lieu tu database
            Connection connect = ConnectToDatabase.getConnect();//connect database
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, Tensanpham);
            ResultSet rs = ppstm.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);//lay du lieu cua id
                String tenKhachHang = rs.getString(2);//lay du lieu cua ten khach hang
                String tenSanPham = rs.getString(3);//lay du lieu cua ten san pham
                String tongSoLuong = rs.getString(4);//lay du lieu cua tong so luong
                String tongTien = rs.getString(5);//lay du lieu cua tong tien
                Date ngayMua = rs.getDate(6);//lay du lieu cua ngay mua
                String diaChi = rs.getString(7);//lay du lieu cua dia chi
                String soDienThoai = rs.getString(8);//lay du lieu cua so dien thoai
                String email = rs.getString(9);//lay du lieu cua email
                String tinhTrangDonHang = rs.getString(10);//lay du lieu cua tinh trang don hang
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
