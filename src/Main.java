/**
 * This is the driver class.
 */
public class Main {
    public static  void main(String[] args) {
        System.out.println("\ncreate two new library cardholders:");
        LibraryCard JovienneTrotta = new LibraryCard();
        LibraryCard AnthonyLicari = new LibraryCard();

        System.out.println("\ncreate three books in library and print their information:");
        Book BluestEye = new Book("The Bluest Eye", new Person("Toni", "Morrison", 1931), 9780375411557L);
        Book SirensTitans = new Book("The Sirens of Titan", new Person("Kurt", "Vonnegut", 1922), 340028769L);
        Book HillHouse = new Book("The Haunting of Hill House", new Person("Shirley", "Jackson", 1916), 5779);
        System.out.println(BluestEye.toString());
        System.out.println(SirensTitans.toString());
        System.out.println(HillHouse.toString());

        System.out.println("\nfirst user borrows a book and their card is updated");
        JovienneTrotta.borrowBook(HillHouse);
        System.out.println(JovienneTrotta.getBook1());

        System.out.println("\nmeanwhile a second user tries to borrow the same book");
        AnthonyLicari.borrowBook(HillHouse);
        System.out.println(AnthonyLicari.getBook1());

        System.out.println("\nfirst user returns the book");
        JovienneTrotta.returnBook(JovienneTrotta.getBook1());
        System.out.println(JovienneTrotta.getBook1());
        HillHouse.setAvailable(true);

        System.out.println("\nsecond user borrows three books");
        AnthonyLicari.borrowBook(BluestEye);
        System.out.println(AnthonyLicari.getBook1());
        AnthonyLicari.borrowBook(SirensTitans);
        System.out.println(AnthonyLicari.getBook2());
        AnthonyLicari.borrowBook(HillHouse);
        System.out.println(AnthonyLicari.getBook3());

        System.out.println("\nsecond user checks the books due dates and any late fees on their card");
        System.out.println(AnthonyLicari.getBook1().getDueDate());
        System.out.println(AnthonyLicari.getBook2().getDueDate());
        System.out.println(AnthonyLicari.getBook3().getDueDate());
        System.out.println(AnthonyLicari.getTotalFeesOwed());
    }
}