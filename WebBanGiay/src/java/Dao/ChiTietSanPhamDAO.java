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
 * @author HAOVNCE140475
 */
public class ChiTietSanPhamDAO implements ObjectDAO {
//map use to store data of product detail

    public static Map<String, ChiTietSanPham> mapChiTietSanPham = layDuLieuTuDatabase();

    /**
     * Use to check product is exist or not
     *
     * @param maSanPham id of product
     * @return true if exit or false if not exit
     */
    public boolean checkProductIDDuplicate(String maSanPham) {
        ChiTietSanPham ctsp = mapChiTietSanPham.get(maSanPham);
        return (ctsp != null) ? true : false;
    }

    /**
     * Use to add product detail
     *
     * @param obj data of product detail
     * @return true if success
     */
    @Override
    public boolean add(Object obj) {
        ChiTietSanPham ncc = (ChiTietSanPham) obj;      //data product detail
        mapChiTietSanPham.put(ncc.getMasp(), ncc);     // add data of product detail to list
        try {
            String sql = "insert into Thongtinsanpham values (?,?,?,?,?,?)";        //sql command
            Connection getConnect = ConnectToDatabase.getConnect();     //get connect
            PreparedStatement ppstm = getConnect.prepareStatement(sql);
            ppstm.setString(1, ncc.getMasp());      //set data
            ppstm.setString(2, ncc.getMoTa1());      //set data
            ppstm.setString(3, ncc.getHinhAnhChiTiet1());      //set data
            ppstm.setString(4, ncc.getHinhAnhChiTiet2());      //set data
            ppstm.setString(5, ncc.getHinhAnhChiTiet3());      //set data
            ppstm.setString(6, ncc.getHinhAnhChiTiet4());      //set data
            ppstm.executeUpdate();      //add data to database
        } catch (Exception e) {
            System.out.println("Hệ thống gặp lỗi " + e.getMessage());
            return false;
        }
        return true;
    }

    /**
     * Use to get data of product detail from database
     *
     * @return data of product detail
     */
    public static Map<String, ChiTietSanPham> layDuLieuTuDatabase() {
        Map<String, ChiTietSanPham> map = new HashMap<>();      //map use to store data
        try {
            ResultSet rs = new ConnectToDatabase().selectData("select * from  Thongtinsanpham");    //sql command
            while (rs.next()) { //loop use to gat data
                String maSanPham = rs.getString(1);     //get data
                String moTa1 = rs.getString(2);     //get data
                String hinhAnhChiTiet1 = rs.getString(3);     //get data
                String hinhAnhChiTiet2 = rs.getString(4);     //get data
                String hinhAnhChiTiet3 = rs.getString(5);     //get data
                String hinhAnhChiTiet4 = rs.getString(6);     //get data
                ChiTietSanPham ncc = new ChiTietSanPham(maSanPham, moTa1, hinhAnhChiTiet1, hinhAnhChiTiet2, hinhAnhChiTiet3, hinhAnhChiTiet4);
                map.put(ncc.getMasp(), ncc);   //add data to map
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return map;
    }

    /**
     * Use to get data of product detail by id product
     *
     * @param masp id of product
     * @return data of product detail
     */
    public ChiTietSanPham getDetailProductById(String masp) {
        try {
            String sql = "SELECT * FROM `thongtinsanpham` WHERE Masanpham=?";       //sql command
            Connection connect = ConnectToDatabase.getConnect();        //get connect
            PreparedStatement ppstm = connect.prepareStatement(sql);
            ppstm.setString(1, masp);       //set data
            ResultSet rs = ppstm.executeQuery(); //get data from databse
            if (rs.first()) {   //if exit
                String idproduct = rs.getString(1);     //get data
                String mota1 = rs.getString(2);     //get data
                String hinhanhchitiet1 = rs.getString(3);     //get data
                String hinhanhchitiet2 = rs.getString(4);     //get data
                String hinhanhchitiet3 = rs.getString(5);     //get data
                String hinhanhchitiet4 = rs.getString(6);     //get data

                ChiTietSanPham ctsp = new ChiTietSanPham(idproduct, mota1, hinhanhchitiet1, hinhanhchitiet2, hinhanhchitiet3, hinhanhchitiet4);
                return ctsp;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Use to edit data of product detail
     *
     * @param id of product
     * @param obj data of product detail
     * @return true if success
     */
    @Override
    public boolean edit(String id, Object obj) {
        ChiTietSanPham ncc = (ChiTietSanPham) obj;      //get data of product
        mapChiTietSanPham.replace(ncc.getMasp(), ncc);      //add data to map
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

    /**
     * Use to delete product detail by id
     *
     * @param id of product
     * @return
     */
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

    /**
     * Use to search product detail by id
     *
     * @param maSp id of product
     * @return data of product detail
     */
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
