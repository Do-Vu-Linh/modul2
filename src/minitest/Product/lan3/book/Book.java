package minitest.Product.lan3.book;

public class Book {
    private String bookCode ;
    private String name ;
    private int number;
    private String author;
    private  int price;

    public Book() {

    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public String getBookCode (){
        return getBookCode();
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public Book(String bookCode, String name, int number, String author, int price) {
        this.bookCode = bookCode;
        this.name = name;
        this.number = number;
        this.author = author;
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
