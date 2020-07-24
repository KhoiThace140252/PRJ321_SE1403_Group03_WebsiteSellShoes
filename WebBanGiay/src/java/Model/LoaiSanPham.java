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
public class LoaiSanPham {

    String maLoai;  //id type of product
    String tenLoai;  //name type of product
    String maNhaCungCap;  //supplier id
    String moTaLoai;  //description type of product

    /**
     * Constructor
     *
     * @param maLoai id type of product
     * @param tenLoai name type of product
     * @param maNhaCungCap supplier id
     * @param moTaLoai description type of product
     */
    public LoaiSanPham(String maLoai, String tenLoai, String maNhaCungCap, String moTaLoai) {
        super();
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.maNhaCungCap = maNhaCungCap;
        this.moTaLoai = moTaLoai;
    }

    /**
     *
     * @return
     */
    public String getMaLoai() {
        return maLoai;
    }

    /**
     *
     * @param maLoai
     */
    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    /**
     *
     * @return
     */
    public String getTenLoai() {
        return tenLoai;
    }

    /**
     *
     * @param tenLoai
     */
    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
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
    public String getMoTaLoai() {
        return moTaLoai;
    }

    /**
     *
     * @param moTa
     */
    public void setMoTaLoai(String moTa) {
        this.moTaLoai = moTaLoai;
    }

    @Override
    public String toString() {
        return "LoaiSanPham [maLoai=" + maLoai + ", tenLoai=" + tenLoai + ", maNhaCungCap=" + maNhaCungCap + ", moTaLoai="
                + moTaLoai + "]";
    }
}
