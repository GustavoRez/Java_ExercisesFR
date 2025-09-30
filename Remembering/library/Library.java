package library;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book list[] = {
                new Book("The Lord Of The Rings", "J.R.R. Tolkien", 1954),
                new Book("Animal Farm", "George Orwell", 1945),
                new Book("Dom Casmurro", "Machado de Assis", 1899)
        };

        listBooks(list);

        int action = 0;
        while (action != 4) {
            System.out.println("Choose an option:");
            System.out.println("1. List all books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            action = sc.nextInt();
            sc.nextLine();

            switch (action) {
                case 1:
                    System.out.println();
                    listBooks(list);
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    borrowBook(list, sc);
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    returnBook(list, sc);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    System.out.println("Thank you for using the library!");
                    break;

                default:
                    System.out.println("Invalid action. Please try again.");
            }
        }
        sc.close();
    }

    public static void borrowBook(Book[] list, Scanner sc) {
        System.out.println("Which book would you like to borrow?");
        for (int i = 0; i < list.length; i++) {
            if (list[i].isAvailable()) {
                System.out.println((i + 1) + ". " + list[i].getTitle());
            } else {
                System.out.println((i + 1) + ". " + list[i].getTitle() + " (Unavailable)");
            }
        }
        int choice = sc.nextInt() - 1;
        if (choice >= 0 && choice < list.length) {
            if (list[choice].isAvailable()) {
                list[choice].setAvailable(false);
                System.out.println("You borrowed the book: " + list[choice].getTitle());
            } else {
                System.out.println("This book is currently unavailable.");
            }
        } else {
            System.out.println("Invalid section.");
        }
    }

    public static void returnBook(Book[] list, Scanner sc) {
        System.out.println("Which book would you like to return?");
        for (int i = 0; i < list.length; i++) {
            if (!list[i].isAvailable()) {
                System.out.println((i + 1) + ". " + list[i].getTitle());
            } else {
                System.out.println((i + 1) + ". " + list[i].getTitle() + " (Available)");
            }
        }
        int choice = sc.nextInt() - 1;
        if (choice >= 0 && choice < list.length) {
            if (!list[choice].isAvailable()) {
                list[choice].setAvailable(true);
                System.out.println("You returned the book: " + list[choice].getTitle());
            } else {
                System.out.println("This book has not been borrowed.");
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static void listBooks(Book[] list) {
        System.out.println("-----------------------------");
        for (Book book : list) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Publication Year: " + book.getPublicationYear());
            System.out.println("Status: " + (book.isAvailable() ? "Available" : "Unavailable"));
            System.out.println("-----------------------------");
        }
    }
}
