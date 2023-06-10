package lessons.lesson1;

public class Book {
    private String title;
    private int pages;
    private String[] authors;
    private String genre;

    public Book(String title, int pages, String[] authors, String genre) {
        this.title = title;
        this.pages = pages;
        this.authors = authors;
        this.genre = genre;
    }

    public void printDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Pages: " + pages);
        System.out.println("Authors: " + String.join(", ", authors));
        System.out.println("Genre: " + genre);
    }

    public static void main(String[] args) {
        String[] authors = {"John Doe"};
        Book book = new Book("My Book", 100, authors, "Fiction");
        book.printDetails();
    }
}
