package BT2_1;
public class testBookAuthor {

    public static void main(String[] args) {

        Author2_1 ahTeck = new Author2_1("Tan Ah Teck", "ahteck@nowhere.com", 'm');
       System.out.println();

        Book2_1 dummyBook = new Book2_1("Java for dummy", ahTeck, 19.95f, 99); // Test Book's Constructor
        System.out.println(dummyBook); // Test Book's toString()

        // Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor2_1()); // Author's toString()
        System.out.println("Author's name is: " + dummyBook.getAuthor2_1().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor2_1().getEmail());

        Book2_1 anotherBook = new Book2_1("more Java",
                new Author2_1("Paul Tan", "paul@somewhere.com", 'm'), 29.95, 50);
        System.out.println(anotherBook); // toString()
    }
}