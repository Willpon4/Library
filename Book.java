package Library_Program.Library;

import java.util.ArrayList;

public class Book extends Library{
    private int numBooks;
    private int numShelves;
    private int numLockedCabinets;
    private int numCabinets;
    private String password;

    private String title;
    private boolean read;
    private String author;

    private final int MAX_BOOKS_SHELF = 12;

    ArrayList<Book> books;

    public Book(String title, String author, boolean read) {
        super(numShelves, numCabinets, numLockedCabinets, password);
        this.numBooks = numBooks;
        this.numShelves = numShelves;
        this.numLockedCabinets = numLockedCabinets;
        this.numCabinets = numCabinets;
        this.password = password;
        books = new ArrayList<Book>();
    }

    // Add a book to the ArrayList
    public void addBook(Book book) {
        books.add(book);
    }

    // Find duplicate books
    public boolean findDuplicate(Object obj) {
        if (obj instanceof Book) {
            Book book = (Book) obj;
            for (int i = 0; i < books.size(); i++) {
                if (book == books.get(i)) {
                    return true;
                }
            }
        }
        return false;
    }

    // If a shelf has 12 books, start a new shelf
    public void newShelf() {
        // TODO
    }

    // Search for the location of a book in the ArrayList
    public int search(Book book) {
        // TODO
    }

    // get number of shelves (abstract method from Library.java)
    public int getShelves() {
        // TODO
    }

    // get number of books in the catalog (abstract method from Library.java)
    public int getCount() {
        // TODO
    }
}
