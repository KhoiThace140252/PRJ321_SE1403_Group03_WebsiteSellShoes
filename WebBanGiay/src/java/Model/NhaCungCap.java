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

    public NhaCungCap(String maNhaCungCap, String tenNhaCungCap, String diaChi, String soDienThoai, String logo, String mota,String tinhtrangncc) {
        super();
        this.maNhaCungCap = maNhaCungCap;
        this.tenNhaCungCap = tenNhaCungCap;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.logo = logo;
        this.mota = mota;
        this.tinhtrangncc=tinhtrangncc;
    }

    public String getMaNhaCungCap() {
        return maNhaCungCap;
    }

    public void setMaNhaCungCap(String maNhaCungCap) {
        this.maNhaCungCap = maNhaCungCap;
    }

    public String getTenNhaCungCap() {
        return tenNhaCungCap;
    }

    public void setTenNhaCungCap(String tenNhaCungCap) {
        this.tenNhaCungCap = tenNhaCungCap;
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getTinhtrangncc() {
        return tinhtrangncc;
    }

    public void setTinhtrangncc(String tinhtrangncc) {
        this.tinhtrangncc = tinhtrangncc;
    }

    @Override
    public String toString() {
        return "Producer [maNhaCungCap=" + maNhaCungCap + ", tenNhaCungCap=" + tenNhaCungCap + ", diaChi=" + diaChi
                + ", soDienThoai=" + soDienThoai + ", logo=" + logo + ", mota=" + mota + ", TinhTrangNCC=" + tinhtrangncc +"]";
    }
}
