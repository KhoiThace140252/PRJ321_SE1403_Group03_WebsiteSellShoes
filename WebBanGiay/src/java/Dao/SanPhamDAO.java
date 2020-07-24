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
 * @author HAOVNCE140475
 */
public class SanPhamDAO implements ObjectDAO {

    public static Map<String, SanPham> mapSanPham = layDuLieuTuDatabase();      //create map use to store data from database

    /**
     * Use to add product to database
     *
     * @param obj data about product
     * @return false if insert false
     */
    @Override
    public boolean add(Object obj) {
        SanPham sp = (SanPham) obj;
        mapSanPham.put(sp.getMaSanPham(), sp);//add data of product to database
        try {
            String sql = "insert into SanPham values (?,?,?,?,?,?,?,?,?,?,?)";  //sql command
            Connection connect = ConnectToDatabase.getConnect();        //get connect to data base
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, sp.getMaSanPham());        //get data
            ppstm.setString(2, sp.getTenSanPham());        //get data
            ppstm.setString(3, sp.getGiaGiam());        //get data
            ppstm.setString(4, sp.getGiaTien());        //get data
            ppstm.setString(5, sp.getSoLuong());        //get data
            ppstm.setString(6, sp.getMaNhaCungCap());        //get data
            ppstm.setString(7, sp.getMaLoaiSanPham());        //get data
            ppstm.setString(8, sp.getHinhAnh());        //get data
            ppstm.setString(9, sp.getSoLuongNhap());        //get data
            ppstm.setString(10, sp.getSoLuongBan());        //get data
            ppstm.setString(11, sp.getTinhtrangsanpham());        //get data
            ppstm.executeUpdate();      //add data to database
        } catch (Exception e) {
            System.out.println("Hệ thống gặp lỗi " + e.getMessage());
            return false;
        }
        return true;
    }

    /**
     * Use to get data from database
     *
     * @return product data
     */
    public static Map<String, SanPham> layDuLieuTuDatabase() {
        Map<String, SanPham> map = new HashMap<>(); //new map use to store product data
        try {
            //connect to data base with sql command
            ResultSet rs = new ConnectToDatabase().selectData("select * from  SanPham where Soluong > 0");
            while (rs.next()) { //loop use to get data product
                String maSanPham = rs.getString(1);        //get data
                String tenSanPham = rs.getString(2);        //get data
                String giaGiam = rs.getString(3);        //get data
                String giaTien = rs.getString(4);        //get data
                String soLuong = rs.getString(5);        //get data
                String maNhaCungCap = rs.getString(6);        //get data
                String maLoaiSanPham = rs.getString(7);        //get data
                String hinhAnh = rs.getString(8);        //get data
                String soLuongNhap = rs.getString(9);        //get data
                String soLuongBan = rs.getString(10);        //get data
                String tinhtrangSanPham = rs.getString(11);        //get data
                SanPham sp = new SanPham(maSanPham, tenSanPham, giaGiam, giaTien, soLuong, maNhaCungCap, maLoaiSanPham, hinhAnh,
                        soLuongNhap, soLuongBan, tinhtrangSanPham);
                map.put(sp.getMaSanPham(), sp);     //add data to map
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return map;
    }

    /**
     * Use to get data of product if product is ready
     *
     * @return data of product
     */
    public static Map<String, SanPham> getTinhTrangSanPham() {
        Map<String, SanPham> map = new HashMap<>();     //map use to store data product
        try {
            //connect to database with sql command
            ResultSet rs = new ConnectToDatabase().selectData("select * from  SanPham where Tinhtrang='Already'");
            while (rs.next()) { //loop use get data from database
                String maSanPham = rs.getString(1);        //get data
                String tenSanPham = rs.getString(2);        //get data
                String giaGiam = rs.getString(3);        //get data
                String giaTien = rs.getString(4);        //get data
                String soLuong = rs.getString(5);        //get data
                String maNhaCungCap = rs.getString(6);        //get data
                String maLoaiSanPham = rs.getString(7);        //get data
                String hinhAnh = rs.getString(8);        //get data
                String soLuongNhap = rs.getString(9);        //get data
                String soLuongBan = rs.getString(10);        //get data
                String tinhtrangSanPham = rs.getString(11);        //get data
                SanPham sp = new SanPham(maSanPham, tenSanPham, giaGiam, giaTien, soLuong, maNhaCungCap, maLoaiSanPham, hinhAnh,
                        soLuongNhap, soLuongBan, tinhtrangSanPham);
                map.put(sp.getMaSanPham(), sp);     //add data of product to map
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return map;
    }

    /**
     * Use to get product by id
     *
     * @param id of product
     * @return data of product
     */
    public SanPham getProductByID(String id) {
        try {
            //sql command
            String sql = "SELECT * FROM `sanpham` WHERE Masanpham=?";
            Connection connect = ConnectToDatabase.getConnect();    //connect to database
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, id);
            ResultSet rs = ppstm.executeQuery();        //get data from data base
            if (rs.first()) {  //get data from resultset
                String masp = rs.getString(1);        //get data
                String ten = rs.getString(2);        //get data
                String giadagiam = rs.getString(3);        //get data
                String giaban = rs.getString(4);        //get data
                String soluong = rs.getString(5);        //get data
                String nhacungcap = rs.getString(6);        //get data
                String maloai = rs.getString(7);        //get data
                String hinhanh = rs.getString(8);        //get data
                String soluongnhap = rs.getString(9);        //get data
                String soluongban = rs.getString(10);        //get data
                String tinhtrangSanPham = rs.getString(11);
                //add to sanpham
                SanPham sp = new SanPham(masp, ten, giadagiam, giaban, soluong, nhacungcap, maloai, hinhanh, soluongnhap, soluongban, tinhtrangSanPham);
                return sp;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * use to update quantity of product
     *
     * @param quantity of product
     * @param export quantity of products sold
     * @param idproduct id ò product
     * @return true ì success
     */
    public boolean updateQuantity(String quantity, String export, String idproduct) {
        String sql = "UPDATE `sanpham` SET `Soluong`=?,`Soluongban`=? WHERE Masanpham=?";       //sql command
        Connection connect;
        try {
            connect = ConnectToDatabase.getConnect();       //connect to database
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, quantity);
            ppstm.setString(2, export);
            ppstm.setString(3, idproduct);
            ppstm.executeUpdate();      //update data to database
            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    /**
     * Use to edit data of product
     *
     * @param id of product
     * @param obj data of product
     * @return true if success
     */
    @Override
    public boolean edit(String id, Object obj) {
        SanPham sp = (SanPham) obj;
        mapSanPham.replace(sp.getMaSanPham(), sp);      //raeplace data
        //sql command
        String sql = "update SanPham set Ten=?,Giadagiam=?,Giaban=?,Soluong=?,Manhacungcap=?,Maloai=?,Hinhanh=?,Soluongnhap=?,Soluongban=?, Tinhtrang=? where Masanpham=?";
        Connection connect;
        try {
            connect = ConnectToDatabase.getConnect();       //connect to database
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, sp.getTenSanPham()); //set data
            ppstm.setString(2, sp.getGiaGiam()); //set data
            ppstm.setString(3, sp.getGiaTien()); //set data
            ppstm.setString(4, sp.getSoLuong()); //set data
            ppstm.setString(5, sp.getMaNhaCungCap()); //set data
            ppstm.setString(6, sp.getMaLoaiSanPham()); //set data
            ppstm.setString(7, sp.getHinhAnh()); //set data
            ppstm.setString(8, sp.getSoLuongNhap()); //set data
            ppstm.setString(9, sp.getSoLuongBan()); //set data
            ppstm.setString(10, sp.getTinhtrangsanpham()); //set data
            ppstm.setString(11, id); //set data
            ppstm.executeUpdate();      //update data
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    /**
     * Use to set status of product to not already
     *
     * @param id of product
     * @return true if success
     */
    @Override
    public boolean del(String id) {
//sql command
        String sql = "Update SanPham set Tinhtrang=? where Masanpham='" + id + "'";
        try {
            Connection connect = ConnectToDatabase.getConnect();        //connect to data base
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, "Not Already");
            ppstm.executeUpdate();  //update data
        } catch (Exception e) {
            System.out.println("Hệ thống lỗi vì:" + e.getMessage());
            return false;
        }
        return true;
    }

    /**
     * Use to search product by name
     *
     * @param tensp name of product
     * @return data of product
     */
    public static Map<String, SanPham> searchProduct(String tensp) {
        Map<String, SanPham> map = new HashMap<>();
        try {
            String sql = "select * from  SanPham";
            Connection connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ResultSet rs = ppstm.executeQuery();
            while (rs.next()) {
                String maSanPham = rs.getString(1);     //get data
                String tenSanPham = rs.getString(2);     //get data
                if (tenSanPham.contains(tensp)) { //compare name of product
                    String giaGiam = rs.getString(3);      //get data
                    String giaTien = rs.getString(4);     //get data
                    String soLuong = rs.getString(5);     //get data
                    String maNhaCungCap = rs.getString(6);     //get data
                    String maLoaiSanPham = rs.getString(7);     //get data
                    String hinhAnh = rs.getString(8);     //get data
                    String soLuongNhap = rs.getString(9);     //get data
                    String soLuongBan = rs.getString(10);     //get data
                    String tinhtrangSanPham = rs.getString(11);     //get data
                    SanPham sp = new SanPham(maSanPham, tenSanPham, giaGiam, giaTien, soLuong, maNhaCungCap, maLoaiSanPham, hinhAnh,
                            soLuongNhap, soLuongBan, tinhtrangSanPham);
                    map.put(sp.getMaSanPham(), sp);     //add data to product
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
