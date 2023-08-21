import java.time.LocalDate;

/**
 * This class represents a library card, which is used to borrow books.
 * The library card has a unique card number.
 * The library card can also have a maximum of 3 borrowed books at any given time.
 */
public class LibraryCard {
    private int cardNumber;
    private BorrowedBook book1; // First borrowed book
    private BorrowedBook book2; // Second borrowed book
    private BorrowedBook book3; // Third borrowed book
    private double totalFeesOwed;

    /**
     * Constructs a library card class and initializes it.
     * Assigns a library card number.
     */
    public LibraryCard() {
        this.cardNumber = LibraryCardNumber.generateNewNumber();
        this.totalFeesOwed = 0.0;
    }

    /**
     * Get the card number of the library card.
     * @return the card number of the library card, as an integer.
     */
    public int getCardNumber() {
        return this.cardNumber;
    }

    /**
     * Get the total fees associated with a library card.
     * @return the total fees associated with a library card, as a double.
     */
    public double getTotalFeesOwed() {
        this.totalFeesOwed = book1.getLateFees() + book2.getLateFees() + book3.getLateFees();
        return this.totalFeesOwed;
    }

    /**
     * Get the book associated with book slot 1.
     * @return the book associated with book slot 1, as a borrowed book object.
     */
    public BorrowedBook getBook1() { return this.book1;}

    /**
     * Get the book associated with book slot 2.
     * @return the book associated with book slot 2, as a borrowed book object.
     */
    public BorrowedBook getBook2() {
        return this.book2;
    }

    /**
     * Get the book associated with book slot 3.
     * @return the book associated with book slot 3, as a borrowed book object.
     */
    public BorrowedBook getBook3() {
        return this.book3;
    }

    /**
     * Checks if a book is available.
     * If available, assigned the book to an available book slot as a borrowed book object.
     * If no book slots are available, print a message to the user.
     */
    public void borrowBook(Book book) {
        System.out.println(book.getTitle());
        if (book1 == null && book.isAvailable()) {
            book.setAvailable(false);
            this.book1 = new BorrowedBook(book, LocalDate.now());
            System.out.println("You've borrowed " + book1.getTitle() + "!");
        } else if (book2 == null && book.isAvailable()) {
            book.setAvailable(false);
            book2 = new BorrowedBook(book, LocalDate.now());
            System.out.println("You've borrowed " + book2.getTitle() + "!");
        } else if (book3 == null && book.isAvailable()) {
            book.setAvailable(false);
            book3 = new BorrowedBook(book, LocalDate.now());
            System.out.println("You've borrowed " + book3.getTitle() + "!");
        } else if (!book.isAvailable()) {
            System.out.println("Book is not available!");
        } else {
            System.out.println("You already have the max number of books checked out!");
        }
    }

    /**
     * Checks if the totalFeesOwed balance is zero.
     * If fees are zero (paid), then iterates through each book slot.
     * Checks if the title of the returned book matches the title of a book in the book slot.
     * If it does match, sets the book slot to null.
     * If it does not match any book slots, return a message to the user.
     */
    public void returnBook(BorrowedBook book) {
        if (this.totalFeesOwed == 0){
            if (book.getTitle() == book1.title) {
                book1 = null;
                System.out.println(book.getTitle() + " successfully returned.");
            } else if (book.getTitle() == book2.title) {
                book2 = null;
                System.out.println(book.getTitle() + " successfully returned.");
            } else if (book.getTitle() == book3.title) {
                book3 = null;
                System.out.println(book.getTitle() + " successfully returned.");
            }
            else {
                System.out.println("Error: book not found!");
            }
        }
        else {
            System.out.println("Fees must be paid before a book is returned.");
        }
    }

    /**
     * Subtracts payment from the totalFeesOwed balance.
     * @return a double value showing the remaining balance.
     */
    public double makePayment(double amountPaid) {
        return totalFeesOwed - amountPaid;
    }
}
