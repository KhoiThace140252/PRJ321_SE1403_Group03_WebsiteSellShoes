/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Admin
 */
public class NhaCungCap {

    String maNhaCungCap;
    String tenNhaCungCap;
    String diaChi;
    String soDienThoai;
    String logo;
    String mota;
    String tinhtrangncc;

    /**
     * tao constructor
     *
     * @param maNhaCungCap
     * @param tenNhaCungCap
     * @param diaChi
     * @param soDienThoai
     * @param logo
     * @param mota
     * @param tinhtrangncc
     */
    public NhaCungCap(String maNhaCungCap, String tenNhaCungCap, String diaChi, String soDienThoai, String logo, String mota, String tinhtrangncc) {
        super();
        this.maNhaCungCap = maNhaCungCap;
        this.tenNhaCungCap = tenNhaCungCap;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.logo = logo;
        this.mota = mota;
        this.tinhtrangncc = tinhtrangncc;
    }

    /**
     * lay gia tri ma nha cung cap
     *
     * @return ma nha cung cap
     */
    public String getMaNhaCungCap() {
        return maNhaCungCap;
    }

    /**
     * gan gia tri ma nha cung cap
     *
     *
     * @param maNhaCungCap
     */
    public void setMaNhaCungCap(String maNhaCungCap) {
        this.maNhaCungCap = maNhaCungCap;
    }

    /**
     * lay gia tri ten nha cung cap
     *
     * @return ten nhan cung cap
     */
    public String getTenNhaCungCap() {
        return tenNhaCungCap;
    }

    /**
     * gan gia tri ten nhan cung cap
     *
     * @param tenNhaCungCap
     */
    public void setTenNhaCungCap(String tenNhaCungCap) {
        this.tenNhaCungCap = tenNhaCungCap;
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
     * gan so dien thoai
     *
     * @param soDienThoai
     */
    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    /**
     * lay gia tri cua logo
     *
     * @return logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * gan gia tri cho logo
     *
     * @param logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * lay gia tri cua mo ta
     *
     * @return mo ta
     */
    public String getMota() {
        return mota;
    }

    /**
     * gan gian tri cho mo ta
     *
     * @param mota
     */
    public void setMota(String mota) {
        this.mota = mota;
    }

    /**
     * lay gia tri tinh trang nha cung cap
     *
     * @return tinh trang nha cung cap
     */
    public String getTinhtrangncc() {
        return tinhtrangncc;
    }

    /**
     * gan gia tri tinh trang nha cung cap
     *
     * @param tinhtrangncc
     */
    public void setTinhtrangncc(String tinhtrangncc) {
        this.tinhtrangncc = tinhtrangncc;
    }

    @Override
    public String toString() {
        return "Producer [maNhaCungCap=" + maNhaCungCap + ", tenNhaCungCap=" + tenNhaCungCap + ", diaChi=" + diaChi
                + ", soDienThoai=" + soDienThoai + ", logo=" + logo + ", mota=" + mota + ", TinhTrangNCC=" + tinhtrangncc + "]";
    }
}
