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


public class NhaCungCapDAO implements ObjectDAO {


    public static Map<String, NhaCungCap> mapNhaCungCap = layDuLieuTuDatabase();

    /**
     *
     * @param obj
     * @return true khi khong xuat hien loi
     */
    @Override
    public boolean add(Object obj) {
        NhaCungCap ncc = (NhaCungCap) obj;
        mapNhaCungCap.put(ncc.getMaNhaCungCap(), ncc);
        try {
            String sql = "insert into NhaCungCap values (?,?,?,?,?,?,?)";//khai bao cau lenh sql de lay du lieu tu database
            Connection connect = ConnectToDatabase.getConnect();//connect database
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, ncc.getMaNhaCungCap());//lay du lieu cua nha cung cap
            ppstm.setString(2, ncc.getTenNhaCungCap());//lay du lieu cua nha cung cap
            ppstm.setString(3, ncc.getDiaChi());//lay du lieu cua nha cung cap
            ppstm.setString(4, ncc.getSoDienThoai());//lay du lieu cua nha cung cap
            ppstm.setString(5, ncc.getLogo());//lay du lieu cua nha cung cap
            ppstm.setString(6, ncc.getMota());//lay du lieu cua nha cung cap
            ppstm.setString(7, ncc.getTinhtrangncc());//lay du lieu cua nha cung cap
            ppstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Hệ thống gặp lỗi " + e.getMessage());
            return false;
        }
        return true;
    }


    /**
     * Phương thức lấy dữ liệu từ database lên sử dụng
     *
     * @return map sau khi upload thanh cong
     */
    public static Map<String, NhaCungCap> layDuLieuTuDatabase() {
        Map<String, NhaCungCap> map = new HashMap<>();
        try {
            ResultSet rs = new ConnectToDatabase().selectData("select * from  NhaCungCap");
            while (rs.next()) {
                String maNhaCungCap = rs.getString(1);//lay du lieu tu ma nha cung cap
                String tenNhaCungCap = rs.getString(2);// lay du lieu tu ten nha cung cap
                String diaChi = rs.getString(3);//lay du lieu tu dia chi
                String soDienThoai = rs.getString(4);//lay du lieu tu so dien thoai
                String logo = rs.getString(5);//lay du lieu tu logo
                String mota = rs.getString(6);//lay du lieu tu mota
                String tinhtrangncc = rs.getString(7);//lay du lieu tu tinh trang 
                NhaCungCap ncc = new NhaCungCap(maNhaCungCap, tenNhaCungCap, diaChi, soDienThoai, logo, mota, tinhtrangncc);
                map.put(ncc.getMaNhaCungCap(), ncc);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return map;
    }

    /**
     * lay du lieu tu nha cung cap
     *
     * @param idsupplier
     * @return 
     */
    public NhaCungCap getSupplierByID(String idsupplier) {
        try {
            String sql = "SELECT * FROM `nhacungcap` WHERE Manhacungcap=?";//khai bao cau lenh sql de lay du lieu tu database
            Connection connect = ConnectToDatabase.getConnect();//ket noi voi co do du lieu
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, idsupplier);
            ResultSet rs = ppstm.executeQuery(); // tra ket qua ve
            if (rs.first()) {
                String Idsupplier = rs.getString(1);//lay du lieu cua id nha cung cap
                String Namesupplier = rs.getString(2);// lay du lieu cua ten nha cung cap
                String Address = rs.getString(3);// lay du lieu cua dia chi
                String Phone = rs.getString(4);// lay du lieu 
                String Logo = rs.getString(5);//lay du lieu lodgo
                String mota = rs.getString(6);//lay du lieu mo ta
                String tinhtrangncc = rs.getString(7);//lay du lieu 
                NhaCungCap ncc = new NhaCungCap(Idsupplier, Namesupplier, Address, Phone, Logo, mota, tinhtrangncc);
                return ncc;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * chinh sua thong tin cua san pham
     *
     * @param id
     * @param obj
     * @return true neu khong xuat hien loi
     */
    @Override
    public boolean edit(String id, Object obj) {
        NhaCungCap ncc = (NhaCungCap) obj;
        mapNhaCungCap.replace(ncc.getMaNhaCungCap(), ncc);
        //khai bao cau lenh sql de lay du lieu tu co so du lieu
        String sql = "update NhaCungCap set Tennhacungcap=?,Diachi=?,Sodienthoai=?,Logo=?,Mota=?, TinhtrangNcc=? where Manhacungcap=?";
        Connection connect;//ket noi voi co so du lieu
        try {
            connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, ncc.getTenNhaCungCap());//lay gia tri du lieu cua ten nha cung cap
            ppstm.setString(2, ncc.getDiaChi());// lay gia tri dia chi
            ppstm.setString(3, ncc.getSoDienThoai());//lay gia tri so dien thoai
            ppstm.setString(4, ncc.getLogo());// lay gia tri lo go
            ppstm.setString(5, ncc.getMota());// lay gia tri mo ta
            ppstm.setString(6, ncc.getTinhtrangncc());// lay gia tri tinh trang
            ppstm.setString(7, id);// lay id
            ppstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    /**
     * xoa ten nha cung cap
     *
     * @param id
     * @param status
     * @return true neu khong co loi
     */
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

    /**
     *
     * @param namesuppiler
     * @return
     */
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
