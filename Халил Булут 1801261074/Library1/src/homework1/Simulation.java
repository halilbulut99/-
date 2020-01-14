package homework1;

import java.util.ArrayList;

public  class Simulation {
   public Lib library = new Lib();

    Book description = new Book(1235,"Description","Stephen King","16.10.2010");
    Book it = new Book(1266,"It","Stephen King","23.10.2020");
    Book harryPotter = new Book(1200,"Harry Potter","Joanne Rowling","16.12.2011");

    public Simulation(){

    }


    public void addBooks(){
        library.addBook(description);
        library.addBook(it);
        library.addBook(harryPotter);
    }
    public void run(){
         addBooks();
         showBooks();
         searchAndDelete();
        System.out.println("--------------------------------------------------------------------------");
         showBooks();

    }
    public void showBooks(){
        for (int i = 0;i < library.books.size();i++){
            System.out.println(library.viewBook(library.books.get(i)));
        }
    }
    public void searchAndDelete(){
        String author = "Stephen King";
        ArrayList authorBooks = library.searchBook(author);
        for (int i = 0; i < authorBooks.size(); i++) {
           library.deleteBook((Book) authorBooks.get(i));
        }
    }


}
