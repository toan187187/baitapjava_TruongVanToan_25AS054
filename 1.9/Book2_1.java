 public class Book2_1 {
        private String name;
        private Author2_1 author2_1;
        private double price;
        private int qty=0;
        public Book2_1(String name, Author2_1 author2_1, double price){
            this.name=name;
            this.author2_1=author2_1;
            this.price=price;
        }
        public Book2_1(String name, Author2_1 author2_1, double Price, int qty){
            this.name=name;
           this.author2_1=author2_1;
            this.price=Price;
            this.qty=qty;
        }
        public String getName(){
            return this.name;
        }
        public Author2_1 getAuthor2_1(){
            return this.author2_1;
        }
        public double getPrice(){
            return this.price;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        public int getQty(){
            return this.qty;
        }
        public void setQty(int qty){
            this.qty=qty;
        }
        public String toString() {
            return "Book2_1{" + "name='" + name + '\'' + ", author2_1=" + author2_1 + ", price=" + price + ", qty=" + qty + '}';
        }
    }
