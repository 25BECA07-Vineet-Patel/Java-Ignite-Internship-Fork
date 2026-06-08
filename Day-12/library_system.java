import java.io.*;
import java.util.Scanner;

class Book {

    int id;
    String title;
    double price;

    Book(int id, String title, String price) {

        this.id = id;
        this.title = title;

        // Wrapper Class Conversion
        this.price = Double.parseDouble(price);
    }

    void showBookType() {
        System.out.println("General Book");
    }
}

// Child Class 1
class EBook extends Book {

    EBook(int id, String title, String price) {
        super(id, title, price);
    }

    @Override
    void showBookType() {
        System.out.println("Book Type: E-Book");
    }
}

class PrintedBook extends Book {

    PrintedBook(int id, String title, String price) {
        super(id, title, price);
    }

    @Override
    void showBookType() {
        System.out.println("Book Type: Printed Book");
    }
}

class Library {

    // Overloading
    void searchBook(int id) {
        System.out.println("Searching Book by ID: " + id);
    }

    void searchBook(String title) {
        System.out.println("Searching Book by Title: " + title);
    }

    // File Handling - Write
    void saveBook(Book book) {

        try {
            FileWriter fw = new FileWriter("library.txt", true);

            fw.write("ID: " + book.id +
                    ", Title: " + book.title +
                    ", Price: " + book.price + "\n");

            fw.close();

            System.out.println("Book saved successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    void readBooks() {

        try {

            File file = new File("library.txt");

            Scanner sc = new Scanner(file);

            System.out.println("\n----- Library Records -----");

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

public class library_system {

    public static void main(String[] args) {

        Library lib = new Library();

        EBook ebook = new EBook(101, "Java Programming", "499.50");

        PrintedBook printedBook = new PrintedBook(102, "Data Structures", "650.75");

        // Overriding
        ebook.showBookType();
        printedBook.showBookType();

        // Overloading
        lib.searchBook(101);
        lib.searchBook("Java Programming");

        // Save to file
        lib.saveBook(ebook);
        lib.saveBook(printedBook);

        // Read from file
        lib.readBooks();
    }
}