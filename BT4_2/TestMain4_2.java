package BT4_2;

public class TestMain4_2 {
    public static void main(String[] args){
        Person a1 = new Student("Toan", "Da Nang", "Đai hoc", 2025, 10000000);
        System.out.println(a1);
        System.out.println("TEN: " + a1.getName());
        System.out.println("DIA CHI: " + a1.getAddress());
        Person a2= new Staff("Thang","Ho Chi Minh","Canh sat Nhan Dan 2",0);
        System.out.println(a2);
        System.out.println("TEN: "+a1.getName());
        System.out.println("DIA CHI: "+ a1.getAddress());
    }
}
