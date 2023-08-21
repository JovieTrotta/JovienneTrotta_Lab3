/**
 * This class represents a book.
 * A book has a title, an author, an ISBN, and a status (available or checked out).
 */
public class Book {
    protected String title;
    protected Person author;
    protected long ISBN;
    protected boolean isAvailable;

    /**
     * Construct a Book class that has the provided title, author and ISBN.
     * @param title to be given to this book, as a string.
     * @param author to be given to this book, as a person object.
     * @param ISBN the International Standard Book Number of this book, as a long.
     */
    public Book(){}
    public Book(String title, Person author, long ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    /**
     * Return the title of this book.
     * @return the title of this book, as a String.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Return the author of this book.
     * @return the author of this book, as a @link{Person} class.
     */
    public String getAuthor() { return this.author.toString(); }

    /**
     * Return the ISBN of this book.
     * @return the ISBN of this book, as an integer.
     */
    public long getISBN() {
        return this.ISBN;
    }

    /**
     * Return the availability status of the book.
     * @return the availability of the book: boolean true if available and false otherwise.
     */
    public boolean isAvailable() {
        return this.isAvailable;
    }

    /**
     * Switches the status of the book.
     * @param available (true = true and false = false).
     */
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    /**
     * Return a formatted string that contains the information of this object.
     * The string should be in the following format:
     *
     * Title: [title of the book]
     * Author: [first-name last-name]
     * ISBN: [ISBN as a 13-digit integer with digits separated appropriately by dashes i.e. 978-3-16-148410-0].
     *
     * @return the formatted string as above.
     */
    public String toString() {
        String str;
        str = "Title: "+ this.title + "\n" + "Author: " + this.author + "\n";

        //first format the isbn into a string and make sure it is 13 digits
        String isbn = String.format("ISBN: %013d", this.ISBN);

        //then format the 13 digit isbn to match 000-0-00-000000-0 layout
        str = str + String.valueOf(isbn).replaceFirst("(\\d{3})(\\d{1})(\\d{2})(\\d{6})(\\d{1})", "$1-$2-$3-$4-$5");

        return str;
    }
}
