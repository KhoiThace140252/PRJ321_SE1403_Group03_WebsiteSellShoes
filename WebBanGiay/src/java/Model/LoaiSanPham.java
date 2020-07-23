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
public class LoaiSanPham {

    String maLoai;
    String tenLoai;
    String maNhaCungCap;
    String moTaLoai;

    public LoaiSanPham(String maLoai, String tenLoai, String maNhaCungCap, String moTaLoai) {
        super();
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.maNhaCungCap = maNhaCungCap;
        this.moTaLoai = moTaLoai;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public String getMaNhaCungCap() {
        return maNhaCungCap;
    }

    public void setMaNhaCungCap(String maNhaCungCap) {
        this.maNhaCungCap = maNhaCungCap;
    }

    public String getMoTaLoai() {
        return moTaLoai;
    }

    public void setMoTaLoai(String moTa) {
        this.moTaLoai = moTaLoai;
    }

    @Override
    public String toString() {
        return "LoaiSanPham [maLoai=" + maLoai + ", tenLoai=" + tenLoai + ", maNhaCungCap=" + maNhaCungCap + ", moTaLoai="
                + moTaLoai + "]";
    }
}
