/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_oop;

import java.util.Scanner;

/**
 *
 * @author AD
 */
public class NhanVienSanXuat extends CanBo{
    private Integer so_San_Pham;
    private Integer tang_Ca;
    private double thuong;

    public NhanVienSanXuat() {
    }
    

    public NhanVienSanXuat(Integer so_San_Pham, Integer tang_Ca, double thuong, String ma_NV, String name_NV, double luong_Co_Ban) {
        super(ma_NV, name_NV, luong_Co_Ban);
        this.so_San_Pham = so_San_Pham;
        this.tang_Ca = tang_Ca;
        this.thuong = thuong;
    }

    public Integer getSo_San_Pham() {
        return so_San_Pham;
    }

    public void setSo_San_Pham(Integer so_San_Pham) {
        this.so_San_Pham = so_San_Pham;
    }

    public Integer getTang_Ca() {
        return tang_Ca;
    }

    public void setTang_Ca(Integer tang_Ca) {
        this.tang_Ca = tang_Ca;
    }

    public double getThuong() {
        return thuong;
    }

    public void setThuong(double thuong) {
        this.thuong = thuong;
    }

    
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so san pham da lam: ");
        so_San_Pham = Integer.valueOf(sc.nextLine());
        System.out.printf("Nhap so gio tang ca: ");
        tang_Ca = Integer.valueOf(sc.nextLine());
        System.out.printf("Nhap thuong cua nhan vien: ");
        thuong = Double.parseDouble(sc.nextLine());
    }
    
    @Override
    public double tinh_Luong(){
        double luongCoBan = super.tinh_Luong();
        double luongTuSanPham = so_San_Pham * 10;
        double luongMoiGio = luongCoBan / 30 / 8;
        double luongTangCa = tang_Ca * (luongMoiGio * 1.5);
        return luongCoBan + luongTuSanPham + luongTangCa + thuong;
    }
}
