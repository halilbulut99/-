package homework1;

public class Book {
public int isbn;

 public String title,author,dateOfPublish;

    public Book(){
        isbn = 0;
        title = null;
        author = null;
        dateOfPublish = null;
    }
    public Book(int isbn,String title,String author,String dateOfPublish){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.dateOfPublish = dateOfPublish;

    }
    @Override
    public String toString(){
        return "\nTitle: " + title + "\nAuthor: " + author +
                "\nISBN: " + isbn + "\nDateOfPublish: "+ dateOfPublish+ "\n";
    }
}
