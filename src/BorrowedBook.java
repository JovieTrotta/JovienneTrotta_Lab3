import java.time.LocalDate;

/**
 * This class represents a borrowed book.
 * It inherits attributes and methods from the book super class.
 * It also has several additional attributes such as issueDate, dueDate, and lateFees.
 */
class BorrowedBook extends Book {
    private final Book book;
    private final LocalDate issueDate;
    private final LocalDate dueDate;
    private double lateFees;

    /**
     * Construct a BorrowedBook class that has the provided issueDate, dueDate, and lateFees.
     * @param book as a book object.
     * @param issueDate as a LocalDate object.
     */
    public BorrowedBook(Book book, LocalDate issueDate) {
        this.book = book;
        this.title = book.title;
        this.author = book.author;
        this.ISBN = book.getISBN();
        this.isAvailable = book.isAvailable;
        this.dueDate = issueDate.plusDays(7);
        this.issueDate = issueDate;
        this.lateFees = getLateFees();
    }

    /**
     * Return the issue date of this book.
     * @return the issue date of this book, as a LocalDate.
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /**
     * Return the due date of this book.
     * @return the due date of this book, as a LocalDate.
     */
    public LocalDate getDueDate() {
        return dueDate;
    }

    /**
     * Return the late fees associated with this book.
     * @return the late fees associated with this book, as a double.
     */
    public double getLateFees() {
        LocalDate currentTime = LocalDate.now();
        int differenceInDays = dueDate.until(currentTime).getDays();
        if (differenceInDays > 0) {
            lateFees = differenceInDays * 0.50;
        } else {
            lateFees = 0;
        }
        return lateFees;
    }
}

