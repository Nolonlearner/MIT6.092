package lec04;

public class Book {
    String title;
    boolean borrowed;
    // Creates a new Book
    public Book(){
        title = "default book title";
        borrowed = false;
    }
    public Book(String bookTitle) {
    // Implement this method
        title = bookTitle;
        borrowed = false;
    }

    public void rented(){
        borrowed();
    }

    // Marks the book as rented
    public void borrowed() {
    // Implement this method
        if(borrowed == false){
            borrowed = true;
            System.out.println("You successfully borrowed " + title  );
        }
        else{
            System.out.println("Sorry, this book " + title + " is already borrowed.");
        }
    }

    // Marks the book as not rented
    public void returned() {
    // Implement this method
        if(borrowed == true){
            borrowed = false;
            System.out.println("You successfully returned " + title );
        }
        else{
            System.out.println("The book has been returned!");
        }
    }

    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
    // Implement this method
        return borrowed;
    }

    // Returns the title of the book
    public String getTitle() {
    // Implement this method
        return title;
    }

    public static void main(String[] arguments) {
    // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.rented();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
}