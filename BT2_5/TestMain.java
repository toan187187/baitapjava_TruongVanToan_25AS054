package BT2_5;

public class TestMain {
    public static void main(String[] args){
        Customer c1 = new Customer(123, "Truong Van Toan", 'm');
        System.out.println(c1);
        System.out.println("id is: " +c1.getId());
        System.out.println("name is: "+ c1.getName());
        System.out.println("gender is: "+ c1.getGender());

        Account a1 = new Account(101, c1,200.233);
        System.out.println(a1);
        a1.setBalance(300.00);
        System.out.println("new balance is: "+ a1.getBalance());
        System.out.println("id is: "+ a1.getId());
        System.out.println("name is: "+ a1.getCustomerName());
        System.out.println("Customer is: "+ a1.getCustomer());

        a1.deposit(232.32);
        System.out.println("nạp: " + a1.getBalance());

        a1.withdraw(322.43);
        System.out.println("rút: " + a1.getBalance());

        System.out.println("thử rút");
        a1.withdraw(23323323.323);
        System.out.println("Số dư sau khi rút hụt: "+ a1.getBalance());
    }
}
