import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * This is a test class for the LibraryCardNumber class.
 */
public class LibraryCardNumberTest {
    private LibraryCardNumber baseTest;

    /**
     * This sets up the instance of the LibraryCardNumber class as test objects "baseTest".
     */
    @Before
    public void setup() {
        this.baseTest = new LibraryCardNumber();
    }

    /**
     * This tests the method getTotalCards.
     * This is the base test, so there should be only one card.
     */
    @Test
    public void testTotalCards() {
        assertEquals(1, this.baseTest.getTotalCards());
    }

    /**
     * This tests the method getTotalCards.
     * This is the next test, which tests that a new card has been added and the total is updated.
     *
     * If you want to continue testing additional cards:
     *      -add another new LibraryCard();
     *      - update the expected value to the number of LibraryCard(); + 1
     */
    @Test
    public void testTotalCardsNew() {
        new LibraryCard();
        assertEquals(2, this.baseTest.getTotalCards());
    }
}

