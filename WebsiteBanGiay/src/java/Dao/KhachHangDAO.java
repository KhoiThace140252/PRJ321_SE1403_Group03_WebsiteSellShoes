/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.ConnectToDatabase;
import Model.KhachHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

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
                int IdTaikhoan=rs.getInt(1);
                String taiKhoan = rs.getString(2);
                String matKhau = rs.getString(3);
                String ten = rs.getString(4);
                String gioiTinh = rs.getString(5);
                String soDienThoai = rs.getString(6);
                String email = rs.getString(7);
                String ngaySinh = rs.getString(8);
                String diaChi = rs.getString(9);
                String soLuongMua = rs.getString(10);
                String role = rs.getString(11);
                KhachHang kh = new KhachHang(IdTaikhoan,ten, taiKhoan, matKhau, gioiTinh, soDienThoai, email, ngaySinh, diaChi,
                        soLuongMua, role);
                mapTemp.put(kh.getTaiKhoan(), kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mapTemp;
    }

    public boolean checkLogin(String userName, String passWord) {
        KhachHang kh = mapKhachHang.get(userName);
        if (kh != null) {
            if (kh.getMatKhau().equals(passWord)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean add(Object obj) {
        KhachHang kh = (KhachHang) obj;
        mapKhachHang.put(kh.getTaiKhoan(), kh);
        String sql = "insert into TaiKhoan values (?,?,?,?,?,?,?,?,?,?,?)";
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
            ppstm.setString(8, kh.getNgaySinh());
            ppstm.setString(9, kh.getDiaChi());
            ppstm.setString(10, kh.getSoLuongMua());
            ppstm.setString(11, kh.getRole());
            ppstm.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error when add customer :" + e.getMessage());
        }
        return false;
    }

    public boolean del(String id) {
        mapKhachHang.remove(id);
        try {
            new ConnectToDatabase().excuteSql("delete from TaiKhoan where taikhoan='" + id + "'");
            return true;
        } catch (Exception e) {
            System.out.println("Error when delete customer :" + e.getMessage());
        }
        return false;
    }

    public boolean edit(String id, Object obj) {
        KhachHang kh = (KhachHang) obj;
        mapKhachHang.replace(id, kh);
        String sql = "update taikhoan set Tenkhachhang=?,Matkhau=?,Gioitinh=?,Sodienthoai=?,Email=?,Ngaysinh=?,Diachi=?,Soluotmua=?,Role=? where Tentaikhoan='"
                + id + "'";
        Connection connect = ConnectToDatabase.getConnect();
        try {
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, kh.getTen());
            ppstm.setString(2, kh.getMatKhau());
            ppstm.setString(3, kh.getGioiTinh());
            ppstm.setString(4, kh.getSoDienThoai());
            ppstm.setString(5, kh.getEmail());
            ppstm.setString(6, kh.getNgaySinh());
            ppstm.setString(7, kh.getDiaChi());
            ppstm.setString(8, kh.getSoLuongMua());
            ppstm.setString(9, kh.getRole());
            ppstm.setString(10, id);
            ppstm.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error when edit customer :" + e.getMessage());
        }
        return false;
    }

    public boolean changePass(String userName, String newPass) {
        KhachHang kh = mapKhachHang.get(userName);
        if (kh != null) {
            kh.setMatKhau(newPass);
            mapKhachHang.replace(kh.getTaiKhoan(), kh);
            edit(kh.getTaiKhoan(), kh);
            return true;
        } else {
            return false;
        }
    }

//    public static boolean sendMail(String to, String subject, String text) {
//        Properties props = new Properties();
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.port", "587");
//        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication("shopphoneltw@gmail.com", "abcdabcd");
//            }
//        });
//        try {
//            Message message = new MimeMessage(session);
//            message.setHeader("Content-Type", "text/plain; charset=UTF-8");
//            message.setFrom(new InternetAddress("shopphoneltw@gmail.com"));
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
//            message.setSubject(subject);
//            message.setText(text);
//            Transport.send(message);
//        } catch (MessagingException e) {
//            return false;
//        }
//        return true;
//    }
//    public boolean passwordRecovery(String userName, String email) {
//        KhachHang kh = mapKhachHang.get(userName);
//        if (kh != null) {
//            sendMail(email, "passWord recorvery", kh.getMatKhau());
//            return true;
//        } else {
//            System.out.println("No account");
//        }
//        return false;
//    }
}
