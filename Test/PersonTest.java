import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * This is a test class for the Person class.
 */
public class PersonTest {
    private Person jovie;
    private Person anthony;

    /**
     * This sets up the instances of the Person class as test objects "jovie" and "anthony".
     */
    @Before
    public void setup() {
        this.jovie = new Person("Jovienne", "Trotta", 1993);
        this.anthony = new Person("Anthony", "Licari", 1994);
    }

    /**
     * This tests the Person getter method for getFirstName.
     */
    @Test
    public void testFirstName() {
        assertEquals("Jovienne", this.jovie.getFirstName());
        assertEquals("Anthony", this.anthony.getFirstName());
    }

    /**
     * This tests the Person getter method for getLastName.
     */
    @Test
    public void testLastName() {
        assertEquals("Trotta", this.jovie.getLastName());
        assertEquals("Licari", this.anthony.getLastName());
    }

    /**
     * This tests the Person getter method for getYearOfBirth.
     */
    @Test
    public void testBirthYear() {
        assertEquals(1993, this.jovie.getYearOfBirth());
        assertEquals(1994, this.anthony.getYearOfBirth());
    }

    /**
     * This tests the toString method for Person.
     */
    @Test
    public void testFullName() {
        assertEquals("Jovienne Trotta", this.jovie.toString());
        assertEquals("Anthony Licari", this.anthony.toString());
    }

    /**
     * This tests the same method for Person.
     */
    @Test
    public void testSamePerson() {
        assertEquals(true, this.jovie.same(jovie));
        assertEquals(false, this.jovie.same(anthony));
        assertEquals(true, this.anthony.same(anthony));
        assertEquals(false, this.anthony.same(jovie));
    }

    /**
     * This tests the getAge method for Person.
     */
    @Test
    public void testGetAge() {
        assertEquals(30, this.jovie.getAge(2023));
        assertEquals(29, this.anthony.getAge(2023));
    }
}
