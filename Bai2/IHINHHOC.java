package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

interface IHINHHOC {
    double tinhChuVi();
    double tinhDienTich();
}

abstract class Hinh implements IHINHHOC{
    private String tenHinh;

    public Hinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public String getTenHinh() {
        return tenHinh;
    }

    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public void xuatThongTin() {
        System.out.println(this.toString());
        System.out.println("Chu vi = " + tinhChuVi());
        System.out.println("Dien tich = " + tinhDienTich());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Hinh{" +
                "tenHinh='" + tenHinh + '\'' +
                '}';
    }
}


class HinhTron extends Hinh{
    private double banKinh;

    public HinhTron(String tenHinh, double banKinh) {
        super(tenHinh);
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhChuVi() {
        return 2 *  banKinh * Math.PI;
    }

    @Override
    public double tinhDienTich(){
        return Math.PI * Math.pow(banKinh,2);
    }

    @Override
    public String toString() {
        return "Hinh tron - Ten: " + getTenHinh() +
                ", Ban kinh: " + banKinh;
    }
}

class HinhChuNhat extends Hinh{
    public double chieuDai, chieuRong;

    public HinhChuNhat(String tenHinh, double chieuDai, double chieuRong) {
        super(tenHinh);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public double tinhChuVi(){
        return 2 * (chieuDai + chieuRong);
    }

    @Override
    public double tinhDienTich(){
        return chieuRong * chieuDai;
    }

    @Override
    public String toString() {
        return "Hinh chu nhat - Ten: " + getTenHinh() +
                ", Dai: " + chieuDai +
                ", Rong: " + chieuRong;
    }
}


class HinhVuong extends HinhChuNhat{

    public HinhVuong(String tenHinh, double canh) {
        super(tenHinh, canh, canh);
    }

    @Override
    public void setChieuDai(double canh) {
        super.setChieuDai(canh);
        super.setChieuRong(canh);
    }

    @Override
    public void setChieuRong(double canh) {
        super.setChieuDai(canh);
        super.setChieuRong(canh);
    }

    @Override
    public String toString() {
        return "Hinh vuong - Ten: " + getTenHinh() +
                ", Canh: " + chieuDai;
    }
}


class TestHinhHoc{
    public static void main(String[] args) {
        ArrayList<Hinh> ds = new ArrayList<>();
        ds.add(new HinhTron("Hinhtron", 5));
        ds.add(new HinhChuNhat("HCN", 4,6));
        ds.add(new HinhVuong("HV", 7));

        for(Hinh b: ds){
            b.xuatThongTin();
        }

        double tong = 0;
        for(Hinh b: ds){
            tong += b.tinhDienTich();
        }
        System.out.println(tong);
    }
}