/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_oop;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author AD
 */
public abstract class CanBo {

    private String ma_NV;
    private String name_NV;
    private double luong_Co_Ban;

    public CanBo() {
    }

    public CanBo(String ma_NV, String name_NV, double luong_Co_Ban) {
        this.ma_NV = ma_NV;
        this.name_NV = name_NV;
        this.luong_Co_Ban = luong_Co_Ban;
    }

    public String getMa_NV() {
        return ma_NV;
    }

    public void setMa_NV(String ma_NV) {
        this.ma_NV = ma_NV;
    }

    public String getName_NV() {
        return name_NV;
    }

    public void setName_NV(String name_NV) {
        this.name_NV = name_NV;
    }

    public double getLuong_Co_Ban() {
        return luong_Co_Ban;
    }

    public void setLuong_Co_Ban(double luong_Co_Ban) {
        this.luong_Co_Ban = luong_Co_Ban;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ma nhan vien: ");
        ma_NV = sc.nextLine();
        System.out.printf("Nhap ten nhan vien: ");
        name_NV = sc.nextLine();
        System.out.printf("Nhap luong nhan vien: ");
        luong_Co_Ban = Double.parseDouble(sc.nextLine());
    }
    
    public double tinh_Luong() {
        return luong_Co_Ban;
    }

    public double thue() {
        double thuNhapChiuThue = tinh_Luong();
        double thue = 0;

        if (thuNhapChiuThue <= 5000000) {
            thue = 0.05 * thuNhapChiuThue;
        } else if (thuNhapChiuThue <= 10000000) {
            thue = 0.1 * (thuNhapChiuThue - 5000000) + 0.05 * 5000000;
        } else {
            thue = 0.15 * (thuNhapChiuThue - 10000000) + 0.1 * 5000000 + 0.05 * 5000000;
        }

        return thue;
    }

    public void xuat() {
        int maNvWidth = 10;
        int tenNvWidth = 20;
        int luongNvWidth = 15;
        int thueNvWidth = 15;

        String formatString = String.format("|Ma : %%-%ds |Ten : %%-%ds |luong : %%%ds |thue : %%%ds |\n",
                maNvWidth, tenNvWidth, luongNvWidth, thueNvWidth);

        System.out.printf(formatString, this.ma_NV, this.name_NV, formatCurrency(tinh_Luong()), formatCurrency(thue()));
    }

    private String formatCurrency(double amount) {
        Locale locale = new Locale("vi", "VN");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        return currencyFormatter.format(amount);
    }

}
