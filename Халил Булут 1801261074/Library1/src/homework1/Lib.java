package homework1;

import java.util.ArrayList;
import java.util.List;

public class Lib {
    public List<Book> books;

    public Lib(){
        books = new ArrayList<Book>();
    }

    public void addBook(Book b){

        books.add(b);
    }


    public ArrayList<Book> searchBook(String author){
        ArrayList result = new ArrayList<Book>();
        for (int i = 0; i < books.size(); i++) {
             if (author.equals(books.get(i).author)){
                 result.add(books.get(i));
             }

        }
        return result;
    }


    public void deleteBook(Book book){
        if (books.contains(book)){
            books.remove(book);
        }

    }
    public String viewBook(Book book){
        if (books.contains(book)){
            return book.toString();
        }else {
            return "Book not found !";
        }
    }

}


