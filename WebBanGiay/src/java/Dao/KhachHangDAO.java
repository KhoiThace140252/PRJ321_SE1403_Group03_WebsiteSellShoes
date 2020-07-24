/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import Database.ConnectToDatabase;
import Model.KhachHang;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class KhachHangDAO implements ObjectDAO {

     public static Map<String, KhachHang> mapKhachHang = loadData(); //tao mot hashmap luu thong tin khach hang

    /**
     * Tao constructor khong tham so
     */
    public KhachHangDAO() {

    }

    /**
     * Ham load du lieu
     *
     * @return mapTemp chua du lieu
     */
    public static Map<String, KhachHang> loadData() {
        Map<String, KhachHang> mapTemp = new HashMap<>();//tao hashmap
        try {
            ResultSet rs = new ConnectToDatabase().selectData("select * from TaiKhoan");//thuc hien cau lenh lay toan bo gia tri tren database ve
            while (rs.next()) {//vong lap cho toi khach hang cuoi cung
                int IdTaikhoan = rs.getInt(1);//id tai khoan
                String taiKhoan = rs.getString(2);//tai khoan
                String matKhau = rs.getString(3);//mat khau
                String ten = rs.getString(4);// ten khach hang
                String gioiTinh = rs.getString(5);//gioi tinh
                String soDienThoai = rs.getString(6);//so dien thoai
                String email = rs.getString(7);//email
                Date ngaySinh = rs.getDate(8);//ngay thang nam sinh sql
                String diaChi = rs.getString(9);//dia chi
                String soLuongMua = rs.getString(10);//so luong mua
                String role = rs.getString(11);//vai tro
                String accountstatus = rs.getString(12);//tinh trang tai khoan
                KhachHang kh = new KhachHang(IdTaikhoan, taiKhoan, matKhau, ten, gioiTinh, soDienThoai, email, ngaySinh, diaChi,
                        soLuongMua, role, accountstatus);//luu vao kh
                mapTemp.put(kh.getTaiKhoan(), kh);//them cac thong tin vao hashmap
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mapTemp;//neu ghi du lieu vao khong xay ra loi
    }

    /**
     * ham lay thong tin khach hang bang id
     *
     * @param id id tai khoan
     * @return kh
     */
    public KhachHang getAccountByID(int id) {
        try {
            String sql = "SELECT * FROM `taikhoan` WHERE IdTaikhoan=?";//cau lenh sql
            Connection connect = ConnectToDatabase.getConnect();//lay ket noi
            PreparedStatement ppstm = connect.prepareStatement(sql);//thuc hien cau lenh sql
            ppstm.setInt(1, id);//truyen gia tri
            //ppstm.setString(2, "Used");
            ResultSet rs = ppstm.executeQuery();//rs get gia tri
            if (rs.first()) {//neu co gia tri 
                int IdTaikhoan = rs.getInt(1);//id tai khoan
                String taiKhoan = rs.getString(2);//tai khoan
                String matKhau = rs.getString(3);//mat khau
                String ten = rs.getString(4);//ten
                String gioiTinh = rs.getString(5);//gioi tinh
                String soDienThoai = rs.getString(6);//so dien thoai
                String email = rs.getString(7);//email
                Date ngaySinh = rs.getDate(8);//ngay thang nam sinh
                String diaChi = rs.getString(9);//dia chi
                String soLuongMua = rs.getString(10);//so luong mua
                String role = rs.getString(11);//vai tro
                String accountstatus = rs.getString(12);//tinh trang khach hang
                KhachHang kh = new KhachHang(IdTaikhoan, taiKhoan, matKhau, ten, gioiTinh, soDienThoai, email, ngaySinh, diaChi,
                        soLuongMua, role, accountstatus);//luu thong tin khach hang vao kh
                return kh;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;//neu get thong tin that bai
    }

    /**
     * Ham kiem tra dang nhap
     *
     * @param userName tai khoan nguoi dung
     * @param passWord mat khau nguoi dung
     * @return true neu thanh cong hoac false neu that bai
     */
    public boolean checkLogin(String userName, String passWord) {
        try {
            String sql = "select * from TaiKhoan where Tentaikhoan=? AND Matkhau=MD5(?) ";//cau lenh sql
            Connection connect = ConnectToDatabase.getConnect();//lay ket noi
            PreparedStatement ppstm = connect.prepareStatement(sql);//thuc hien cau lenh sql
            ppstm.setString(1, userName);//dat gia tri
            ppstm.setString(2, passWord);//dat gia tri
            ResultSet rs = ppstm.executeQuery();//rs get gia tri
            if (rs.next()) {//neu gia tri co
                return true;//tra ve true
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;//neu dang nhap khong thanh cong
    }

    /**
     * Kiem tra vai tro nguoi dung
     *
     * @param userName tai khoan nguoi dung
     * @param passWord mat khau nguoi dung
     * @return true neu la Manager or false neu la Customer
     */
    public boolean checkRole(String userName, String passWord) {
        KhachHang kh = mapKhachHang.get(userName);//lay username
        if (kh != null) {//neu username khac null
            if (kh.getRole().equals("Manager")) {//kiem tra vai tro neu la Manager
                return true;
            }
        }
        return false;//neu la customer
    }

    /**
     * Them khach hang
     *
     * @param obj doi tuong can thuc thi
     * @return true neu them thanh cong va false neu tham that bai
     */
    public boolean add(Object obj) {
        KhachHang kh = (KhachHang) obj;//mot doi tuong kh luu khach hang
        mapKhachHang.put(kh.getTaiKhoan(), kh);//dua vao map
        String sql = "insert into TaiKhoan values (?,?,MD5(?),?,?,?,?,?,?,?,?,?)";//cau lenh sql
        Connection connect = ConnectToDatabase.getConnect();//lay ket noi
        try {
            PreparedStatement ppstm = connect.prepareStatement(sql);//thuc hien cau lenh sql
            ppstm.setString(1, null);//id tai khoan
            ppstm.setString(2, kh.getTaiKhoan());//tai khoan
            ppstm.setString(3, kh.getMatKhau());//mat khau
            ppstm.setString(4, kh.getTen());//ten 
            ppstm.setString(5, kh.getGioiTinh());//gioi tinh
            ppstm.setString(6, kh.getSoDienThoai());//so dien thoai
            ppstm.setString(7, kh.getEmail());//email
            ppstm.setDate(8, kh.getNgaySinh());//ngay thang nam sinh
            ppstm.setString(9, kh.getDiaChi());//dia chi
            ppstm.setString(10, kh.getSoLuongMua());//so luong mua
            ppstm.setString(11, kh.getRole());//vai tro
            ppstm.setString(12, kh.getAccountstatus());//tinh trang khach hang
            ppstm.executeUpdate();//thuc hien cau lenh
            return true;//neu them thanh cong
        } catch (SQLException e) {
            System.out.println("Error when add customer :" + e.getMessage());
        }
        return false;//neu them that bai
    }

    /**
     * Ham xoa tai khoan khach hang bang cach doi trang thai tai khoan
     *
     * @param id id tai khoan
     * @return true neu xoa thanh cong hoac false neu that bai
     */
    public boolean del(String id) {

        String sql = "Update taikhoan set Tinhtrangtaikhoan=? where IdTaikhoan='" + id + "'";//cau lenh sql
        try {
            Connection connect = ConnectToDatabase.getConnect();//lay ket noi
            PreparedStatement ppstm = connect.prepareStatement(sql);//thuc hien cau lenh sql
            ppstm.setString(1, "Not Used");//truyen gia tri thay doi vao
            ppstm.executeUpdate();//thuc hien
        } catch (Exception e) {
            System.out.println("Hệ thống lỗi vì:" + e.getMessage());
            return false;//neu trong qua trinh thuc hien xay ra ngoai le
        }
        return true;//neu thay doi thanh cong
    }

    /**
     * Ham cap nhat bill cua khach hang
     *
     * @param total tong so luot mua
     * @param idTaikhoan id tai khoan
     * @return true neu thanh cong hoac false neu that bai
     */
    public boolean updateBill(int total, int idTaikhoan) {
        String sql = "update taikhoan set Soluotmua=? where IdTaikhoan=?";//cau lenh sql
        Connection connect = ConnectToDatabase.getConnect();//lay ket noi
        try {
            PreparedStatement ppstm = connect.prepareStatement(sql);//thuc hien cau lenh sql
            ppstm.setInt(1, total);//gia tri can update
            ppstm.setInt(2, idTaikhoan);//id update
            ppstm.executeUpdate();//thuc hien cau lenh
            return true;//neu xoa thanh cong
        } catch (Exception e) {
            System.out.println("Error when edit customer :" + e.getMessage());
        }
        return false;//neu xoa that bai
    }

    /**
     * update thong tin tai khoan
     *
     * @param id id tai khoan can update
     * @param obj cac thuoc tinh trong doi tuong cho update
     * @return true neu thanh cong hoac false neu that bai
     */
    public boolean edit(int id, Object obj) {
        KhachHang kh = (KhachHang) obj;//mot doi tuong kh luu khach hang
        mapKhachHang.replace(Integer.toString(id), kh);//thay the gia tri tuong ung trong map
        String sql = "update taikhoan set Tentaikhoan=?,Matkhau=?,Tenkhachhang=?,Gioitinh=?,Sodienthoai=?,Email=?,Ngaysinh=?,Diachi=?,Soluotmua=?,Vaitro=?,Tinhtrangtaikhoan=? where IdTaikhoan=?";//cau lenh sql
        Connection connect = ConnectToDatabase.getConnect();//lay ket noi
        try {
            PreparedStatement ppstm = connect.prepareStatement(sql);//thuc hien cau lenh
            ppstm.setString(1, kh.getTaiKhoan());//tai khoan
            ppstm.setString(2, kh.getMatKhau());//mat khau
            ppstm.setString(3, kh.getTen());//ten
            ppstm.setString(4, kh.getGioiTinh());//gioi tinh
            ppstm.setString(5, kh.getSoDienThoai());//so dien thoai
            ppstm.setString(6, kh.getEmail());//email
            ppstm.setDate(7, kh.getNgaySinh());//ngay thang nam sinh
            ppstm.setString(8, kh.getDiaChi());//dia chi
            ppstm.setInt(9, Integer.parseInt(kh.getSoLuongMua()));//so luong mua
            ppstm.setString(10, kh.getRole());//vai tro
            ppstm.setString(11, kh.getAccountstatus());//tinh trang khach hang
            ppstm.setInt(12, id);//id update
            ppstm.executeUpdate();//thuc hien cau lenh
            return true;//neu thanh cong
        } catch (SQLException e) {
            System.out.println("Error when edit customer :" + e.getMessage());
        }
        return false;//that bai
    }

    /**
     * Ham tim kiem khach hang
     *
     * @param name ten tai khoan can tim
     * @return kh thong tin khach hang
     */
    public KhachHang searchCustomer(String name) {
        try {
            String sql = "SELECT * FROM `taikhoan` WHERE Tentaikhoan=?";//cau lenh sql
            Connection connect = ConnectToDatabase.getConnect();//lay ket noi
            PreparedStatement ppstm = connect.prepareStatement(sql);//thuc hien cau lenh
            ppstm.setString(1, name);//set gia tri
            ResultSet rs = ppstm.executeQuery();//rs lay gia tri
            if (rs.first()) {//neu co gia tri
                int IdTaikhoan = rs.getInt(1);//id tai khoan
                String taiKhoan = rs.getString(2);//tai khoan
                String matKhau = rs.getString(3);//mat khau
                String ten = rs.getString(4);//ten 
                String gioiTinh = rs.getString(5);//gioi tinh
                String soDienThoai = rs.getString(6);//so dien thoai
                String email = rs.getString(7);//email
                Date ngaySinh = rs.getDate(8);//ngay sinh
                String diaChi = rs.getString(9);//dia chi
                String soLuongMua = rs.getString(10);//so luong mua
                String role = rs.getString(11);//vai tro
                String accountstatus = rs.getString(12);//tinh trang tai khoan
                KhachHang kh = new KhachHang(IdTaikhoan, taiKhoan, matKhau, ten, gioiTinh, soDienThoai, email, ngaySinh, diaChi,
                        soLuongMua, role, accountstatus);//luu vao object
                return kh;//neu thanh cong
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;//that bai
    }

    /**
     * Ham thay doi mat khau
     *
     * @param idpw id tai khoan
     * @param pass mat khau hien tai
     * @param newPass mat khau moi
     * @return true neu thay doi thanh cong hoac false neu that bai
     */
    public boolean changePass(int idpw, String pass, String newPass) {
        try {
            String sql = "SELECT * FROM `TaiKhoan` WHERE Matkhau=MD5(?)";//cau lenh sql
            Connection connect = ConnectToDatabase.getConnect();//lay ket noi
            PreparedStatement ppstm = connect.prepareStatement(sql);//thuc hien cau lenh sql
            ppstm.setString(1, pass);//set gia tri
            ResultSet rs = ppstm.executeQuery();//rs get gia tri
            if (rs.first()) {//neu co gia tri
                String sql2 = "UPDATE TaiKhoan set Matkhau=MD5(?) where IdTaikhoan=?";//cau lenh sql update mat khau
                PreparedStatement ppstm2 = connect.prepareStatement(sql2);//thuc hien update mat khau
                ppstm2.setString(1, newPass);//set gia tri (mat khau moi)
                ppstm2.setInt(2, idpw);//set gia tri id tai khoan
                ppstm2.executeUpdate();//thuc hien cau lenh
                return true;//neu thanh cong
            }
        } catch (SQLException ex) {
            return false;//neu that bai
        }
        return false;//neu that bai
    }
}
