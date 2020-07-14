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
    int Idphanhoi;
    String Chude;
    String Tentaikhoan;
    String Email;
    String Noidung;
    Date currentDate;

    public PhanHoi(int Idphanhoi,String Chude, String Tentaikhoan, String Email, String Noidung,Date currentDate) {
        this.Idphanhoi = Idphanhoi;
        this.Chude=Chude;
        this.Tentaikhoan = Tentaikhoan;
        this.Email = Email;
        this.Noidung = Noidung;
        this.currentDate=currentDate;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate= currentDate;
    }

    public String getChude() {
        return Chude;
    }

    public void setChude(String Chude) {
        this.Chude = Chude;
    }

    public int getIdphanhoi() {
        return Idphanhoi;
    }

    public void setIdphanhoi(int Idphanhoi) {
        this.Idphanhoi = Idphanhoi;
    }

    public String getTentaikhoan() {
        return Tentaikhoan;
    }

    public void setTentaikhoan(String Tentaikhoan) {
        this.Tentaikhoan = Tentaikhoan;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNoidung() {
        return Noidung;
    }

    public void setNoidung(String Noidung) {
        this.Noidung = Noidung;
    }
    
    
}
