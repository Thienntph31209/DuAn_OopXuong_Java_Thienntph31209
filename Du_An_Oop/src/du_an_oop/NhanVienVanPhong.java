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
public class NhanVienVanPhong extends CanBo{
    private Integer so_Ngay_lam_Viec;
    private double phu_Cap;

    public NhanVienVanPhong() {
    }
    

    public NhanVienVanPhong(Integer so_Ngay_lam_Viec, double phu_Cap, String ma_NV, String name_NV, double luong_Co_Ban) {
        super(ma_NV, name_NV, luong_Co_Ban);
        this.so_Ngay_lam_Viec = so_Ngay_lam_Viec;
        this.phu_Cap = phu_Cap;
    }

    public Integer getSo_Ngay_lam_Viec() {
        return so_Ngay_lam_Viec;
    }

    public void setSo_Ngay_lam_Viec(Integer so_Ngay_lam_Viec) {
        this.so_Ngay_lam_Viec = so_Ngay_lam_Viec;
    }

    public double getPhu_Cap() {
        return phu_Cap;
    }

    public void setPhu_Cap(double phu_Cap) {
        this.phu_Cap = phu_Cap;
    }

    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so ngay lam viec: ");
        so_Ngay_lam_Viec = Integer.valueOf(sc.nextLine());
        System.out.printf("Nhap phu cap: ");
        phu_Cap = Double.parseDouble(sc.nextLine());
    }
    
    @Override
    public double tinh_Luong(){
        double luongCoBan = super.tinh_Luong();
        return (luongCoBan + phu_Cap) * so_Ngay_lam_Viec;
    }
}
