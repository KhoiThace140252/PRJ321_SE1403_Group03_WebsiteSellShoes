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
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

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

    public static Map<String, KhachHang> mapKhachHang = loadData();

    public KhachHangDAO() {

    }

    public static Map<String, KhachHang> loadData() {
        Map<String, KhachHang> mapTemp = new HashMap<>();
        try {
            ResultSet rs = new ConnectToDatabase().selectData("select * from TaiKhoan");
            while (rs.next()) {
                int IdTaikhoan = rs.getInt(1);
                String taiKhoan = rs.getString(2);
                String matKhau = rs.getString(3);
                String ten = rs.getString(4);
                String gioiTinh = rs.getString(5);
                String soDienThoai = rs.getString(6);
                String email = rs.getString(7);
                Date ngaySinh = rs.getDate(8);
                String diaChi = rs.getString(9);
                String soLuongMua = rs.getString(10);
                String role = rs.getString(11);
                String accountstatus = rs.getString(12);
                KhachHang kh = new KhachHang(IdTaikhoan, taiKhoan, matKhau, ten, gioiTinh, soDienThoai, email, ngaySinh, diaChi,
                        soLuongMua, role, accountstatus);
                mapTemp.put(kh.getTaiKhoan(), kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mapTemp;
    }

    public KhachHang getAccountByID(int id) {
        try {
            String sql = "SELECT * FROM `taikhoan` WHERE IdTaikhoan=?";
            Connection connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setInt(1, id);
            //ppstm.setString(2, "Used");
            ResultSet rs = ppstm.executeQuery();
            if (rs.first()) {
                int IdTaikhoan = rs.getInt(1);
                String taiKhoan = rs.getString(2);
                String matKhau = rs.getString(3);
                String ten = rs.getString(4);
                String gioiTinh = rs.getString(5);
                String soDienThoai = rs.getString(6);
                String email = rs.getString(7);
                Date ngaySinh = rs.getDate(8);
                String diaChi = rs.getString(9);
                String soLuongMua = rs.getString(10);
                String role = rs.getString(11);
                String accountstatus = rs.getString(12);
                KhachHang kh = new KhachHang(IdTaikhoan, taiKhoan, matKhau, ten, gioiTinh, soDienThoai, email, ngaySinh, diaChi,
                        soLuongMua, role, accountstatus);
                return kh;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean checkLogin(String userName, String passWord) {
        try {
            String sql = "select * from TaiKhoan where Tentaikhoan=? AND Matkhau=MD5(?) ";
            Connection connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, userName);
            ppstm.setString(2, passWord);
            ResultSet rs = ppstm.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean checkRole(String userName, String passWord) {
        KhachHang kh = mapKhachHang.get(userName);
        if (kh != null) {
            if (kh.getRole().equals("Manager")) {
                return true;
            }
        }
        return false;
    }

    public boolean add(Object obj) {
        KhachHang kh = (KhachHang) obj;
        mapKhachHang.put(kh.getTaiKhoan(), kh);
        String sql = "insert into TaiKhoan values (?,?,MD5(?),?,?,?,?,?,?,?,?,?)";
        Connection connect = ConnectToDatabase.getConnect();
        try {
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, null);
            ppstm.setString(2, kh.getTaiKhoan());
            ppstm.setString(3, kh.getMatKhau());
            ppstm.setString(4, kh.getTen());
            ppstm.setString(5, kh.getGioiTinh());
            ppstm.setString(6, kh.getSoDienThoai());
            ppstm.setString(7, kh.getEmail());
            ppstm.setDate(8, kh.getNgaySinh());
            ppstm.setString(9, kh.getDiaChi());
            ppstm.setString(10, kh.getSoLuongMua());
            ppstm.setString(11, kh.getRole());
            ppstm.setString(12, kh.getAccountstatus());
            ppstm.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error when add customer :" + e.getMessage());
        }
        return false;
    }

    public boolean del(String id) {

        String sql = "Update taikhoan set Tinhtrangtaikhoan=? where IdTaikhoan='" + id + "'";
        try {
            Connection connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, "Not Used");
            ppstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Hệ thống lỗi vì:" + e.getMessage());
            return false;
        }
        return true;
    }

    public boolean updateBill(int total, int idTaikhoan) {
        String sql = "update taikhoan set Soluotmua=? where IdTaikhoan=?";
        Connection connect = ConnectToDatabase.getConnect();
        try {
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setInt(1, total);
            ppstm.setInt(2, idTaikhoan);
            ppstm.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error when edit customer :" + e.getMessage());
        }
        return false;
    }

    public boolean edit(int id, Object obj) {
        KhachHang kh = (KhachHang) obj;
        mapKhachHang.replace(Integer.toString(id), kh);
        String sql = "update taikhoan set Tentaikhoan=?,Matkhau=?,Tenkhachhang=?,Gioitinh=?,Sodienthoai=?,Email=?,Ngaysinh=?,Diachi=?,Soluotmua=?,Vaitro=?,Tinhtrangtaikhoan=? where IdTaikhoan=?";
        Connection connect = ConnectToDatabase.getConnect();
        try {
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, kh.getTaiKhoan());
            ppstm.setString(2, kh.getMatKhau());
            ppstm.setString(3, kh.getTen());
            ppstm.setString(4, kh.getGioiTinh());
            ppstm.setString(5, kh.getSoDienThoai());
            ppstm.setString(6, kh.getEmail());
            ppstm.setDate(7, kh.getNgaySinh());
            ppstm.setString(8, kh.getDiaChi());
            ppstm.setInt(9, Integer.parseInt(kh.getSoLuongMua()));
            ppstm.setString(10, kh.getRole());
            ppstm.setString(11, kh.getAccountstatus());
            ppstm.setInt(12, id);
            ppstm.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error when edit customer :" + e.getMessage());
        }
        return false;
    }

    public KhachHang searchCustomer(String name) {
        try {
            String sql = "SELECT * FROM `taikhoan` WHERE Tentaikhoan=?";
            Connection connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, name);
            ResultSet rs = ppstm.executeQuery();
            if (rs.first()) {
                int IdTaikhoan = rs.getInt(1);
                String taiKhoan = rs.getString(2);
                String matKhau = rs.getString(3);
                String ten = rs.getString(4);
                String gioiTinh = rs.getString(5);
                String soDienThoai = rs.getString(6);
                String email = rs.getString(7);
                Date ngaySinh = rs.getDate(8);
                String diaChi = rs.getString(9);
                String soLuongMua = rs.getString(10);
                String role = rs.getString(11);
                String accountstatus = rs.getString(12);
                KhachHang kh = new KhachHang(IdTaikhoan, taiKhoan, matKhau, ten, gioiTinh, soDienThoai, email, ngaySinh, diaChi,
                        soLuongMua, role, accountstatus);
                return kh;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public boolean changePass(int idpw, String pass, String newPass) {
        try {
            String sql = "SELECT * FROM `TaiKhoan` WHERE Matkhau=MD5(?)";
            Connection connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, pass);
            ResultSet rs = ppstm.executeQuery();
            if (rs.first()) {
                String sql2 = "UPDATE TaiKhoan set Matkhau=MD5(?) where IdTaikhoan=?";
                PreparedStatement ppstm2 = connect.prepareStatement(sql2);
                ppstm2.setString(1, newPass);
                ppstm2.setInt(2, idpw);
                ppstm2.executeUpdate();
                return true;
            }
        } catch (SQLException ex) {
            return false;
        }
        return false;
    }

    public static boolean sendMail(String to, String subject, String text) {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("shopKHD@gmail.com", "khoi0939657217");
            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setHeader("Content-Type", "text/plain; charset=UTF-8");
            message.setFrom(new InternetAddress("shopKHD@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);
            message.setText(text);
            Transport.send(message);
        } catch (MessagingException e) {
            return false;
        }
        return true;
    }

    public boolean passwordRecovery(String userName, String email) {
        KhachHang kh = mapKhachHang.get(userName);
        if (kh != null) {
            sendMail(email, "passWord recorvery", kh.getMatKhau());
            return true;
        } else {
            System.out.println("No account");
        }
        return false;
    }

}
