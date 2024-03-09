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
public class QuanLy extends CanBo{
    private Integer he_So_Chuc_Vu;
    private double luongThuong;
    private double luongTrachNhiem;

    public QuanLy() {
    }

    public QuanLy(Integer he_So_Chuc_Vu, double luongThuong, double luongTrachNhiem, String ma_NV, String name_NV, double luong_Co_Ban) {
        super(ma_NV, name_NV, luong_Co_Ban);
        this.he_So_Chuc_Vu = he_So_Chuc_Vu;
        this.luongThuong = luongThuong;
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public Integer getHe_So_Chuc_Vu() {
        return he_So_Chuc_Vu;
    }

    public void setHe_So_Chuc_Vu(Integer he_So_Chuc_Vu) {
        this.he_So_Chuc_Vu = he_So_Chuc_Vu;
    }

    public double getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(double luongThuong) {
        this.luongThuong = luongThuong;
    }

    public double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap he so chuc vu: ");
        he_So_Chuc_Vu = Integer.valueOf(sc.nextLine());
        System.out.printf("Nhap luong thuong: ");
        luongThuong = Double.parseDouble(sc.nextLine());
        System.out.printf("Nhap luong trach nhiem: ");
        luongTrachNhiem = Double.parseDouble(sc.nextLine());
    }
    
    @Override
    public double tinh_Luong(){
        return super.tinh_Luong() + luongThuong + luongTrachNhiem;
    }
}
