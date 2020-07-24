/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author HAOVNCE140475
 */
public class SanPham {

    String maSanPham;   //use to store id of product
    String tenSanPham;   //use to store name of product
    String giaTien;   //use to store price of product
    String soLuong;   //use to store quantity of product
    String maNhaCungCap;   //use to store id of supplier
    String maLoaiSanPham;   //use to store id of type product
    String hinhAnh;   //use to store link image of product
    String soLuongNhap;   //use to store input quantity of product
    String soLuongBan;   //use to store quantity of product was sold
    String giaGiam;   //use to store price discounted
    String tinhtrangsanpham;   //use to store starus of product

    /**
     * Constructor
     *
     * @param maSanPham id of product
     * @param tenSanPham name of product
     * @param giaGiam price discounted
     * @param giaTien price of product
     * @param soLuong quantity of product
     * @param maNhaCungCap id of supplier
     * @param maLoaiSanPham id of type product
     * @param hinhAnh link image of product
     * @param soLuongNhap input quantity
     * @param soLuongBan quantity of product was sold
     * @param tinhtrangsanpham starus of product
     */
    public SanPham(String maSanPham, String tenSanPham, String giaGiam, String giaTien, String soLuong, String maNhaCungCap,
            String maLoaiSanPham, String hinhAnh, String soLuongNhap, String soLuongBan, String tinhtrangsanpham) {
        super();
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaGiam = giaGiam;
        this.giaTien = giaTien;
        this.soLuong = soLuong;
        this.maNhaCungCap = maNhaCungCap;
        this.maLoaiSanPham = maLoaiSanPham;
        this.hinhAnh = hinhAnh;
        this.soLuongNhap = soLuongNhap;
        this.soLuongBan = soLuongBan;
        this.tinhtrangsanpham = tinhtrangsanpham;
    }

    /**
     * Get status of product
     *
     * @return status of product
     */
    public String getTinhtrangsanpham() {
        return tinhtrangsanpham;
    }

    /**
     * Set status of product
     *
     * @param tinhtrangsanpham status of product
     */
    public void setTinhtrangsanpham(String tinhtrangsanpham) {
        this.tinhtrangsanpham = tinhtrangsanpham;
    }

    /**
     *
     * @return
     */
    public String getMaSanPham() {
        return maSanPham;
    }

    /**
     *
     * @param maSanPham
     */
    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    /**
     *
     * @return
     */
    public String getTenSanPham() {
        return tenSanPham;
    }

    /**
     *
     * @param tenSanPham
     */
    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    /**
     *
     * @return
     */
    public String getGiaTien() {
        return giaTien;
    }

    /**
     *
     * @param giaTien
     */
    public void setGiaTien(String giaTien) {
        this.giaTien = giaTien;
    }

    /**
     *
     * @return
     */
    public String getSoLuong() {
        return soLuong;
    }

    /**
     *
     * @param soLuong
     */
    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    /**
     *
     * @return
     */
    public String getMaNhaCungCap() {
        return maNhaCungCap;
    }

    /**
     *
     * @param maNhaCungCap
     */
    public void setMaNhaCungCap(String maNhaCungCap) {
        this.maNhaCungCap = maNhaCungCap;
    }

    /**
     *
     * @return
     */
    public String getMaLoaiSanPham() {
        return maLoaiSanPham;
    }

    /**
     *
     * @param maLoaiSanPham
     */
    public void setMaLoaiSanPham(String maLoaiSanPham) {
        this.maLoaiSanPham = maLoaiSanPham;
    }

    /**
     *
     * @return
     */
    public String getHinhAnh() {
        return hinhAnh;
    }

    /**
     *
     * @param hinhAnh
     */
    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    /**
     *
     * @return
     */
    public String getSoLuongNhap() {
        return soLuongNhap;
    }

    /**
     *
     * @param soLuongNhap
     */
    public void setSoLuongNhap(String soLuongNhap) {
        this.soLuongNhap = soLuongNhap;
    }

    /**
     *
     * @return
     */
    public String getSoLuongBan() {
        return soLuongBan;
    }

    /**
     *
     * @param soLuongBan
     */
    public void setSoLuongBan(String soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    /**
     *
     * @return
     */
    public String getGiaGiam() {
        return giaGiam;
    }

    /**
     *
     * @param giaGiam
     */
    public void setGiaGiam(String giaGiam) {
        this.giaGiam = giaGiam;
    }

    @Override
    public String toString() {
        return "SanPham [maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", giaTien=" + giaTien + ", soLuong="
                + soLuong + ", maNhaCungCap=" + maNhaCungCap + ", maLoaiSanPham=" + maLoaiSanPham + ", hinhAnh="
                + hinhAnh + ", soLuongNhap=" + soLuongNhap + ", soLuongBan=" + soLuongBan + ", giaGiam=" + giaGiam
                + "]";
    }
}
