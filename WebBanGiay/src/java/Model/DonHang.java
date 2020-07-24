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

    String id;//khai bao bien id
    String tenKhachHang; //khai bao bien ten khach hang
    String tenSanPham;//khai bao bien ten san pham
    String tongSoLuong;//khai bao bien tong so luong
    String tongTien;//khai bao bien tong tien
    Date ngayMua;//khai bao bien ngay mua
    String diaChi;//khai bao bien dia chi
    String soDienThoai;//khai bao bien so dien thoai
    String email;//khai bao bien email
    String tinhTrangDonHang;//khai bao bien tinh trang son hang

    /**
     * tao constructor 
     *
     * @param id
     * @param tenKhachHang
     * @param tenSanPham
     * @param tongSoLuong
     * @param tongTien
     * @param ngayMua
     * @param diaChi
     * @param soDienThoai
     * @param email
     * @param tinhTrangDonHang
     */
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

    /**
     * lay ID
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * gan gia tri id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * lay ten khach hang
     *
     * @return ten khach hang
     */
    public String getTenKhachHang() {
        return tenKhachHang;
    }

    /**
     * gan gia tri ten khach hang
     *
     * @param tenKhachHang
     */
    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    /**
     * lay gia tri ten san pham
     *
     * @return ten san pham
     */
    public String getTenSanPham() {
        return tenSanPham;
    }

    /**
     * ten san pham
     *
     * @param tenSanPham
     */
    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    /**
     * lay gia tri tong so luong
     *
     * @return tong so luong
     */
    public String getTongSoLuong() {
        return tongSoLuong;
    }

    /**
     * gan gia tri tong so luong
     *
     * @param tongSoLuong
     */
    public void setTongSoLuong(String tongSoLuong) {
        this.tongSoLuong = tongSoLuong;
    }

    /**
     * lay gia tri tong tien
     *
     * @return tong tien
     */
    public String getTongTien() {
        return tongTien;
    }

    /**
     * set tong tien
     *
     * @param tongTien
     */
    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }

    /**
     * lay ngay mua
     *
     * @return ngay mua
     */
    public Date getNgayMua() {
        return ngayMua;
    }

    /**
     * gan gia tri ngay mua
     *
     * @param ngayMua
     */
    public void setNgayMua(Date ngayMua) {
        this.ngayMua = ngayMua;
    }

    /**
     * lay gia tri dia chi
     *
     * @return dia chi
     */
    public String getDiaChi() {
        return diaChi;
    }

    /**
     * gan gia tri dia chi
     *
     * @param diaChi
     */
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    /**
     * lay so dien thoai
     *
     * @return so dien thoai
     */
    public String getSoDienThoai() {
        return soDienThoai;
    }

    /**
     * gan gia tri so dien thoai
     *
     * @param soDienThoai
     */
    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    /**
     * lay email
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * gan gia tri email
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * lay gia tri trang don hang
     *
     * @return tinh trang don hang
     */
    public String getTinhTrangDonHang() {
        return tinhTrangDonHang;
    }

    /**
     * gan gia tri trang don hang
     *
     * @param tinhTrangDonHang
     */
    public void setTinhTrangDonHang(String tinhTrangDonHang) {
        this.tinhTrangDonHang = tinhTrangDonHang;
    }

    @Override
    public String toString() {
        return "DonHang{" + "id=" + id + ", tenKhachHang=" + tenKhachHang + ", tenSanPham=" + tenSanPham + ", tongSoLuong=" + tongSoLuong + ", tongTien=" + tongTien + ", ngayMua=" + ngayMua + ", diaChi=" + diaChi + ", soDienThoai=" + soDienThoai + ", email=" + email + ", tinhTrangDonHang=" + tinhTrangDonHang + '}';
    }

}
