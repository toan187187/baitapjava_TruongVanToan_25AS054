package BT2_3;

import java.util.Arrays;

public class Book {
    private String isbn;
    private String name;
    private Author Author;
    private double price;
    private int qty=0;

    public Book(String isbn, Author author, String name, double price) {
        this.isbn = isbn;
        Author = author;
        this.name = name;
        this.price = price;
    }

    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        Author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbnn() {
        return isbn;
    }

    public void setIsbnn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return Author;
    }

    public void setAuthor(Author author) {
        Author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" + super.toString()+
                "isbnn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                ", Author=" + Author.toString()+
                ", price=" + price +
                ", qty=" + qty +
                ", getAuthorName='" + getAuthorName + '\'' +
                '}';
    }
    private String getAuthorName;
    public Book(String getAuthorName) {
        this.getAuthorName=getAuthorName;
    }
    public String getGetAuthorName() {
        return getAuthorName;
    }

    public void setGetAuthorName(String getAuthorName) {
        this.getAuthorName = getAuthorName;
    }
}
