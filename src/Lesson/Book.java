package Lesson;

import java.util.Objects;

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

    public String toString() {
        return "Название книги: " +getBookName()+". Год издания - "+getYearBook()+". Автор: "+ getAuthor();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearBook == book.yearBook && bookName.equals(book.bookName) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, yearBook, author);
    }
}

