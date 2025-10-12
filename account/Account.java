import javax.lang.model.element.Name;

public class Account {
    private String id;
    private String name;
    private int balance=0;
    public  Account( String id, String name, int balance){
        this.id=id;
        this.name=name;
        this.balance= balance;
    }
    public Account(String id, String name){
        this.id=id;
        this.name= name;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public void Creadit(int amount){
        this.balance += amount;  // balance=balance+amount
        System.out.println("đã nạp:" +amount+ "số dư mới:" + this.balance);
    }
    public void debit(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("đã rút:" + amount + "số dư mới:" + this.balance);
        } else {
            System.out.println(" rút thất bại: ");
        }
    }
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Amount exceeed balance");
        }

        return balance;
    }
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
