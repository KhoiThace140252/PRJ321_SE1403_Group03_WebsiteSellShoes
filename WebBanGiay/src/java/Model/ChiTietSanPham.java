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
public class ChiTietSanPham {

    private String masp;    //id of product
    private String moTa1;    //description of product
    private String hinhAnhChiTiet1;     //image 1
    private String hinhAnhChiTiet2;     //image 2
    private String hinhAnhChiTiet3;     //image 3
    private String hinhAnhChiTiet4;     //image 4

    /**
     * Constructor
     *
     * @param masp id of product
     * @param moTa1 description of product
     * @param hinhAnhChiTiet1 image 1
     * @param hinhAnhChiTiet2 image 2
     * @param hinhAnhChiTiet3 image 3
     * @param hinhAnhChiTiet4 image 4
     */
    public ChiTietSanPham(String masp, String moTa1, String hinhAnhChiTiet1, String hinhAnhChiTiet2, String hinhAnhChiTiet3, String hinhAnhChiTiet4) {
        super();
        this.masp = masp;
        this.moTa1 = moTa1;
        this.hinhAnhChiTiet1 = hinhAnhChiTiet1;
        this.hinhAnhChiTiet2 = hinhAnhChiTiet2;
        this.hinhAnhChiTiet3 = hinhAnhChiTiet3;
        this.hinhAnhChiTiet4 = hinhAnhChiTiet4;
    }

    /**
     *
     * @return
     */
    public String getHinhAnhChiTiet1() {
        return hinhAnhChiTiet1;
    }

    /**
     *
     * @param hinhAnhChiTiet1
     */
    public void setHinhAnhChiTiet1(String hinhAnhChiTiet1) {
        this.hinhAnhChiTiet1 = hinhAnhChiTiet1;
    }

    /**
     *
     * @return
     */
    public String getHinhAnhChiTiet2() {
        return hinhAnhChiTiet2;
    }

    /**
     *
     * @param hinhAnhChiTiet2
     */
    public void setHinhAnhChiTiet2(String hinhAnhChiTiet2) {
        this.hinhAnhChiTiet2 = hinhAnhChiTiet2;
    }

    /**
     *
     * @return
     */
    public String getHinhAnhChiTiet3() {
        return hinhAnhChiTiet3;
    }

    /**
     *
     * @param hinhAnhChiTiet3
     */
    public void setHinhAnhChiTiet3(String hinhAnhChiTiet3) {
        this.hinhAnhChiTiet3 = hinhAnhChiTiet3;
    }

    /**
     *
     * @return
     */
    public String getHinhAnhChiTiet4() {
        return hinhAnhChiTiet4;
    }

    /**
     *
     * @param hinhAnhChiTiet4
     */
    public void setHinhAnhChiTiet4(String hinhAnhChiTiet4) {
        this.hinhAnhChiTiet4 = hinhAnhChiTiet4;
    }

    /**
     *
     * @return
     */
    public String getMasp() {
        return masp;
    }

    /**
     *
     * @param masp
     */
    public void setMasp(String masp) {
        this.masp = masp;
    }

    /**
     *
     * @return
     */
    public String getMoTa1() {
        return moTa1;
    }

    /**
     *
     * @param moTa1
     */
    public void setMoTa1(String moTa1) {
        this.moTa1 = moTa1;
    }

    @Override
    public String toString() {
        return "ChiTietSanPham{" + "masp=" + masp + ", moTa1=" + moTa1 + ", hinhAnhChiTiet1=" + hinhAnhChiTiet1 + ", hinhAnhChiTiet2=" + hinhAnhChiTiet2 + ", hinhAnhChiTiet3=" + hinhAnhChiTiet3 + ", hinhAnhChiTiet4=" + hinhAnhChiTiet4 + '}';
    }

}
