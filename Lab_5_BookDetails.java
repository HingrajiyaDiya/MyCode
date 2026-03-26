package MyPackage;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    String authorName;

    Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }
}

public class Lab_5_BookDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of Book " + (i + 1));

            System.out.print("Book ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Book Name: ");
            String name = sc.nextLine();

            System.out.print("Author Name: ");
            String author = sc.nextLine();

            bookList.add(new Book(id, name, author));
        }

        System.out.println("\nBook Details:");
        for (Book b : bookList) {
            System.out.println("Book ID: " + b.bookId);
            System.out.println("Book Name: " + b.bookName);
            System.out.println("Author Name: " + b.authorName);
            System.out.println("--------------------");
        }

        sc.close();
    }
}