/**
 * This class represents a library card number.
 * It creates a library card number and sets it to 1.
 */
public class LibraryCardNumber {
    private static int numCards = 1;

    /**
     * Creates a method to generate a new library card number.
     * Every time the method is run, the number increases by one.
     * @return the new number for each library card object.
     */
    public static int generateNewNumber() {
        return numCards++;
    }

    /**
     * Get the total number of library cards.
     * @return the total number of library cards, as an integer.
     */
    public int getTotalCards() {
        return this.numCards;
    }

}
