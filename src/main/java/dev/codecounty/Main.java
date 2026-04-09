package dev.codecounty;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();


        library.addBook(new Book(1, "Java 1", "ABC 1", true));
        library.addBook(new Book(2, "Java 2", "ABC 2", true));
        library.addBook(new Book(3, "Java 3", "ABC 3", true));
        library.addBook(new Book(4, "Java 4", "ABC 4", true));
        library.addBook(new Book(5, "Java 5", "ABC 5", true));

        System.out.println("All Books:");
        library.displayBooks();

        System.out.println("\nFinal Book List:");
        library.displayBooks();
    }
}