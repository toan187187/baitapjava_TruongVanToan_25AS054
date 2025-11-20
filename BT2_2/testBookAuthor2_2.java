package BT2_2;
public class testBookAuthor2_2{
    public static void main(String[] args){
        Author2_2[] author2_2s= new Author2_2[2];
        author2_2s[0]=new Author2_2("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        author2_2s[1]=new Author2_2("Paul Tan", "Paul@nowhere.com", 'm');
        Book2_2 javaDummy = new Book2_2("Java for Dummy", author2_2s, 19.99, 99);
        System.out.println(javaDummy);
}}