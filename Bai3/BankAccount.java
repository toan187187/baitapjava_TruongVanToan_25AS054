package Bai3;


import javax.management.StringValueExp;
import javax.swing.*;
import java.net.Inet4Address;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

abstract class BankAccount {
    private int accountNumber;
    private String ownerName;
    protected double balance;

    public BankAccount(int accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Successful deposit: " + balance);
        }
        else {
            System.out.println("Unsuccessful deposit");
        }
    }

    public abstract boolean withdraw(double amount);

    public abstract void showAccountInfo();

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}




class SavingAccount extends BankAccount{
    private double interestRate;

    public SavingAccount(int accountNumber, String ownerName, double balance, double interestRate) {
        super(accountNumber, ownerName, balance);
        this.interestRate = interestRate;
    }
    public SavingAccount(int accountNumber, String ownerName, double balance){
        super(accountNumber, ownerName, balance);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingAccount{" + super.toString()+
                "interestRate=" + interestRate +
                '}';
    }
    public boolean withdraw(double amount){
        if(balance < 100000){
            System.out.println("Unsuccessful withdraw");
        }
        else if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Successful withdraw" + balance);
        }
        else if ( amount > 0 && amount > balance){
            System.out.println("Report an error");
        }
        return true;
    }

    public void tietkiem() {
        long SoDuHienTai = (long) balance;
        long tienlai = (long) (SoDuHienTai * 0.048 * 1);
        long tong = SoDuHienTai + tienlai;
        interestRate = tienlai;
        System.out.println("Số Dư Hiện Tại: " + SoDuHienTai);
        System.out.println("Số tiễn lãi sau 1 năm: " + tienlai);
        System.out.println("Tổng số tiền (gốc + lãi) sau 1 năm: " + tong);
    }


    @Override
    public void showAccountInfo(){
        System.out.println("=== Savings Account ===");
        System.out.println("Số tài khoản: " + getAccountNumber());
        System.out.println("Chủ sở hữu: " + getOwnerName());
        System.out.println("Số dư: " + balance);
        System.out.println("Lãi suất: " + interestRate);
        System.out.println();
    }
}




class CheckingAccount extends BankAccount{
    public CheckingAccount(int accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance);
    }

    public boolean withdraw(double amount){
        if(amount > balance){
            System.out.println("Unsuccessful withdraw");
            return false;
        }
        else
            balance -= amount;
        System.out.println("Successful withdraw" + balance);
        return true;
    }

    public void thanhtoan(){
        long Soduhientai = (long) balance;
        long phigiaodich = (long) ((double) getBalance()*0.0015);
        long tong= Soduhientai - phigiaodich;
        System.out.println("Số dư hiện tại: " + Soduhientai);
        System.out.println("Số tiền của phí giao dịch là: " + phigiaodich);
        System.out.println("Số tiền còn lại sau khi giao dịch: " + tong);
    }

    @Override
    public void showAccountInfo() {
        System.out.println("=== Checking Account ===");
        System.out.println("Số tài khoản: " + getAccountNumber());
        System.out.println("Chủ sở hữu: " + getOwnerName());
        System.out.println("Số dư: " + balance);
        System.out.println();
    }

    @Override
    public String toString() {
        return "CheckingAccount{" + super.toString() +
                "balance=" + balance +
                '}';
    }
}





class Transaction {
    private String transactionId;
    private String type;
    private double amount;
    private String fromAccount;
    private String toAccount;
    private LocalDateTime dateTime;

    public Transaction(String transactionId, String type, double amount, String fromAccount, String toAccount, LocalDateTime dateTime) {
        this.transactionId = transactionId;
        this.type = type;
        this.amount = amount;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.dateTime = dateTime;
    }

    public Transaction(){}

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String generateTransactionID(){
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i=0; i< 8; i++){
            int index = r.nextInt(chars.length());      // chars.charAt():  lấy kí tự ở vị trí chỉ định. || sb.append(): lấy ký tự đó ghép vào "sb"
            sb.append(chars.charAt(index));
        }
        return sb.toString();
    }

    public void showTransactionInfo() {
        System.out.println("----- TRANSACTION -----");
        System.out.println("ID: " + transactionId);
        System.out.println("Loại GD: " + type);
        System.out.println("Số tiền: " + amount);
        System.out.println("Từ TK: " + fromAccount);
        System.out.println("Đến TK: " + toAccount);
        System.out.println("Thời gian: " + dateTime);
        System.out.println("-----------------------");
    }
}





class BankSystem{
    private ArrayList<BankAccount> account;
    private ArrayList<Transaction> transaction;
    Scanner sc = new Scanner(System.in);

    public BankSystem(){
        this.account = new ArrayList<>();
        this.transaction = new ArrayList<>();
    }

    public void createAccount(BankAccount a){
        account.add(a);
        System.out.println("ACCOUNT CREATED SUCCESSFULLY");
    }

    public BankAccount findAccountByNumber(int accountNumber){
        for(BankAccount b: account){
            if(b.getAccountNumber() == (accountNumber)){
                System.out.println("FOUND ACCOUNT");
                return b;
            }
        }
        return null;
    }

    public BankAccount login(int accountNumber){
        BankAccount acc = findAccountByNumber(accountNumber);
        for(int i =0; i < account.size(); i++) {
            if (account.get(i).getAccountNumber() == accountNumber){
                System.out.println("LOGIN SUCCESSFUL");
                return null;
            }
            else {
                System.out.println("LOGIN UNSUCCESSFUL");
                return null;
            }
        }
        return null;
    }

    public void deposit(int acc, double amount){
        for(BankAccount b: account){
            if(b.getAccountNumber() == (acc)) {
                b.deposit(amount);
                if (b instanceof SavingAccount){
                    SavingAccount rut = (SavingAccount) b;
                    rut.tietkiem();
                }
                else if(b instanceof CheckingAccount){
                    CheckingAccount rut = (CheckingAccount) b;
                    rut.thanhtoan();
                }
                break;
            }
        }
    }

    public void withdraw(int acc, double amount){
        for(BankAccount b: account){
            if(b instanceof SavingAccount){
                b.withdraw(amount);
                SavingAccount nap = (SavingAccount) b;
                nap.tietkiem();
            }
            else if(b instanceof CheckingAccount){
                b.withdraw(amount);
                CheckingAccount nap = (CheckingAccount) b;
                nap.thanhtoan();
            }
            break;
        }
    }

    public boolean transfer(int senderID, int receiverID, double amount) {
        BankAccount receiver = findAccountByNumber(receiverID);
        BankAccount sender = findAccountByNumber(senderID);
        if (receiver == null || sender == null) {
            System.out.println("Tai khoan khong ton tai");
            return false;
        }
        if (receiver == sender) {
            System.out.println("Tai khoan khong ton tai");
            return false;
        }
        if (sender.getAccountNumber() == receiver.getAccountNumber()) {
            System.out.println("Giao dịch thất bại: Không thể tự chuyển tiền cho chính mình.");
            return false;
        }
        if (sender.getBalance() < amount){
            System.out.println("Giao dich thất bại. Số dư không đủ");
            return false;
        }
        boolean rut_tu_n_gui = sender.withdraw(amount);
        if (rut_tu_n_gui) {
            receiver.deposit(amount);
            String transID = new Transaction().generateTransactionID();
            String senderStr = String.valueOf(sender.getAccountNumber());
            String receiverStr = String.valueOf(receiver.getAccountNumber());
            Transaction t = new Transaction(transID,"TRANSFER", amount, senderStr, receiverStr, LocalDateTime.now());
            transaction.add(t);
            System.out.println("Chuyen khoan thanh cong");
            t.showTransactionInfo();
            return true;
        }
        else {
            System.out.println("Chuyen khoan that bai");
            return false;
        }
    }

    public void showTransactionHistory(){
        if(transaction.isEmpty()){
            System.out.println("No transactions found");
        }
        for(Transaction t: transaction) {
            t.showTransactionInfo();
        }
    }

    public void showTransactionInfo(BankAccount acc){
        if(transaction.isEmpty()){
            System.out.println("No transactions found");
        }
        boolean found = false;
            for (Transaction t: transaction){
                // if (acc != null){}
                if(t.getFromAccount().equals(String.valueOf(acc.getAccountNumber())) || t.getToAccount().equals(String.valueOf(acc.getAccountNumber())))
                {
                    t.showTransactionInfo();
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("No transactions found");
            }
    }
}



class Menu{
    static void main() {
        Scanner sc = new Scanner(System.in);
        BankSystem bk = new BankSystem();
        while(true){
            System.out.println("\n============BANK SYSTEM===========");
            System.out.println("1. Create new account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    BankAccount ba = null;
                    System.out.println("-----Bạn muốn chon loại tài khoản nào-----");
                    System.out.println("-----     1. Tài khoản tiết kiệm     -----");
                    System.out.println("-----     2. Tài khoản thanh toán    -----");
                    System.out.println("--------HÃY CHỌN 1 TRONG 2 CÁI TRÊN-------");
                    int choice1 = sc.nextInt();
                    sc.nextLine();
//                    System.out.print("Enter account number: ");
//                    int accNum = Integer.parseInt(sc.nextLine());
//                    System.out.print("Enter owner name: ");
//                    String name = sc.nextLine();
//                    System.out.print("Enter initial balance: ");
//                    double bal = Double.parseDouble(sc.nextLine());
                    if (choice1 == 1) {
                        System.out.print("Enter account number: ");
                        int accNum = Integer.parseInt(sc.nextLine());
                        System.out.print("Enter owner name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter initial balance: ");
                        double bal = Double.parseDouble(sc.nextLine());
                        ba = new SavingAccount(accNum, name, bal);
//                        ba.showAccountInfo();
                        bk.createAccount(ba);
                    } else if (choice1 == 2) {
                        System.out.print("Enter account number: ");
                        int accNum = Integer.parseInt(sc.nextLine());
                        System.out.print("Enter owner name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter initial balance: ");
                        double bal = Double.parseDouble(sc.nextLine());
                        ba = new CheckingAccount(accNum, name, bal);
//                        ba.showAccountInfo();
                        bk.createAccount(ba);
                    } else {
                        System.out.println("Invalid choice. Please choose 1 or 2.");
                    }
//                    ba.showAccountInfo();
//                    bk.createAccount(ba);
                    break;
                case 2:
                    System.out.println("Number");
                    int loginNum = Integer.parseInt(sc.nextLine());
                    bk.login(loginNum);
                    BankAccount loggedInAccount = bk.findAccountByNumber(loginNum);
                    if(loggedInAccount != null) {
                        do {
                            System.out.println("\n=== Logged In Menu ===");
                            System.out.println("1. Deposit");
                            System.out.println("2. Withdraw");
                            System.out.println("3. Transfer");
                            System.out.println("4. Show Account Info");
                            System.out.println("5. Show Transaction History");
                            System.out.println("6. Logout");
                            System.out.print("Choose an option: ");
                            int choice2 = Integer.parseInt(sc.nextLine());
                            switch (choice2) {
                                case 1:
                                    System.out.println("Enter the account number to be deposited: ");
                                    int accountNap = Integer.parseInt(sc.nextLine());
                                    System.out.println("Enter amount to deposit: ");
                                    long amount = Long.parseLong(sc.nextLine());
                                    bk.deposit(accountNap, amount);
                                    break;
                                case 2:
                                    System.out.println("Enter the account number to be withdraw: ");
                                    int accountRut = Integer.parseInt(sc.nextLine());
                                    System.out.println("Enter amount to withdraw: ");
                                    long amount1 = Long.parseLong(sc.nextLine());
                                    bk.withdraw(accountRut, amount1);
                                    break;
                                case 3:
                                    System.out.print("Enter receiver account number: ");
                                    int recAcc = Integer.parseInt(sc.nextLine());
                                    System.out.print("Enter amount to transfer: ");
                                    int transAmt = Integer.parseInt(sc.nextLine());
                                    System.out.println("Enter amount: ");
                                    long amount2 = Long.parseLong(sc.nextLine());
                                    bk.transfer(recAcc, transAmt, amount2);
                                    break;
                                case 4:
                                    bk.showTransactionInfo(loggedInAccount);
                                    break;
                                case 5:
                                    bk.showTransactionHistory();
                                    break;
                                case 6:
                                    System.out.println("Log out");
                                    return;
                                default:
                                    System.out.println("Không có sự lựa chọn trong này");
                            }
                        } while(true);
                    } else {
                        System.out.println("Account the found. Please try agian");
                    }
                case 3:
                    System.out.println("EXITING.....");
                    return;
                default:
                    System.out.println("Không có sự lựa chọn trong này");
            }
        }
    }
}

// sai login chỗ chuyển tiền. 1 tài khoản ko đủ tiền nhưng có thể chuyển được số tiền nhiều hơn số dư


