/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythuvien;

import java.util.Date;

/**
 *
 * @author taitongg
 */
public abstract class SACH implements ISACH{
    protected String maSach;
    protected String NXB;
    protected Date ngayNhap;
    protected double donGia;
    protected double soLuong;

    public SACH() {
    }

    public SACH(String maSach, String NXB, Date ngayNhap, double donGia, double soLuong) {
        this.maSach = maSach;
        this.NXB = NXB;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }
    
    
    public abstract double TinhTienGiam();
    
    
}
