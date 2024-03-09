/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_oop;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author AD
 */
public class QLCB {

    ArrayList<CanBo> listCanBO = new ArrayList<>();

    public QLCB() {
        setDuLieuTest();
    }

    Scanner sc = new Scanner(System.in);

    public void nhapThongTin() {
        while (true) {
            System.out.println("| 1.KySu --- 2.KeToan --- 3.NhanVienSanXuat --- 4.NhanVienVanPhong --- 5.QuanLy --- 0.Thoat |");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> {
                    KySu ks = new KySu();
                    ks.nhap();
                    listCanBO.add(ks);
                }
                case 2 -> {
                    KeToan kt = new KeToan();
                    kt.nhap();
                    listCanBO.add(kt);
                }
                case 3 -> {
                    NhanVienSanXuat nvsx = new NhanVienSanXuat();
                    nvsx.nhap();
                    listCanBO.add(nvsx);
                }
                case 4 -> {
                    NhanVienVanPhong nvvp = new NhanVienVanPhong();
                    nvvp.nhap();
                    listCanBO.add(nvvp);
                }
                case 5 -> {
                    QuanLy ql = new QuanLy();
                    ql.nhap();
                    listCanBO.add(ql);
                }
                case 0 -> {
                    return;
                }
                default -> {
                    System.out.println("Chon sai vui long chon lai !");
                    continue;
                }
            }

            System.out.println("Co nhap nhan vien nua khong ? (y or n) : ");
            if (sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    //xuat danh sach canBo
    public void xuatThongTin() {
        System.out.println("----------- Danh sach can bo ------------");
        for (CanBo cb : listCanBO) {
            cb.xuat();
        }
    }

    //tim kiem theo ma
    public void timKiemTheoMa() {
        System.out.println("Nhap ma can bo ban muon tim kiem: ");
        String ma = sc.nextLine();
        System.out.println("---------- Thong tin can bo muon tim -----------");
        for (CanBo cb : listCanBO) {
            listCanBO.indexOf(cb);
            if (cb.getMa_NV().equalsIgnoreCase(ma)) {
                cb.xuat();
            }
        }
    }

    //xoa theo ma
    public void xoaNvTheoMa() {
        System.out.println("Nhap ma can bo ban muon xoa: ");
        String ma = sc.nextLine();
        for (CanBo cb : listCanBO) {
            if (ma.equalsIgnoreCase(cb.getMa_NV())) {
                listCanBO.remove(cb);
                break;
            }
        }
        xuatThongTin();
    }

    //cap nhat theo ma
    public void capNhatTheoMa() {
        System.out.println("Nhap ma canBo muon cap nhat: ");
        String ma = sc.nextLine();
        for (CanBo cb : listCanBO) {
            if (cb.getMa_NV().equalsIgnoreCase(ma)) {
                System.out.println("--------- Cap nhat thong tin can bo ------------");
                cb.nhap();
                cb.xuat();
            }
        }
    }

    //tim theo khoang luong
    public void timTheoKhoangLuong() {
        System.out.println("Nhap vao khoang luong ban muon tim: ");
        System.out.println("Nhap min luong: ");
        double luongMin = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap max luong: ");
        double luongMax = Double.parseDouble(sc.nextLine());
        System.out.println("--- danh sach can bo co muc gia muon tim ---");
        for (CanBo cb : listCanBO) {
            if (cb.tinh_Luong() >= luongMin && cb.tinh_Luong() <= luongMax) {
                cb.xuat();
            }
        }
    }

    //sap xep theo ten
    public void sapXepTheoTen() {
        Comparator<CanBo> comp = (CanBo o1, CanBo o2) -> o1.getName_NV().compareTo(o2.getName_NV());
        Collections.sort(listCanBO, comp);
        System.out.println("--- Danh sach xe sap xep theo ten ---");
        xuatThongTin();
    }

    //sap xep danh sach theo luong
    public void sapXepTheoLuong() {
        Comparator<CanBo> comp = Comparator.comparingDouble(CanBo::tinh_Luong).reversed();
        Collections.sort(listCanBO, comp);
        System.out.println("--- Danh sach can bo sap xep theo luong ---");
        xuatThongTin();
    }

    //Top 5 CanBo co luong cao nhat
    public void topLuongCao() {
        Comparator<CanBo> comp = Comparator.comparingDouble(CanBo::tinh_Luong).reversed();
        Collections.sort(listCanBO, comp);
        System.out.println("--- Top 5 canBo co luong cao nhat ---");
        int topCount = Math.min(listCanBO.size(), 5);
        for (int i = 0; i < topCount; i++) {
            listCanBO.get(i).xuat();
        }
    }

    // Tính tổng lương của tất cả nhân viên
    public double tinhTongLuong() {
        double tongLuong = 0.0;
        for (CanBo cb : listCanBO) {
            tongLuong += cb.tinh_Luong();
        }
        return tongLuong;
    }

    // In ra tổng lương của tất cả nhân viên
    public void inTongLuong() {
        double tongLuong = tinhTongLuong();

        Locale locale = new Locale("vi", "VN");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        String tongLuongFormatted = currencyFormatter.format(tongLuong);
        System.out.println("Tong luong cua tat ca nhan vien la: " + tongLuongFormatted);
    }

    public void setDuLieuTest() {
        KySu kySu1 = new KySu("Kỹ năng A", "Ngành A", 2000000, 500000, "KS01", "Nguyen Van A", 10000000);
        listCanBO.add(kySu1);

        KeToan keToan1 = new KeToan("Cao đẳng", "Trưởng phòng", 3000000, "KT01", "Tran Thi B", 8000000);
        listCanBO.add(keToan1);

        NhanVienSanXuat nhanVienSX1 = new NhanVienSanXuat(200, 10, 1000000, "NV01", "Le Van C", 5000000);
        listCanBO.add(nhanVienSX1);

        NhanVienVanPhong nhanVienVP1 = new NhanVienVanPhong(20, 2000000, "NVVP01", "Pham Van D", 6000000);
        listCanBO.add(nhanVienVP1);

        QuanLy quanLy1 = new QuanLy(3, 2000000, 1500000, "QL01", "Truong Van E", 12000000);
        listCanBO.add(quanLy1);

        KySu kySu2 = new KySu("Kỹ năng B", "Ngành B", 2500000, 600000, "KS02", "Nguyen Thi F", 15000000);
        listCanBO.add(kySu2);

        KeToan keToan2 = new KeToan("Đại học", "Nhân viên", 2000000, "KT02", "Tran Van G", 7000000);
        listCanBO.add(keToan2);

        NhanVienSanXuat nhanVienSX2 = new NhanVienSanXuat(150, 8, 800000, "NV02", "Le Thi H", 4500000);
        listCanBO.add(nhanVienSX2);

        NhanVienVanPhong nhanVienVP2 = new NhanVienVanPhong(25, 2500000, "NVVP02", "Pham Thi I", 5500000);
        listCanBO.add(nhanVienVP2);

        QuanLy quanLy2 = new QuanLy(2, 1500000, 1000000, "QL02", "Truong Thi K", 10000000);
        listCanBO.add(quanLy2);
    }

}
