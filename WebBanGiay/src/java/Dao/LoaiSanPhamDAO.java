/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Database.ConnectToDatabase;
import Model.LoaiSanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author HAOVNCE140475
 */
public class LoaiSanPhamDAO implements ObjectDAO {

    public static Map<String, LoaiSanPham> mapLoaiSanPham = layDuLieuTuDatabase();

    /**
     * Use to add type of product
     *
     * @param obj data of type product
     * @return data type of product
     */
    @Override
    public boolean add(Object obj) {
        LoaiSanPham sp = (LoaiSanPham) obj;//Get data 
        mapLoaiSanPham.put(sp.getMaLoai(), sp);     //add data to map
        try {
            //sql command
            String sql = "insert into LoaiSanPham values (?,?,?,?)";
            Connection connect = ConnectToDatabase.getConnect();        //get connect
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, sp.getMaLoai());     //set data
            ppstm.setString(2, sp.getTenLoai());     //set data
            ppstm.setString(3, sp.getMaNhaCungCap());     //set data
            ppstm.setString(4, sp.getMoTaLoai());     //set data
            ppstm.executeUpdate();      //add data
        } catch (Exception e) {
            System.out.println("Hệ thống gặp lỗi " + e.getMessage());
            return false;
        }
        return true;
    }
//phương thức load dữ liệu từ database

    /**
     * Use to get data type of product from data base
     *
     * @return data type of product
     */
    public static Map<String, LoaiSanPham> layDuLieuTuDatabase() {
        Map<String, LoaiSanPham> map = new HashMap<>();
        try {

            ResultSet rs = new ConnectToDatabase().selectData("select * from  LoaiSanPham");
            while (rs.next()) {     //loop use to get data type of product
                String maLoai = rs.getString(1);    //get data 
                String tenLoai = rs.getString(2);    //get data 
                String maNhaCungCap = rs.getString(3);    //get data 
                String moTa = rs.getString(4);    //get data 
                LoaiSanPham sp = new LoaiSanPham(maLoai, tenLoai, maNhaCungCap, moTa);
                map.put(sp.getMaLoai(), sp);        //add data to map
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return map;
    }

    /**
     * Use to get type product by id
     *
     * @param idtype id of type product
     * @return data type of product
     */
    public LoaiSanPham getTypeProductByID(String idtype) {
        try {
            //sql commend
            String sql = "SELECT * FROM `loaisanpham` WHERE Maloai=?";
            Connection connect = ConnectToDatabase.getConnect();        //get connect
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, idtype);     //set data
            ResultSet rs = ppstm.executeQuery();        //get data
            if (rs.first()) {       //if exist
                String maloai = rs.getString(1);        //get data
                String tenloai = rs.getString(2);        //get data
                String manhacungcap = rs.getString(3);        //get data
                String mota = rs.getString(4);        //get data
                LoaiSanPham lsp = new LoaiSanPham(maloai, tenloai, manhacungcap, mota);
                return lsp;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Use to edit type of product
     *
     * @param id of type of product
     * @param obj data type of product
     * @return true if success
     */
    @Override
    public boolean edit(String id, Object obj) {
        LoaiSanPham sp = (LoaiSanPham) obj;
        mapLoaiSanPham.replace(sp.getMaLoai(), sp);
        String sql = "update LoaiSanPham set Tenloai=?,Manhacungcap=?,Mota=? where Maloai=?";       //sql command
        Connection connect;
        try {
            connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, sp.getTenLoai());
            ppstm.setString(2, sp.getMaNhaCungCap());
            ppstm.setString(3, sp.getMoTaLoai());
            ppstm.setString(4, id);
            ppstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    /**
     * Use to delete type product by id
     *
     * @param id of type of product
     * @return true if success
     */
    @Override
    public boolean del(String id) {
        mapLoaiSanPham.remove(id);
        String sql = "delete from LoaiSanPham where Maloai='" + id + "'";
        try {
            new ConnectToDatabase().excuteSql(sql);
        } catch (Exception e) {
            System.out.println("Hệ thống lỗi vì:" + e.getMessage());
            return false;
        }
        return true;
    }

    /**
     * Use to search type of product by name
     *
     * @param type name of type of product
     * @return
     */
    public static Map<String, LoaiSanPham> searchType(String type) {
        Map<String, LoaiSanPham> map = new HashMap<>();
        try {
            String sql = ("select * from  LoaiSanPham where Tenloai=?");
            Connection connect = ConnectToDatabase.getConnect();
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, type);
            ResultSet rs = ppstm.executeQuery();
            while (rs.next()) {
                String maLoai = rs.getString(1);
                String tenLoai = rs.getString(2);
                String maNhaCungCap = rs.getString(3);
                String moTa = rs.getString(4);
                LoaiSanPham sp = new LoaiSanPham(maLoai, tenLoai, maNhaCungCap, moTa);
                map.put(sp.getMaLoai(), sp);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return map;
    }

}
