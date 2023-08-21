import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;

/**
 * This is a test class for the BorrowedBook class.
 */
public class BorrowedBookTest {
    private BorrowedBook test1;
    private BorrowedBook test2;
    private BorrowedBook test3;

    /**
     * This sets up the instances of the BorrowedBook class as test objects.
     */
    @Before
    public void setup() {
        Book bookTest = new Book();
        LocalDate localDateTest = LocalDate.now();
        LocalDate localDateTest2 = LocalDate.now().minusDays(15);
        LocalDate localDateTest3 = LocalDate.now().minusDays(5);
        this.test1 = new BorrowedBook(bookTest, localDateTest);
        this.test2 = new BorrowedBook(bookTest, localDateTest2);
        this.test3 = new BorrowedBook(bookTest, localDateTest3);
    }

    /**
     * This tests the BorrowedBook getter method for getIssueDate.
     */
    @Test
    public void testGetIssueDate() {
        assertEquals(LocalDate.now(),this.test1.getIssueDate());
    }

    /**
     * This tests the BorrowedBook getter method for getDueDate.
     */
    @Test
    public void testGetDueDate() {
        assertEquals(LocalDate.now().plusDays(7),this.test1.getDueDate());
    }

    /**
     * This tests the BorrowedBook method for getLateFees.
     */
    @Test
    public void testLateFees() {
        assertEquals(0.0,this.test1.getLateFees(), 0.01);
        assertEquals(4.0, this.test2.getLateFees(), 0.01);
        assertEquals(0.0, this.test3.getLateFees(), 0.01);
    }
}
