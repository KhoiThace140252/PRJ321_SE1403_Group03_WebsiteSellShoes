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
public class PhanHoi {

    int Idphanhoi;//id phan hoi
    String Chude;//chu de phan hoi
    String Tentaikhoan;//ten tai khoan phan hoi
    String Email;//email phan hoi
    String Noidung;//noi dung phan hoi
    Date currentDate;//ngay phan hoi

    /**
     * tao mot constructor co day du tham so
     *
     * @param Idphanhoi id phan hoi
     * @param Chude chu de phan hoi
     * @param Tentaikhoan ten tai khoan phan hoi
     * @param Email email phan hoi
     * @param Noidung noi dung phan hoi
     * @param currentDate ngay phan hoi
     */
    public PhanHoi(int Idphanhoi, String Chude, String Tentaikhoan, String Email, String Noidung, Date currentDate) {
        this.Idphanhoi = Idphanhoi;
        this.Chude = Chude;
        this.Tentaikhoan = Tentaikhoan;
        this.Email = Email;
        this.Noidung = Noidung;
        this.currentDate = currentDate;
    }

    /**
     * get Current date
     *
     * @return currentDate
     */
    public Date getCurrentDate() {
        return currentDate;
    }

    /**
     * set Current date
     *
     * @param currentDate
     */
    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    /**
     * get Chu de
     *
     * @return Chude
     */
    public String getChude() {
        return Chude;
    }

    /**
     * set Chu de
     *
     * @param Chude
     */
    public void setChude(String Chude) {
        this.Chude = Chude;
    }

    /**
     * get Id phan hoi
     *
     * @return Idphanhoi
     */
    public int getIdphanhoi() {
        return Idphanhoi;
    }

    /**
     * set Id phan hoi
     *
     * @param Idphanhoi
     */
    public void setIdphanhoi(int Idphanhoi) {
        this.Idphanhoi = Idphanhoi;
    }

    /**
     * get Ten tai khoan
     *
     * @return Tentaikhoan
     */
    public String getTentaikhoan() {
        return Tentaikhoan;
    }

    /**
     * set Ten tai khoan
     *
     * @param Tentaikhoan
     */
    public void setTentaikhoan(String Tentaikhoan) {
        this.Tentaikhoan = Tentaikhoan;
    }

    /**
     * get email
     *
     * @return Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * set Email
     *
     * @param Email
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * get Noi dung
     *
     * @return Noidung
     */
    public String getNoidung() {
        return Noidung;
    }

    /**
     * set Noi dung
     *
     * @param Noidung
     */
    public void setNoidung(String Noidung) {
        this.Noidung = Noidung;
    }

}
