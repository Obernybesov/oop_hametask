package library.reader;

import library.books.Books;

import java.util.Arrays;

public class Reader {

    private String readerName;
    private int readerTicketNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;



    public Reader(String readerName) {
        this.readerName = readerName;
    }

    public void takeBook(int booksAmount) {
        String bookOrBooks;
        if (booksAmount == 1) {bookOrBooks = "book";}
        else {bookOrBooks = "books";}
        System.out.println(readerName + " take " + booksAmount + " " +  bookOrBooks);

    }

    public void takeBook(String... bookNames) {
        System.out.println(readerName + " take: " + Arrays.toString(bookNames).replace('[', ' ').replace(']', ' '));
    }

    public void takeBook(Books[] books) {
        System.out.print(readerName + " take: ");
        for (Books b : books
             ) {
            System.out.print(b.getBook() + " ");
        }
        System.out.print("\n");
    }

    public void returnBook(int booksAmount) {
        String bookOrBooks;
        if (booksAmount == 1) {bookOrBooks = "book";}
        else {bookOrBooks = "books";}
        System.out.println(readerName + " return " + booksAmount + " " + bookOrBooks);
    }
    public void returnBook(String... bookNames) {
        System.out.println(readerName + " return: " + Arrays.toString(bookNames).replace('[', ' ').replace(']', ' '));
    }
    public void returnBook(Books[] books) {
        System.out.print(readerName + " take: ");
        for (Books b : books
        ) {
            System.out.print(b.getBook() + " ");
        }
        System.out.print("\n");

    }
}
