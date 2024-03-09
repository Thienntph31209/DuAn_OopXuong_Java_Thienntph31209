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
public class Program {

    public static void main(String[] args) {

        QLCB qlcb = new QLCB();

        while (true) {

            Scanner sc = new Scanner(System.in);
            menu();
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Lua chon khong duoc de trong !");
                continue;
            }

            if (!Character.isDigit(input.charAt(0))) {
                System.out.println("Lua chon sai vui long lua chon lai !");
                continue;
            }

            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Lua chon sai vui long lua chon lai !");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Nhap sanh sach can bo");
                    qlcb.nhapThongTin();
                    break;
                case 2:
                    qlcb.xuatThongTin();
                    break;
                case 3:
                    qlcb.timKiemTheoMa();
                    break;
                case 4:
                    qlcb.xoaNvTheoMa();
                    break;
                case 5:
                    qlcb.capNhatTheoMa();
                    break;
                case 6:
                    qlcb.timTheoKhoangLuong();
                    break;
                case 7:
                    qlcb.sapXepTheoTen();
                    break;
                case 8:
                    qlcb.sapXepTheoLuong();
                    break;
                case 9:
                    qlcb.topLuongCao();
                    break;
                case 10: 
                    qlcb.inTongLuong();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Chon sai chuc nang , chon lai (0 -> 9)");
            }
        }
    }

    public static void menu() {
        System.out.println("|============ Quan ly can bo ============|");
        System.out.println("| 1. Nhap danh sach can bo               |");
        System.out.println("| 2. Xuat danh sach can bo               |");
        System.out.println("| 3. Tim can bo theo ma                  |");
        System.out.println("| 4. Xoa can bo theo ma                  |");
        System.out.println("| 5. Cap nhat thong tin theo ma          |");
        System.out.println("| 6. Tim theo muc luong                  |");
        System.out.println("| 7. Sap xep theo ten                    |");
        System.out.println("| 8. Sap xep theo luong                  |");
        System.out.println("| 9. Top 5 can bo co luong cao nhat      |");
        System.out.println("| 10. Xem tong luong cua tat ca nhan vien|");
        System.out.println("| 0. Thoat                               |");
        System.out.println("|========================================|");
        System.out.printf("Chon chuc nang : ");
    }
}
