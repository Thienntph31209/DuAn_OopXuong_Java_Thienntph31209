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
public class KySu extends CanBo{
    private String kyNang;
    private String nganh;
    private double phuCap;
    private double luongThuong;
    
    public KySu(){
    }
    
    public KySu(String kyNang, String nganh, double phuCap, double luongThuong, String ma_NV, String name_NV, double luong_Co_Ban) {
        super(ma_NV, name_NV, luong_Co_Ban);
        this.kyNang = kyNang;
        this.nganh = nganh;
        this.phuCap = phuCap;
        this.luongThuong = luongThuong;
    }

    public String getKyNang() {
        return kyNang;
    }

    public void setKyNang(String kyNang) {
        this.kyNang = kyNang;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    public double getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(double luongThuong) {
        this.luongThuong = luongThuong;
    }
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ky nang: ");
        kyNang = sc.nextLine();
        System.out.printf("Nhap nganh: ");
        nganh = sc.nextLine();
        System.out.printf("Nhap phu cap: ");
        phuCap = sc.nextDouble();
        System.out.printf("Nhap luong thuong: ");
        luongThuong = sc.nextDouble();
    }
    
    @Override
    public double tinh_Luong(){
        return super.tinh_Luong() + phuCap + luongThuong;
    }
}
