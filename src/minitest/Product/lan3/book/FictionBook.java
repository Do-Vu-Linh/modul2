package minitest.Product.lan3.book;

public class FictionBook extends Book {
    private String category;

    public FictionBook() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public FictionBook(String category) {
        this.category = category;
    }

    public FictionBook(String bookCode, String name, int number, String author, int price, String category) {
        super(bookCode, name, number, author, price);
        this.category = category;
    }
}
