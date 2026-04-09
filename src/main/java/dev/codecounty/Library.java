package dev.codecounty;

import java.util.ArrayList;

class Library {

    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }


    void displayBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    Book findBook(int id) throws Exception {
        for (Book b : books) {
            if (b.getBookId() == id) {
                return b;
            }
        }
        throw new Exception("Book not found");
    }

}