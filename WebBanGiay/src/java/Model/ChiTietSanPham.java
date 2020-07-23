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
    private String hinhAnhChiTiet1;
    private String hinhAnhChiTiet2;
    private String hinhAnhChiTiet3;
    private String hinhAnhChiTiet4;

    public ChiTietSanPham(String masp, String moTa1, String hinhAnhChiTiet1, String hinhAnhChiTiet2, String hinhAnhChiTiet3, String hinhAnhChiTiet4) {
        super();
        this.masp = masp;
        this.moTa1 = moTa1;
        this.hinhAnhChiTiet1 = hinhAnhChiTiet1;
        this.hinhAnhChiTiet2 = hinhAnhChiTiet2;
        this.hinhAnhChiTiet3 = hinhAnhChiTiet3;
        this.hinhAnhChiTiet4 = hinhAnhChiTiet4;
    }

    public String getHinhAnhChiTiet1() {
        return hinhAnhChiTiet1;
    }

    public void setHinhAnhChiTiet1(String hinhAnhChiTiet1) {
        this.hinhAnhChiTiet1 = hinhAnhChiTiet1;
    }

    public String getHinhAnhChiTiet2() {
        return hinhAnhChiTiet2;
    }

    public void setHinhAnhChiTiet2(String hinhAnhChiTiet2) {
        this.hinhAnhChiTiet2 = hinhAnhChiTiet2;
    }

    public String getHinhAnhChiTiet3() {
        return hinhAnhChiTiet3;
    }

    public void setHinhAnhChiTiet3(String hinhAnhChiTiet3) {
        this.hinhAnhChiTiet3 = hinhAnhChiTiet3;
    }

    public String getHinhAnhChiTiet4() {
        return hinhAnhChiTiet4;
    }

    public void setHinhAnhChiTiet4(String hinhAnhChiTiet4) {
        this.hinhAnhChiTiet4 = hinhAnhChiTiet4;
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

    @Override
    public String toString() {
        return "ChiTietSanPham{" + "masp=" + masp + ", moTa1=" + moTa1 + ", hinhAnhChiTiet1=" + hinhAnhChiTiet1 +", hinhAnhChiTiet2=" + hinhAnhChiTiet2 +", hinhAnhChiTiet3=" + hinhAnhChiTiet3 +", hinhAnhChiTiet4=" + hinhAnhChiTiet4 + '}';
    }

}
