package booklibrary;

import java.util.ArrayList;

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book '" + book.getTitle() + "' added to the library.");
    }

    public void issueBook(String title) {
        books.forEach(book -> {
            if (book.getTitle().equals(title)) {
                if (!book.isIssued()) {
                    book.issue();
                    System.out.println("Book '" + title + "' has been issued.");
                    return;
                } else {
                    System.out.println("Book '" + title + "' is already issued.");
                    return;
                }
            }
        } );
        System.out.println("Book '" + title + "' not found in the library.");
    }

    public void returnBook(String title) {
        books.forEach(book-> {
            if (book.getTitle().equals(title)) {
                if (book.isIssued()) {
                    book.returnBook();
                    System.out.println("Book '" + title + "' has been returned.");
                    return;
                } else {
                    System.out.println("Book '" + title + "' was not issued.");
                    return;
                }
            }
        });

        System.out.println("Book '" + title + "' not found in the library.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        books.forEach(System.out::println);
    }
}
