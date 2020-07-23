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

    int IdTaikhoan;//Id tai khoan khach hang
    String ten;//ten khach hang
    String taiKhoan;//tai khoan khach hang
    String matKhau;//mat khau khach hang
    String gioiTinh;//gioi tinh khach hang
    String soDienThoai;//so dien thoai khach hang
    String email;//email khach hang
    Date ngaySinh;//ngay sinh khach hang
    String diaChi;//dia chi khach hang
    String soLuongMua;//so luong mua khach hang
    String role;//vai tro khach hang
    String accountstatus;//tinh trang tai khoan khach hang

    /**
     * Tao mot constructor co day du tham so
     *
     * @param IdTaikhoan Id tai khoan khach hang
     * @param taiKhoan tai khoan khach hang
     * @param matKhau mat khau khach hang
     * @param ten ten khach hang
     * @param gioiTinh gioi tinh khach hang
     * @param soDienThoai so dien thoai khach hang
     * @param email email khach hang
     * @param ngaySinh ngay sinh khach hang
     * @param diaChi dia chi khach hang
     * @param soLuongMua so luong mua khach hang
     * @param role vai tro khach hang
     * @param accountstatus tinh trang tai khoan khach hang
     */
    public KhachHang(int IdTaikhoan, String taiKhoan, String matKhau, String ten, String gioiTinh, String soDienThoai, String email,
            Date ngaySinh, String diaChi, String soLuongMua, String role, String accountstatus) {
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
        this.accountstatus = accountstatus;
    }

    /**
     * Tao mot constructor khong tham so
     */
    public KhachHang() {

    }

    /**
     * get Id tai khoan
     *
     * @return IdTaikhoan
     */
    public int getIdTaikhoan() {
        return IdTaikhoan;
    }

    /**
     * set IdTaikhoan
     *
     * @param IdTaikhoan
     */
    public void setIdTaikhoan(int IdTaikhoan) {
        this.IdTaikhoan = IdTaikhoan;
    }

    /**
     * get ten
     *
     * @return ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * set Ten
     *
     * @param ten
     */
    public void setTen(String ten) {
        this.ten = ten;
    }

    /**
     * get Tai khoan
     *
     * @return taiKhoan
     */
    public String getTaiKhoan() {
        return taiKhoan;
    }

    /**
     * Set Tai khoan
     *
     * @param taiKhoan
     */
    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    /**
     * get Mat khau
     *
     * @return matkhau
     */
    public String getMatKhau() {
        return matKhau;
    }

    /**
     * setMatKhau
     *
     * @param matKhau
     */
    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    /**
     * get gioi tinh
     *
     * @return gioi tinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * set gioi tinh
     *
     * @param gioiTinh
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * get so dien thoai
     *
     * @return soDienthoai
     */
    public String getSoDienThoai() {
        return soDienThoai;
    }

    /**
     * set So dien thoai
     *
     * @param soDienThoai
     */
    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    /**
     * get email
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * set email
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * get Ngay sinh
     *
     * @return ngaysinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * set ngay sinh
     *
     * @param ngaySinh
     */
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * get dia chi
     *
     * @return diaChi
     */
    public String getDiaChi() {
        return diaChi;
    }

    /**
     * set Dia chi
     *
     * @param diaChi
     */
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    /**
     * get so luong mua
     *
     * @return soLuongMua
     */
    public String getSoLuongMua() {
        return soLuongMua;
    }

    /**
     * set so luong mua
     *
     * @param soLuongMua
     */
    public void setSoLuongMua(String soLuongMua) {
        this.soLuongMua = soLuongMua;
    }

    /**
     * get role
     *
     * @return role
     */
    public String getRole() {
        return role;
    }

    /**
     * set role
     *
     * @param role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * get account status
     *
     * @return accountstatus
     */
    public String getAccountstatus() {
        return accountstatus;
    }

    /**
     * set account status
     *
     * @param accountstatus
     */
    public void setAccountstatus(String accountstatus) {
        this.accountstatus = accountstatus;
    }

    /**
     * to string
     *
     * @return tostring
     */
    @Override
    public String toString() {
        return "KhachHang [ten=" + ten + ", taiKhoan=" + taiKhoan + ", matKhau=" + matKhau + ", gioiTinh="
                + gioiTinh + ", soDienThoai=" + soDienThoai + ", email=" + email + ", ngaySinh=" + ngaySinh
                + ", diaChi=" + diaChi + ", soLuongMua=" + soLuongMua + ", role=" + role + ", accountStatus=" + accountstatus + "]";
    }
}
