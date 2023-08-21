import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * This is a test class for the LibraryCard class.
 */
public class LibraryCardTest {
    private LibraryCard test1;
    private LibraryCard test2;
    private LibraryCard test3;
    private Book testBook1;
    private Book testBook2;
    private Book testBook3;


    /**
     * This sets up the instances of the LibraryCard class as test objects "test1" and "test2".
     */
    @Before
    public void setup() {
        this.test1 = new LibraryCard();
        this.test2 = new LibraryCard();
        this.test3 = new LibraryCard();
        this.testBook1 = new Book("Test Title 1", new Person("Test", "Author", 1900), 0);
        this.testBook2 = new Book("Test Title 2", new Person("Test", "Author", 1900), 0);
        this.testBook3 = new Book("Test Title 3", new Person("Test", "Author", 1900), 0);
    }

    /**
     * This tests the method getCardNumber.
     */
    @Test
    public void testCardNumber() {
        assertEquals(1, this.test1.getCardNumber());
        assertEquals(2, this.test2.getCardNumber());
        assertEquals(3, this.test3.getCardNumber());
    }

    /**
     * This tests the method getTotalFeesOwed.
     */
    @Test
    public void testTotalFees() {
        test1.borrowBook(testBook1);
        test1.borrowBook(testBook2);
        test1.borrowBook(testBook3);
        assertEquals(0.0, this.test1.getTotalFeesOwed(),0.01);
        test1.returnBook(test1.getBook1());
        test1.returnBook(test1.getBook2());
        test1.returnBook(test1.getBook3());
    }

    /**
     * This tests the method getBook1.
     */
    @Test
    public void testGetBook1() {
        assertEquals(null, this.test1.getBook1());
        test1.borrowBook(testBook1);
        assertEquals("Test Title 1", this.test1.getBook1().getTitle());
    }

    /**
     * This tests the method borrowBook.
     */
    @Test
    public void testBorrowBook() {
        assertEquals(null, test1.getBook1());
        test1.borrowBook(testBook1);
        assertEquals("Test Title 1", test1.getBook1().getTitle());
        assertEquals(false, testBook1.isAvailable());
        test1.borrowBook(testBook2);
        assertEquals("Test Title 2", test1.getBook2().getTitle());
        assertEquals(false, testBook1.isAvailable());
        test1.borrowBook(testBook3);
        assertEquals("Test Title 3", test1.getBook3().getTitle());
        assertEquals(false, testBook1.isAvailable());
        test1.borrowBook(testBook1);
    }

    /**
     * This tests the method returnBook.
     */
    @Test
    public void testReturnBook() {
        test1.borrowBook(testBook1);
        assertEquals("Test Title 1", test1.getBook1().getTitle());
        assertEquals(false, testBook1.isAvailable());
        test1.returnBook(test1.getBook1());
        testBook1.setAvailable(true);
        assertEquals(true, testBook1.isAvailable());
        assertEquals(null, test1.getBook1());
    }

    /**
     * This tests the method makePayment.
     */
    @Test
    public void testMakePayment() {
        assertEquals(0.0, this.test1.makePayment(0.0),0.01);
        assertEquals(-2.0, this.test1.makePayment(2.0),0.01);
    }
}