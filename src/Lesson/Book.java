package Lesson;

public class Book {
   private String bookName;
   private int yearBook;
   private Author author;
    public Book(String bookName, int yearBook, Author author) {
        this.bookName = bookName;
        this.yearBook = yearBook;
        this.author = author;
    }
    public String getBookName() {
        return this.bookName;
    }
    public int getYearBook() {
        return this.yearBook;
    }
    public Author getAuthor() {
        return this.author;
    }
    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }
}

