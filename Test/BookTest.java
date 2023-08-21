import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.Test;

/**
 * This is a test class for the Book class.
 */
public class BookTest {
    private Book bluestEye;
    private Book sirensOfTitan;

    /**
     * This sets up the instances of the Book class as test objects "bluestEye" and "sirensOfTitan".
     */
    @Before
    public void setup() {
        this.bluestEye = new Book("The Bluest Eye", new Person("Toni", "Morrison", 1931), 9780375411557L);
        this.sirensOfTitan = new Book("The Sirens of Titan", new Person("Kurt", "Vonnegut", 1922), 340028769L);
    }

    /**
     * This tests the Book getter method for getTitle.
     */
    @Test
    public void testTitle() {
        assertEquals("The Bluest Eye", this.bluestEye.getTitle());
        assertEquals("The Sirens of Titan", this.sirensOfTitan.getTitle());
    }

    /**
     * This tests the Book getter method for getAuthor.
     */
    @Test
    public void testAuthor() {
        assertEquals("Toni Morrison", this.bluestEye.getAuthor());
        assertEquals("Kurt Vonnegut", this.sirensOfTitan.getAuthor());
    }

    /**
     * This tests the Book getter method for getISBN.
     */
    @Test
    public void testISBN() {
        assertEquals(9780375411557L, this.bluestEye.getISBN());
        assertEquals(340028769L, this.sirensOfTitan.getISBN());
    }

    /**
     * This tests the Book method that shows availability.
     */
    @Test
    public void testIsAvailable() {
        assertEquals(true, this.bluestEye.isAvailable());
        assertEquals(true, this.sirensOfTitan.isAvailable());
    }

    /**
     * This tests the Book method that changes availability.
     * Checks that the availability starts as true, is changed to false, and then true again.
     */
    @Test
    public void testSetAvailability() {
        // Testing for bluestEye test object.
        assertTrue(bluestEye.isAvailable());
        this.bluestEye.setAvailable(false);
        assertFalse(bluestEye.isAvailable());
        this.bluestEye.setAvailable(true);
        assertTrue(bluestEye.isAvailable());

        // Testing for sirensOfTitan test object.
        assertTrue(sirensOfTitan.isAvailable());
        this.sirensOfTitan.setAvailable(false);
        assertFalse(sirensOfTitan.isAvailable());
        this.sirensOfTitan.setAvailable(true);
        assertTrue(sirensOfTitan.isAvailable());
    }

    /**
     * This tests the toString method for Book.
     */
    @Test
    public void testToString() {
        // Testing for bluestEye test object.
        assertEquals("Title: The Bluest Eye" + "\n" +
                "Author: Toni Morrison" + "\n" +
                "ISBN: 978-0-37-541155-7", this.bluestEye.toString());

        // Testing for sirensOfTitan test object.
        assertEquals("Title: The Sirens of Titan" + "\n" +
                "Author: Kurt Vonnegut" + "\n" +
                "ISBN: 000-0-34-002876-9", this.sirensOfTitan.toString());
    }

}
