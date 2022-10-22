package minitest.Product.lan3.book;

public class ProgrammingBook extends Book {
    private String language ;
    private String frameWork ;

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setFrameWork(String frameWork) {
        this.frameWork = frameWork;
    }
    public String getLanguage(){
        return language;
    }
    public String getFrameWork(){
        return  frameWork;
    }

    public ProgrammingBook(String language, String frameWork) {
        this.language = language;
        this.frameWork = frameWork;
    }

    public ProgrammingBook(String bookCode, String name, int number, String author, int price, String language, String frameWork) {
        super(bookCode, name, number, author, price);
        this.language = language;
        this.frameWork = frameWork;
    }
}

