package library.init;

import library.books.Books;
import library.reader.Reader;

public class Run {

    public static void main(String[] args) {
        Reader reader = new Reader("Petrov V. V.");
        Books adventures = new Books("Adventures");
        Books vocabulary = new Books("Vocabulary");
        Books encyclopedia = new Books("Encyclopedia");
        Books[] books = new Books[]{adventures, vocabulary, encyclopedia};

        reader.takeBook(1);
        reader.takeBook("Adventures", "Vocabulary", "Encyclopedia");
        reader.takeBook(books);

        reader.returnBook(3);
        reader.returnBook("Adventures", "Vocabulary", "Encyclopedia");
        reader.returnBook(books);



    }
}
