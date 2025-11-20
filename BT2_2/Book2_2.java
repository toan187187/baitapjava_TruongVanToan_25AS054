package BT2_2;
public class Book2_2 {
    private String name;
    private Author2_2[] author2_2s;
    private double price;
    private int qty=0;
    public Book2_2(String name, Author2_2[] author2_2s, double price){
        this.name=name;
        this.author2_2s=author2_2s;
        this.price=price;
    }
    public Book2_2(String name, Author2_2[] author2_2s, double price, int qty){
        this.name=name;
        this.author2_2s=author2_2s;
        this.price=price;
        this.qty=qty;
    }
    public String getName(){
        return name;
    }
    public Author2_2[] getAuthor2_2s(){
        return author2_2s;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double p){
        this.price= p;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int q){
        this.qty=q;
    }
    public String toString(){
        return "Book2_2{" + "name='"+ name + "\'" + ", author2_2=" + author2_2s + ",price" + price + ",qty" +qty +'}';
    }
    public String getAuthorNames() {
        StringBuilder names = new StringBuilder();
        for (int i = 0; i < author2_2s.length; i++) {
            names.append(author2_2s[i].getName());
        }
        return names.toString();
    }
}
