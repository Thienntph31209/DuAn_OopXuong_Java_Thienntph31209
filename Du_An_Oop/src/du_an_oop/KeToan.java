/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_oop;

/**
 *
 * @author AD
 */
public class KeToan extends CanBo{
    private String trinhDO;
    private String chucVu;
    private double luongThuong;

    public KeToan() {
    }
    

    public KeToan(String trinhDO, String chucVu, double luongThuong, String ma_NV, String name_NV, double luong_Co_Ban) {
        super(ma_NV, name_NV, luong_Co_Ban);
        this.trinhDO = trinhDO;
        this.chucVu = chucVu;
        this.luongThuong = luongThuong;
    }

    public String getTrinhDO() {
        return trinhDO;
    }

    public void setTrinhDO(String trinhDO) {
        this.trinhDO = trinhDO;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(double luongThuong) {
        this.luongThuong = luongThuong;
    }
    
    @Override
    public double tinh_Luong(){
        return super.tinh_Luong() + luongThuong;
    }
}
