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
public class ChiTietSanPham {

    private String masp;
    private String moTa1;
    private String hinhAnhChiTiet;

    public ChiTietSanPham(String masp, String moTa1, String hinhAnhChiTiet) {
        super();
        this.masp = masp;
        this.moTa1 = moTa1;
        this.hinhAnhChiTiet = hinhAnhChiTiet;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getMoTa1() {
        return moTa1;
    }

    public void setMoTa1(String moTa1) {
        this.moTa1 = moTa1;
    }

    public String getHinhAnhChiTiet() {
        return hinhAnhChiTiet;
    }

    public void setHinhAnhChiTiet(String hinhAnhChiTiet) {
        this.hinhAnhChiTiet = hinhAnhChiTiet;
    }

    @Override
    public String toString() {
        return "ChiTietSanPham{" + "masp=" + masp + ", moTa1=" + moTa1 + ", hinhAnhChiTiet=" + hinhAnhChiTiet + '}';
    }

}
