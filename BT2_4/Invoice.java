package BT2_4;

public class Invoice {
    private int id;
    private Customer customers;
    private double amount;

    public Invoice(int id, Customer customers, double amount) {
        this.id = id;
        this.customers = customers;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomers() {
        return customers;
    }

    public void setCustomers(Customer customers) {
        this.customers = customers;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomerId(){
        return this.customers.getId();
    }
    public String getCustomerName(){
        return this.customers.getName();
    }
    public int getCustomerDiscount(){
        return this.customers.getDiscount();
    }
    public double getAmountAfterDiscount(){
        double tien = amount * (1-customers.getDiscount()/100.0);
        return tien;
    }
    @Override
    public String toString(){
        return "Invoice [ id=" + id + ", customer="+ customers.toString()+ ", amount= "+ amount+ "]";
    }
}
