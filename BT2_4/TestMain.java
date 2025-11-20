package BT2_4;

public class TestMain {
    public static void main(String[] args){
        Customer c1 = new Customer(88,"Tan Ah Teck",10);
        System.out.println(c1);
        c1.setDiscount(8);
        System.out.println("id is: "+c1.getId());
        System.out.println("name is: "+c1.getName());
        System.out.println("discount is: "+c1.getDiscount());

        Invoice c2= new Invoice(101,c1,888.8);
        System.out.println(c2);
        c2.setAmount(999.9);
        System.out.println("id is: "+ c2.getId());
        System.out.println("customer is: "+ c2.getCustomers());
        System.out.println("amount is: "+ c2.getAmount());
        System.out.println("customer's id is: "+ c2.getCustomerId());
        System.out.println("customer's name is: "+ c2.getCustomerName());
        System.out.println("customer's discount is: "+ c2.getCustomerDiscount());
        System.out.println("amount after discount is: " + c2.getAmountAfterDiscount());
    }
}
