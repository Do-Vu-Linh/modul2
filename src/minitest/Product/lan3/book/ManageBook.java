package minitest.Product.lan3.book;

public class ManageBook {
    private Book[] books;

    public int sumprice() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += books[i].getPrice();

        }
        return sum;
    }

    public int countbook() {
        int count = 0;

        for (Book book : books) {
            if (book instanceof ProgrammingBook) {
                if (((ProgrammingBook) book).getLanguage().equals("java")) {
                    count++;
                }

            }
        }
        return count ;
    }
    public  int countCatoloy(){
        int count1 = 0;
        for (Book book : books){
            if(book instanceof  FictionBook) {
                if (((FictionBook) book). getCategory().equals("viễn tưởng 1")) {
                    count1++;
                }
            }
        }
        return count1;
    }
    public  int contprice100 (){
        int cont2 = 0;
        for(Book book : books){
            if(book instanceof  FictionBook) {
                if((((FictionBook) book).getPrice() <100 )) {
                    cont2 ++;
                }
            }
        }
        return cont2;
    }


    public static void main(String[] args) {
        Book book1 = new ProgrammingBook("bookcode1", "name1", 1, "author1", 1, "java", "frameWork1");
        Book book2 = new ProgrammingBook("bookcode2", "name2", 2, "author2", 2, "java", "frameWork2");
        Book book3 = new ProgrammingBook("bookcode3", "name3", 3, "author3", 3, "java", "frameWork3");
        Book book4 = new ProgrammingBook("bookcode4", "name4", 4, "author4", 4, "java1", "frameWork4");
        Book book5 = new ProgrammingBook("bookcode5", "name5", 5, "author5", 5, "java1", "frameWork5");
        Book book6 = new FictionBook("bookcode6", "name6", 6, "author6", 6, "viễn tưởng 1");
        Book book7 = new FictionBook("bookcode7", "name7", 7, "author7", 100, "viễn tưởng 1");
        Book book8 = new FictionBook("bookcode8", "name8", 8, "author8", 100, "viễn tưởng 2");
        Book book9 = new FictionBook("bookcode9", "name9", 9, "author9", 9, "viễn tưởng 3");
        Book book10 = new FictionBook("bookcode10", "name10", 10, "author10", 10, "viễn tưởng 4");
        ManageBook manageBook = new ManageBook();
        manageBook.books =  new Book[]{book1, book2, book3, book4, book5, book6, book7, book8, book9, book10};

        System.out.println("tổng là " + manageBook.sumprice());
        System.out.println("tổng sách java là " + manageBook.countbook());
        System.out.println( " tổng số sách có catogaly là viễn tưởng 1 là : " + manageBook.countCatoloy());
        System.out.println( "tổng số sách Fiction có giá dưới 100 là : " + manageBook.contprice100());

    }

}


