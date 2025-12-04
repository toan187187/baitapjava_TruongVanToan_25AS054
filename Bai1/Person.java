package Bai1;

import java.util.Scanner;

abstract class Person {
    private String hoTen;
    private String diaChi;
    private int namSinh;

    public Person(String hoTen, String diaChi, int namSinh){
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
    }

    public String getHoTen(){
        return hoTen;
    }

    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }

    public String getdiaChi(){
        return diaChi;
    }

    public void setDiaChi(String diaChi){
        this.diaChi = diaChi;
    }

    public int getNamSinh(){
        return namSinh;

    }

    public void setNamSinh(int namSinh){
        this.namSinh= namSinh;
    }

    public abstract String getLoai();


    @Override
    public String toString(){
        return "Person[ hoTen: " + hoTen + ",diaChi: " + diaChi + ",namSinh: "+ namSinh +"]";
    }

    public void inThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ho Ten: ");
        String hoTen = sc.nextLine();
        sc.nextLine();
        System.out.print("Nhap dia chi: ");
        String diaChi = sc.nextLine();
        sc.nextLine();
        System.out.print("Nhap nam sinh");
        int namSinh = Integer.parseInt(sc.nextLine());
    }
}

class SinhVien extends Person{
    private String maSV;
    private double diemTB;

    public SinhVien(String maSV, double diemTB, String hoTen, String diaChi, int namSinh){
        super(hoTen, diaChi, namSinh);
        this.maSV = maSV;
        this.diemTB = diemTB;
    }

    public String getMaSV(){
        return maSV;
    }
    public void setMaSV(String maSV){
        this.maSV = maSV;
    }

    public double getDiemTB(){
        return diemTB;
    }
    public void setDiemTB(double diemTB){
        this.diemTB = diemTB;
    }

    @Override
    public String getLoai(){
        return "SinhVien";
    }

    @Override
    public String toString(){
        return "Sinh Vien [ " + super.toString() + ", Ma SV: " + maSV + ", Diem trung binh: " + diemTB +" ]" ;
    }

    public void inThongTin(){
        super.inThongTin();
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ma SV");
        String maSV = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhap diem trung binh");
    }
}

class GiangVien extends Person{
    private String maGV;
    private double luongThang;

    public GiangVien(String hoTen, String diaChi, int namSinh) {
        super(hoTen, diaChi, namSinh);
    }

    public GiangVien(String maGV, double luongThang, String hoTen, String diaChi, int namSinh){
        super(hoTen, diaChi, namSinh);
        this.maGV = maGV;
        this.luongThang = luongThang;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public double getLuongThang() {
        return luongThang;
    }

    public void setLuongThang(double luongThang) {
        this.luongThang = luongThang;
    }

    public String getLoai(){
        return "GiangVien";
    }

    public void inThongTin(){
        super.inThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma GV");
        String maGV = sc.nextLine();
        System.out.println("Nhap Luong Thang");
        Double luongThang = Double.parseDouble(sc.nextLine());
    }

    @Override
    public String toString() {
        return "GiangVien{" + super.toString()+
                "maGV='" + maGV + '\'' +
                ", luongThang=" + luongThang +
                '}';
    }
}

class TestPerson{
    static void main() {
        Person[] ds = new Person[5];
        ds[0] = new SinhVien("25AS054", 8.0, "toan", "Da Nang", 2007);
        ds[1] = new SinhVien("25AS055", 9.0, "tu", "Da Nang", 2007);
        ds[2] = new SinhVien("25AS056", 10.0, "tinh", "Da Nang", 2007);

        ds[3] = new GiangVien("AS", 50000000.00,"anh", "Quang Nam", 1980 );
        ds[4] = new GiangVien("GT", 542720000.00, "my", "Ho Chi Minh", 1999);


        for(Person b: ds){
            b.inThongTin();
        }
    }
}
