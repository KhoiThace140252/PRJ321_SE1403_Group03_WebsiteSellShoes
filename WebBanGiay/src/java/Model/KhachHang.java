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
public class KhachHang {

    int IdTaikhoan;
    String ten;
    String taiKhoan;
    String matKhau;
    String gioiTinh;
    String soDienThoai;
    String email;
    Date ngaySinh;
    String diaChi;
    String soLuongMua;
    String role;
    String accountstatus;

    public KhachHang(int IdTaikhoan, String taiKhoan, String matKhau,String ten, String gioiTinh, String soDienThoai, String email,
            Date ngaySinh, String diaChi, String soLuongMua, String role,String accountstatus) {
        super();
        this.IdTaikhoan = IdTaikhoan;
        this.ten = ten;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.soLuongMua = soLuongMua;
        this.role = role;
        this.accountstatus=accountstatus;
    }

    public KhachHang() {
       
    }

    public int getIdTaikhoan() {
        return IdTaikhoan;
    }

    public void setIdTaikhoan(int IdTaikhoan) {
        this.IdTaikhoan = IdTaikhoan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoLuongMua() {
        return soLuongMua;
    }

    public void setSoLuongMua(String soLuongMua) {
        this.soLuongMua = soLuongMua;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAccountstatus() {
        return accountstatus;
    }

    public void setAccountstatus(String accountstatus) {
        this.accountstatus = accountstatus;
    }

    @Override
    public String toString() {
        return "KhachHang [ten=" + ten + ", taiKhoan=" + taiKhoan + ", matKhau=" + matKhau + ", gioiTinh="
                + gioiTinh + ", soDienThoai=" + soDienThoai + ", email=" + email + ", ngaySinh=" + ngaySinh
                + ", diaChi=" + diaChi + ", soLuongMua=" + soLuongMua + ", role=" + role +", accountStatus=" + accountstatus + "]";
    }
}
