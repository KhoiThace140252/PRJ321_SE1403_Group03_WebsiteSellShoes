/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class DonHang {

    String id;
    String tenKhachHang;
    String tenSanPham;
    String tongSoLuong;
    String tongTien;
    Date ngayMua;
    String diaChi;
    String soDienThoai;
    String email;
    String tinhTrangDonHang;

    public DonHang(String id, String tenKhachHang, String tenSanPham, String tongSoLuong, String tongTien, Date ngayMua, String diaChi, String soDienThoai, String email,
            String tinhTrangDonHang) {
        super();
        this.id = id;
        this.tenKhachHang = tenKhachHang;
        this.tenSanPham = tenSanPham;
        this.tongSoLuong = tongSoLuong;
      
        this.tongTien = tongTien;
        this.ngayMua = ngayMua;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.tinhTrangDonHang = tinhTrangDonHang;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getTongSoLuong() {
        return tongSoLuong;
    }

    public void setTongSoLuong(String tongSoLuong) {
        this.tongSoLuong = tongSoLuong;
    }

    public String getTongTien() {
        return tongTien;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }

    public Date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(Date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTinhTrangDonHang() {
        return tinhTrangDonHang;
    }

    public void setTinhTrangDonHang(String tinhTrangDonHang) {
        this.tinhTrangDonHang = tinhTrangDonHang;
    }

 
    @Override
    public String toString() {
        return "DonHang{" + "id=" + id + ", tenKhachHang=" + tenKhachHang + ", tenSanPham=" + tenSanPham + ", tongSoLuong=" + tongSoLuong + ", tongTien=" + tongTien + ", ngayMua=" + ngayMua + ", diaChi=" + diaChi + ", soDienThoai=" + soDienThoai + ", email=" + email + ", tinhTrangDonHang=" + tinhTrangDonHang + '}';
    }

    
}
