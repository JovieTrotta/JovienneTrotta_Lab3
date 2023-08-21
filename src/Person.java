/**
 * This class represents a person.
 * The person has a first name, last name and year of birth.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int yearOfBirth;

    /**
     * Constructs a Person class and initializes it to the given first name, last name and year of birth.
     * @param firstName the first name of this person.
     * @param lastName the last name of this person.
     * @param yearOfBirth the year of birth of this person.
     */
    public Person(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    /**
     * Return the first name of this person.
     * @return the first name of this person, as a String.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Return the last name of this person.
     * @return the last name of this person, as a String.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Return the year of birth of this person.
     * @return the year of birth of this person, as an integer.
     */
    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    /**
     Returns a string representation of this person with first and last name.
     @return a formatted string.
     */
    public String toString() {
        return "" + firstName  + " " + lastName;
    }

    /**
     * Check if this person is the same as the person in the argument.
     * Two persons are the same if they have the same first and last names and the same years of birth.
     * @param other the other person to be compared to.
     * @return boolean true if this person is the same as other, false otherwise.
     */
    public boolean same(Person other) {
        return  this.firstName.equals(other.firstName)
                && this.lastName.equals(other.lastName)
                && this.yearOfBirth == other.yearOfBirth;
    }

    /**
     * Calculates the approximate age of a person.
     * @param currentYear is the year you want to check against.
     * @return the approximate age of a person, as an integer.
     */
    public int getAge(int currentYear) {
        return  currentYear - this.yearOfBirth;
    }
}
